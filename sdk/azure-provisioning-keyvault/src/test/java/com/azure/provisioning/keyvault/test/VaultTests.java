package com.azure.provisioning.keyvault.test;

import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.Region;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.TestBase;
import com.azure.core.test.TestProxyTestBase;
import com.azure.identity.DefaultAzureCredentialBuilder;
import com.azure.provisioning.BicepList;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.Infrastructure;
import com.azure.provisioning.ProvisioningContext;
import com.azure.provisioning.ProvisioningPlan;
import com.azure.provisioning.bicep.BicepProvisioningPlan;
import com.azure.provisioning.keyvault.generated.VaultResource;
import com.azure.provisioning.keyvault.generated.models.NetworkRuleBypassOptions;
import com.azure.provisioning.keyvault.generated.models.NetworkRuleSet;
import com.azure.provisioning.keyvault.generated.models.Sku;
import com.azure.provisioning.keyvault.generated.models.SkuFamily;
import com.azure.provisioning.keyvault.generated.models.SkuName;
import com.azure.provisioning.keyvault.generated.models.VaultProperties;
import com.azure.resourcemanager.resources.ResourceManager;
import com.azure.resourcemanager.resources.models.DeploymentMode;
import com.azure.resourcemanager.resources.models.ResourceGroup;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.UUID;

public class VaultTests extends TestBase {

    private ResourceManager resourceManager;
    private ResourceGroup resourceGroup;
    private final Region region = Region.US_WEST;

    @Override
    protected void beforeTest() {
        resourceManager = ResourceManager.configure().withLogLevel(HttpLogDetailLevel.BODY_AND_HEADERS)
            .authenticate(new DefaultAzureCredentialBuilder().build(), new AzureProfile(AzureEnvironment.AZURE))
            .withDefaultSubscription();
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

    @Test
    public void testCreateVault() throws IOException {
        String vaultName = testResourceNamer.randomName("vt", 15);
        VaultResource vaultResource = new VaultResource(vaultName, VaultResource.ResourceVersions.V2023_07_01);
//        vaultResource.setResourceGroupName(testResourceNamer.randomName("rg", 15));
        vaultResource.setLocation(region.name());
        vaultResource.setName(vaultName);
        VaultProperties vaultProperties = new VaultProperties();
        vaultProperties.setTenantId(BicepValue.from(UUID.fromString("72f988bf-86f1-41af-91ab-2d7cd011db47")))
            .setSku(BicepValue.from(new Sku().setFamily(BicepValue.from(SkuFamily.A)).setName(BicepValue.from(SkuName.STANDARD))))
//            .setNetworkAcls(BicepValue.from(new NetworkRuleSet().setBypass(BicepValue.from(NetworkRuleBypassOptions.AZURE_SERVICES)).setIpRules(BicepList.defineProperty())))
        ;

        vaultResource.setProperties(vaultProperties);
        Infrastructure infrastructure = new Infrastructure();
        infrastructure.add(vaultResource);

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
    }
}
