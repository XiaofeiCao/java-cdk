// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.keyvault.generated;

import com.azure.provisioning.keyvault.generated.models.KeyProperties;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.Resource;
import com.azure.provisioning.tmp.ResourceType;

public class KeyResource extends Resource {

    private final BicepValue<KeyProperties> properties;
    private final BicepValue<String> location;
    private final BicepValue<String> name;

    public KeyResource(String identifierName) {
        this(identifierName, null);
    }

    public KeyResource(String identifierName, String resourceVersion) {
        super(identifierName, new ResourceType("Microsoft.KeyVault/vaults/keys"), resourceVersion);
        properties = BicepValue.defineProperty(this, "properties", new String[] { "properties" }, false, false, false, null);
        location = BicepValue.defineProperty(this, "location", new String[] { "location" }, false, false, false, null);
        name = BicepValue.defineProperty(this, "name", new String[] { "name" }, false, false, false, null);
    }

    public BicepValue<KeyProperties> getProperties() {
        return this.properties;
    }

    public KeyResource setProperties(BicepValue<KeyProperties> properties) {
        this.properties.assign(properties);
        return this;
    }

    public KeyResource setProperties(KeyProperties properties) {
        return this.setProperties(BicepValue.from(properties));
    }

    public BicepValue<String> getLocation() {
        return this.location;
    }

    public KeyResource setLocation(BicepValue<String> location) {
        this.location.assign(location);
        return this;
    }

    public KeyResource setLocation(String location) {
        return this.setLocation(BicepValue.from(location));
    }

    public BicepValue<String> getName() {
        return this.name;
    }

    public KeyResource setName(BicepValue<String> name) {
        this.name.assign(name);
        return this;
    }

    public KeyResource setName(String name) {
        return this.setName(BicepValue.from(name));
    }


    public static class ResourceVersions {

        public static final String V2024_11_01 = "2024-11-01";

        public static final String V2023_08_01_PREVIEW = "2023-08-01-PREVIEW";

        public static final String V2023_07_01 = "2023-07-01";

        public static final String V2023_02_01 = "2023-02-01";

        public static final String V2022_11_01 = "2022-11-01";

        public static final String V2022_07_01 = "2022-07-01";

        public static final String V2021_10_01 = "2021-10-01";

        public static final String V2019_09_01 = "2019-09-01";

    }
}
