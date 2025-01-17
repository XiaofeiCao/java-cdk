// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated.models;

import com.azure.provisioning.storage.generated.models.GeoReplicationStatus;
import java.time.OffsetDateTime;
import com.azure.provisioning.storage.generated.models.PostFailoverRedundancy;
import com.azure.provisioning.storage.generated.models.PostPlannedFailoverRedundancy;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class GeoReplicationStats extends ProvisioningConstruct {

    private final BicepValue<GeoReplicationStatus> status;
    private final BicepValue<OffsetDateTime> lastSyncTime;
    private final BicepValue<Boolean> canFailover;
    private final BicepValue<PostFailoverRedundancy> postFailoverRedundancy;
    private final BicepValue<PostPlannedFailoverRedundancy> postPlannedFailoverRedundancy;
    private final BicepValue<Boolean> canPlannedFailover;

    public GeoReplicationStats() {
        status = BicepValue.defineProperty(this, "status", new String[] { "status" }, null);
        lastSyncTime = BicepValue.defineProperty(this, "lastSyncTime", new String[] { "lastSyncTime" }, null);
        canFailover = BicepValue.defineProperty(this, "canFailover", new String[] { "canFailover" }, null);
        postFailoverRedundancy = BicepValue.defineProperty(this, "postFailoverRedundancy", new String[] { "postFailoverRedundancy" }, null);
        postPlannedFailoverRedundancy = BicepValue.defineProperty(this, "postPlannedFailoverRedundancy", new String[] { "postPlannedFailoverRedundancy" }, null);
        canPlannedFailover = BicepValue.defineProperty(this, "canPlannedFailover", new String[] { "canPlannedFailover" }, null);
    }

    public BicepValue<GeoReplicationStatus> getStatus() {
        return this.status;
    }

    public GeoReplicationStats setStatus(BicepValue<GeoReplicationStatus> status) {
        this.status.assign(status);
        return this;
    }
    public BicepValue<OffsetDateTime> getLastSyncTime() {
        return this.lastSyncTime;
    }

    public GeoReplicationStats setLastSyncTime(BicepValue<OffsetDateTime> lastSyncTime) {
        this.lastSyncTime.assign(lastSyncTime);
        return this;
    }
    public BicepValue<Boolean> getCanFailover() {
        return this.canFailover;
    }

    public GeoReplicationStats setCanFailover(BicepValue<Boolean> canFailover) {
        this.canFailover.assign(canFailover);
        return this;
    }
    public BicepValue<PostFailoverRedundancy> getPostFailoverRedundancy() {
        return this.postFailoverRedundancy;
    }

    public GeoReplicationStats setPostFailoverRedundancy(BicepValue<PostFailoverRedundancy> postFailoverRedundancy) {
        this.postFailoverRedundancy.assign(postFailoverRedundancy);
        return this;
    }
    public BicepValue<PostPlannedFailoverRedundancy> getPostPlannedFailoverRedundancy() {
        return this.postPlannedFailoverRedundancy;
    }

    public GeoReplicationStats setPostPlannedFailoverRedundancy(BicepValue<PostPlannedFailoverRedundancy> postPlannedFailoverRedundancy) {
        this.postPlannedFailoverRedundancy.assign(postPlannedFailoverRedundancy);
        return this;
    }
    public BicepValue<Boolean> getCanPlannedFailover() {
        return this.canPlannedFailover;
    }

    public GeoReplicationStats setCanPlannedFailover(BicepValue<Boolean> canPlannedFailover) {
        this.canPlannedFailover.assign(canPlannedFailover);
        return this;
    }
}
