// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated;

import com.azure.provisioning.storage.generated.models.LocalUserProperties;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.Resource;
import com.azure.provisioning.tmp.ResourceType;

public class LocalUserResource extends Resource {

    private final BicepValue<LocalUserProperties> properties;
    private final BicepValue<String> name;

    public LocalUserResource(String identifierName) {
        this(identifierName, null);
    }

    public LocalUserResource(String identifierName, String resourceVersion) {
        super(identifierName, new ResourceType("Microsoft.Storage/storageAccounts/localUsers"), resourceVersion);
        properties = BicepValue.defineProperty(this, "properties", new String[] { "properties" }, false, false, false, null);
        name = BicepValue.defineProperty(this, "name", new String[] { "name" }, false, false, false, null);
    }

    public BicepValue<LocalUserProperties> getProperties() {
        return this.properties;
    }

    public LocalUserResource setProperties(BicepValue<LocalUserProperties> properties) {
        this.properties.assign(properties);
        return this;
    }

    public LocalUserResource setProperties(LocalUserProperties properties) {
        return this.setProperties(BicepValue.from(properties));
    }

    public BicepValue<String> getName() {
        return this.name;
    }

    public LocalUserResource setName(BicepValue<String> name) {
        this.name.assign(name);
        return this;
    }

    public LocalUserResource setName(String name) {
        return this.setName(BicepValue.from(name));
    }

}
