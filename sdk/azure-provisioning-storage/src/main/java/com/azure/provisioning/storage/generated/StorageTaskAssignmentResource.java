// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated;

import com.azure.provisioning.storage.generated.models.StorageTaskAssignmentProperties;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.Resource;
import com.azure.provisioning.tmp.ResourceType;

public class StorageTaskAssignmentResource extends Resource {

    private final BicepValue<StorageTaskAssignmentProperties> properties;
    private final BicepValue<String> name;

    public StorageTaskAssignmentResource(String identifierName) {
        this(identifierName, null);
    }

    public StorageTaskAssignmentResource(String identifierName, String resourceVersion) {
        super(identifierName, new ResourceType("Microsoft.Storage/storageAccounts/storageTaskAssignments"), resourceVersion);
        properties = BicepValue.defineProperty(this, "properties", new String[] { "properties" }, false, false, false, null);
        name = BicepValue.defineProperty(this, "name", new String[] { "name" }, false, false, false, null);
    }

    public BicepValue<StorageTaskAssignmentProperties> getProperties() {
        return this.properties;
    }

    public StorageTaskAssignmentResource setProperties(BicepValue<StorageTaskAssignmentProperties> properties) {
        this.properties.assign(properties);
        return this;
    }

    public StorageTaskAssignmentResource setProperties(StorageTaskAssignmentProperties properties) {
        return this.setProperties(BicepValue.from(properties));
    }

    public BicepValue<String> getName() {
        return this.name;
    }

    public StorageTaskAssignmentResource setName(BicepValue<String> name) {
        this.name.assign(name);
        return this;
    }

    public StorageTaskAssignmentResource setName(String name) {
        return this.setName(BicepValue.from(name));
    }


    public static class ResourceVersions {

        public static final String V2024_01_01 = "2024-01-01";

        public static final String V2023_05_01 = "2023-05-01";

        public static final String V2023_04_01 = "2023-04-01";

        public static final String V2023_01_01 = "2023-01-01";

        public static final String V2022_09_01 = "2022-09-01";

        public static final String V2022_05_01 = "2022-05-01";

        public static final String V2021_09_01 = "2021-09-01";

    }
}
