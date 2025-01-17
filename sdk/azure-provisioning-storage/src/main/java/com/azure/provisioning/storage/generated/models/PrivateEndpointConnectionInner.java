// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated.models;

import com.azure.provisioning.storage.generated.models.PrivateEndpointConnectionProvisioningState;
import com.azure.provisioning.storage.generated.models.PrivateEndpoint;
import com.azure.provisioning.storage.generated.models.PrivateLinkServiceConnectionState;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class PrivateEndpointConnectionInner extends ProvisioningConstruct {

    private final BicepValue<PrivateEndpointConnectionProvisioningState> provisioningState;
    private final BicepValue<String> id;
    private final BicepValue<PrivateLinkServiceConnectionState> privateLinkServiceConnectionState;
    private final BicepValue<String> type;
    private final BicepValue<String> name;
    private final BicepValue<PrivateEndpoint> privateEndpoint;

    public PrivateEndpointConnectionInner() {
        provisioningState = BicepValue.defineProperty(this, "provisioningState", new String[] { "provisioningState" }, null);
        id = BicepValue.defineProperty(this, "id", new String[] { "id" }, null);
        privateLinkServiceConnectionState = BicepValue.defineProperty(this, "privateLinkServiceConnectionState", new String[] { "privateLinkServiceConnectionState" }, null);
        type = BicepValue.defineProperty(this, "type", new String[] { "type" }, null);
        name = BicepValue.defineProperty(this, "name", new String[] { "name" }, null);
        privateEndpoint = BicepValue.defineProperty(this, "privateEndpoint", new String[] { "privateEndpoint" }, null);
    }

    public BicepValue<PrivateEndpointConnectionProvisioningState> getProvisioningState() {
        return this.provisioningState;
    }

    public PrivateEndpointConnectionInner setProvisioningState(BicepValue<PrivateEndpointConnectionProvisioningState> provisioningState) {
        this.provisioningState.assign(provisioningState);
        return this;
    }
    public BicepValue<String> getId() {
        return this.id;
    }

    public PrivateEndpointConnectionInner setId(BicepValue<String> id) {
        this.id.assign(id);
        return this;
    }
    public BicepValue<PrivateLinkServiceConnectionState> getPrivateLinkServiceConnectionState() {
        return this.privateLinkServiceConnectionState;
    }

    public PrivateEndpointConnectionInner setPrivateLinkServiceConnectionState(BicepValue<PrivateLinkServiceConnectionState> privateLinkServiceConnectionState) {
        this.privateLinkServiceConnectionState.assign(privateLinkServiceConnectionState);
        return this;
    }
    public BicepValue<String> getType() {
        return this.type;
    }

    public PrivateEndpointConnectionInner setType(BicepValue<String> type) {
        this.type.assign(type);
        return this;
    }
    public BicepValue<String> getName() {
        return this.name;
    }

    public PrivateEndpointConnectionInner setName(BicepValue<String> name) {
        this.name.assign(name);
        return this;
    }
    public BicepValue<PrivateEndpoint> getPrivateEndpoint() {
        return this.privateEndpoint;
    }

    public PrivateEndpointConnectionInner setPrivateEndpoint(BicepValue<PrivateEndpoint> privateEndpoint) {
        this.privateEndpoint.assign(privateEndpoint);
        return this;
    }
}
