// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.keyvault.generated.models;

import com.azure.provisioning.keyvault.generated.models.PrivateEndpointConnectionProvisioningState;
import com.azure.provisioning.keyvault.generated.models.MhsmPrivateLinkServiceConnectionState;
import com.azure.provisioning.keyvault.generated.models.MhsmPrivateEndpoint;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class MhsmPrivateEndpointConnectionItem extends ProvisioningConstruct {

    private final BicepValue<MhsmPrivateEndpoint> privateEndpoint;
    private final BicepValue<PrivateEndpointConnectionProvisioningState> provisioningState;
    private final BicepValue<String> id;
    private final BicepValue<String> etag;
    private final BicepValue<MhsmPrivateLinkServiceConnectionState> privateLinkServiceConnectionState;

    public MhsmPrivateEndpointConnectionItem() {
        privateEndpoint = BicepValue.defineProperty(this, "privateEndpoint", new String[] { "privateEndpoint" }, null);
        provisioningState = BicepValue.defineProperty(this, "provisioningState", new String[] { "provisioningState" }, null);
        id = BicepValue.defineProperty(this, "id", new String[] { "id" }, null);
        etag = BicepValue.defineProperty(this, "etag", new String[] { "etag" }, null);
        privateLinkServiceConnectionState = BicepValue.defineProperty(this, "privateLinkServiceConnectionState", new String[] { "privateLinkServiceConnectionState" }, null);
    }

    public BicepValue<MhsmPrivateEndpoint> getPrivateEndpoint() {
        return this.privateEndpoint;
    }

    public MhsmPrivateEndpointConnectionItem setPrivateEndpoint(BicepValue<MhsmPrivateEndpoint> privateEndpoint) {
        this.privateEndpoint.assign(privateEndpoint);
        return this;
    }
    public BicepValue<PrivateEndpointConnectionProvisioningState> getProvisioningState() {
        return this.provisioningState;
    }

    public MhsmPrivateEndpointConnectionItem setProvisioningState(BicepValue<PrivateEndpointConnectionProvisioningState> provisioningState) {
        this.provisioningState.assign(provisioningState);
        return this;
    }
    public BicepValue<String> getId() {
        return this.id;
    }

    public MhsmPrivateEndpointConnectionItem setId(BicepValue<String> id) {
        this.id.assign(id);
        return this;
    }
    public BicepValue<String> getEtag() {
        return this.etag;
    }

    public MhsmPrivateEndpointConnectionItem setEtag(BicepValue<String> etag) {
        this.etag.assign(etag);
        return this;
    }
    public BicepValue<MhsmPrivateLinkServiceConnectionState> getPrivateLinkServiceConnectionState() {
        return this.privateLinkServiceConnectionState;
    }

    public MhsmPrivateEndpointConnectionItem setPrivateLinkServiceConnectionState(BicepValue<MhsmPrivateLinkServiceConnectionState> privateLinkServiceConnectionState) {
        this.privateLinkServiceConnectionState.assign(privateLinkServiceConnectionState);
        return this;
    }
}
