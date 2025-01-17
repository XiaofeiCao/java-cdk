// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated.models;

import java.time.OffsetDateTime;
import com.azure.provisioning.storage.generated.models.ImmutabilityPolicyUpdateType;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class UpdateHistoryProperty extends ProvisioningConstruct {

    private final BicepValue<Boolean> allowProtectedAppendWritesAll;
    private final BicepValue<OffsetDateTime> timestamp;
    private final BicepValue<String> upn;
    private final BicepValue<Integer> immutabilityPeriodSinceCreationInDays;
    private final BicepValue<String> tenantId;
    private final BicepValue<String> objectIdentifier;
    private final BicepValue<ImmutabilityPolicyUpdateType> update;
    private final BicepValue<Boolean> allowProtectedAppendWrites;

    public UpdateHistoryProperty() {
        allowProtectedAppendWritesAll = BicepValue.defineProperty(this, "allowProtectedAppendWritesAll", new String[] { "allowProtectedAppendWritesAll" }, null);
        timestamp = BicepValue.defineProperty(this, "timestamp", new String[] { "timestamp" }, null);
        upn = BicepValue.defineProperty(this, "upn", new String[] { "upn" }, null);
        immutabilityPeriodSinceCreationInDays = BicepValue.defineProperty(this, "immutabilityPeriodSinceCreationInDays", new String[] { "immutabilityPeriodSinceCreationInDays" }, null);
        tenantId = BicepValue.defineProperty(this, "tenantId", new String[] { "tenantId" }, null);
        objectIdentifier = BicepValue.defineProperty(this, "objectIdentifier", new String[] { "objectIdentifier" }, null);
        update = BicepValue.defineProperty(this, "update", new String[] { "update" }, null);
        allowProtectedAppendWrites = BicepValue.defineProperty(this, "allowProtectedAppendWrites", new String[] { "allowProtectedAppendWrites" }, null);
    }

    public BicepValue<Boolean> getAllowProtectedAppendWritesAll() {
        return this.allowProtectedAppendWritesAll;
    }

    public UpdateHistoryProperty setAllowProtectedAppendWritesAll(BicepValue<Boolean> allowProtectedAppendWritesAll) {
        this.allowProtectedAppendWritesAll.assign(allowProtectedAppendWritesAll);
        return this;
    }
    public BicepValue<OffsetDateTime> getTimestamp() {
        return this.timestamp;
    }

    public UpdateHistoryProperty setTimestamp(BicepValue<OffsetDateTime> timestamp) {
        this.timestamp.assign(timestamp);
        return this;
    }
    public BicepValue<String> getUpn() {
        return this.upn;
    }

    public UpdateHistoryProperty setUpn(BicepValue<String> upn) {
        this.upn.assign(upn);
        return this;
    }
    public BicepValue<Integer> getImmutabilityPeriodSinceCreationInDays() {
        return this.immutabilityPeriodSinceCreationInDays;
    }

    public UpdateHistoryProperty setImmutabilityPeriodSinceCreationInDays(BicepValue<Integer> immutabilityPeriodSinceCreationInDays) {
        this.immutabilityPeriodSinceCreationInDays.assign(immutabilityPeriodSinceCreationInDays);
        return this;
    }
    public BicepValue<String> getTenantId() {
        return this.tenantId;
    }

    public UpdateHistoryProperty setTenantId(BicepValue<String> tenantId) {
        this.tenantId.assign(tenantId);
        return this;
    }
    public BicepValue<String> getObjectIdentifier() {
        return this.objectIdentifier;
    }

    public UpdateHistoryProperty setObjectIdentifier(BicepValue<String> objectIdentifier) {
        this.objectIdentifier.assign(objectIdentifier);
        return this;
    }
    public BicepValue<ImmutabilityPolicyUpdateType> getUpdate() {
        return this.update;
    }

    public UpdateHistoryProperty setUpdate(BicepValue<ImmutabilityPolicyUpdateType> update) {
        this.update.assign(update);
        return this;
    }
    public BicepValue<Boolean> getAllowProtectedAppendWrites() {
        return this.allowProtectedAppendWrites;
    }

    public UpdateHistoryProperty setAllowProtectedAppendWrites(BicepValue<Boolean> allowProtectedAppendWrites) {
        this.allowProtectedAppendWrites.assign(allowProtectedAppendWrites);
        return this;
    }
}
