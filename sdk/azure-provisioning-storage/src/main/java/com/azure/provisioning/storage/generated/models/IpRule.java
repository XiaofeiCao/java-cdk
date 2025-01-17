// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated.models;

import com.azure.provisioning.storage.generated.models.Action;
import com.azure.core.util.logging.ClientLogger;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class IpRule extends ProvisioningConstruct {

    private final BicepValue<String> ipAddressOrRange;
    private final BicepValue<Action> action;
    private final BicepValue<ClientLogger> lOGGER;

    public IpRule() {
        ipAddressOrRange = BicepValue.defineProperty(this, "ipAddressOrRange", new String[] { "ipAddressOrRange" }, null);
        action = BicepValue.defineProperty(this, "action", new String[] { "action" }, null);
        lOGGER = BicepValue.defineProperty(this, "lOGGER", new String[] { "lOGGER" }, null);
    }

    public BicepValue<String> getIpAddressOrRange() {
        return this.ipAddressOrRange;
    }

    public IpRule setIpAddressOrRange(BicepValue<String> ipAddressOrRange) {
        this.ipAddressOrRange.assign(ipAddressOrRange);
        return this;
    }
    public BicepValue<Action> getAction() {
        return this.action;
    }

    public IpRule setAction(BicepValue<Action> action) {
        this.action.assign(action);
        return this;
    }
    public BicepValue<ClientLogger> getLOGGER() {
        return this.lOGGER;
    }

    public IpRule setLOGGER(BicepValue<ClientLogger> lOGGER) {
        this.lOGGER.assign(lOGGER);
        return this;
    }
}
