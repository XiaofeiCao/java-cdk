// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated.models;

import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class DateAfterModification extends ProvisioningConstruct {

    private final BicepValue<Float> daysAfterLastAccessTimeGreaterThan;
    private final BicepValue<Float> daysAfterCreationGreaterThan;
    private final BicepValue<Float> daysAfterLastTierChangeGreaterThan;
    private final BicepValue<Float> daysAfterModificationGreaterThan;

    public DateAfterModification() {
        daysAfterLastAccessTimeGreaterThan = BicepValue.defineProperty(this, "daysAfterLastAccessTimeGreaterThan", new String[] { "daysAfterLastAccessTimeGreaterThan" }, null);
        daysAfterCreationGreaterThan = BicepValue.defineProperty(this, "daysAfterCreationGreaterThan", new String[] { "daysAfterCreationGreaterThan" }, null);
        daysAfterLastTierChangeGreaterThan = BicepValue.defineProperty(this, "daysAfterLastTierChangeGreaterThan", new String[] { "daysAfterLastTierChangeGreaterThan" }, null);
        daysAfterModificationGreaterThan = BicepValue.defineProperty(this, "daysAfterModificationGreaterThan", new String[] { "daysAfterModificationGreaterThan" }, null);
    }

    public BicepValue<Float> getDaysAfterLastAccessTimeGreaterThan() {
        return this.daysAfterLastAccessTimeGreaterThan;
    }

    public DateAfterModification setDaysAfterLastAccessTimeGreaterThan(BicepValue<Float> daysAfterLastAccessTimeGreaterThan) {
        this.daysAfterLastAccessTimeGreaterThan.assign(daysAfterLastAccessTimeGreaterThan);
        return this;
    }
    public DateAfterModification setDaysAfterLastAccessTimeGreaterThan(Float daysAfterLastAccessTimeGreaterThan) {
        return this.setDaysAfterLastAccessTimeGreaterThan(BicepValue.from(daysAfterLastAccessTimeGreaterThan));
    }

    public BicepValue<Float> getDaysAfterCreationGreaterThan() {
        return this.daysAfterCreationGreaterThan;
    }

    public DateAfterModification setDaysAfterCreationGreaterThan(BicepValue<Float> daysAfterCreationGreaterThan) {
        this.daysAfterCreationGreaterThan.assign(daysAfterCreationGreaterThan);
        return this;
    }
    public DateAfterModification setDaysAfterCreationGreaterThan(Float daysAfterCreationGreaterThan) {
        return this.setDaysAfterCreationGreaterThan(BicepValue.from(daysAfterCreationGreaterThan));
    }

    public BicepValue<Float> getDaysAfterLastTierChangeGreaterThan() {
        return this.daysAfterLastTierChangeGreaterThan;
    }

    public DateAfterModification setDaysAfterLastTierChangeGreaterThan(BicepValue<Float> daysAfterLastTierChangeGreaterThan) {
        this.daysAfterLastTierChangeGreaterThan.assign(daysAfterLastTierChangeGreaterThan);
        return this;
    }
    public DateAfterModification setDaysAfterLastTierChangeGreaterThan(Float daysAfterLastTierChangeGreaterThan) {
        return this.setDaysAfterLastTierChangeGreaterThan(BicepValue.from(daysAfterLastTierChangeGreaterThan));
    }

    public BicepValue<Float> getDaysAfterModificationGreaterThan() {
        return this.daysAfterModificationGreaterThan;
    }

    public DateAfterModification setDaysAfterModificationGreaterThan(BicepValue<Float> daysAfterModificationGreaterThan) {
        this.daysAfterModificationGreaterThan.assign(daysAfterModificationGreaterThan);
        return this;
    }
    public DateAfterModification setDaysAfterModificationGreaterThan(Float daysAfterModificationGreaterThan) {
        return this.setDaysAfterModificationGreaterThan(BicepValue.from(daysAfterModificationGreaterThan));
    }

}
