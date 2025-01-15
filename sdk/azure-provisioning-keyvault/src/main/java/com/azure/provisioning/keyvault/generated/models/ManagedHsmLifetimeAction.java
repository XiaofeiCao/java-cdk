// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.keyvault.generated.models;

import com.azure.provisioning.keyvault.generated.models.ManagedHsmAction;
import com.azure.provisioning.keyvault.generated.models.ManagedHsmTrigger;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class ManagedHsmLifetimeAction extends ProvisioningConstruct {

    private final BicepValue<ManagedHsmAction> action;
    private final BicepValue<ManagedHsmTrigger> trigger;

    public ManagedHsmLifetimeAction() {
        action = BicepValue.defineProperty(this, "action", new String[] { "action" }, null);
        trigger = BicepValue.defineProperty(this, "trigger", new String[] { "trigger" }, null);
    }

    public BicepValue<ManagedHsmAction> getAction() {
        return this.action;
    }

    public ManagedHsmLifetimeAction setAction(BicepValue<ManagedHsmAction> action) {
        this.action.assign(action);
        return this;
    }
    public BicepValue<ManagedHsmTrigger> getTrigger() {
        return this.trigger;
    }

    public ManagedHsmLifetimeAction setTrigger(BicepValue<ManagedHsmTrigger> trigger) {
        this.trigger.assign(trigger);
        return this;
    }
}
