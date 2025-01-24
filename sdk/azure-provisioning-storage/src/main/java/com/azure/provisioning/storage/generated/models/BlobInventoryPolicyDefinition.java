// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated.models;

import java.util.List;
import com.azure.provisioning.storage.generated.models.Format;
import com.azure.core.util.logging.ClientLogger;
import com.azure.provisioning.storage.generated.models.Schedule;
import java.lang.String;
import com.azure.provisioning.storage.generated.models.ObjectType;
import com.azure.provisioning.storage.generated.models.BlobInventoryPolicyFilter;
import com.azure.provisioning.BicepList;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class BlobInventoryPolicyDefinition extends ProvisioningConstruct {

    private final BicepValue<BlobInventoryPolicyFilter> filters;
    private final BicepValue<ClientLogger> lOGGER;
    private final BicepValue<Schedule> schedule;
    private final BicepValue<ObjectType> objectType;
    private final BicepList<String> schemaFields;
    private final BicepValue<Format> format;

    public BlobInventoryPolicyDefinition() {
        filters = BicepValue.defineProperty(this, "filters", new String[] { "filters" }, null);
        lOGGER = BicepValue.defineProperty(this, "lOGGER", new String[] { "lOGGER" }, null);
        schedule = BicepValue.defineProperty(this, "schedule", new String[] { "schedule" }, null);
        objectType = BicepValue.defineProperty(this, "objectType", new String[] { "objectType" }, null);
        schemaFields = BicepList.defineProperty(this, "schemaFields", new String[] { "schemaFields" }, false, false);
        format = BicepValue.defineProperty(this, "format", new String[] { "format" }, null);
    }

    public BicepValue<BlobInventoryPolicyFilter> getFilters() {
        return this.filters;
    }

    public BlobInventoryPolicyDefinition setFilters(BicepValue<BlobInventoryPolicyFilter> filters) {
        this.filters.assign(filters);
        return this;
    }
    public BlobInventoryPolicyDefinition setFilters(BlobInventoryPolicyFilter filters) {
        return this.setFilters(BicepValue.from(filters));
    }

    public BicepValue<ClientLogger> getLOGGER() {
        return this.lOGGER;
    }

    public BlobInventoryPolicyDefinition setLOGGER(BicepValue<ClientLogger> lOGGER) {
        this.lOGGER.assign(lOGGER);
        return this;
    }
    public BlobInventoryPolicyDefinition setLOGGER(ClientLogger lOGGER) {
        return this.setLOGGER(BicepValue.from(lOGGER));
    }

    public BicepValue<Schedule> getSchedule() {
        return this.schedule;
    }

    public BlobInventoryPolicyDefinition setSchedule(BicepValue<Schedule> schedule) {
        this.schedule.assign(schedule);
        return this;
    }
    public BlobInventoryPolicyDefinition setSchedule(Schedule schedule) {
        return this.setSchedule(BicepValue.from(schedule));
    }

    public BicepValue<ObjectType> getObjectType() {
        return this.objectType;
    }

    public BlobInventoryPolicyDefinition setObjectType(BicepValue<ObjectType> objectType) {
        this.objectType.assign(objectType);
        return this;
    }
    public BlobInventoryPolicyDefinition setObjectType(ObjectType objectType) {
        return this.setObjectType(BicepValue.from(objectType));
    }

    public BicepList<String> getSchemaFields() {
        return this.schemaFields;
    }

    public BlobInventoryPolicyDefinition setSchemaFields(BicepList<String> schemaFields) {
        this.schemaFields.assign(schemaFields);
        return this;
    }
    public BlobInventoryPolicyDefinition setSchemaFields(List<String> schemaFields) {
        return this.setSchemaFields(BicepList.from(schemaFields));
    }

    public BicepValue<Format> getFormat() {
        return this.format;
    }

    public BlobInventoryPolicyDefinition setFormat(BicepValue<Format> format) {
        this.format.assign(format);
        return this;
    }
    public BlobInventoryPolicyDefinition setFormat(Format format) {
        return this.setFormat(BicepValue.from(format));
    }

}
