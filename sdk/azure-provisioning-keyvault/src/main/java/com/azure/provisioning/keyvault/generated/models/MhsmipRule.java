// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.keyvault.generated.models;

import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class MhsmipRule extends ProvisioningConstruct {

    private final BicepValue<String> value;

    public MhsmipRule() {
        value = BicepValue.defineProperty(this, "value", new String[] { "value" }, null);
    }

    public BicepValue<String> getValue() {
        return this.value;
    }

    public MhsmipRule setValue(BicepValue<String> value) {
        this.value.assign(value);
        return this;
    }
    public MhsmipRule setValue(String value) {
        return this.setValue(BicepValue.from(value));
    }

}
