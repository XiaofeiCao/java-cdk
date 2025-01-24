// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated.models;

import com.azure.provisioning.storage.generated.models.RunResult;
import com.azure.provisioning.storage.generated.models.RunStatusEnum;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class StorageTaskReportProperties extends ProvisioningConstruct {

    private final BicepValue<String> taskVersion;
    private final BicepValue<String> finishTime;
    private final BicepValue<String> objectsTargetedCount;
    private final BicepValue<String> objectsOperatedOnCount;
    private final BicepValue<String> objectFailedCount;
    private final BicepValue<String> summaryReportPath;
    private final BicepValue<String> storageAccountId;
    private final BicepValue<String> taskAssignmentId;
    private final BicepValue<String> startTime;
    private final BicepValue<String> objectsSucceededCount;
    private final BicepValue<RunStatusEnum> runStatusEnum;
    private final BicepValue<String> runStatusError;
    private final BicepValue<RunResult> runResult;
    private final BicepValue<String> taskId;

    public StorageTaskReportProperties() {
        taskVersion = BicepValue.defineProperty(this, "taskVersion", new String[] { "taskVersion" }, null);
        finishTime = BicepValue.defineProperty(this, "finishTime", new String[] { "finishTime" }, null);
        objectsTargetedCount = BicepValue.defineProperty(this, "objectsTargetedCount", new String[] { "objectsTargetedCount" }, null);
        objectsOperatedOnCount = BicepValue.defineProperty(this, "objectsOperatedOnCount", new String[] { "objectsOperatedOnCount" }, null);
        objectFailedCount = BicepValue.defineProperty(this, "objectFailedCount", new String[] { "objectFailedCount" }, null);
        summaryReportPath = BicepValue.defineProperty(this, "summaryReportPath", new String[] { "summaryReportPath" }, null);
        storageAccountId = BicepValue.defineProperty(this, "storageAccountId", new String[] { "storageAccountId" }, null);
        taskAssignmentId = BicepValue.defineProperty(this, "taskAssignmentId", new String[] { "taskAssignmentId" }, null);
        startTime = BicepValue.defineProperty(this, "startTime", new String[] { "startTime" }, null);
        objectsSucceededCount = BicepValue.defineProperty(this, "objectsSucceededCount", new String[] { "objectsSucceededCount" }, null);
        runStatusEnum = BicepValue.defineProperty(this, "runStatusEnum", new String[] { "runStatusEnum" }, null);
        runStatusError = BicepValue.defineProperty(this, "runStatusError", new String[] { "runStatusError" }, null);
        runResult = BicepValue.defineProperty(this, "runResult", new String[] { "runResult" }, null);
        taskId = BicepValue.defineProperty(this, "taskId", new String[] { "taskId" }, null);
    }

    public BicepValue<String> getTaskVersion() {
        return this.taskVersion;
    }

    public StorageTaskReportProperties setTaskVersion(BicepValue<String> taskVersion) {
        this.taskVersion.assign(taskVersion);
        return this;
    }
    public StorageTaskReportProperties setTaskVersion(String taskVersion) {
        return this.setTaskVersion(BicepValue.from(taskVersion));
    }

    public BicepValue<String> getFinishTime() {
        return this.finishTime;
    }

    public StorageTaskReportProperties setFinishTime(BicepValue<String> finishTime) {
        this.finishTime.assign(finishTime);
        return this;
    }
    public StorageTaskReportProperties setFinishTime(String finishTime) {
        return this.setFinishTime(BicepValue.from(finishTime));
    }

    public BicepValue<String> getObjectsTargetedCount() {
        return this.objectsTargetedCount;
    }

    public StorageTaskReportProperties setObjectsTargetedCount(BicepValue<String> objectsTargetedCount) {
        this.objectsTargetedCount.assign(objectsTargetedCount);
        return this;
    }
    public StorageTaskReportProperties setObjectsTargetedCount(String objectsTargetedCount) {
        return this.setObjectsTargetedCount(BicepValue.from(objectsTargetedCount));
    }

    public BicepValue<String> getObjectsOperatedOnCount() {
        return this.objectsOperatedOnCount;
    }

    public StorageTaskReportProperties setObjectsOperatedOnCount(BicepValue<String> objectsOperatedOnCount) {
        this.objectsOperatedOnCount.assign(objectsOperatedOnCount);
        return this;
    }
    public StorageTaskReportProperties setObjectsOperatedOnCount(String objectsOperatedOnCount) {
        return this.setObjectsOperatedOnCount(BicepValue.from(objectsOperatedOnCount));
    }

    public BicepValue<String> getObjectFailedCount() {
        return this.objectFailedCount;
    }

    public StorageTaskReportProperties setObjectFailedCount(BicepValue<String> objectFailedCount) {
        this.objectFailedCount.assign(objectFailedCount);
        return this;
    }
    public StorageTaskReportProperties setObjectFailedCount(String objectFailedCount) {
        return this.setObjectFailedCount(BicepValue.from(objectFailedCount));
    }

    public BicepValue<String> getSummaryReportPath() {
        return this.summaryReportPath;
    }

    public StorageTaskReportProperties setSummaryReportPath(BicepValue<String> summaryReportPath) {
        this.summaryReportPath.assign(summaryReportPath);
        return this;
    }
    public StorageTaskReportProperties setSummaryReportPath(String summaryReportPath) {
        return this.setSummaryReportPath(BicepValue.from(summaryReportPath));
    }

    public BicepValue<String> getStorageAccountId() {
        return this.storageAccountId;
    }

    public StorageTaskReportProperties setStorageAccountId(BicepValue<String> storageAccountId) {
        this.storageAccountId.assign(storageAccountId);
        return this;
    }
    public StorageTaskReportProperties setStorageAccountId(String storageAccountId) {
        return this.setStorageAccountId(BicepValue.from(storageAccountId));
    }

    public BicepValue<String> getTaskAssignmentId() {
        return this.taskAssignmentId;
    }

    public StorageTaskReportProperties setTaskAssignmentId(BicepValue<String> taskAssignmentId) {
        this.taskAssignmentId.assign(taskAssignmentId);
        return this;
    }
    public StorageTaskReportProperties setTaskAssignmentId(String taskAssignmentId) {
        return this.setTaskAssignmentId(BicepValue.from(taskAssignmentId));
    }

    public BicepValue<String> getStartTime() {
        return this.startTime;
    }

    public StorageTaskReportProperties setStartTime(BicepValue<String> startTime) {
        this.startTime.assign(startTime);
        return this;
    }
    public StorageTaskReportProperties setStartTime(String startTime) {
        return this.setStartTime(BicepValue.from(startTime));
    }

    public BicepValue<String> getObjectsSucceededCount() {
        return this.objectsSucceededCount;
    }

    public StorageTaskReportProperties setObjectsSucceededCount(BicepValue<String> objectsSucceededCount) {
        this.objectsSucceededCount.assign(objectsSucceededCount);
        return this;
    }
    public StorageTaskReportProperties setObjectsSucceededCount(String objectsSucceededCount) {
        return this.setObjectsSucceededCount(BicepValue.from(objectsSucceededCount));
    }

    public BicepValue<RunStatusEnum> getRunStatusEnum() {
        return this.runStatusEnum;
    }

    public StorageTaskReportProperties setRunStatusEnum(BicepValue<RunStatusEnum> runStatusEnum) {
        this.runStatusEnum.assign(runStatusEnum);
        return this;
    }
    public StorageTaskReportProperties setRunStatusEnum(RunStatusEnum runStatusEnum) {
        return this.setRunStatusEnum(BicepValue.from(runStatusEnum));
    }

    public BicepValue<String> getRunStatusError() {
        return this.runStatusError;
    }

    public StorageTaskReportProperties setRunStatusError(BicepValue<String> runStatusError) {
        this.runStatusError.assign(runStatusError);
        return this;
    }
    public StorageTaskReportProperties setRunStatusError(String runStatusError) {
        return this.setRunStatusError(BicepValue.from(runStatusError));
    }

    public BicepValue<RunResult> getRunResult() {
        return this.runResult;
    }

    public StorageTaskReportProperties setRunResult(BicepValue<RunResult> runResult) {
        this.runResult.assign(runResult);
        return this;
    }
    public StorageTaskReportProperties setRunResult(RunResult runResult) {
        return this.setRunResult(BicepValue.from(runResult));
    }

    public BicepValue<String> getTaskId() {
        return this.taskId;
    }

    public StorageTaskReportProperties setTaskId(BicepValue<String> taskId) {
        this.taskId.assign(taskId);
        return this;
    }
    public StorageTaskReportProperties setTaskId(String taskId) {
        return this.setTaskId(BicepValue.from(taskId));
    }

}
