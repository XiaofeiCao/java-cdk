// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated.models;

import com.azure.provisioning.storage.generated.models.TagProperty;
import java.util.List;
import com.azure.provisioning.storage.generated.models.ProtectedAppendWritesHistory;
import com.azure.provisioning.BicepList;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class LegalHoldProperties extends ProvisioningConstruct {

    private final BicepValue<ProtectedAppendWritesHistory> protectedAppendWritesHistory;
    private final BicepValue<Boolean> hasLegalHold;
    private final BicepList<TagProperty> tags;

    public LegalHoldProperties() {
        protectedAppendWritesHistory = BicepValue.defineProperty(this, "protectedAppendWritesHistory", new String[] { "protectedAppendWritesHistory" }, null);
        hasLegalHold = BicepValue.defineProperty(this, "hasLegalHold", new String[] { "hasLegalHold" }, null);
        tags = BicepList.defineProperty(this, "tags", new String[] { "tags" }, false, false);
    }

    public BicepValue<ProtectedAppendWritesHistory> getProtectedAppendWritesHistory() {
        return this.protectedAppendWritesHistory;
    }

    public LegalHoldProperties setProtectedAppendWritesHistory(BicepValue<ProtectedAppendWritesHistory> protectedAppendWritesHistory) {
        this.protectedAppendWritesHistory.assign(protectedAppendWritesHistory);
        return this;
    }
    public LegalHoldProperties setProtectedAppendWritesHistory(ProtectedAppendWritesHistory protectedAppendWritesHistory) {
        return this.setProtectedAppendWritesHistory(BicepValue.from(protectedAppendWritesHistory));
    }

    public BicepValue<Boolean> getHasLegalHold() {
        return this.hasLegalHold;
    }

    public LegalHoldProperties setHasLegalHold(BicepValue<Boolean> hasLegalHold) {
        this.hasLegalHold.assign(hasLegalHold);
        return this;
    }
    public LegalHoldProperties setHasLegalHold(Boolean hasLegalHold) {
        return this.setHasLegalHold(BicepValue.from(hasLegalHold));
    }

    public BicepList<TagProperty> getTags() {
        return this.tags;
    }

    public LegalHoldProperties setTags(BicepList<TagProperty> tags) {
        this.tags.assign(tags);
        return this;
    }
    public LegalHoldProperties setTags(List<TagProperty> tags) {
        return this.setTags(BicepList.from(tags));
    }

}
