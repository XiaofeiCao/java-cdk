// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.appconfiguration.generated;

import com.azure.provisioning.appconfiguration.generated.models.ConfigurationStoreProperties;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.Resource;
import com.azure.provisioning.tmp.ResourceType;

public class ConfigurationStoreResource extends Resource {

    private final BicepValue<ConfigurationStoreProperties> properties;
    private final BicepValue<String> location;

    public ConfigurationStoreResource(String identifierName) {
        this(identifierName, null);
    }

    public ConfigurationStoreResource(String identifierName, String resourceVersion) {
        super(identifierName, new ResourceType("Microsoft.AppConfiguration/configurationStores"), resourceVersion);
        properties = BicepValue.defineProperty(this, "properties", new String[] { "properties" }, false, false, false, null);
        location = BicepValue.defineProperty(this, "location", new String[] { "location" }, false, false, false, null);
    }

    public BicepValue<ConfigurationStoreProperties> getProperties() {
        return this.properties;
    }

    public ConfigurationStoreResource setProperties(BicepValue<ConfigurationStoreProperties> properties) {
        this.properties.assign(properties);
        return this;
    }

    public ConfigurationStoreResource setProperties(ConfigurationStoreProperties properties) {
        return this.setProperties(BicepValue.from(properties));
    }

    public BicepValue<String> getLocation() {
        return this.location;
    }

    public ConfigurationStoreResource setLocation(BicepValue<String> location) {
        this.location.assign(location);
        return this;
    }

    public ConfigurationStoreResource setLocation(String location) {
        return this.setLocation(BicepValue.from(location));
    }


    public static class ResourceVersions {

        public static final String V2024_05_01 = "2024-05-01";

        public static final String V2023_03_01 = "2023-03-01";

        public static final String V2022_05_01 = "2022-05-01";

        public static final String V2020_06_01 = "2020-06-01";

        public static final String V2019_10_01 = "2019-10-01";

    }
}
