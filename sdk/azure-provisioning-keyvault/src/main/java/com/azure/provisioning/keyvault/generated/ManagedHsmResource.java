// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.keyvault.generated;

import com.azure.provisioning.keyvault.generated.models.ManagedHsmProperties;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.Resource;
import com.azure.provisioning.tmp.ResourceType;

public class ManagedHsmResource extends Resource {

    private final BicepValue<String> name;
    private final BicepValue<String> type;
    private final BicepValue<String> id;
    private final BicepValue<String> resourceGroupName;
    private final BicepValue<String> location;
    private final BicepValue<ManagedHsmProperties> properties;

    public ManagedHsmResource(String identifierName) {
        this(identifierName, null);
    }

    public ManagedHsmResource(String identifierName, String resourceVersion) {
        super(identifierName, new ResourceType("Microsoft.KeyVault/managedHSMs"), resourceVersion);
        name = BicepValue.defineProperty(this, "name", new String[] { "name" }, false, false, false, null);
        type = BicepValue.defineProperty(this, "type", new String[] { "type" }, false, false, false, null);
        id = BicepValue.defineProperty(this, "id", new String[] { "id" }, false, false, false, null);
        resourceGroupName = BicepValue.defineProperty(this, "resourceGroupName", new String[] { "resourceGroupName" }, false, false, false, null);
        location = BicepValue.defineProperty(this, "location", new String[] { "location" }, false, false, false, null);
        properties = BicepValue.defineProperty(this, "properties", new String[] { "properties" }, false, false, false, null);
    }

    public BicepValue<String> getName() {
        return this.name;
    }

    public ManagedHsmResource setName(BicepValue<String> name) {
        this.name.assign(name);
        return this;
    }

    public ManagedHsmResource setName(String name) {
        return this.setName(BicepValue.from(name));
    }

    public BicepValue<String> getType() {
        return this.type;
    }

    public ManagedHsmResource setType(BicepValue<String> type) {
        this.type.assign(type);
        return this;
    }

    public ManagedHsmResource setType(String type) {
        return this.setType(BicepValue.from(type));
    }

    public BicepValue<String> getId() {
        return this.id;
    }

    public ManagedHsmResource setId(BicepValue<String> id) {
        this.id.assign(id);
        return this;
    }

    public ManagedHsmResource setId(String id) {
        return this.setId(BicepValue.from(id));
    }

    public BicepValue<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    public ManagedHsmResource setResourceGroupName(BicepValue<String> resourceGroupName) {
        this.resourceGroupName.assign(resourceGroupName);
        return this;
    }

    public ManagedHsmResource setResourceGroupName(String resourceGroupName) {
        return this.setResourceGroupName(BicepValue.from(resourceGroupName));
    }

    public BicepValue<String> getLocation() {
        return this.location;
    }

    public ManagedHsmResource setLocation(BicepValue<String> location) {
        this.location.assign(location);
        return this;
    }

    public ManagedHsmResource setLocation(String location) {
        return this.setLocation(BicepValue.from(location));
    }

    public BicepValue<ManagedHsmProperties> getProperties() {
        return this.properties;
    }

    public ManagedHsmResource setProperties(BicepValue<ManagedHsmProperties> properties) {
        this.properties.assign(properties);
        return this;
    }

    public ManagedHsmResource setProperties(ManagedHsmProperties properties) {
        return this.setProperties(BicepValue.from(properties));
    }


    public static class ResourceVersions {

        public static final String V2024_11_01 = "2024-11-01";

        public static final String V2023_08_01_PREVIEW = "2023-08-01-PREVIEW";

        public static final String V2023_07_01 = "2023-07-01";

        public static final String V2023_02_01 = "2023-02-01";

        public static final String V2022_11_01 = "2022-11-01";

        public static final String V2022_07_01 = "2022-07-01";

        public static final String V2021_10_01 = "2021-10-01";

    }
}
