// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.keyvault.generated;

import com.azure.provisioning.keyvault.generated.models.VaultProperties;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.Resource;
import com.azure.provisioning.tmp.ResourceType;

public class VaultResource extends Resource {

    private final BicepValue<VaultProperties> properties;
    private final BicepValue<String> resourceGroupName;
    private final BicepValue<String> vaultName;
    private final BicepValue<String> location;

    public VaultResource(String identifierName) {
        this(identifierName, null);
    }

    public VaultResource(String identifierName, String resourceVersion) {
        super(identifierName, new ResourceType("Microsoft.KeyVault/vaults"), resourceVersion);
        properties = BicepValue.defineProperty(this, "properties", new String[] { "properties" }, false, false, false, null);
        resourceGroupName = BicepValue.defineProperty(this, "resourceGroupName", new String[] { "resourceGroupName" }, false, false, false, null);
        vaultName = BicepValue.defineProperty(this, "name", new String[] { "name" }, false, false, false, null);
        location = BicepValue.defineProperty(this, "location", new String[] { "location" }, false, false, false, null);
    }

    public BicepValue<VaultProperties> getProperties() {
        return this.properties;
    }

    public VaultResource setProperties(BicepValue<VaultProperties> properties) {
        this.properties.assign(properties);
        return this;
    }

    public VaultResource setProperties(VaultProperties properties) {
        return this.setProperties(BicepValue.from(properties));
    }

    public BicepValue<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    public VaultResource setResourceGroupName(BicepValue<String> resourceGroupName) {
        this.resourceGroupName.assign(resourceGroupName);
        return this;
    }

    public VaultResource setResourceGroupName(String resourceGroupName) {
        return this.setResourceGroupName(BicepValue.from(resourceGroupName));
    }

    public BicepValue<String> getVaultName() {
        return this.vaultName;
    }

    public VaultResource setVaultName(BicepValue<String> vaultName) {
        this.vaultName.assign(vaultName);
        return this;
    }

    public VaultResource setVaultName(String vaultName) {
        return this.setVaultName(BicepValue.from(vaultName));
    }

    public BicepValue<String> getLocation() {
        return this.location;
    }

    public VaultResource setLocation(BicepValue<String> location) {
        this.location.assign(location);
        return this;
    }

    public VaultResource setLocation(String location) {
        return this.setLocation(BicepValue.from(location));
    }


    public static class ResourceVersions {

        public static final String V2024_11_01 = "2024-11-01";

        public static final String V2023_08_01_PREVIEW = "2023-08-01-PREVIEW";

        public static final String V2023_07_01 = "2023-07-01";

        public static final String V2023_02_01 = "2023-02-01";

        public static final String V2022_11_01 = "2022-11-01";

        public static final String V2022_07_01 = "2022-07-01";

        public static final String V2021_10_01 = "2021-10-01";

        public static final String V2019_09_01 = "2019-09-01";

        public static final String V2018_02_14 = "2018-02-14";

        public static final String V2016_10_01 = "2016-10-01";

        public static final String V2015_06_01 = "2015-06-01";

    }
}
