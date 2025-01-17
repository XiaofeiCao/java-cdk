// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated;

import com.azure.provisioning.storage.generated.models.TableProperties;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.Resource;
import com.azure.provisioning.tmp.ResourceType;

public class TableResource extends Resource {

    private final BicepValue<TableProperties> properties;
    private final BicepValue<String> name;

    public TableResource(String identifierName) {
        this(identifierName, null);
    }

    public TableResource(String identifierName, String resourceVersion) {
        super(identifierName, new ResourceType("Microsoft.Storage/storageAccounts/tableServices/tables"), resourceVersion);
        properties = BicepValue.defineProperty(this, "properties", new String[] { "properties" }, false, false, false, null);
        name = BicepValue.defineProperty(this, "name", new String[] { "name" }, false, false, false, null);
    }

    public BicepValue<TableProperties> getProperties() {
        return this.properties;
    }

    public TableResource setProperties(BicepValue<TableProperties> properties) {
        this.properties.assign(properties);
        return this;
    }

    public TableResource setProperties(TableProperties properties) {
        return this.setProperties(BicepValue.from(properties));
    }

    public BicepValue<String> getName() {
        return this.name;
    }

    public TableResource setName(BicepValue<String> name) {
        this.name.assign(name);
        return this;
    }

    public TableResource setName(String name) {
        return this.setName(BicepValue.from(name));
    }

}
