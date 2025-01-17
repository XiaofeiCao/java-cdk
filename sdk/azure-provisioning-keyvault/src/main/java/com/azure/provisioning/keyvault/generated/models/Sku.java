// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.keyvault.generated.models;

import com.azure.provisioning.keyvault.generated.models.SkuName;
import com.azure.core.util.logging.ClientLogger;
import com.azure.provisioning.keyvault.generated.models.SkuFamily;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class Sku extends ProvisioningConstruct {

    private final BicepValue<ClientLogger> lOGGER;
    private final BicepValue<SkuFamily> family;
    private final BicepValue<SkuName> name;

    public Sku() {
        lOGGER = BicepValue.defineProperty(this, "lOGGER", new String[] { "lOGGER" }, null);
        family = BicepValue.defineProperty(this, "family", new String[] { "family" }, null);
        name = BicepValue.defineProperty(this, "name", new String[] { "name" }, null);
    }

    public BicepValue<ClientLogger> getLOGGER() {
        return this.lOGGER;
    }

    public Sku setLOGGER(BicepValue<ClientLogger> lOGGER) {
        this.lOGGER.assign(lOGGER);
        return this;
    }
    public BicepValue<SkuFamily> getFamily() {
        return this.family;
    }

    public Sku setFamily(BicepValue<SkuFamily> family) {
        this.family.assign(family);
        return this;
    }
    public BicepValue<SkuName> getName() {
        return this.name;
    }

    public Sku setName(BicepValue<SkuName> name) {
        this.name.assign(name);
        return this;
    }
}
