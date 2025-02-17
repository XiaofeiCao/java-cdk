// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.keyvault.generated.models;

import com.azure.provisioning.keyvault.generated.models.PrivateEndpointConnectionProvisioningState;
import com.azure.provisioning.keyvault.generated.models.MhsmPrivateLinkServiceConnectionState;
import com.azure.provisioning.keyvault.generated.models.MhsmPrivateEndpoint;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class MhsmPrivateEndpointConnectionProperties extends ProvisioningConstruct {

    private final BicepValue<PrivateEndpointConnectionProvisioningState> provisioningState;
    private final BicepValue<MhsmPrivateEndpoint> privateEndpoint;
    private final BicepValue<MhsmPrivateLinkServiceConnectionState> privateLinkServiceConnectionState;

    public MhsmPrivateEndpointConnectionProperties() {
        provisioningState = BicepValue.defineProperty(this, "provisioningState", new String[] { "provisioningState" }, null);
        privateEndpoint = BicepValue.defineProperty(this, "privateEndpoint", new String[] { "privateEndpoint" }, null);
        privateLinkServiceConnectionState = BicepValue.defineProperty(this, "privateLinkServiceConnectionState", new String[] { "privateLinkServiceConnectionState" }, null);
    }

    public BicepValue<PrivateEndpointConnectionProvisioningState> getProvisioningState() {
        return this.provisioningState;
    }

    public MhsmPrivateEndpointConnectionProperties setProvisioningState(BicepValue<PrivateEndpointConnectionProvisioningState> provisioningState) {
        this.provisioningState.assign(provisioningState);
        return this;
    }
    public MhsmPrivateEndpointConnectionProperties setProvisioningState(PrivateEndpointConnectionProvisioningState provisioningState) {
        return this.setProvisioningState(BicepValue.from(provisioningState));
    }

    public BicepValue<MhsmPrivateEndpoint> getPrivateEndpoint() {
        return this.privateEndpoint;
    }

    public MhsmPrivateEndpointConnectionProperties setPrivateEndpoint(BicepValue<MhsmPrivateEndpoint> privateEndpoint) {
        this.privateEndpoint.assign(privateEndpoint);
        return this;
    }
    public MhsmPrivateEndpointConnectionProperties setPrivateEndpoint(MhsmPrivateEndpoint privateEndpoint) {
        return this.setPrivateEndpoint(BicepValue.from(privateEndpoint));
    }

    public BicepValue<MhsmPrivateLinkServiceConnectionState> getPrivateLinkServiceConnectionState() {
        return this.privateLinkServiceConnectionState;
    }

    public MhsmPrivateEndpointConnectionProperties setPrivateLinkServiceConnectionState(BicepValue<MhsmPrivateLinkServiceConnectionState> privateLinkServiceConnectionState) {
        this.privateLinkServiceConnectionState.assign(privateLinkServiceConnectionState);
        return this;
    }
    public MhsmPrivateEndpointConnectionProperties setPrivateLinkServiceConnectionState(MhsmPrivateLinkServiceConnectionState privateLinkServiceConnectionState) {
        return this.setPrivateLinkServiceConnectionState(BicepValue.from(privateLinkServiceConnectionState));
    }

}
