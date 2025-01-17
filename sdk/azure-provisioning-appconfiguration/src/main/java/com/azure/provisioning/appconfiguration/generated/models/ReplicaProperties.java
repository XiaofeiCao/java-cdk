// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.appconfiguration.generated.models;

import com.azure.provisioning.appconfiguration.generated.models.ReplicaProvisioningState;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class ReplicaProperties extends ProvisioningConstruct {

    private final BicepValue<String> endpoint;
    private final BicepValue<ReplicaProvisioningState> provisioningState;

    public ReplicaProperties() {
        endpoint = BicepValue.defineProperty(this, "endpoint", new String[] { "endpoint" }, null);
        provisioningState = BicepValue.defineProperty(this, "provisioningState", new String[] { "provisioningState" }, null);
    }

    public BicepValue<String> getEndpoint() {
        return this.endpoint;
    }

    public ReplicaProperties setEndpoint(BicepValue<String> endpoint) {
        this.endpoint.assign(endpoint);
        return this;
    }
    public BicepValue<ReplicaProvisioningState> getProvisioningState() {
        return this.provisioningState;
    }

    public ReplicaProperties setProvisioningState(BicepValue<ReplicaProvisioningState> provisioningState) {
        this.provisioningState.assign(provisioningState);
        return this;
    }
}
