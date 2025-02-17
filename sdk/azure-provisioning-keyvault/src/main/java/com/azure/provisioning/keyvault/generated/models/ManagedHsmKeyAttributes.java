// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.keyvault.generated.models;

import com.azure.provisioning.keyvault.generated.models.DeletionRecoveryLevel;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class ManagedHsmKeyAttributes extends ProvisioningConstruct {

    private final BicepValue<DeletionRecoveryLevel> recoveryLevel;
    private final BicepValue<Boolean> enabled;
    private final BicepValue<Long> exp;
    private final BicepValue<Boolean> exportable;
    private final BicepValue<Long> nbf;
    private final BicepValue<Long> created;
    private final BicepValue<Long> updated;

    public ManagedHsmKeyAttributes() {
        recoveryLevel = BicepValue.defineProperty(this, "recoveryLevel", new String[] { "recoveryLevel" }, null);
        enabled = BicepValue.defineProperty(this, "enabled", new String[] { "enabled" }, null);
        exp = BicepValue.defineProperty(this, "exp", new String[] { "exp" }, null);
        exportable = BicepValue.defineProperty(this, "exportable", new String[] { "exportable" }, null);
        nbf = BicepValue.defineProperty(this, "nbf", new String[] { "nbf" }, null);
        created = BicepValue.defineProperty(this, "created", new String[] { "created" }, null);
        updated = BicepValue.defineProperty(this, "updated", new String[] { "updated" }, null);
    }

    public BicepValue<DeletionRecoveryLevel> getRecoveryLevel() {
        return this.recoveryLevel;
    }

    public ManagedHsmKeyAttributes setRecoveryLevel(BicepValue<DeletionRecoveryLevel> recoveryLevel) {
        this.recoveryLevel.assign(recoveryLevel);
        return this;
    }
    public ManagedHsmKeyAttributes setRecoveryLevel(DeletionRecoveryLevel recoveryLevel) {
        return this.setRecoveryLevel(BicepValue.from(recoveryLevel));
    }

    public BicepValue<Boolean> getEnabled() {
        return this.enabled;
    }

    public ManagedHsmKeyAttributes setEnabled(BicepValue<Boolean> enabled) {
        this.enabled.assign(enabled);
        return this;
    }
    public ManagedHsmKeyAttributes setEnabled(Boolean enabled) {
        return this.setEnabled(BicepValue.from(enabled));
    }

    public BicepValue<Long> getExp() {
        return this.exp;
    }

    public ManagedHsmKeyAttributes setExp(BicepValue<Long> exp) {
        this.exp.assign(exp);
        return this;
    }
    public ManagedHsmKeyAttributes setExp(Long exp) {
        return this.setExp(BicepValue.from(exp));
    }

    public BicepValue<Boolean> getExportable() {
        return this.exportable;
    }

    public ManagedHsmKeyAttributes setExportable(BicepValue<Boolean> exportable) {
        this.exportable.assign(exportable);
        return this;
    }
    public ManagedHsmKeyAttributes setExportable(Boolean exportable) {
        return this.setExportable(BicepValue.from(exportable));
    }

    public BicepValue<Long> getNbf() {
        return this.nbf;
    }

    public ManagedHsmKeyAttributes setNbf(BicepValue<Long> nbf) {
        this.nbf.assign(nbf);
        return this;
    }
    public ManagedHsmKeyAttributes setNbf(Long nbf) {
        return this.setNbf(BicepValue.from(nbf));
    }

    public BicepValue<Long> getCreated() {
        return this.created;
    }

    public ManagedHsmKeyAttributes setCreated(BicepValue<Long> created) {
        this.created.assign(created);
        return this;
    }
    public ManagedHsmKeyAttributes setCreated(Long created) {
        return this.setCreated(BicepValue.from(created));
    }

    public BicepValue<Long> getUpdated() {
        return this.updated;
    }

    public ManagedHsmKeyAttributes setUpdated(BicepValue<Long> updated) {
        this.updated.assign(updated);
        return this;
    }
    public ManagedHsmKeyAttributes setUpdated(Long updated) {
        return this.setUpdated(BicepValue.from(updated));
    }

}
