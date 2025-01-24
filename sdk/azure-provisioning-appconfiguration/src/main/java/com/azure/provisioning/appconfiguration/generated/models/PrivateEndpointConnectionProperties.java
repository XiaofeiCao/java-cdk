// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.appconfiguration.generated.models;

import com.azure.provisioning.appconfiguration.generated.models.PrivateLinkServiceConnectionState;
import com.azure.provisioning.appconfiguration.generated.models.PrivateEndpoint;
import com.azure.provisioning.appconfiguration.generated.models.ProvisioningState;
import com.azure.core.util.logging.ClientLogger;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class PrivateEndpointConnectionProperties extends ProvisioningConstruct {

    private final BicepValue<ClientLogger> lOGGER;
    private final BicepValue<PrivateLinkServiceConnectionState> privateLinkServiceConnectionState;
    private final BicepValue<PrivateEndpoint> privateEndpoint;
    private final BicepValue<ProvisioningState> provisioningState;

    public PrivateEndpointConnectionProperties() {
        lOGGER = BicepValue.defineProperty(this, "lOGGER", new String[] { "lOGGER" }, null);
        privateLinkServiceConnectionState = BicepValue.defineProperty(this, "privateLinkServiceConnectionState", new String[] { "privateLinkServiceConnectionState" }, null);
        privateEndpoint = BicepValue.defineProperty(this, "privateEndpoint", new String[] { "privateEndpoint" }, null);
        provisioningState = BicepValue.defineProperty(this, "provisioningState", new String[] { "provisioningState" }, null);
    }

    public BicepValue<ClientLogger> getLOGGER() {
        return this.lOGGER;
    }

    public PrivateEndpointConnectionProperties setLOGGER(BicepValue<ClientLogger> lOGGER) {
        this.lOGGER.assign(lOGGER);
        return this;
    }
    public PrivateEndpointConnectionProperties setLOGGER(ClientLogger lOGGER) {
        return this.setLOGGER(BicepValue.from(lOGGER));
    }

    public BicepValue<PrivateLinkServiceConnectionState> getPrivateLinkServiceConnectionState() {
        return this.privateLinkServiceConnectionState;
    }

    public PrivateEndpointConnectionProperties setPrivateLinkServiceConnectionState(BicepValue<PrivateLinkServiceConnectionState> privateLinkServiceConnectionState) {
        this.privateLinkServiceConnectionState.assign(privateLinkServiceConnectionState);
        return this;
    }
    public PrivateEndpointConnectionProperties setPrivateLinkServiceConnectionState(PrivateLinkServiceConnectionState privateLinkServiceConnectionState) {
        return this.setPrivateLinkServiceConnectionState(BicepValue.from(privateLinkServiceConnectionState));
    }

    public BicepValue<PrivateEndpoint> getPrivateEndpoint() {
        return this.privateEndpoint;
    }

    public PrivateEndpointConnectionProperties setPrivateEndpoint(BicepValue<PrivateEndpoint> privateEndpoint) {
        this.privateEndpoint.assign(privateEndpoint);
        return this;
    }
    public PrivateEndpointConnectionProperties setPrivateEndpoint(PrivateEndpoint privateEndpoint) {
        return this.setPrivateEndpoint(BicepValue.from(privateEndpoint));
    }

    public BicepValue<ProvisioningState> getProvisioningState() {
        return this.provisioningState;
    }

    public PrivateEndpointConnectionProperties setProvisioningState(BicepValue<ProvisioningState> provisioningState) {
        this.provisioningState.assign(provisioningState);
        return this;
    }
    public PrivateEndpointConnectionProperties setProvisioningState(ProvisioningState provisioningState) {
        return this.setProvisioningState(BicepValue.from(provisioningState));
    }

}
