// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated;

import com.azure.provisioning.storage.generated.models.BlobInventoryPolicyProperties;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.Resource;
import com.azure.provisioning.tmp.ResourceType;

public class BlobInventoryPolicyResource extends Resource {

    private final BicepValue<BlobInventoryPolicyProperties> properties;
    private final BicepValue<String> name;

    public BlobInventoryPolicyResource(String identifierName) {
        this(identifierName, null);
    }

    public BlobInventoryPolicyResource(String identifierName, String resourceVersion) {
        super(identifierName, new ResourceType("Microsoft.Storage/storageAccounts/inventoryPolicies"), resourceVersion);
        properties = BicepValue.defineProperty(this, "properties", new String[] { "properties" }, false, false, false, null);
        name = BicepValue.defineProperty(this, "name", new String[] { "name" }, false, false, false, null);
    }

    public BicepValue<BlobInventoryPolicyProperties> getProperties() {
        return this.properties;
    }

    public BlobInventoryPolicyResource setProperties(BicepValue<BlobInventoryPolicyProperties> properties) {
        this.properties.assign(properties);
        return this;
    }

    public BlobInventoryPolicyResource setProperties(BlobInventoryPolicyProperties properties) {
        return this.setProperties(BicepValue.from(properties));
    }

    public BicepValue<String> getName() {
        return this.name;
    }

    public BlobInventoryPolicyResource setName(BicepValue<String> name) {
        this.name.assign(name);
        return this;
    }

    public BlobInventoryPolicyResource setName(String name) {
        return this.setName(BicepValue.from(name));
    }

}
