// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.keyvault.generated.models;

import com.azure.provisioning.keyvault.generated.models.SkuName;
import com.azure.provisioning.keyvault.generated.models.SkuFamily;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class Sku extends ProvisioningConstruct {

    private final BicepValue<SkuName> name;
    private final BicepValue<SkuFamily> family;

    public Sku() {
        name = BicepValue.defineProperty(this, "name", new String[] { "name" }, null);
        family = BicepValue.defineProperty(this, "family", new String[] { "family" }, null);
    }

    public BicepValue<SkuName> getName() {
        return this.name;
    }

    public Sku setName(BicepValue<SkuName> name) {
        this.name.assign(name);
        return this;
    }
    public Sku setName(SkuName name) {
        return this.setName(BicepValue.from(name));
    }

    public BicepValue<SkuFamily> getFamily() {
        return this.family;
    }

    public Sku setFamily(BicepValue<SkuFamily> family) {
        this.family.assign(family);
        return this;
    }
    public Sku setFamily(SkuFamily family) {
        return this.setFamily(BicepValue.from(family));
    }

}
