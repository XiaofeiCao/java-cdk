// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated.models;

import java.time.OffsetDateTime;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class TagProperty extends ProvisioningConstruct {

    private final BicepValue<OffsetDateTime> timestamp;
    private final BicepValue<String> upn;
    private final BicepValue<String> tenantId;
    private final BicepValue<String> objectIdentifier;
    private final BicepValue<String> tag;

    public TagProperty() {
        timestamp = BicepValue.defineProperty(this, "timestamp", new String[] { "timestamp" }, null);
        upn = BicepValue.defineProperty(this, "upn", new String[] { "upn" }, null);
        tenantId = BicepValue.defineProperty(this, "tenantId", new String[] { "tenantId" }, null);
        objectIdentifier = BicepValue.defineProperty(this, "objectIdentifier", new String[] { "objectIdentifier" }, null);
        tag = BicepValue.defineProperty(this, "tag", new String[] { "tag" }, null);
    }

    public BicepValue<OffsetDateTime> getTimestamp() {
        return this.timestamp;
    }

    public TagProperty setTimestamp(BicepValue<OffsetDateTime> timestamp) {
        this.timestamp.assign(timestamp);
        return this;
    }
    public TagProperty setTimestamp(OffsetDateTime timestamp) {
        return this.setTimestamp(BicepValue.from(timestamp));
    }

    public BicepValue<String> getUpn() {
        return this.upn;
    }

    public TagProperty setUpn(BicepValue<String> upn) {
        this.upn.assign(upn);
        return this;
    }
    public TagProperty setUpn(String upn) {
        return this.setUpn(BicepValue.from(upn));
    }

    public BicepValue<String> getTenantId() {
        return this.tenantId;
    }

    public TagProperty setTenantId(BicepValue<String> tenantId) {
        this.tenantId.assign(tenantId);
        return this;
    }
    public TagProperty setTenantId(String tenantId) {
        return this.setTenantId(BicepValue.from(tenantId));
    }

    public BicepValue<String> getObjectIdentifier() {
        return this.objectIdentifier;
    }

    public TagProperty setObjectIdentifier(BicepValue<String> objectIdentifier) {
        this.objectIdentifier.assign(objectIdentifier);
        return this;
    }
    public TagProperty setObjectIdentifier(String objectIdentifier) {
        return this.setObjectIdentifier(BicepValue.from(objectIdentifier));
    }

    public BicepValue<String> getTag() {
        return this.tag;
    }

    public TagProperty setTag(BicepValue<String> tag) {
        this.tag.assign(tag);
        return this;
    }
    public TagProperty setTag(String tag) {
        return this.setTag(BicepValue.from(tag));
    }

}
