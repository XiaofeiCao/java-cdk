// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.keyvault.generated.models;

import com.azure.provisioning.keyvault.generated.models.KeyRotationPolicyActionType;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class ManagedHsmAction extends ProvisioningConstruct {

    private final BicepValue<KeyRotationPolicyActionType> type;

    public ManagedHsmAction() {
        type = BicepValue.defineProperty(this, "type", new String[] { "type" }, null);
    }

    public BicepValue<KeyRotationPolicyActionType> getType() {
        return this.type;
    }

    public ManagedHsmAction setType(BicepValue<KeyRotationPolicyActionType> type) {
        this.type.assign(type);
        return this;
    }
}
