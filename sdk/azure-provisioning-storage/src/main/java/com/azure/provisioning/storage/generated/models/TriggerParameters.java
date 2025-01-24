// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated.models;

import java.time.OffsetDateTime;
import com.azure.provisioning.storage.generated.models.IntervalUnit;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class TriggerParameters extends ProvisioningConstruct {

    private final BicepValue<OffsetDateTime> startFrom;
    private final BicepValue<IntervalUnit> intervalUnit;
    private final BicepValue<OffsetDateTime> endBy;
    private final BicepValue<OffsetDateTime> startOn;
    private final BicepValue<Integer> interval;

    public TriggerParameters() {
        startFrom = BicepValue.defineProperty(this, "startFrom", new String[] { "startFrom" }, null);
        intervalUnit = BicepValue.defineProperty(this, "intervalUnit", new String[] { "intervalUnit" }, null);
        endBy = BicepValue.defineProperty(this, "endBy", new String[] { "endBy" }, null);
        startOn = BicepValue.defineProperty(this, "startOn", new String[] { "startOn" }, null);
        interval = BicepValue.defineProperty(this, "interval", new String[] { "interval" }, null);
    }

    public BicepValue<OffsetDateTime> getStartFrom() {
        return this.startFrom;
    }

    public TriggerParameters setStartFrom(BicepValue<OffsetDateTime> startFrom) {
        this.startFrom.assign(startFrom);
        return this;
    }
    public TriggerParameters setStartFrom(OffsetDateTime startFrom) {
        return this.setStartFrom(BicepValue.from(startFrom));
    }

    public BicepValue<IntervalUnit> getIntervalUnit() {
        return this.intervalUnit;
    }

    public TriggerParameters setIntervalUnit(BicepValue<IntervalUnit> intervalUnit) {
        this.intervalUnit.assign(intervalUnit);
        return this;
    }
    public TriggerParameters setIntervalUnit(IntervalUnit intervalUnit) {
        return this.setIntervalUnit(BicepValue.from(intervalUnit));
    }

    public BicepValue<OffsetDateTime> getEndBy() {
        return this.endBy;
    }

    public TriggerParameters setEndBy(BicepValue<OffsetDateTime> endBy) {
        this.endBy.assign(endBy);
        return this;
    }
    public TriggerParameters setEndBy(OffsetDateTime endBy) {
        return this.setEndBy(BicepValue.from(endBy));
    }

    public BicepValue<OffsetDateTime> getStartOn() {
        return this.startOn;
    }

    public TriggerParameters setStartOn(BicepValue<OffsetDateTime> startOn) {
        this.startOn.assign(startOn);
        return this;
    }
    public TriggerParameters setStartOn(OffsetDateTime startOn) {
        return this.setStartOn(BicepValue.from(startOn));
    }

    public BicepValue<Integer> getInterval() {
        return this.interval;
    }

    public TriggerParameters setInterval(BicepValue<Integer> interval) {
        this.interval.assign(interval);
        return this;
    }
    public TriggerParameters setInterval(Integer interval) {
        return this.setInterval(BicepValue.from(interval));
    }

}
