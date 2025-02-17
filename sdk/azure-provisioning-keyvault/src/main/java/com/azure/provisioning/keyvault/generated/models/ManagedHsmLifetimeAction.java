// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.keyvault.generated.models;

import com.azure.provisioning.keyvault.generated.models.ManagedHsmAction;
import com.azure.provisioning.keyvault.generated.models.ManagedHsmTrigger;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class ManagedHsmLifetimeAction extends ProvisioningConstruct {

    private final BicepValue<ManagedHsmTrigger> trigger;
    private final BicepValue<ManagedHsmAction> action;

    public ManagedHsmLifetimeAction() {
        trigger = BicepValue.defineProperty(this, "trigger", new String[] { "trigger" }, null);
        action = BicepValue.defineProperty(this, "action", new String[] { "action" }, null);
    }

    public BicepValue<ManagedHsmTrigger> getTrigger() {
        return this.trigger;
    }

    public ManagedHsmLifetimeAction setTrigger(BicepValue<ManagedHsmTrigger> trigger) {
        this.trigger.assign(trigger);
        return this;
    }
    public ManagedHsmLifetimeAction setTrigger(ManagedHsmTrigger trigger) {
        return this.setTrigger(BicepValue.from(trigger));
    }

    public BicepValue<ManagedHsmAction> getAction() {
        return this.action;
    }

    public ManagedHsmLifetimeAction setAction(BicepValue<ManagedHsmAction> action) {
        this.action.assign(action);
        return this;
    }
    public ManagedHsmLifetimeAction setAction(ManagedHsmAction action) {
        return this.setAction(BicepValue.from(action));
    }

}
