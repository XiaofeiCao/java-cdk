package com.azure.provisioning.storage;

import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.Region;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.TestBase;
import com.azure.core.test.TestProxyTestBase;
import com.azure.identity.DefaultAzureCredentialBuilder;
import com.azure.provisioning.Infrastructure;
import com.azure.provisioning.ProvisioningContext;
import com.azure.provisioning.ProvisioningPlan;
import com.azure.provisioning.bicep.BicepProvisioningPlan;
import com.azure.provisioning.storage.generated.StorageAccountResource;
import com.azure.provisioning.storage.generated.models.AccessTier;
import com.azure.resourcemanager.resources.ResourceManager;
import com.azure.resourcemanager.resources.models.ResourceGroup;
import org.junit.jupiter.api.Test;

public class StorageTests extends TestBase {

    private ResourceManager resourceManager;
    private ResourceGroup resourceGroup;
    private final Region region = Region.US_WEST;

    @Override
    protected void beforeTest() {
        resourceManager = ResourceManager.configure().withLogLevel(HttpLogDetailLevel.BODY_AND_HEADERS)
            .authenticate(new DefaultAzureCredentialBuilder().build(), new AzureProfile(AzureEnvironment.AZURE))
            .withDefaultSubscription();
//        resourceGroup = resourceManager.resourceGroups().define(testResourceNamer.randomName("jvmrg", 15))
//            .withRegion(region)
//            .create();
    }

    @Override
    protected void afterTest() {
//        if (resourceGroup != null) {
//            resourceManager.resourceGroups().beginDeleteByName(resourceGroup.name());
//        }
    }

    @Test
    public void testCreateStorageAccount() {
        String saName = testResourceNamer.randomName("sa", 15);
        StorageAccountResource resource = new StorageAccountResource(saName, StorageAccountResource.ResourceVersions.V2024_01_01);
        resource.setLocation(region.name());
        resource.setResourceGroupName(testResourceNamer.randomName("jvmrg", 15));
        resource.setAccountName("mySA");
//        resource.setResourceGroupName(resourceGroup.name());
        resource.setAccessTier(AccessTier.Hot);
        resource.setAllowBlobPublicAccess(true);
        resource.setIsLocalUserEnabled(true);

        Infrastructure infrastructure = new Infrastructure();
        infrastructure.add(resource);

        ProvisioningPlan plan = new BicepProvisioningPlan(infrastructure, new ProvisioningContext());
        String armTemplate = plan.compileArmTemplate();

        System.out.println(armTemplate);
    }
}
