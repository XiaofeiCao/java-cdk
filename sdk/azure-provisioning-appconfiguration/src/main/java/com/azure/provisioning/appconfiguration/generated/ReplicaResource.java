// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.appconfiguration.generated;

import com.azure.provisioning.appconfiguration.generated.models.ReplicaProvisioningState;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.Resource;
import com.azure.provisioning.tmp.ResourceType;

public class ReplicaResource extends Resource {

    private final BicepValue<String> endpoint;
    private final BicepValue<ReplicaProvisioningState> provisioningState;
    private final BicepValue<String> arg2;
    private final BicepValue<String> arg1;
    private final BicepValue<String> location;
    private final BicepValue<String> arg0;

    public ReplicaResource(String identifierName) {
        this(identifierName, null);
    }

    public ReplicaResource(String identifierName, String resourceVersion) {
        super(identifierName, new ResourceType("Microsoft.AppConfiguration/configurationStores/replicas"), resourceVersion);
        endpoint = BicepValue.defineProperty(this, "endpoint", new String[] { "temp", "endpoint" }, false, false, false, null);
        provisioningState = BicepValue.defineProperty(this, "provisioningState", new String[] { "temp", "provisioningState" }, false, false, false, null);
        arg2 = BicepValue.defineProperty(this, "arg2", new String[] { "temp", "arg2" }, false, false, false, null);
        arg1 = BicepValue.defineProperty(this, "arg1", new String[] { "temp", "arg1" }, false, false, false, null);
        location = BicepValue.defineProperty(this, "location", new String[] { "temp", "location" }, false, false, false, null);
        arg0 = BicepValue.defineProperty(this, "arg0", new String[] { "temp", "arg0" }, false, false, false, null);
    }

    public BicepValue<String> getEndpoint() {
        return this.endpoint;
    }

    public ReplicaResource setEndpoint(BicepValue<String> endpoint) {
        this.endpoint.assign(endpoint);
        return this;
    }

    public ReplicaResource setEndpoint(String endpoint) {
        return this.setEndpoint(BicepValue.from(endpoint));
    }

    public BicepValue<ReplicaProvisioningState> getProvisioningState() {
        return this.provisioningState;
    }

    public ReplicaResource setProvisioningState(BicepValue<ReplicaProvisioningState> provisioningState) {
        this.provisioningState.assign(provisioningState);
        return this;
    }

    public ReplicaResource setProvisioningState(ReplicaProvisioningState provisioningState) {
        return this.setProvisioningState(BicepValue.from(provisioningState));
    }

    public BicepValue<String> getArg2() {
        return this.arg2;
    }

    public ReplicaResource setArg2(BicepValue<String> arg2) {
        this.arg2.assign(arg2);
        return this;
    }

    public ReplicaResource setArg2(String arg2) {
        return this.setArg2(BicepValue.from(arg2));
    }

    public BicepValue<String> getArg1() {
        return this.arg1;
    }

    public ReplicaResource setArg1(BicepValue<String> arg1) {
        this.arg1.assign(arg1);
        return this;
    }

    public ReplicaResource setArg1(String arg1) {
        return this.setArg1(BicepValue.from(arg1));
    }

    public BicepValue<String> getLocation() {
        return this.location;
    }

    public ReplicaResource setLocation(BicepValue<String> location) {
        this.location.assign(location);
        return this;
    }

    public ReplicaResource setLocation(String location) {
        return this.setLocation(BicepValue.from(location));
    }

    public BicepValue<String> getArg0() {
        return this.arg0;
    }

    public ReplicaResource setArg0(BicepValue<String> arg0) {
        this.arg0.assign(arg0);
        return this;
    }

    public ReplicaResource setArg0(String arg0) {
        return this.setArg0(BicepValue.from(arg0));
    }


    public static class ResourceVersions {

        public static final String V2024_05_01 = "2024-05-01";

        public static final String V2023_03_01 = "2023-03-01";

    }
}
