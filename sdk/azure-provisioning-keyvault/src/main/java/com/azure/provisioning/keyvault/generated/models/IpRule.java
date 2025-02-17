// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.keyvault.generated.models;

import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class IpRule extends ProvisioningConstruct {

    private final BicepValue<String> value;

    public IpRule() {
        value = BicepValue.defineProperty(this, "value", new String[] { "value" }, null);
    }

    public BicepValue<String> getValue() {
        return this.value;
    }

    public IpRule setValue(BicepValue<String> value) {
        this.value.assign(value);
        return this;
    }
    public IpRule setValue(String value) {
        return this.setValue(BicepValue.from(value));
    }

}
