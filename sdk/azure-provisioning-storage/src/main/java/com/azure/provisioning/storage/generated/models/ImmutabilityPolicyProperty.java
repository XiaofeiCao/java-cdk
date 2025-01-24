// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated.models;

import com.azure.provisioning.storage.generated.models.ImmutabilityPolicyState;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class ImmutabilityPolicyProperty extends ProvisioningConstruct {

    private final BicepValue<ImmutabilityPolicyState> state;
    private final BicepValue<Boolean> allowProtectedAppendWritesAll;
    private final BicepValue<Integer> immutabilityPeriodSinceCreationInDays;
    private final BicepValue<Boolean> allowProtectedAppendWrites;

    public ImmutabilityPolicyProperty() {
        state = BicepValue.defineProperty(this, "state", new String[] { "state" }, null);
        allowProtectedAppendWritesAll = BicepValue.defineProperty(this, "allowProtectedAppendWritesAll", new String[] { "allowProtectedAppendWritesAll" }, null);
        immutabilityPeriodSinceCreationInDays = BicepValue.defineProperty(this, "immutabilityPeriodSinceCreationInDays", new String[] { "immutabilityPeriodSinceCreationInDays" }, null);
        allowProtectedAppendWrites = BicepValue.defineProperty(this, "allowProtectedAppendWrites", new String[] { "allowProtectedAppendWrites" }, null);
    }

    public BicepValue<ImmutabilityPolicyState> getState() {
        return this.state;
    }

    public ImmutabilityPolicyProperty setState(BicepValue<ImmutabilityPolicyState> state) {
        this.state.assign(state);
        return this;
    }
    public ImmutabilityPolicyProperty setState(ImmutabilityPolicyState state) {
        return this.setState(BicepValue.from(state));
    }

    public BicepValue<Boolean> getAllowProtectedAppendWritesAll() {
        return this.allowProtectedAppendWritesAll;
    }

    public ImmutabilityPolicyProperty setAllowProtectedAppendWritesAll(BicepValue<Boolean> allowProtectedAppendWritesAll) {
        this.allowProtectedAppendWritesAll.assign(allowProtectedAppendWritesAll);
        return this;
    }
    public ImmutabilityPolicyProperty setAllowProtectedAppendWritesAll(Boolean allowProtectedAppendWritesAll) {
        return this.setAllowProtectedAppendWritesAll(BicepValue.from(allowProtectedAppendWritesAll));
    }

    public BicepValue<Integer> getImmutabilityPeriodSinceCreationInDays() {
        return this.immutabilityPeriodSinceCreationInDays;
    }

    public ImmutabilityPolicyProperty setImmutabilityPeriodSinceCreationInDays(BicepValue<Integer> immutabilityPeriodSinceCreationInDays) {
        this.immutabilityPeriodSinceCreationInDays.assign(immutabilityPeriodSinceCreationInDays);
        return this;
    }
    public ImmutabilityPolicyProperty setImmutabilityPeriodSinceCreationInDays(Integer immutabilityPeriodSinceCreationInDays) {
        return this.setImmutabilityPeriodSinceCreationInDays(BicepValue.from(immutabilityPeriodSinceCreationInDays));
    }

    public BicepValue<Boolean> getAllowProtectedAppendWrites() {
        return this.allowProtectedAppendWrites;
    }

    public ImmutabilityPolicyProperty setAllowProtectedAppendWrites(BicepValue<Boolean> allowProtectedAppendWrites) {
        this.allowProtectedAppendWrites.assign(allowProtectedAppendWrites);
        return this;
    }
    public ImmutabilityPolicyProperty setAllowProtectedAppendWrites(Boolean allowProtectedAppendWrites) {
        return this.setAllowProtectedAppendWrites(BicepValue.from(allowProtectedAppendWrites));
    }

}
