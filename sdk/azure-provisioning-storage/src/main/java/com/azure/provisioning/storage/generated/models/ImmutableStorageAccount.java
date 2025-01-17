// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated.models;

import com.azure.provisioning.storage.generated.models.AccountImmutabilityPolicyProperties;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class ImmutableStorageAccount extends ProvisioningConstruct {

    private final BicepValue<Boolean> enabled;
    private final BicepValue<AccountImmutabilityPolicyProperties> immutabilityPolicy;

    public ImmutableStorageAccount() {
        enabled = BicepValue.defineProperty(this, "enabled", new String[] { "enabled" }, null);
        immutabilityPolicy = BicepValue.defineProperty(this, "immutabilityPolicy", new String[] { "immutabilityPolicy" }, null);
    }

    public BicepValue<Boolean> getEnabled() {
        return this.enabled;
    }

    public ImmutableStorageAccount setEnabled(BicepValue<Boolean> enabled) {
        this.enabled.assign(enabled);
        return this;
    }
    public BicepValue<AccountImmutabilityPolicyProperties> getImmutabilityPolicy() {
        return this.immutabilityPolicy;
    }

    public ImmutableStorageAccount setImmutabilityPolicy(BicepValue<AccountImmutabilityPolicyProperties> immutabilityPolicy) {
        this.immutabilityPolicy.assign(immutabilityPolicy);
        return this;
    }
}
