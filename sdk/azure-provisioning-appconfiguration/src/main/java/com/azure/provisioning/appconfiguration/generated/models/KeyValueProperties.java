// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.appconfiguration.generated.models;

import java.time.OffsetDateTime;
import com.azure.provisioning.BicepDictionary;
import java.util.Map;
import java.lang.String;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class KeyValueProperties extends ProvisioningConstruct {

    private final BicepValue<String> contentType;
    private final BicepValue<String> key;
    private final BicepValue<String> label;
    private final BicepValue<String> value;
    private final BicepValue<OffsetDateTime> lastModified;
    private final BicepValue<Boolean> locked;
    private final BicepValue<String> etag;
    private final BicepDictionary<String> tags;

    public KeyValueProperties() {
        contentType = BicepValue.defineProperty(this, "contentType", new String[] { "contentType" }, null);
        key = BicepValue.defineProperty(this, "key", new String[] { "key" }, null);
        label = BicepValue.defineProperty(this, "label", new String[] { "label" }, null);
        value = BicepValue.defineProperty(this, "value", new String[] { "value" }, null);
        lastModified = BicepValue.defineProperty(this, "lastModified", new String[] { "lastModified" }, null);
        locked = BicepValue.defineProperty(this, "locked", new String[] { "locked" }, null);
        etag = BicepValue.defineProperty(this, "etag", new String[] { "etag" }, null);
        tags = BicepDictionary.defineProperty(this, "tags", new String[] { "tags" }, false, false);
    }

    public BicepValue<String> getContentType() {
        return this.contentType;
    }

    public KeyValueProperties setContentType(BicepValue<String> contentType) {
        this.contentType.assign(contentType);
        return this;
    }
    public BicepValue<String> getKey() {
        return this.key;
    }

    public KeyValueProperties setKey(BicepValue<String> key) {
        this.key.assign(key);
        return this;
    }
    public BicepValue<String> getLabel() {
        return this.label;
    }

    public KeyValueProperties setLabel(BicepValue<String> label) {
        this.label.assign(label);
        return this;
    }
    public BicepValue<String> getValue() {
        return this.value;
    }

    public KeyValueProperties setValue(BicepValue<String> value) {
        this.value.assign(value);
        return this;
    }
    public BicepValue<OffsetDateTime> getLastModified() {
        return this.lastModified;
    }

    public KeyValueProperties setLastModified(BicepValue<OffsetDateTime> lastModified) {
        this.lastModified.assign(lastModified);
        return this;
    }
    public BicepValue<Boolean> getLocked() {
        return this.locked;
    }

    public KeyValueProperties setLocked(BicepValue<Boolean> locked) {
        this.locked.assign(locked);
        return this;
    }
    public BicepValue<String> getEtag() {
        return this.etag;
    }

    public KeyValueProperties setEtag(BicepValue<String> etag) {
        this.etag.assign(etag);
        return this;
    }
    public BicepDictionary<String> getTags() {
        return this.tags;
    }

    public KeyValueProperties setTags(BicepDictionary<String> tags) {
        this.tags.assign(tags);
        return this;
    }
}
