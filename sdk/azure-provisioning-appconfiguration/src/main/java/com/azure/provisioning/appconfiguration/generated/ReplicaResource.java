// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.appconfiguration.generated;

import com.azure.provisioning.appconfiguration.generated.models.ReplicaProperties;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.Resource;
import com.azure.provisioning.tmp.ResourceType;

public class ReplicaResource extends Resource {

    private final BicepValue<ReplicaProperties> properties;
    private final BicepValue<String> location;

    public ReplicaResource(String identifierName) {
        this(identifierName, null);
    }

    public ReplicaResource(String identifierName, String resourceVersion) {
        super(identifierName, new ResourceType("Microsoft.AppConfiguration/configurationStores/replicas"), resourceVersion);
        properties = BicepValue.defineProperty(this, "properties", new String[] { "properties" }, false, false, false, null);
        location = BicepValue.defineProperty(this, "location", new String[] { "location" }, false, false, false, null);
    }

    public BicepValue<ReplicaProperties> getProperties() {
        return this.properties;
    }

    public ReplicaResource setProperties(BicepValue<ReplicaProperties> properties) {
        this.properties.assign(properties);
        return this;
    }

    public ReplicaResource setProperties(ReplicaProperties properties) {
        return this.setProperties(BicepValue.from(properties));
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


    public static class ResourceVersions {

        public static final String V2024_05_01 = "2024-05-01";

        public static final String V2023_03_01 = "2023-03-01";

    }
}
