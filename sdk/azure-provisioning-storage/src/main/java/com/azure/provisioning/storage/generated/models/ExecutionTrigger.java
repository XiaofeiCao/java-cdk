// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated.models;

import com.azure.provisioning.storage.generated.models.TriggerType;
import com.azure.provisioning.storage.generated.models.TriggerParameters;
import com.azure.core.util.logging.ClientLogger;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class ExecutionTrigger extends ProvisioningConstruct {

    private final BicepValue<ClientLogger> lOGGER;
    private final BicepValue<TriggerParameters> parameters;
    private final BicepValue<TriggerType> type;

    public ExecutionTrigger() {
        lOGGER = BicepValue.defineProperty(this, "lOGGER", new String[] { "lOGGER" }, null);
        parameters = BicepValue.defineProperty(this, "parameters", new String[] { "parameters" }, null);
        type = BicepValue.defineProperty(this, "type", new String[] { "type" }, null);
    }

    public BicepValue<ClientLogger> getLOGGER() {
        return this.lOGGER;
    }

    public ExecutionTrigger setLOGGER(BicepValue<ClientLogger> lOGGER) {
        this.lOGGER.assign(lOGGER);
        return this;
    }
    public BicepValue<TriggerParameters> getParameters() {
        return this.parameters;
    }

    public ExecutionTrigger setParameters(BicepValue<TriggerParameters> parameters) {
        this.parameters.assign(parameters);
        return this;
    }
    public BicepValue<TriggerType> getType() {
        return this.type;
    }

    public ExecutionTrigger setType(BicepValue<TriggerType> type) {
        this.type.assign(type);
        return this;
    }
}
