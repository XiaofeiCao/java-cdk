// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated.models;

import com.azure.provisioning.storage.generated.models.ManagementPolicyVersion;
import com.azure.provisioning.storage.generated.models.ManagementPolicyBaseBlob;
import com.azure.provisioning.storage.generated.models.ManagementPolicySnapShot;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class ManagementPolicyAction extends ProvisioningConstruct {

    private final BicepValue<ManagementPolicyVersion> version;
    private final BicepValue<ManagementPolicyBaseBlob> baseBlob;
    private final BicepValue<ManagementPolicySnapShot> snapshot;

    public ManagementPolicyAction() {
        version = BicepValue.defineProperty(this, "version", new String[] { "version" }, null);
        baseBlob = BicepValue.defineProperty(this, "baseBlob", new String[] { "baseBlob" }, null);
        snapshot = BicepValue.defineProperty(this, "snapshot", new String[] { "snapshot" }, null);
    }

    public BicepValue<ManagementPolicyVersion> getVersion() {
        return this.version;
    }

    public ManagementPolicyAction setVersion(BicepValue<ManagementPolicyVersion> version) {
        this.version.assign(version);
        return this;
    }
    public ManagementPolicyAction setVersion(ManagementPolicyVersion version) {
        return this.setVersion(BicepValue.from(version));
    }

    public BicepValue<ManagementPolicyBaseBlob> getBaseBlob() {
        return this.baseBlob;
    }

    public ManagementPolicyAction setBaseBlob(BicepValue<ManagementPolicyBaseBlob> baseBlob) {
        this.baseBlob.assign(baseBlob);
        return this;
    }
    public ManagementPolicyAction setBaseBlob(ManagementPolicyBaseBlob baseBlob) {
        return this.setBaseBlob(BicepValue.from(baseBlob));
    }

    public BicepValue<ManagementPolicySnapShot> getSnapshot() {
        return this.snapshot;
    }

    public ManagementPolicyAction setSnapshot(BicepValue<ManagementPolicySnapShot> snapshot) {
        this.snapshot.assign(snapshot);
        return this;
    }
    public ManagementPolicyAction setSnapshot(ManagementPolicySnapShot snapshot) {
        return this.setSnapshot(BicepValue.from(snapshot));
    }

}
