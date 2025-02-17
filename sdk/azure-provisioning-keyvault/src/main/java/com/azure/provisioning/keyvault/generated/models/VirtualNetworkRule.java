// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.keyvault.generated.models;

import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class VirtualNetworkRule extends ProvisioningConstruct {

    private final BicepValue<String> id;
    private final BicepValue<Boolean> ignoreMissingVnetServiceEndpoint;

    public VirtualNetworkRule() {
        id = BicepValue.defineProperty(this, "id", new String[] { "id" }, null);
        ignoreMissingVnetServiceEndpoint = BicepValue.defineProperty(this, "ignoreMissingVnetServiceEndpoint", new String[] { "ignoreMissingVnetServiceEndpoint" }, null);
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

}
