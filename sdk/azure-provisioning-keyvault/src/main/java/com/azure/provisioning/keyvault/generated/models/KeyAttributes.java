// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.keyvault.generated.models;

import com.azure.provisioning.keyvault.generated.models.DeletionRecoveryLevel;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class KeyAttributes extends ProvisioningConstruct {

    private final BicepValue<Boolean> exportable;
    private final BicepValue<Long> updated;
    private final BicepValue<Long> expires;
    private final BicepValue<Long> created;
    private final BicepValue<DeletionRecoveryLevel> recoveryLevel;
    private final BicepValue<Boolean> enabled;
    private final BicepValue<Long> notBefore;

    public KeyAttributes() {
        exportable = BicepValue.defineProperty(this, "exportable", new String[] { "exportable" }, null);
        updated = BicepValue.defineProperty(this, "updated", new String[] { "updated" }, null);
        expires = BicepValue.defineProperty(this, "expires", new String[] { "expires" }, null);
        created = BicepValue.defineProperty(this, "created", new String[] { "created" }, null);
        recoveryLevel = BicepValue.defineProperty(this, "recoveryLevel", new String[] { "recoveryLevel" }, null);
        enabled = BicepValue.defineProperty(this, "enabled", new String[] { "enabled" }, null);
        notBefore = BicepValue.defineProperty(this, "notBefore", new String[] { "notBefore" }, null);
    }

    public BicepValue<Boolean> getExportable() {
        return this.exportable;
    }

    public KeyAttributes setExportable(BicepValue<Boolean> exportable) {
        this.exportable.assign(exportable);
        return this;
    }
    public BicepValue<Long> getUpdated() {
        return this.updated;
    }

    public KeyAttributes setUpdated(BicepValue<Long> updated) {
        this.updated.assign(updated);
        return this;
    }
    public BicepValue<Long> getExpires() {
        return this.expires;
    }

    public KeyAttributes setExpires(BicepValue<Long> expires) {
        this.expires.assign(expires);
        return this;
    }
    public BicepValue<Long> getCreated() {
        return this.created;
    }

    public KeyAttributes setCreated(BicepValue<Long> created) {
        this.created.assign(created);
        return this;
    }
    public BicepValue<DeletionRecoveryLevel> getRecoveryLevel() {
        return this.recoveryLevel;
    }

    public KeyAttributes setRecoveryLevel(BicepValue<DeletionRecoveryLevel> recoveryLevel) {
        this.recoveryLevel.assign(recoveryLevel);
        return this;
    }
    public BicepValue<Boolean> getEnabled() {
        return this.enabled;
    }

    public KeyAttributes setEnabled(BicepValue<Boolean> enabled) {
        this.enabled.assign(enabled);
        return this;
    }
    public BicepValue<Long> getNotBefore() {
        return this.notBefore;
    }

    public KeyAttributes setNotBefore(BicepValue<Long> notBefore) {
        this.notBefore.assign(notBefore);
        return this;
    }
}
