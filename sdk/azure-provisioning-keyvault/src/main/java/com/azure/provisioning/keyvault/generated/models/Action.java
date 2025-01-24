// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.keyvault.generated.models;

import com.azure.provisioning.keyvault.generated.models.KeyRotationPolicyActionType;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class Action extends ProvisioningConstruct {

    private final BicepValue<KeyRotationPolicyActionType> type;

    public Action() {
        type = BicepValue.defineProperty(this, "type", new String[] { "type" }, null);
    }

    public BicepValue<KeyRotationPolicyActionType> getType() {
        return this.type;
    }

    public Action setType(BicepValue<KeyRotationPolicyActionType> type) {
        this.type.assign(type);
        return this;
    }
    public Action setType(KeyRotationPolicyActionType type) {
        return this.setType(BicepValue.from(type));
    }

}
