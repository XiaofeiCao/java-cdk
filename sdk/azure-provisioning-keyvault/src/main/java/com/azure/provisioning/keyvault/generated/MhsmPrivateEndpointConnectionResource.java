// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.keyvault.generated;

import com.azure.provisioning.keyvault.generated.models.MhsmPrivateEndpointConnectionProperties;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.Resource;
import com.azure.provisioning.tmp.ResourceType;

public class MhsmPrivateEndpointConnectionResource extends Resource {

    private final BicepValue<MhsmPrivateEndpointConnectionProperties> properties;
    private final BicepValue<String> name;
    private final BicepValue<String> location;
    private final BicepValue<String> tags;
    private final BicepValue<String> etag;

    public MhsmPrivateEndpointConnectionResource(String identifierName) {
        this(identifierName, null);
    }

    public MhsmPrivateEndpointConnectionResource(String identifierName, String resourceVersion) {
        super(identifierName, new ResourceType("Microsoft.KeyVault/managedHSMs/privateEndpointConnections"), resourceVersion);
        properties = BicepValue.defineProperty(this, "properties", new String[] { "properties" }, false, false, false, null);
        name = BicepValue.defineProperty(this, "name", new String[] { "name" }, false, false, false, null);
        location = BicepValue.defineProperty(this, "location", new String[] { "location" }, false, false, false, null);
        tags = BicepValue.defineProperty(this, "tags", new String[] { "tags" }, false, false, false, null);
        etag = BicepValue.defineProperty(this, "etag", new String[] { "etag" }, false, false, false, null);
    }

    public BicepValue<MhsmPrivateEndpointConnectionProperties> getProperties() {
        return this.properties;
    }

    public MhsmPrivateEndpointConnectionResource setProperties(BicepValue<MhsmPrivateEndpointConnectionProperties> properties) {
        this.properties.assign(properties);
        return this;
    }

    public MhsmPrivateEndpointConnectionResource setProperties(MhsmPrivateEndpointConnectionProperties properties) {
        return this.setProperties(BicepValue.from(properties));
    }

    public BicepValue<String> getName() {
        return this.name;
    }

    public MhsmPrivateEndpointConnectionResource setName(BicepValue<String> name) {
        this.name.assign(name);
        return this;
    }

    public MhsmPrivateEndpointConnectionResource setName(String name) {
        return this.setName(BicepValue.from(name));
    }

    public BicepValue<String> getLocation() {
        return this.location;
    }

    public MhsmPrivateEndpointConnectionResource setLocation(BicepValue<String> location) {
        this.location.assign(location);
        return this;
    }

    public MhsmPrivateEndpointConnectionResource setLocation(String location) {
        return this.setLocation(BicepValue.from(location));
    }

    public BicepValue<String> getTags() {
        return this.tags;
    }

    public MhsmPrivateEndpointConnectionResource setTags(BicepValue<String> tags) {
        this.tags.assign(tags);
        return this;
    }

    public MhsmPrivateEndpointConnectionResource setTags(String tags) {
        return this.setTags(BicepValue.from(tags));
    }

    public BicepValue<String> getEtag() {
        return this.etag;
    }

    public MhsmPrivateEndpointConnectionResource setEtag(BicepValue<String> etag) {
        this.etag.assign(etag);
        return this;
    }

    public MhsmPrivateEndpointConnectionResource setEtag(String etag) {
        return this.setEtag(BicepValue.from(etag));
    }

}
