// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.keyvault.generated.models;

import com.azure.core.util.logging.ClientLogger;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class VirtualNetworkRule extends ProvisioningConstruct {

    private final BicepValue<ClientLogger> lOGGER;
    private final BicepValue<Boolean> ignoreMissingVnetServiceEndpoint;
    private final BicepValue<String> id;

    public VirtualNetworkRule() {
        lOGGER = BicepValue.defineProperty(this, "lOGGER", new String[] { "lOGGER" }, null);
        ignoreMissingVnetServiceEndpoint = BicepValue.defineProperty(this, "ignoreMissingVnetServiceEndpoint", new String[] { "ignoreMissingVnetServiceEndpoint" }, null);
        id = BicepValue.defineProperty(this, "id", new String[] { "id" }, null);
    }

    public BicepValue<ClientLogger> getLOGGER() {
        return this.lOGGER;
    }

    public VirtualNetworkRule setLOGGER(BicepValue<ClientLogger> lOGGER) {
        this.lOGGER.assign(lOGGER);
        return this;
    }
    public VirtualNetworkRule setLOGGER(ClientLogger lOGGER) {
        return this.setLOGGER(BicepValue.from(lOGGER));
    }

    public BicepValue<Boolean> getIgnoreMissingVnetServiceEndpoint() {
        return this.ignoreMissingVnetServiceEndpoint;
    }

    public VirtualNetworkRule setIgnoreMissingVnetServiceEndpoint(BicepValue<Boolean> ignoreMissingVnetServiceEndpoint) {
        this.ignoreMissingVnetServiceEndpoint.assign(ignoreMissingVnetServiceEndpoint);
        return this;
    }
    public VirtualNetworkRule setIgnoreMissingVnetServiceEndpoint(Boolean ignoreMissingVnetServiceEndpoint) {
        return this.setIgnoreMissingVnetServiceEndpoint(BicepValue.from(ignoreMissingVnetServiceEndpoint));
    }

    public BicepValue<String> getId() {
        return this.id;
    }

    public VirtualNetworkRule setId(BicepValue<String> id) {
        this.id.assign(id);
        return this;
    }
    public VirtualNetworkRule setId(String id) {
        return this.setId(BicepValue.from(id));
    }

}
