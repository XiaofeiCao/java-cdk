// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated.models;

import java.time.OffsetDateTime;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class AccessPolicy extends ProvisioningConstruct {

    private final BicepValue<OffsetDateTime> expiryTime;
    private final BicepValue<String> permission;
    private final BicepValue<OffsetDateTime> startTime;

    public AccessPolicy() {
        expiryTime = BicepValue.defineProperty(this, "expiryTime", new String[] { "expiryTime" }, null);
        permission = BicepValue.defineProperty(this, "permission", new String[] { "permission" }, null);
        startTime = BicepValue.defineProperty(this, "startTime", new String[] { "startTime" }, null);
    }

    public BicepValue<OffsetDateTime> getExpiryTime() {
        return this.expiryTime;
    }

    public AccessPolicy setExpiryTime(BicepValue<OffsetDateTime> expiryTime) {
        this.expiryTime.assign(expiryTime);
        return this;
    }
    public BicepValue<String> getPermission() {
        return this.permission;
    }

    public AccessPolicy setPermission(BicepValue<String> permission) {
        this.permission.assign(permission);
        return this;
    }
    public BicepValue<OffsetDateTime> getStartTime() {
        return this.startTime;
    }

    public AccessPolicy setStartTime(BicepValue<OffsetDateTime> startTime) {
        this.startTime.assign(startTime);
        return this;
    }
}
