// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated.models;

import com.azure.provisioning.storage.generated.models.PrivateEndpointServiceConnectionStatus;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class PrivateLinkServiceConnectionState extends ProvisioningConstruct {

    private final BicepValue<PrivateEndpointServiceConnectionStatus> status;
    private final BicepValue<String> description;
    private final BicepValue<String> actionRequired;

    public PrivateLinkServiceConnectionState() {
        status = BicepValue.defineProperty(this, "status", new String[] { "status" }, null);
        description = BicepValue.defineProperty(this, "description", new String[] { "description" }, null);
        actionRequired = BicepValue.defineProperty(this, "actionRequired", new String[] { "actionRequired" }, null);
    }

    public BicepValue<PrivateEndpointServiceConnectionStatus> getStatus() {
        return this.status;
    }

    public PrivateLinkServiceConnectionState setStatus(BicepValue<PrivateEndpointServiceConnectionStatus> status) {
        this.status.assign(status);
        return this;
    }
    public PrivateLinkServiceConnectionState setStatus(PrivateEndpointServiceConnectionStatus status) {
        return this.setStatus(BicepValue.from(status));
    }

    public BicepValue<String> getDescription() {
        return this.description;
    }

    public PrivateLinkServiceConnectionState setDescription(BicepValue<String> description) {
        this.description.assign(description);
        return this;
    }
    public PrivateLinkServiceConnectionState setDescription(String description) {
        return this.setDescription(BicepValue.from(description));
    }

    public BicepValue<String> getActionRequired() {
        return this.actionRequired;
    }

    public PrivateLinkServiceConnectionState setActionRequired(BicepValue<String> actionRequired) {
        this.actionRequired.assign(actionRequired);
        return this;
    }
    public PrivateLinkServiceConnectionState setActionRequired(String actionRequired) {
        return this.setActionRequired(BicepValue.from(actionRequired));
    }

}
