// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated.models;

import java.util.List;
import com.azure.provisioning.storage.generated.models.UpdateHistoryProperty;
import com.azure.provisioning.storage.generated.models.ImmutabilityPolicyState;
import com.azure.provisioning.BicepList;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class ImmutabilityPolicyProperties extends ProvisioningConstruct {

    private final BicepValue<Boolean> allowProtectedAppendWritesAll;
    private final BicepValue<Integer> immutabilityPeriodSinceCreationInDays;
    private final BicepList<UpdateHistoryProperty> updateHistory;
    private final BicepValue<ImmutabilityPolicyState> state;
    private final BicepValue<Boolean> allowProtectedAppendWrites;
    private final BicepValue<String> etag;

    public ImmutabilityPolicyProperties() {
        allowProtectedAppendWritesAll = BicepValue.defineProperty(this, "allowProtectedAppendWritesAll", new String[] { "allowProtectedAppendWritesAll" }, null);
        immutabilityPeriodSinceCreationInDays = BicepValue.defineProperty(this, "immutabilityPeriodSinceCreationInDays", new String[] { "immutabilityPeriodSinceCreationInDays" }, null);
        updateHistory = BicepList.defineProperty(this, "updateHistory", new String[] { "updateHistory" }, false, false);
        state = BicepValue.defineProperty(this, "state", new String[] { "state" }, null);
        allowProtectedAppendWrites = BicepValue.defineProperty(this, "allowProtectedAppendWrites", new String[] { "allowProtectedAppendWrites" }, null);
        etag = BicepValue.defineProperty(this, "etag", new String[] { "etag" }, null);
    }

    public BicepValue<Boolean> getAllowProtectedAppendWritesAll() {
        return this.allowProtectedAppendWritesAll;
    }

    public ImmutabilityPolicyProperties setAllowProtectedAppendWritesAll(BicepValue<Boolean> allowProtectedAppendWritesAll) {
        this.allowProtectedAppendWritesAll.assign(allowProtectedAppendWritesAll);
        return this;
    }
    public ImmutabilityPolicyProperties setAllowProtectedAppendWritesAll(Boolean allowProtectedAppendWritesAll) {
        return this.setAllowProtectedAppendWritesAll(BicepValue.from(allowProtectedAppendWritesAll));
    }

    public BicepValue<Integer> getImmutabilityPeriodSinceCreationInDays() {
        return this.immutabilityPeriodSinceCreationInDays;
    }

    public ImmutabilityPolicyProperties setImmutabilityPeriodSinceCreationInDays(BicepValue<Integer> immutabilityPeriodSinceCreationInDays) {
        this.immutabilityPeriodSinceCreationInDays.assign(immutabilityPeriodSinceCreationInDays);
        return this;
    }
    public ImmutabilityPolicyProperties setImmutabilityPeriodSinceCreationInDays(Integer immutabilityPeriodSinceCreationInDays) {
        return this.setImmutabilityPeriodSinceCreationInDays(BicepValue.from(immutabilityPeriodSinceCreationInDays));
    }

    public BicepList<UpdateHistoryProperty> getUpdateHistory() {
        return this.updateHistory;
    }

    public ImmutabilityPolicyProperties setUpdateHistory(BicepList<UpdateHistoryProperty> updateHistory) {
        this.updateHistory.assign(updateHistory);
        return this;
    }
    public ImmutabilityPolicyProperties setUpdateHistory(List<UpdateHistoryProperty> updateHistory) {
        return this.setUpdateHistory(BicepList.from(updateHistory));
    }

    public BicepValue<ImmutabilityPolicyState> getState() {
        return this.state;
    }

    public ImmutabilityPolicyProperties setState(BicepValue<ImmutabilityPolicyState> state) {
        this.state.assign(state);
        return this;
    }
    public ImmutabilityPolicyProperties setState(ImmutabilityPolicyState state) {
        return this.setState(BicepValue.from(state));
    }

    public BicepValue<Boolean> getAllowProtectedAppendWrites() {
        return this.allowProtectedAppendWrites;
    }

    public ImmutabilityPolicyProperties setAllowProtectedAppendWrites(BicepValue<Boolean> allowProtectedAppendWrites) {
        this.allowProtectedAppendWrites.assign(allowProtectedAppendWrites);
        return this;
    }
    public ImmutabilityPolicyProperties setAllowProtectedAppendWrites(Boolean allowProtectedAppendWrites) {
        return this.setAllowProtectedAppendWrites(BicepValue.from(allowProtectedAppendWrites));
    }

    public BicepValue<String> getEtag() {
        return this.etag;
    }

    public ImmutabilityPolicyProperties setEtag(BicepValue<String> etag) {
        this.etag.assign(etag);
        return this;
    }
    public ImmutabilityPolicyProperties setEtag(String etag) {
        return this.setEtag(BicepValue.from(etag));
    }

}
