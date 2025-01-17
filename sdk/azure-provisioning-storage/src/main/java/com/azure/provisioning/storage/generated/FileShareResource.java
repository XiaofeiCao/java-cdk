// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated;

import com.azure.provisioning.storage.generated.models.FileShareProperties;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.Resource;
import com.azure.provisioning.tmp.ResourceType;

public class FileShareResource extends Resource {

    private final BicepValue<String> name;
    private final BicepValue<FileShareProperties> properties;
    private final BicepValue<String> etag;

    public FileShareResource(String identifierName) {
        this(identifierName, null);
    }

    public FileShareResource(String identifierName, String resourceVersion) {
        super(identifierName, new ResourceType("Microsoft.Storage/storageAccounts/fileServices/shares"), resourceVersion);
        name = BicepValue.defineProperty(this, "name", new String[] { "name" }, false, false, false, null);
        properties = BicepValue.defineProperty(this, "properties", new String[] { "properties" }, false, false, false, null);
        etag = BicepValue.defineProperty(this, "etag", new String[] { "etag" }, false, false, false, null);
    }

    public BicepValue<String> getName() {
        return this.name;
    }

    public FileShareResource setName(BicepValue<String> name) {
        this.name.assign(name);
        return this;
    }

    public FileShareResource setName(String name) {
        return this.setName(BicepValue.from(name));
    }

    public BicepValue<FileShareProperties> getProperties() {
        return this.properties;
    }

    public FileShareResource setProperties(BicepValue<FileShareProperties> properties) {
        this.properties.assign(properties);
        return this;
    }

    public FileShareResource setProperties(FileShareProperties properties) {
        return this.setProperties(BicepValue.from(properties));
    }

    public BicepValue<String> getEtag() {
        return this.etag;
    }

    public FileShareResource setEtag(BicepValue<String> etag) {
        this.etag.assign(etag);
        return this;
    }

    public FileShareResource setEtag(String etag) {
        return this.setEtag(BicepValue.from(etag));
    }

}
