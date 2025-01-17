// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated;

import com.azure.provisioning.storage.generated.models.ImmutabilityPolicyProperty;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.Resource;
import com.azure.provisioning.tmp.ResourceType;

public class ImmutabilityPolicyResource extends Resource {

    private final BicepValue<String> name;
    private final BicepValue<ImmutabilityPolicyProperty> properties;
    private final BicepValue<String> etag;

    public ImmutabilityPolicyResource(String identifierName) {
        this(identifierName, null);
    }

    public ImmutabilityPolicyResource(String identifierName, String resourceVersion) {
        super(identifierName, new ResourceType("Microsoft.Storage/storageAccounts/blobServices/containers/immutabilityPolicies"), resourceVersion);
        name = BicepValue.defineProperty(this, "name", new String[] { "name" }, false, false, false, null);
        properties = BicepValue.defineProperty(this, "properties", new String[] { "properties" }, false, false, false, null);
        etag = BicepValue.defineProperty(this, "etag", new String[] { "etag" }, false, false, false, null);
    }

    public BicepValue<String> getName() {
        return this.name;
    }

    public ImmutabilityPolicyResource setName(BicepValue<String> name) {
        this.name.assign(name);
        return this;
    }

    public ImmutabilityPolicyResource setName(String name) {
        return this.setName(BicepValue.from(name));
    }

    public BicepValue<ImmutabilityPolicyProperty> getProperties() {
        return this.properties;
    }

    public ImmutabilityPolicyResource setProperties(BicepValue<ImmutabilityPolicyProperty> properties) {
        this.properties.assign(properties);
        return this;
    }

    public ImmutabilityPolicyResource setProperties(ImmutabilityPolicyProperty properties) {
        return this.setProperties(BicepValue.from(properties));
    }

    public BicepValue<String> getEtag() {
        return this.etag;
    }

    public ImmutabilityPolicyResource setEtag(BicepValue<String> etag) {
        this.etag.assign(etag);
        return this;
    }

    public ImmutabilityPolicyResource setEtag(String etag) {
        return this.setEtag(BicepValue.from(etag));
    }

}
