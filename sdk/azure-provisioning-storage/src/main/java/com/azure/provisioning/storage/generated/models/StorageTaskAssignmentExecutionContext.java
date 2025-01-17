// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated.models;

import com.azure.provisioning.storage.generated.models.ExecutionTrigger;
import com.azure.provisioning.storage.generated.models.ExecutionTarget;
import com.azure.core.util.logging.ClientLogger;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class StorageTaskAssignmentExecutionContext extends ProvisioningConstruct {

    private final BicepValue<ClientLogger> lOGGER;
    private final BicepValue<ExecutionTarget> target;
    private final BicepValue<ExecutionTrigger> trigger;

    public StorageTaskAssignmentExecutionContext() {
        lOGGER = BicepValue.defineProperty(this, "lOGGER", new String[] { "lOGGER" }, null);
        target = BicepValue.defineProperty(this, "target", new String[] { "target" }, null);
        trigger = BicepValue.defineProperty(this, "trigger", new String[] { "trigger" }, null);
    }

    public BicepValue<ClientLogger> getLOGGER() {
        return this.lOGGER;
    }

    public StorageTaskAssignmentExecutionContext setLOGGER(BicepValue<ClientLogger> lOGGER) {
        this.lOGGER.assign(lOGGER);
        return this;
    }
    public BicepValue<ExecutionTarget> getTarget() {
        return this.target;
    }

    public StorageTaskAssignmentExecutionContext setTarget(BicepValue<ExecutionTarget> target) {
        this.target.assign(target);
        return this;
    }
    public BicepValue<ExecutionTrigger> getTrigger() {
        return this.trigger;
    }

    public StorageTaskAssignmentExecutionContext setTrigger(BicepValue<ExecutionTrigger> trigger) {
        this.trigger.assign(trigger);
        return this;
    }
}
