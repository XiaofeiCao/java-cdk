// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated.models;

import java.time.OffsetDateTime;
import com.azure.core.util.logging.ClientLogger;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class TableAccessPolicy extends ProvisioningConstruct {

    private final BicepValue<OffsetDateTime> expiryTime;
    private final BicepValue<ClientLogger> lOGGER;
    private final BicepValue<String> permission;
    private final BicepValue<OffsetDateTime> startTime;

    public TableAccessPolicy() {
        expiryTime = BicepValue.defineProperty(this, "expiryTime", new String[] { "expiryTime" }, null);
        lOGGER = BicepValue.defineProperty(this, "lOGGER", new String[] { "lOGGER" }, null);
        permission = BicepValue.defineProperty(this, "permission", new String[] { "permission" }, null);
        startTime = BicepValue.defineProperty(this, "startTime", new String[] { "startTime" }, null);
    }

    public BicepValue<OffsetDateTime> getExpiryTime() {
        return this.expiryTime;
    }

    public TableAccessPolicy setExpiryTime(BicepValue<OffsetDateTime> expiryTime) {
        this.expiryTime.assign(expiryTime);
        return this;
    }
    public TableAccessPolicy setExpiryTime(OffsetDateTime expiryTime) {
        return this.setExpiryTime(BicepValue.from(expiryTime));
    }

    public BicepValue<ClientLogger> getLOGGER() {
        return this.lOGGER;
    }

    public TableAccessPolicy setLOGGER(BicepValue<ClientLogger> lOGGER) {
        this.lOGGER.assign(lOGGER);
        return this;
    }
    public TableAccessPolicy setLOGGER(ClientLogger lOGGER) {
        return this.setLOGGER(BicepValue.from(lOGGER));
    }

    public BicepValue<String> getPermission() {
        return this.permission;
    }

    public TableAccessPolicy setPermission(BicepValue<String> permission) {
        this.permission.assign(permission);
        return this;
    }
    public TableAccessPolicy setPermission(String permission) {
        return this.setPermission(BicepValue.from(permission));
    }

    public BicepValue<OffsetDateTime> getStartTime() {
        return this.startTime;
    }

    public TableAccessPolicy setStartTime(BicepValue<OffsetDateTime> startTime) {
        this.startTime.assign(startTime);
        return this;
    }
    public TableAccessPolicy setStartTime(OffsetDateTime startTime) {
        return this.setStartTime(BicepValue.from(startTime));
    }

}
