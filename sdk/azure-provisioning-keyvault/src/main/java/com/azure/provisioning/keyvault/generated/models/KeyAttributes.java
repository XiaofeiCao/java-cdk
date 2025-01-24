// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.keyvault.generated.models;

import com.azure.provisioning.keyvault.generated.models.DeletionRecoveryLevel;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class KeyAttributes extends ProvisioningConstruct {

    private final BicepValue<Boolean> enabled;
    private final BicepValue<DeletionRecoveryLevel> recoveryLevel;
    private final BicepValue<Long> notBefore;
    private final BicepValue<Long> expires;
    private final BicepValue<Long> created;
    private final BicepValue<Long> updated;
    private final BicepValue<Boolean> exportable;

    public KeyAttributes() {
        enabled = BicepValue.defineProperty(this, "enabled", new String[] { "enabled" }, null);
        recoveryLevel = BicepValue.defineProperty(this, "recoveryLevel", new String[] { "recoveryLevel" }, null);
        notBefore = BicepValue.defineProperty(this, "notBefore", new String[] { "notBefore" }, null);
        expires = BicepValue.defineProperty(this, "expires", new String[] { "expires" }, null);
        created = BicepValue.defineProperty(this, "created", new String[] { "created" }, null);
        updated = BicepValue.defineProperty(this, "updated", new String[] { "updated" }, null);
        exportable = BicepValue.defineProperty(this, "exportable", new String[] { "exportable" }, null);
    }

    public BicepValue<Boolean> getEnabled() {
        return this.enabled;
    }

    public KeyAttributes setEnabled(BicepValue<Boolean> enabled) {
        this.enabled.assign(enabled);
        return this;
    }
    public KeyAttributes setEnabled(Boolean enabled) {
        return this.setEnabled(BicepValue.from(enabled));
    }

    public BicepValue<DeletionRecoveryLevel> getRecoveryLevel() {
        return this.recoveryLevel;
    }

    public KeyAttributes setRecoveryLevel(BicepValue<DeletionRecoveryLevel> recoveryLevel) {
        this.recoveryLevel.assign(recoveryLevel);
        return this;
    }
    public KeyAttributes setRecoveryLevel(DeletionRecoveryLevel recoveryLevel) {
        return this.setRecoveryLevel(BicepValue.from(recoveryLevel));
    }

    public BicepValue<Long> getNotBefore() {
        return this.notBefore;
    }

    public KeyAttributes setNotBefore(BicepValue<Long> notBefore) {
        this.notBefore.assign(notBefore);
        return this;
    }
    public KeyAttributes setNotBefore(Long notBefore) {
        return this.setNotBefore(BicepValue.from(notBefore));
    }

    public BicepValue<Long> getExpires() {
        return this.expires;
    }

    public KeyAttributes setExpires(BicepValue<Long> expires) {
        this.expires.assign(expires);
        return this;
    }
    public KeyAttributes setExpires(Long expires) {
        return this.setExpires(BicepValue.from(expires));
    }

    public BicepValue<Long> getCreated() {
        return this.created;
    }

    public KeyAttributes setCreated(BicepValue<Long> created) {
        this.created.assign(created);
        return this;
    }
    public KeyAttributes setCreated(Long created) {
        return this.setCreated(BicepValue.from(created));
    }

    public BicepValue<Long> getUpdated() {
        return this.updated;
    }

    public KeyAttributes setUpdated(BicepValue<Long> updated) {
        this.updated.assign(updated);
        return this;
    }
    public KeyAttributes setUpdated(Long updated) {
        return this.setUpdated(BicepValue.from(updated));
    }

    public BicepValue<Boolean> getExportable() {
        return this.exportable;
    }

    public KeyAttributes setExportable(BicepValue<Boolean> exportable) {
        this.exportable.assign(exportable);
        return this;
    }
    public KeyAttributes setExportable(Boolean exportable) {
        return this.setExportable(BicepValue.from(exportable));
    }

}
