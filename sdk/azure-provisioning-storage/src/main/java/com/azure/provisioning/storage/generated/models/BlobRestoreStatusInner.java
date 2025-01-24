// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated.models;

import com.azure.provisioning.storage.generated.models.BlobRestoreParameters;
import com.azure.provisioning.storage.generated.models.BlobRestoreProgressStatus;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class BlobRestoreStatusInner extends ProvisioningConstruct {

    private final BicepValue<BlobRestoreParameters> parameters;
    private final BicepValue<String> failureReason;
    private final BicepValue<String> restoreId;
    private final BicepValue<BlobRestoreProgressStatus> status;

    public BlobRestoreStatusInner() {
        parameters = BicepValue.defineProperty(this, "parameters", new String[] { "parameters" }, null);
        failureReason = BicepValue.defineProperty(this, "failureReason", new String[] { "failureReason" }, null);
        restoreId = BicepValue.defineProperty(this, "restoreId", new String[] { "restoreId" }, null);
        status = BicepValue.defineProperty(this, "status", new String[] { "status" }, null);
    }

    public BicepValue<BlobRestoreParameters> getParameters() {
        return this.parameters;
    }

    public BlobRestoreStatusInner setParameters(BicepValue<BlobRestoreParameters> parameters) {
        this.parameters.assign(parameters);
        return this;
    }
    public BlobRestoreStatusInner setParameters(BlobRestoreParameters parameters) {
        return this.setParameters(BicepValue.from(parameters));
    }

    public BicepValue<String> getFailureReason() {
        return this.failureReason;
    }

    public BlobRestoreStatusInner setFailureReason(BicepValue<String> failureReason) {
        this.failureReason.assign(failureReason);
        return this;
    }
    public BlobRestoreStatusInner setFailureReason(String failureReason) {
        return this.setFailureReason(BicepValue.from(failureReason));
    }

    public BicepValue<String> getRestoreId() {
        return this.restoreId;
    }

    public BlobRestoreStatusInner setRestoreId(BicepValue<String> restoreId) {
        this.restoreId.assign(restoreId);
        return this;
    }
    public BlobRestoreStatusInner setRestoreId(String restoreId) {
        return this.setRestoreId(BicepValue.from(restoreId));
    }

    public BicepValue<BlobRestoreProgressStatus> getStatus() {
        return this.status;
    }

    public BlobRestoreStatusInner setStatus(BicepValue<BlobRestoreProgressStatus> status) {
        this.status.assign(status);
        return this;
    }
    public BlobRestoreStatusInner setStatus(BlobRestoreProgressStatus status) {
        return this.setStatus(BicepValue.from(status));
    }

}
