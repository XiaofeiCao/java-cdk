package com.azure.provisioning.keyvault.test;

import com.azure.core.credential.TokenCredential;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.Region;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.TestBase;
import com.azure.core.util.Configuration;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.logging.ClientLogger;
import com.azure.identity.DefaultAzureCredentialBuilder;
import com.azure.identity.implementation.util.IdentityUtil;
import com.azure.json.JsonProviders;
import com.azure.json.JsonReader;
import com.azure.provisioning.Infrastructure;
import com.azure.provisioning.ProvisioningContext;
import com.azure.provisioning.ProvisioningPlan;
import com.azure.provisioning.bicep.BicepProvisioningPlan;
import com.azure.provisioning.keyvault.generated.KeyResource;
import com.azure.provisioning.keyvault.generated.SecretResource;
import com.azure.provisioning.keyvault.generated.VaultResource;
import com.azure.provisioning.keyvault.generated.models.AccessPolicyEntry;
import com.azure.provisioning.keyvault.generated.models.CertificatePermissions;
import com.azure.provisioning.keyvault.generated.models.IpRule;
import com.azure.provisioning.keyvault.generated.models.JsonWebKeyOperation;
import com.azure.provisioning.keyvault.generated.models.JsonWebKeyType;
import com.azure.provisioning.keyvault.generated.models.KeyPermissions;
import com.azure.provisioning.keyvault.generated.models.KeyProperties;
import com.azure.provisioning.keyvault.generated.models.NetworkRuleBypassOptions;
import com.azure.provisioning.keyvault.generated.models.NetworkRuleSet;
import com.azure.provisioning.keyvault.generated.models.Permissions;
import com.azure.provisioning.keyvault.generated.models.SecretPermissions;
import com.azure.provisioning.keyvault.generated.models.SecretProperties;
import com.azure.provisioning.keyvault.generated.models.Sku;
import com.azure.provisioning.keyvault.generated.models.SkuFamily;
import com.azure.provisioning.keyvault.generated.models.SkuName;
import com.azure.provisioning.keyvault.generated.models.VaultProperties;
import com.azure.resourcemanager.keyvault.KeyVaultManager;
import com.azure.resourcemanager.keyvault.models.Key;
import com.azure.resourcemanager.keyvault.models.Secret;
import com.azure.resourcemanager.keyvault.models.Vault;
import com.azure.resourcemanager.resources.ResourceManager;
import com.azure.resourcemanager.resources.models.DeploymentMode;
import com.azure.resourcemanager.resources.models.ResourceGroup;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.Exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

public class VaultTests extends TestBase {
    private static final ClientLogger LOGGER = new ClientLogger(VaultTests.class);
    private ResourceManager resourceManager;
    private ResourceGroup resourceGroup;
    private KeyVaultManager keyVaultManager;
    private final Region region = Region.US_WEST;

    @Override
    protected void beforeTest() {
        TokenCredential tokenCredential = new DefaultAzureCredentialBuilder().build();
        AzureProfile profile = new AzureProfile(AzureEnvironment.AZURE);
        resourceManager = ResourceManager.configure().withLogLevel(HttpLogDetailLevel.BODY_AND_HEADERS)
            .authenticate(tokenCredential, profile)
            .withDefaultSubscription();
        keyVaultManager = KeyVaultManager.configure().withLogLevel(HttpLogDetailLevel.BODY_AND_HEADERS)
                .authenticate(tokenCredential, profile);
        resourceGroup = resourceManager.resourceGroups().define(testResourceNamer.randomName("jvmrg", 15))
            .withRegion(region)
            .create();
    }

    @Override
    protected void afterTest() {
        if (resourceGroup != null) {
            resourceManager.resourceGroups().beginDeleteByName(resourceGroup.name());
        }
    }

    /**
     * This test deploys 3 resources: Vault, Key and Secret by
     * 1. Constructing Infrastructure containing the resources.
     * 2. Building a ProvisioningPlan and compile an ARM template.
     * 3. Using ARM azure-resourcemanager-resources lib to deploy the compiled ARM template.
     * <p/>
     * To run the test:
     * 1. Before running test, run `az login` in terminal to login Azure cloud
     * 2. Set test environment variable `AZURE_TENANT_ID` and `AZURE_SUBSCRIPTION_ID`
     */
    @Test
    public void testCreateVaultWithKeyAndSecret() throws IOException {
        String vaultName = testResourceNamer.randomName("vt", 15);
        VaultResource vaultResource = new VaultResource(vaultName, VaultResource.ResourceVersions.V2023_07_01);
        vaultResource.setLocation(region.name());
        vaultResource.setName(vaultName);
        VaultProperties vaultProperties = new VaultProperties();
        vaultProperties.setTenantId(UUID.fromString(Configuration.getGlobalConfiguration().get("AZURE_TENANT_ID")))
                .setSku(new Sku().setFamily(SkuFamily.A).setName(SkuName.STANDARD))
                .setNetworkAcls(new NetworkRuleSet().setBypass(NetworkRuleBypassOptions.AZURE_SERVICES)
                        .setIpRules(List.of(new IpRule().setValue("0.0.0.0/0"))))
                .setAccessPolicies(List.of(
                        new AccessPolicyEntry()
                                .setTenantId(UUID.fromString(Configuration.getGlobalConfiguration().get("AZURE_TENANT_ID")))
                                .setObjectId(azureCliSignedInUser().id())
                                .setPermissions(
                                        new Permissions()
                                                .setKeys(List.of(KeyPermissions.ALL))
                                                .setCertificates(List.of(CertificatePermissions.GET, CertificatePermissions.LIST, CertificatePermissions.CREATE))
                                                .setSecrets(List.of(SecretPermissions.ALL))
                                ))
                );
        vaultResource.setProperties(vaultProperties);

        String keyName = testResourceNamer.randomName("key", 20);
        KeyResource keyResource = new KeyResource(keyName, KeyResource.ResourceVersions.V2023_07_01);
        keyResource.setName(keyName)
                .setProperties(new KeyProperties()
                        .setKty(JsonWebKeyType.RSA)
                        .setKeyOps(List.of(JsonWebKeyOperation.SIGN, JsonWebKeyOperation.VERIFY))
                ).setParent(vaultResource);

        String secretName = testResourceNamer.randomName("secret", 20);
        SecretResource secretResource = new SecretResource(secretName, KeyResource.ResourceVersions.V2023_07_01);
        secretResource.setName(secretName)
                .setProperties(new SecretProperties()
                        .setValue("Some secret value"))
                .setParent(vaultResource);

        Infrastructure infrastructure = new Infrastructure();
        infrastructure.add(vaultResource);
        infrastructure.add(keyResource);
        infrastructure.add(secretResource);

        ProvisioningPlan plan = new BicepProvisioningPlan(infrastructure, new ProvisioningContext());
        String armTemplate = plan.compileArmTemplate();
        System.out.println(armTemplate);

        Assertions.assertNotNull(armTemplate);

        resourceManager.deployments()
            .define(testResourceNamer.randomName("dp", 15))
            .withExistingResourceGroup(resourceGroup.name())
            .withTemplate(armTemplate)
            .withParameters("{}")
            .withMode(DeploymentMode.COMPLETE)
            .create();

        // assert vault deployment succeeded
        Vault vault = keyVaultManager.vaults().getByResourceGroup(resourceGroup.name(), vaultName);
        Assertions.assertNotNull(vault);
        Assertions.assertEquals(com.azure.resourcemanager.keyvault.models.SkuName.STANDARD, vault.sku().name());

        //assert key deployment succeeded
        Key key = vault.keys().getByName(keyName);
        Assertions.assertNotNull(key);

        //assert secret deployment succeeded
        Secret secret = vault.secrets().getByName(secretName);
        Assertions.assertNotNull(secret);
    }

    private AzureUser azureCliSignedInUser() {
        AzureUser azureCliUser = new AzureUser(testResourceNamer);
        String azCommand = "az ad signed-in-user show --output json";

        final Pattern windowsProcessErrorMessage = Pattern.compile("'azd?' is not recognized");
        final Pattern shProcessErrorMessage = Pattern.compile("azd?:.*not found");
        try {
            String starter;
            String switcher;
            if (IdentityUtil.isWindowsPlatform()) {
                starter = "cmd.exe";
                switcher = "/c";
            } else {
                starter = "/bin/sh";
                switcher = "-c";
            }

            ProcessBuilder builder = new ProcessBuilder(starter, switcher, azCommand.toString());
            // Redirects stdin to dev null, helps to avoid messages sent in by the cmd process to upgrade etc.
            builder.redirectInput(ProcessBuilder.Redirect.from(IdentityUtil.NULL_FILE));

            builder.redirectErrorStream(true);
            Process process = builder.start();

            StringBuilder output = new StringBuilder();
            try (BufferedReader reader
                         = new BufferedReader(new InputStreamReader(process.getInputStream(), StandardCharsets.UTF_8))) {
                String line;
                while (true) {
                    line = reader.readLine();
                    if (line == null) {
                        break;
                    }

                    if (windowsProcessErrorMessage.matcher(line).find()
                            || shProcessErrorMessage.matcher(line).find()) {
                        throw LOGGER.logExceptionAsError(new RuntimeException(
                                "AzureCliCredential authentication unavailable. Azure CLI not installed."
                                        + "To mitigate this issue, please refer to the troubleshooting guidelines here at "
                                        + "https://aka.ms/azsdk/java/identity/azclicredential/troubleshoot"));
                    }
                    output.append(line);
                }
            }
            String processOutput = output.toString();

            // wait(at most) 10 seconds for the process to complete
            process.waitFor(10, TimeUnit.SECONDS);

            if (process.exitValue() != 0) {
                if (processOutput.length() > 0) {
                    if (processOutput.contains("az login") || processOutput.contains("az account set")) {
                        throw LOGGER.logExceptionAsError(new RuntimeException(
                                "AzureCliCredential authentication unavailable. Azure CLI not installed."
                                        + "To mitigate this issue, please refer to the troubleshooting guidelines here at "
                                        + "https://aka.ms/azsdk/java/identity/azclicredential/troubleshoot"));
                    }
                    throw LOGGER.logExceptionAsError(
                            new ClientAuthenticationException("get Azure CLI current signed-in user failed", null));
                } else {
                    throw LOGGER.logExceptionAsError(
                            new ClientAuthenticationException("Failed to invoke Azure CLI ", null));
                }
            }

            LOGGER
                    .verbose("Get Azure CLI signed-in user => A response was received from Azure CLI, deserializing the"
                            + " response into an signed-in user.");
            try (JsonReader reader = JsonProviders.createReader(processOutput)) {
                Map<String, Object> signedInUserInfo = reader.readMap(JsonReader::readUntyped);
                String userPrincipalName = (String) signedInUserInfo.get("userPrincipalName");
                String id = (String) signedInUserInfo.get("id");
                if (CoreUtils.isNullOrEmpty(id)) {
                    id = (String) signedInUserInfo.get("objectId");
                }
                azureCliUser = new AzureUser(testResourceNamer, id, userPrincipalName);
            }
        } catch (IOException | InterruptedException e) {
            throw LOGGER.logExceptionAsError(Exceptions.propagate(e));
        }
        return azureCliUser;
    }
}
