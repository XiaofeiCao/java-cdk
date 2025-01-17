// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated;

import com.azure.provisioning.storage.generated.models.ContainerProperties;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.Resource;
import com.azure.provisioning.tmp.ResourceType;

public class BlobContainerResource extends Resource {

    private final BicepValue<ContainerProperties> properties;
    private final BicepValue<String> name;
    private final BicepValue<String> etag;

    public BlobContainerResource(String identifierName) {
        this(identifierName, null);
    }

    public BlobContainerResource(String identifierName, String resourceVersion) {
        super(identifierName, new ResourceType("Microsoft.Storage/storageAccounts/blobServices/containers"), resourceVersion);
        properties = BicepValue.defineProperty(this, "properties", new String[] { "properties" }, false, false, false, null);
        name = BicepValue.defineProperty(this, "name", new String[] { "name" }, false, false, false, null);
        etag = BicepValue.defineProperty(this, "etag", new String[] { "etag" }, false, false, false, null);
    }

    public BicepValue<ContainerProperties> getProperties() {
        return this.properties;
    }

    public BlobContainerResource setProperties(BicepValue<ContainerProperties> properties) {
        this.properties.assign(properties);
        return this;
    }

    public BlobContainerResource setProperties(ContainerProperties properties) {
        return this.setProperties(BicepValue.from(properties));
    }

    public BicepValue<String> getName() {
        return this.name;
    }

    public BlobContainerResource setName(BicepValue<String> name) {
        this.name.assign(name);
        return this;
    }

    public BlobContainerResource setName(String name) {
        return this.setName(BicepValue.from(name));
    }

    public BicepValue<String> getEtag() {
        return this.etag;
    }

    public BlobContainerResource setEtag(BicepValue<String> etag) {
        this.etag.assign(etag);
        return this;
    }

    public BlobContainerResource setEtag(String etag) {
        return this.setEtag(BicepValue.from(etag));
    }

}
