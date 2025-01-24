// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.keyvault.generated.models;

import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class SecretAttributes extends ProvisioningConstruct {

    private final BicepValue<Long> created;
    private final BicepValue<Long> updated;

    public SecretAttributes() {
        created = BicepValue.defineProperty(this, "created", new String[] { "created" }, null);
        updated = BicepValue.defineProperty(this, "updated", new String[] { "updated" }, null);
    }

    public BicepValue<Long> getCreated() {
        return this.created;
    }

    public SecretAttributes setCreated(BicepValue<Long> created) {
        this.created.assign(created);
        return this;
    }
    public SecretAttributes setCreated(Long created) {
        return this.setCreated(BicepValue.from(created));
    }

    public BicepValue<Long> getUpdated() {
        return this.updated;
    }

    public SecretAttributes setUpdated(BicepValue<Long> updated) {
        this.updated.assign(updated);
        return this;
    }
    public SecretAttributes setUpdated(Long updated) {
        return this.setUpdated(BicepValue.from(updated));
    }

}
