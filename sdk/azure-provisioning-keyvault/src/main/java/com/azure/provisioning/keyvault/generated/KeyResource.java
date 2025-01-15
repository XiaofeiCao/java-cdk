// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.keyvault.generated;

import com.azure.provisioning.keyvault.generated.models.KeyProperties;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.Resource;
import com.azure.provisioning.tmp.ResourceType;

public class KeyResource extends Resource {

    private final BicepValue<String> resourceGroupName;
    private final BicepValue<String> vaultName;
    private final BicepValue<String> keyName;
    private final BicepValue<KeyProperties> properties;

    public KeyResource(String identifierName) {
        this(identifierName, null);
    }

    public KeyResource(String identifierName, String resourceVersion) {
        super(identifierName, new ResourceType("Microsoft.KeyVault/vaults/keys"), resourceVersion);
        resourceGroupName = BicepValue.defineProperty(this, "resourceGroupName", new String[] { "resourceGroupName" }, false, false, false, null);
        vaultName = BicepValue.defineProperty(this, "vaultName", new String[] { "vaultName" }, false, false, false, null);
        keyName = BicepValue.defineProperty(this, "keyName", new String[] { "keyName" }, false, false, false, null);
        properties = BicepValue.defineProperty(this, "properties", new String[] { "properties" }, false, false, false, null);
    }

    public BicepValue<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    public KeyResource setResourceGroupName(BicepValue<String> resourceGroupName) {
        this.resourceGroupName.assign(resourceGroupName);
        return this;
    }

    public KeyResource setResourceGroupName(String resourceGroupName) {
        return this.setResourceGroupName(BicepValue.from(resourceGroupName));
    }

    public BicepValue<String> getVaultName() {
        return this.vaultName;
    }

    public KeyResource setVaultName(BicepValue<String> vaultName) {
        this.vaultName.assign(vaultName);
        return this;
    }

    public KeyResource setVaultName(String vaultName) {
        return this.setVaultName(BicepValue.from(vaultName));
    }

    public BicepValue<String> getKeyName() {
        return this.keyName;
    }

    public KeyResource setKeyName(BicepValue<String> keyName) {
        this.keyName.assign(keyName);
        return this;
    }

    public KeyResource setKeyName(String keyName) {
        return this.setKeyName(BicepValue.from(keyName));
    }

    public BicepValue<KeyProperties> getProperties() {
        return this.properties;
    }

    public KeyResource setProperties(BicepValue<KeyProperties> properties) {
        this.properties.assign(properties);
        return this;
    }

    public KeyResource setProperties(KeyProperties properties) {
        return this.setProperties(BicepValue.from(properties));
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

    }
}
