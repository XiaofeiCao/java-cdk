// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.keyvault.generated.models;

import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class KeyRotationPolicyAttributes extends ProvisioningConstruct {

    private final BicepValue<String> expiryTime;
    private final BicepValue<Long> created;
    private final BicepValue<Long> updated;

    public KeyRotationPolicyAttributes() {
        expiryTime = BicepValue.defineProperty(this, "expiryTime", new String[] { "expiryTime" }, null);
        created = BicepValue.defineProperty(this, "created", new String[] { "created" }, null);
        updated = BicepValue.defineProperty(this, "updated", new String[] { "updated" }, null);
    }

    public BicepValue<String> getExpiryTime() {
        return this.expiryTime;
    }

    public KeyRotationPolicyAttributes setExpiryTime(BicepValue<String> expiryTime) {
        this.expiryTime.assign(expiryTime);
        return this;
    }
    public KeyRotationPolicyAttributes setExpiryTime(String expiryTime) {
        return this.setExpiryTime(BicepValue.from(expiryTime));
    }

    public BicepValue<Long> getCreated() {
        return this.created;
    }

    public KeyRotationPolicyAttributes setCreated(BicepValue<Long> created) {
        this.created.assign(created);
        return this;
    }
    public KeyRotationPolicyAttributes setCreated(Long created) {
        return this.setCreated(BicepValue.from(created));
    }

    public BicepValue<Long> getUpdated() {
        return this.updated;
    }

    public KeyRotationPolicyAttributes setUpdated(BicepValue<Long> updated) {
        this.updated.assign(updated);
        return this;
    }
    public KeyRotationPolicyAttributes setUpdated(Long updated) {
        return this.setUpdated(BicepValue.from(updated));
    }

}
