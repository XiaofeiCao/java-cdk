// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated.models;

import com.azure.provisioning.storage.generated.models.SkuName;
import com.azure.provisioning.storage.generated.models.SkuConversionStatus;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class StorageAccountSkuConversionStatus extends ProvisioningConstruct {

    private final BicepValue<SkuConversionStatus> skuConversionStatus;
    private final BicepValue<SkuName> targetSkuName;
    private final BicepValue<String> endTime;
    private final BicepValue<String> startTime;

    public StorageAccountSkuConversionStatus() {
        skuConversionStatus = BicepValue.defineProperty(this, "skuConversionStatus", new String[] { "skuConversionStatus" }, null);
        targetSkuName = BicepValue.defineProperty(this, "targetSkuName", new String[] { "targetSkuName" }, null);
        endTime = BicepValue.defineProperty(this, "endTime", new String[] { "endTime" }, null);
        startTime = BicepValue.defineProperty(this, "startTime", new String[] { "startTime" }, null);
    }

    public BicepValue<SkuConversionStatus> getSkuConversionStatus() {
        return this.skuConversionStatus;
    }

    public StorageAccountSkuConversionStatus setSkuConversionStatus(BicepValue<SkuConversionStatus> skuConversionStatus) {
        this.skuConversionStatus.assign(skuConversionStatus);
        return this;
    }
    public BicepValue<SkuName> getTargetSkuName() {
        return this.targetSkuName;
    }

    public StorageAccountSkuConversionStatus setTargetSkuName(BicepValue<SkuName> targetSkuName) {
        this.targetSkuName.assign(targetSkuName);
        return this;
    }
    public BicepValue<String> getEndTime() {
        return this.endTime;
    }

    public StorageAccountSkuConversionStatus setEndTime(BicepValue<String> endTime) {
        this.endTime.assign(endTime);
        return this;
    }
    public BicepValue<String> getStartTime() {
        return this.startTime;
    }

    public StorageAccountSkuConversionStatus setStartTime(BicepValue<String> startTime) {
        this.startTime.assign(startTime);
        return this;
    }
}
