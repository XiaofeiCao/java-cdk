// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.appconfiguration.generated;

import com.azure.provisioning.appconfiguration.generated.models.PrivateLinkServiceConnectionState;
import com.azure.provisioning.appconfiguration.generated.models.PrivateEndpoint;
import com.azure.provisioning.appconfiguration.generated.models.ProvisioningState;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.Resource;
import com.azure.provisioning.tmp.ResourceType;

public class PrivateEndpointConnectionResource extends Resource {

    private final BicepValue<ProvisioningState> provisioningState;
    private final BicepValue<PrivateEndpoint> privateEndpoint;
    private final BicepValue<String> arg2;
    private final BicepValue<String> arg1;
    private final BicepValue<String> arg0;
    private final BicepValue<PrivateLinkServiceConnectionState> privateLinkServiceConnectionState;

    public PrivateEndpointConnectionResource(String identifierName) {
        this(identifierName, null);
    }

    public PrivateEndpointConnectionResource(String identifierName, String resourceVersion) {
        super(identifierName, new ResourceType("Microsoft.AppConfiguration/configurationStores/privateEndpointConnections"), resourceVersion);
        provisioningState = BicepValue.defineProperty(this, "provisioningState", new String[] { "temp", "provisioningState" }, false, false, false, null);
        privateEndpoint = BicepValue.defineProperty(this, "privateEndpoint", new String[] { "temp", "privateEndpoint" }, false, false, false, null);
        arg2 = BicepValue.defineProperty(this, "arg2", new String[] { "temp", "arg2" }, false, false, false, null);
        arg1 = BicepValue.defineProperty(this, "arg1", new String[] { "temp", "arg1" }, false, false, false, null);
        arg0 = BicepValue.defineProperty(this, "arg0", new String[] { "temp", "arg0" }, false, false, false, null);
        privateLinkServiceConnectionState = BicepValue.defineProperty(this, "privateLinkServiceConnectionState", new String[] { "temp", "privateLinkServiceConnectionState" }, false, false, false, null);
    }

    public BicepValue<ProvisioningState> getProvisioningState() {
        return this.provisioningState;
    }

    public PrivateEndpointConnectionResource setProvisioningState(BicepValue<ProvisioningState> provisioningState) {
        this.provisioningState.assign(provisioningState);
        return this;
    }

    public PrivateEndpointConnectionResource setProvisioningState(ProvisioningState provisioningState) {
        return this.setProvisioningState(BicepValue.from(provisioningState));
    }

    public BicepValue<PrivateEndpoint> getPrivateEndpoint() {
        return this.privateEndpoint;
    }

    public PrivateEndpointConnectionResource setPrivateEndpoint(BicepValue<PrivateEndpoint> privateEndpoint) {
        this.privateEndpoint.assign(privateEndpoint);
        return this;
    }

    public PrivateEndpointConnectionResource setPrivateEndpoint(PrivateEndpoint privateEndpoint) {
        return this.setPrivateEndpoint(BicepValue.from(privateEndpoint));
    }

    public BicepValue<String> getArg2() {
        return this.arg2;
    }

    public PrivateEndpointConnectionResource setArg2(BicepValue<String> arg2) {
        this.arg2.assign(arg2);
        return this;
    }

    public PrivateEndpointConnectionResource setArg2(String arg2) {
        return this.setArg2(BicepValue.from(arg2));
    }

    public BicepValue<String> getArg1() {
        return this.arg1;
    }

    public PrivateEndpointConnectionResource setArg1(BicepValue<String> arg1) {
        this.arg1.assign(arg1);
        return this;
    }

    public PrivateEndpointConnectionResource setArg1(String arg1) {
        return this.setArg1(BicepValue.from(arg1));
    }

    public BicepValue<String> getArg0() {
        return this.arg0;
    }

    public PrivateEndpointConnectionResource setArg0(BicepValue<String> arg0) {
        this.arg0.assign(arg0);
        return this;
    }

    public PrivateEndpointConnectionResource setArg0(String arg0) {
        return this.setArg0(BicepValue.from(arg0));
    }

    public BicepValue<PrivateLinkServiceConnectionState> getPrivateLinkServiceConnectionState() {
        return this.privateLinkServiceConnectionState;
    }

    public PrivateEndpointConnectionResource setPrivateLinkServiceConnectionState(BicepValue<PrivateLinkServiceConnectionState> privateLinkServiceConnectionState) {
        this.privateLinkServiceConnectionState.assign(privateLinkServiceConnectionState);
        return this;
    }

    public PrivateEndpointConnectionResource setPrivateLinkServiceConnectionState(PrivateLinkServiceConnectionState privateLinkServiceConnectionState) {
        return this.setPrivateLinkServiceConnectionState(BicepValue.from(privateLinkServiceConnectionState));
    }

}
