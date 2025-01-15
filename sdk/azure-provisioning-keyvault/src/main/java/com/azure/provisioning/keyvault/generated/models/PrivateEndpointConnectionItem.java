// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.keyvault.generated.models;

import com.azure.provisioning.keyvault.generated.models.PrivateEndpointConnectionProvisioningState;
import com.azure.provisioning.keyvault.generated.models.PrivateLinkServiceConnectionState;
import com.azure.provisioning.keyvault.generated.models.PrivateEndpoint;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class PrivateEndpointConnectionItem extends ProvisioningConstruct {

    private final BicepValue<PrivateEndpoint> privateEndpoint;
    private final BicepValue<PrivateLinkServiceConnectionState> privateLinkServiceConnectionState;
    private final BicepValue<String> id;
    private final BicepValue<PrivateEndpointConnectionProvisioningState> provisioningState;
    private final BicepValue<String> etag;

    public PrivateEndpointConnectionItem() {
        privateEndpoint = BicepValue.defineProperty(this, "privateEndpoint", new String[] { "privateEndpoint" }, null);
        privateLinkServiceConnectionState = BicepValue.defineProperty(this, "privateLinkServiceConnectionState", new String[] { "privateLinkServiceConnectionState" }, null);
        id = BicepValue.defineProperty(this, "id", new String[] { "id" }, null);
        provisioningState = BicepValue.defineProperty(this, "provisioningState", new String[] { "provisioningState" }, null);
        etag = BicepValue.defineProperty(this, "etag", new String[] { "etag" }, null);
    }

    public BicepValue<PrivateEndpoint> getPrivateEndpoint() {
        return this.privateEndpoint;
    }

    public PrivateEndpointConnectionItem setPrivateEndpoint(BicepValue<PrivateEndpoint> privateEndpoint) {
        this.privateEndpoint.assign(privateEndpoint);
        return this;
    }
    public BicepValue<PrivateLinkServiceConnectionState> getPrivateLinkServiceConnectionState() {
        return this.privateLinkServiceConnectionState;
    }

    public PrivateEndpointConnectionItem setPrivateLinkServiceConnectionState(BicepValue<PrivateLinkServiceConnectionState> privateLinkServiceConnectionState) {
        this.privateLinkServiceConnectionState.assign(privateLinkServiceConnectionState);
        return this;
    }
    public BicepValue<String> getId() {
        return this.id;
    }

    public PrivateEndpointConnectionItem setId(BicepValue<String> id) {
        this.id.assign(id);
        return this;
    }
    public BicepValue<PrivateEndpointConnectionProvisioningState> getProvisioningState() {
        return this.provisioningState;
    }

    public PrivateEndpointConnectionItem setProvisioningState(BicepValue<PrivateEndpointConnectionProvisioningState> provisioningState) {
        this.provisioningState.assign(provisioningState);
        return this;
    }
    public BicepValue<String> getEtag() {
        return this.etag;
    }

    public PrivateEndpointConnectionItem setEtag(BicepValue<String> etag) {
        this.etag.assign(etag);
        return this;
    }
}
