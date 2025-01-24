// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.keyvault.generated.models;

import com.azure.provisioning.keyvault.generated.models.PrivateEndpointConnectionProvisioningState;
import com.azure.provisioning.keyvault.generated.models.MhsmPrivateLinkServiceConnectionState;
import com.azure.provisioning.keyvault.generated.models.MhsmPrivateEndpoint;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class MhsmPrivateEndpointConnectionItem extends ProvisioningConstruct {

    private final BicepValue<MhsmPrivateLinkServiceConnectionState> privateLinkServiceConnectionState;
    private final BicepValue<String> id;
    private final BicepValue<MhsmPrivateEndpoint> privateEndpoint;
    private final BicepValue<String> etag;
    private final BicepValue<PrivateEndpointConnectionProvisioningState> provisioningState;

    public MhsmPrivateEndpointConnectionItem() {
        privateLinkServiceConnectionState = BicepValue.defineProperty(this, "privateLinkServiceConnectionState", new String[] { "privateLinkServiceConnectionState" }, null);
        id = BicepValue.defineProperty(this, "id", new String[] { "id" }, null);
        privateEndpoint = BicepValue.defineProperty(this, "privateEndpoint", new String[] { "privateEndpoint" }, null);
        etag = BicepValue.defineProperty(this, "etag", new String[] { "etag" }, null);
        provisioningState = BicepValue.defineProperty(this, "provisioningState", new String[] { "provisioningState" }, null);
    }

    public BicepValue<MhsmPrivateLinkServiceConnectionState> getPrivateLinkServiceConnectionState() {
        return this.privateLinkServiceConnectionState;
    }

    public MhsmPrivateEndpointConnectionItem setPrivateLinkServiceConnectionState(BicepValue<MhsmPrivateLinkServiceConnectionState> privateLinkServiceConnectionState) {
        this.privateLinkServiceConnectionState.assign(privateLinkServiceConnectionState);
        return this;
    }
    public MhsmPrivateEndpointConnectionItem setPrivateLinkServiceConnectionState(MhsmPrivateLinkServiceConnectionState privateLinkServiceConnectionState) {
        return this.setPrivateLinkServiceConnectionState(BicepValue.from(privateLinkServiceConnectionState));
    }

    public BicepValue<String> getId() {
        return this.id;
    }

    public MhsmPrivateEndpointConnectionItem setId(BicepValue<String> id) {
        this.id.assign(id);
        return this;
    }
    public MhsmPrivateEndpointConnectionItem setId(String id) {
        return this.setId(BicepValue.from(id));
    }

    public BicepValue<MhsmPrivateEndpoint> getPrivateEndpoint() {
        return this.privateEndpoint;
    }

    public MhsmPrivateEndpointConnectionItem setPrivateEndpoint(BicepValue<MhsmPrivateEndpoint> privateEndpoint) {
        this.privateEndpoint.assign(privateEndpoint);
        return this;
    }
    public MhsmPrivateEndpointConnectionItem setPrivateEndpoint(MhsmPrivateEndpoint privateEndpoint) {
        return this.setPrivateEndpoint(BicepValue.from(privateEndpoint));
    }

    public BicepValue<String> getEtag() {
        return this.etag;
    }

    public MhsmPrivateEndpointConnectionItem setEtag(BicepValue<String> etag) {
        this.etag.assign(etag);
        return this;
    }
    public MhsmPrivateEndpointConnectionItem setEtag(String etag) {
        return this.setEtag(BicepValue.from(etag));
    }

    public BicepValue<PrivateEndpointConnectionProvisioningState> getProvisioningState() {
        return this.provisioningState;
    }

    public MhsmPrivateEndpointConnectionItem setProvisioningState(BicepValue<PrivateEndpointConnectionProvisioningState> provisioningState) {
        this.provisioningState.assign(provisioningState);
        return this;
    }
    public MhsmPrivateEndpointConnectionItem setProvisioningState(PrivateEndpointConnectionProvisioningState provisioningState) {
        return this.setProvisioningState(BicepValue.from(provisioningState));
    }

}
