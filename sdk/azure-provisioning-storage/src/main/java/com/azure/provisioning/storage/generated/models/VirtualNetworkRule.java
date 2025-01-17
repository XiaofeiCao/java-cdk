// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated.models;

import com.azure.provisioning.storage.generated.models.Action;
import com.azure.provisioning.storage.generated.models.State;
import com.azure.core.util.logging.ClientLogger;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class VirtualNetworkRule extends ProvisioningConstruct {

    private final BicepValue<ClientLogger> lOGGER;
    private final BicepValue<String> virtualNetworkResourceId;
    private final BicepValue<State> state;
    private final BicepValue<Action> action;

    public VirtualNetworkRule() {
        lOGGER = BicepValue.defineProperty(this, "lOGGER", new String[] { "lOGGER" }, null);
        virtualNetworkResourceId = BicepValue.defineProperty(this, "virtualNetworkResourceId", new String[] { "virtualNetworkResourceId" }, null);
        state = BicepValue.defineProperty(this, "state", new String[] { "state" }, null);
        action = BicepValue.defineProperty(this, "action", new String[] { "action" }, null);
    }

    public BicepValue<ClientLogger> getLOGGER() {
        return this.lOGGER;
    }

    public VirtualNetworkRule setLOGGER(BicepValue<ClientLogger> lOGGER) {
        this.lOGGER.assign(lOGGER);
        return this;
    }
    public BicepValue<String> getVirtualNetworkResourceId() {
        return this.virtualNetworkResourceId;
    }

    public VirtualNetworkRule setVirtualNetworkResourceId(BicepValue<String> virtualNetworkResourceId) {
        this.virtualNetworkResourceId.assign(virtualNetworkResourceId);
        return this;
    }
    public BicepValue<State> getState() {
        return this.state;
    }

    public VirtualNetworkRule setState(BicepValue<State> state) {
        this.state.assign(state);
        return this;
    }
    public BicepValue<Action> getAction() {
        return this.action;
    }

    public VirtualNetworkRule setAction(BicepValue<Action> action) {
        this.action.assign(action);
        return this;
    }
}
