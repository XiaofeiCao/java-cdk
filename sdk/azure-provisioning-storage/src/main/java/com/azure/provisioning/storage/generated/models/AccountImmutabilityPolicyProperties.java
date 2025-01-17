// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated.models;

import com.azure.provisioning.storage.generated.models.AccountImmutabilityPolicyState;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class AccountImmutabilityPolicyProperties extends ProvisioningConstruct {

    private final BicepValue<AccountImmutabilityPolicyState> state;
    private final BicepValue<Integer> immutabilityPeriodSinceCreationInDays;
    private final BicepValue<Boolean> allowProtectedAppendWrites;

    public AccountImmutabilityPolicyProperties() {
        state = BicepValue.defineProperty(this, "state", new String[] { "state" }, null);
        immutabilityPeriodSinceCreationInDays = BicepValue.defineProperty(this, "immutabilityPeriodSinceCreationInDays", new String[] { "immutabilityPeriodSinceCreationInDays" }, null);
        allowProtectedAppendWrites = BicepValue.defineProperty(this, "allowProtectedAppendWrites", new String[] { "allowProtectedAppendWrites" }, null);
    }

    public BicepValue<AccountImmutabilityPolicyState> getState() {
        return this.state;
    }

    public AccountImmutabilityPolicyProperties setState(BicepValue<AccountImmutabilityPolicyState> state) {
        this.state.assign(state);
        return this;
    }
    public BicepValue<Integer> getImmutabilityPeriodSinceCreationInDays() {
        return this.immutabilityPeriodSinceCreationInDays;
    }

    public AccountImmutabilityPolicyProperties setImmutabilityPeriodSinceCreationInDays(BicepValue<Integer> immutabilityPeriodSinceCreationInDays) {
        this.immutabilityPeriodSinceCreationInDays.assign(immutabilityPeriodSinceCreationInDays);
        return this;
    }
    public BicepValue<Boolean> getAllowProtectedAppendWrites() {
        return this.allowProtectedAppendWrites;
    }

    public AccountImmutabilityPolicyProperties setAllowProtectedAppendWrites(BicepValue<Boolean> allowProtectedAppendWrites) {
        this.allowProtectedAppendWrites.assign(allowProtectedAppendWrites);
        return this;
    }
}
