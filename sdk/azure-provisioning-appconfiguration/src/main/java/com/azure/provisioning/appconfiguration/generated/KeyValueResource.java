// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.appconfiguration.generated;

import com.azure.provisioning.appconfiguration.generated.models.KeyValueProperties;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.Resource;
import com.azure.provisioning.tmp.ResourceType;

public class KeyValueResource extends Resource {

    private final BicepValue<KeyValueProperties> properties;

    public KeyValueResource(String identifierName) {
        this(identifierName, null);
    }

    public KeyValueResource(String identifierName, String resourceVersion) {
        super(identifierName, new ResourceType("Microsoft.AppConfiguration/configurationStores/keyValues"), resourceVersion);
        properties = BicepValue.defineProperty(this, "properties", new String[] { "properties" }, false, false, false, null);
    }

    public BicepValue<KeyValueProperties> getProperties() {
        return this.properties;
    }

    public KeyValueResource setProperties(BicepValue<KeyValueProperties> properties) {
        this.properties.assign(properties);
        return this;
    }

    public KeyValueResource setProperties(KeyValueProperties properties) {
        return this.setProperties(BicepValue.from(properties));
    }


    public static class ResourceVersions {

        public static final String V2024_06_01_PREVIEW = "2024-06-01-preview";

    }
}
