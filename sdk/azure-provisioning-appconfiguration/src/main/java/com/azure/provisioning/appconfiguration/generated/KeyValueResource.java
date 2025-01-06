// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.appconfiguration.generated;

import com.azure.provisioning.BicepDictionary;
import java.time.OffsetDateTime;
import java.util.Map;
import java.lang.String;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.Resource;
import com.azure.provisioning.tmp.ResourceType;

public class KeyValueResource extends Resource {

    private final BicepValue<String> contentType;
    private final BicepValue<String> label;
    private final BicepDictionary<String> tags;
    private final BicepValue<String> arg2;
    private final BicepValue<String> arg1;
    private final BicepValue<String> value;
    private final BicepValue<OffsetDateTime> lastModified;
    private final BicepValue<String> etag;
    private final BicepValue<String> arg0;
    private final BicepValue<Boolean> locked;
    private final BicepValue<String> key;

    public KeyValueResource(String identifierName) {
        this(identifierName, null);
    }

    public KeyValueResource(String identifierName, String resourceVersion) {
        super(identifierName, new ResourceType("Microsoft.AppConfiguration/configurationStores/keyValues"), resourceVersion);
        contentType = BicepValue.defineProperty(this, "contentType", new String[] { "temp", "contentType" }, false, false, false, null);
        label = BicepValue.defineProperty(this, "label", new String[] { "temp", "label" }, false, false, false, null);
        tags = BicepDictionary.defineProperty(this, "tags", new String[] { "temp", "tags" }, false, false);
        arg2 = BicepValue.defineProperty(this, "arg2", new String[] { "temp", "arg2" }, false, false, false, null);
        arg1 = BicepValue.defineProperty(this, "arg1", new String[] { "temp", "arg1" }, false, false, false, null);
        value = BicepValue.defineProperty(this, "value", new String[] { "temp", "value" }, false, false, false, null);
        lastModified = BicepValue.defineProperty(this, "lastModified", new String[] { "temp", "lastModified" }, false, false, false, null);
        etag = BicepValue.defineProperty(this, "etag", new String[] { "temp", "etag" }, false, false, false, null);
        arg0 = BicepValue.defineProperty(this, "arg0", new String[] { "temp", "arg0" }, false, false, false, null);
        locked = BicepValue.defineProperty(this, "locked", new String[] { "temp", "locked" }, false, false, false, null);
        key = BicepValue.defineProperty(this, "key", new String[] { "temp", "key" }, false, false, false, null);
    }

    public BicepValue<String> getContentType() {
        return this.contentType;
    }

    public KeyValueResource setContentType(BicepValue<String> contentType) {
        this.contentType.assign(contentType);
        return this;
    }

    public KeyValueResource setContentType(String contentType) {
        return this.setContentType(BicepValue.from(contentType));
    }

    public BicepValue<String> getLabel() {
        return this.label;
    }

    public KeyValueResource setLabel(BicepValue<String> label) {
        this.label.assign(label);
        return this;
    }

    public KeyValueResource setLabel(String label) {
        return this.setLabel(BicepValue.from(label));
    }

    public BicepDictionary<String> getTags() {
        return this.tags;
    }

    public KeyValueResource setTags(BicepValue<Map<String,String>> tags) {
        this.tags.assign(tags);
        return this;
    }

    public KeyValueResource setTags(Map<String,String> tags) {
        return this.setTags(BicepValue.from(tags));
    }

    public BicepValue<String> getArg2() {
        return this.arg2;
    }

    public KeyValueResource setArg2(BicepValue<String> arg2) {
        this.arg2.assign(arg2);
        return this;
    }

    public KeyValueResource setArg2(String arg2) {
        return this.setArg2(BicepValue.from(arg2));
    }

    public BicepValue<String> getArg1() {
        return this.arg1;
    }

    public KeyValueResource setArg1(BicepValue<String> arg1) {
        this.arg1.assign(arg1);
        return this;
    }

    public KeyValueResource setArg1(String arg1) {
        return this.setArg1(BicepValue.from(arg1));
    }

    public BicepValue<String> getValue() {
        return this.value;
    }

    public KeyValueResource setValue(BicepValue<String> value) {
        this.value.assign(value);
        return this;
    }

    public KeyValueResource setValue(String value) {
        return this.setValue(BicepValue.from(value));
    }

    public BicepValue<OffsetDateTime> getLastModified() {
        return this.lastModified;
    }

    public KeyValueResource setLastModified(BicepValue<OffsetDateTime> lastModified) {
        this.lastModified.assign(lastModified);
        return this;
    }

    public KeyValueResource setLastModified(OffsetDateTime lastModified) {
        return this.setLastModified(BicepValue.from(lastModified));
    }

    public BicepValue<String> getEtag() {
        return this.etag;
    }

    public KeyValueResource setEtag(BicepValue<String> etag) {
        this.etag.assign(etag);
        return this;
    }

    public KeyValueResource setEtag(String etag) {
        return this.setEtag(BicepValue.from(etag));
    }

    public BicepValue<String> getArg0() {
        return this.arg0;
    }

    public KeyValueResource setArg0(BicepValue<String> arg0) {
        this.arg0.assign(arg0);
        return this;
    }

    public KeyValueResource setArg0(String arg0) {
        return this.setArg0(BicepValue.from(arg0));
    }

    public BicepValue<Boolean> getLocked() {
        return this.locked;
    }

    public KeyValueResource setLocked(BicepValue<Boolean> locked) {
        this.locked.assign(locked);
        return this;
    }

    public KeyValueResource setLocked(Boolean locked) {
        return this.setLocked(BicepValue.from(locked));
    }

    public BicepValue<String> getKey() {
        return this.key;
    }

    public KeyValueResource setKey(BicepValue<String> key) {
        this.key.assign(key);
        return this;
    }

    public KeyValueResource setKey(String key) {
        return this.setKey(BicepValue.from(key));
    }


    public static class ResourceVersions {

        public static final String V2024_06_01_PREVIEW = "2024-06-01-preview";

    }
}
