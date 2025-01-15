// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.keyvault.generated.models;

import com.azure.provisioning.keyvault.generated.models.Action;
import com.azure.provisioning.keyvault.generated.models.Trigger;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class LifetimeAction extends ProvisioningConstruct {

    private final BicepValue<Action> action;
    private final BicepValue<Trigger> trigger;

    public LifetimeAction() {
        action = BicepValue.defineProperty(this, "action", new String[] { "action" }, null);
        trigger = BicepValue.defineProperty(this, "trigger", new String[] { "trigger" }, null);
    }

    public BicepValue<Action> getAction() {
        return this.action;
    }

    public LifetimeAction setAction(BicepValue<Action> action) {
        this.action.assign(action);
        return this;
    }
    public BicepValue<Trigger> getTrigger() {
        return this.trigger;
    }

    public LifetimeAction setTrigger(BicepValue<Trigger> trigger) {
        this.trigger.assign(trigger);
        return this;
    }
}
