// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.keyvault.generated;

import com.azure.provisioning.keyvault.generated.models.ManagedHsmKeyProperties;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.Resource;
import com.azure.provisioning.tmp.ResourceType;

public class ManagedHsmKeyResource extends Resource {

    private final BicepValue<ManagedHsmKeyProperties> innerProperties;
    private final BicepValue<String> name;

    public ManagedHsmKeyResource(String identifierName) {
        this(identifierName, null);
    }

    public ManagedHsmKeyResource(String identifierName, String resourceVersion) {
        super(identifierName, new ResourceType("Microsoft.KeyVault/managedHSMs/keys"), resourceVersion);
        innerProperties = BicepValue.defineProperty(this, "innerProperties", new String[] { "innerProperties" }, false, false, false, null);
        name = BicepValue.defineProperty(this, "name", new String[] { "name" }, false, false, false, null);
    }

    public BicepValue<ManagedHsmKeyProperties> getInnerProperties() {
        return this.innerProperties;
    }

    public ManagedHsmKeyResource setInnerProperties(BicepValue<ManagedHsmKeyProperties> innerProperties) {
        this.innerProperties.assign(innerProperties);
        return this;
    }

    public ManagedHsmKeyResource setInnerProperties(ManagedHsmKeyProperties innerProperties) {
        return this.setInnerProperties(BicepValue.from(innerProperties));
    }

    public BicepValue<String> getName() {
        return this.name;
    }

    public ManagedHsmKeyResource setName(BicepValue<String> name) {
        this.name.assign(name);
        return this;
    }

    public ManagedHsmKeyResource setName(String name) {
        return this.setName(BicepValue.from(name));
    }


    public static class ResourceVersions {

        public static final String V2024_11_01 = "2024-11-01";

        public static final String V2023_08_01_PREVIEW = "2023-08-01-PREVIEW";

        public static final String V2023_07_01 = "2023-07-01";

        public static final String V2023_02_01 = "2023-02-01";

        public static final String V2022_11_01 = "2022-11-01";

    }
}
