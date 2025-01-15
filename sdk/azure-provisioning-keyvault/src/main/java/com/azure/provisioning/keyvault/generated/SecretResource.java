// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.keyvault.generated;

import com.azure.provisioning.keyvault.generated.models.SecretProperties;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.Resource;
import com.azure.provisioning.tmp.ResourceType;

public class SecretResource extends Resource {

    private final BicepValue<SecretProperties> properties;
    private final BicepValue<String> secretName;
    private final BicepValue<String> resourceGroupName;
    private final BicepValue<String> vaultName;

    public SecretResource(String identifierName) {
        this(identifierName, null);
    }

    public SecretResource(String identifierName, String resourceVersion) {
        super(identifierName, new ResourceType("Microsoft.KeyVault/vaults/secrets"), resourceVersion);
        properties = BicepValue.defineProperty(this, "properties", new String[] { "properties" }, false, false, false, null);
        secretName = BicepValue.defineProperty(this, "secretName", new String[] { "secretName" }, false, false, false, null);
        resourceGroupName = BicepValue.defineProperty(this, "resourceGroupName", new String[] { "resourceGroupName" }, false, false, false, null);
        vaultName = BicepValue.defineProperty(this, "vaultName", new String[] { "vaultName" }, false, false, false, null);
    }

    public BicepValue<SecretProperties> getProperties() {
        return this.properties;
    }

    public SecretResource setProperties(BicepValue<SecretProperties> properties) {
        this.properties.assign(properties);
        return this;
    }

    public SecretResource setProperties(SecretProperties properties) {
        return this.setProperties(BicepValue.from(properties));
    }

    public BicepValue<String> getSecretName() {
        return this.secretName;
    }

    public SecretResource setSecretName(BicepValue<String> secretName) {
        this.secretName.assign(secretName);
        return this;
    }

    public SecretResource setSecretName(String secretName) {
        return this.setSecretName(BicepValue.from(secretName));
    }

    public BicepValue<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    public SecretResource setResourceGroupName(BicepValue<String> resourceGroupName) {
        this.resourceGroupName.assign(resourceGroupName);
        return this;
    }

    public SecretResource setResourceGroupName(String resourceGroupName) {
        return this.setResourceGroupName(BicepValue.from(resourceGroupName));
    }

    public BicepValue<String> getVaultName() {
        return this.vaultName;
    }

    public SecretResource setVaultName(BicepValue<String> vaultName) {
        this.vaultName.assign(vaultName);
        return this;
    }

    public SecretResource setVaultName(String vaultName) {
        return this.setVaultName(BicepValue.from(vaultName));
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
