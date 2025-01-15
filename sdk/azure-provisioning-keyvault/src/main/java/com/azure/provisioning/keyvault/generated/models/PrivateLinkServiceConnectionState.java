// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.keyvault.generated.models;

import com.azure.provisioning.keyvault.generated.models.ActionsRequired;
import com.azure.provisioning.keyvault.generated.models.PrivateEndpointServiceConnectionStatus;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class PrivateLinkServiceConnectionState extends ProvisioningConstruct {

    private final BicepValue<ActionsRequired> actionsRequired;
    private final BicepValue<PrivateEndpointServiceConnectionStatus> status;
    private final BicepValue<String> description;

    public PrivateLinkServiceConnectionState() {
        actionsRequired = BicepValue.defineProperty(this, "actionsRequired", new String[] { "actionsRequired" }, null);
        status = BicepValue.defineProperty(this, "status", new String[] { "status" }, null);
        description = BicepValue.defineProperty(this, "description", new String[] { "description" }, null);
    }

    public BicepValue<ActionsRequired> getActionsRequired() {
        return this.actionsRequired;
    }

    public PrivateLinkServiceConnectionState setActionsRequired(BicepValue<ActionsRequired> actionsRequired) {
        this.actionsRequired.assign(actionsRequired);
        return this;
    }
    public BicepValue<PrivateEndpointServiceConnectionStatus> getStatus() {
        return this.status;
    }

    public PrivateLinkServiceConnectionState setStatus(BicepValue<PrivateEndpointServiceConnectionStatus> status) {
        this.status.assign(status);
        return this;
    }
    public BicepValue<String> getDescription() {
        return this.description;
    }

    public PrivateLinkServiceConnectionState setDescription(BicepValue<String> description) {
        this.description.assign(description);
        return this;
    }
}
