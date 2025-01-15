// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.keyvault.generated.models;

import com.azure.core.util.logging.ClientLogger;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class IpRule extends ProvisioningConstruct {

    private final BicepValue<String> value;
    private final BicepValue<ClientLogger> lOGGER;

    public IpRule() {
        value = BicepValue.defineProperty(this, "value", new String[] { "value" }, null);
        lOGGER = BicepValue.defineProperty(this, "lOGGER", new String[] { "lOGGER" }, null);
    }

    public BicepValue<String> getValue() {
        return this.value;
    }

    public IpRule setValue(BicepValue<String> value) {
        this.value.assign(value);
        return this;
    }
    public BicepValue<ClientLogger> getLOGGER() {
        return this.lOGGER;
    }

    public IpRule setLOGGER(BicepValue<ClientLogger> lOGGER) {
        this.lOGGER.assign(lOGGER);
        return this;
    }
}
