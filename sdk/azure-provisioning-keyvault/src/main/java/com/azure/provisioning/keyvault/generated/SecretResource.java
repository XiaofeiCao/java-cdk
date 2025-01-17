// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.keyvault.generated;

import com.azure.provisioning.keyvault.generated.models.SecretProperties;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.Resource;
import com.azure.provisioning.tmp.ResourceType;

public class SecretResource extends Resource {

    private final BicepValue<String> name;
    private final BicepValue<SecretProperties> properties;
    private final BicepValue<String> location;

    public SecretResource(String identifierName) {
        this(identifierName, null);
    }

    public SecretResource(String identifierName, String resourceVersion) {
        super(identifierName, new ResourceType("Microsoft.KeyVault/vaults/secrets"), resourceVersion);
        name = BicepValue.defineProperty(this, "name", new String[] { "name" }, false, false, false, null);
        properties = BicepValue.defineProperty(this, "properties", new String[] { "properties" }, false, false, false, null);
        location = BicepValue.defineProperty(this, "location", new String[] { "location" }, false, false, false, null);
    }

    public BicepValue<String> getName() {
        return this.name;
    }

    public SecretResource setName(BicepValue<String> name) {
        this.name.assign(name);
        return this;
    }

    public SecretResource setName(String name) {
        return this.setName(BicepValue.from(name));
    }

    public BicepValue<SecretProperties> getProperties() {
        return this.properties;
    }

    public SecretResource setProperties(BicepValue<SecretProperties> properties) {
        this.properties.assign(properties);
        return this;
    }

    public SecretResource setProperties(SecretProperties properties) {
        return this.setProperties(BicepValue.from(properties));
    }

    public BicepValue<String> getLocation() {
        return this.location;
    }

    public SecretResource setLocation(BicepValue<String> location) {
        this.location.assign(location);
        return this;
    }

    public SecretResource setLocation(String location) {
        return this.setLocation(BicepValue.from(location));
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

        public static final String V2018_02_14 = "2018-02-14";

        public static final String V2016_10_01 = "2016-10-01";

        public static final String V2015_06_01 = "2015-06-01";

    }
}
