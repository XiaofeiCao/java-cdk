// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated;

import com.azure.provisioning.storage.generated.models.ObjectReplicationPolicyProperties;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.Resource;
import com.azure.provisioning.tmp.ResourceType;

public class ObjectReplicationPolicyResource extends Resource {

    private final BicepValue<ObjectReplicationPolicyProperties> properties;
    private final BicepValue<String> name;

    public ObjectReplicationPolicyResource(String identifierName) {
        this(identifierName, null);
    }

    public ObjectReplicationPolicyResource(String identifierName, String resourceVersion) {
        super(identifierName, new ResourceType("Microsoft.Storage/storageAccounts/objectReplicationPolicies"), resourceVersion);
        properties = BicepValue.defineProperty(this, "properties", new String[] { "properties" }, false, false, false, null);
        name = BicepValue.defineProperty(this, "name", new String[] { "name" }, false, false, false, null);
    }

    public BicepValue<ObjectReplicationPolicyProperties> getProperties() {
        return this.properties;
    }

    public ObjectReplicationPolicyResource setProperties(BicepValue<ObjectReplicationPolicyProperties> properties) {
        this.properties.assign(properties);
        return this;
    }

    public ObjectReplicationPolicyResource setProperties(ObjectReplicationPolicyProperties properties) {
        return this.setProperties(BicepValue.from(properties));
    }

    public BicepValue<String> getName() {
        return this.name;
    }

    public ObjectReplicationPolicyResource setName(BicepValue<String> name) {
        this.name.assign(name);
        return this;
    }

    public ObjectReplicationPolicyResource setName(String name) {
        return this.setName(BicepValue.from(name));
    }

}
