// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.appconfiguration.generated.models;

import com.azure.provisioning.appconfiguration.generated.models.ActionsRequired;
import com.azure.provisioning.appconfiguration.generated.models.ConnectionStatus;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class PrivateLinkServiceConnectionState extends ProvisioningConstruct {

    private final BicepValue<ConnectionStatus> status;
    private final BicepValue<ActionsRequired> actionsRequired;
    private final BicepValue<String> description;

    public PrivateLinkServiceConnectionState() {
        status = BicepValue.defineProperty(this, "status", new String[] { "status" }, null);
        actionsRequired = BicepValue.defineProperty(this, "actionsRequired", new String[] { "actionsRequired" }, null);
        description = BicepValue.defineProperty(this, "description", new String[] { "description" }, null);
    }

    public BicepValue<ConnectionStatus> getStatus() {
        return this.status;
    }

    public PrivateLinkServiceConnectionState setStatus(BicepValue<ConnectionStatus> status) {
        this.status.assign(status);
        return this;
    }
    public PrivateLinkServiceConnectionState setStatus(ConnectionStatus status) {
        return this.setStatus(BicepValue.from(status));
    }

    public BicepValue<ActionsRequired> getActionsRequired() {
        return this.actionsRequired;
    }

    public PrivateLinkServiceConnectionState setActionsRequired(BicepValue<ActionsRequired> actionsRequired) {
        this.actionsRequired.assign(actionsRequired);
        return this;
    }
    public PrivateLinkServiceConnectionState setActionsRequired(ActionsRequired actionsRequired) {
        return this.setActionsRequired(BicepValue.from(actionsRequired));
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

}
