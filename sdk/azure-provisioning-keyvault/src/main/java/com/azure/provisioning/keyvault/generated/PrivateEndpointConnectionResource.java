// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.keyvault.generated;

import com.azure.provisioning.keyvault.generated.models.PrivateEndpointConnectionProperties;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.Resource;
import com.azure.provisioning.tmp.ResourceType;

public class PrivateEndpointConnectionResource extends Resource {

    private final BicepValue<String> name;
    private final BicepValue<PrivateEndpointConnectionProperties> properties;
    private final BicepValue<String> location;
    private final BicepValue<String> tags;
    private final BicepValue<String> etag;

    public PrivateEndpointConnectionResource(String identifierName) {
        this(identifierName, null);
    }

    public PrivateEndpointConnectionResource(String identifierName, String resourceVersion) {
        super(identifierName, new ResourceType("Microsoft.KeyVault/vaults/privateEndpointConnections"), resourceVersion);
        name = BicepValue.defineProperty(this, "name", new String[] { "name" }, false, false, false, null);
        properties = BicepValue.defineProperty(this, "properties", new String[] { "properties" }, false, false, false, null);
        location = BicepValue.defineProperty(this, "location", new String[] { "location" }, false, false, false, null);
        tags = BicepValue.defineProperty(this, "tags", new String[] { "tags" }, false, false, false, null);
        etag = BicepValue.defineProperty(this, "etag", new String[] { "etag" }, false, false, false, null);
    }

    public BicepValue<String> getName() {
        return this.name;
    }

    public PrivateEndpointConnectionResource setName(BicepValue<String> name) {
        this.name.assign(name);
        return this;
    }

    public PrivateEndpointConnectionResource setName(String name) {
        return this.setName(BicepValue.from(name));
    }

    public BicepValue<PrivateEndpointConnectionProperties> getProperties() {
        return this.properties;
    }

    public PrivateEndpointConnectionResource setProperties(BicepValue<PrivateEndpointConnectionProperties> properties) {
        this.properties.assign(properties);
        return this;
    }

    public PrivateEndpointConnectionResource setProperties(PrivateEndpointConnectionProperties properties) {
        return this.setProperties(BicepValue.from(properties));
    }

    public BicepValue<String> getLocation() {
        return this.location;
    }

    public PrivateEndpointConnectionResource setLocation(BicepValue<String> location) {
        this.location.assign(location);
        return this;
    }

    public PrivateEndpointConnectionResource setLocation(String location) {
        return this.setLocation(BicepValue.from(location));
    }

    public BicepValue<String> getTags() {
        return this.tags;
    }

    public PrivateEndpointConnectionResource setTags(BicepValue<String> tags) {
        this.tags.assign(tags);
        return this;
    }

    public PrivateEndpointConnectionResource setTags(String tags) {
        return this.setTags(BicepValue.from(tags));
    }

    public BicepValue<String> getEtag() {
        return this.etag;
    }

    public PrivateEndpointConnectionResource setEtag(BicepValue<String> etag) {
        this.etag.assign(etag);
        return this;
    }

    public PrivateEndpointConnectionResource setEtag(String etag) {
        return this.setEtag(BicepValue.from(etag));
    }

}
