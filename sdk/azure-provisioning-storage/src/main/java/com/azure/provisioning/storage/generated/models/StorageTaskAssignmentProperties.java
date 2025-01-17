// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated.models;

import com.azure.provisioning.storage.generated.models.StorageTaskReportProperties;
import com.azure.provisioning.storage.generated.models.StorageTaskAssignmentReport;
import com.azure.core.util.logging.ClientLogger;
import com.azure.provisioning.storage.generated.models.ProvisioningState;
import com.azure.provisioning.storage.generated.models.StorageTaskAssignmentExecutionContext;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class StorageTaskAssignmentProperties extends ProvisioningConstruct {

    private final BicepValue<ProvisioningState> provisioningState;
    private final BicepValue<ClientLogger> lOGGER;
    private final BicepValue<StorageTaskAssignmentReport> report;
    private final BicepValue<Boolean> enabled;
    private final BicepValue<String> taskId;
    private final BicepValue<String> description;
    private final BicepValue<StorageTaskReportProperties> runStatus;
    private final BicepValue<StorageTaskAssignmentExecutionContext> executionContext;

    public StorageTaskAssignmentProperties() {
        provisioningState = BicepValue.defineProperty(this, "provisioningState", new String[] { "provisioningState" }, null);
        lOGGER = BicepValue.defineProperty(this, "lOGGER", new String[] { "lOGGER" }, null);
        report = BicepValue.defineProperty(this, "report", new String[] { "report" }, null);
        enabled = BicepValue.defineProperty(this, "enabled", new String[] { "enabled" }, null);
        taskId = BicepValue.defineProperty(this, "taskId", new String[] { "taskId" }, null);
        description = BicepValue.defineProperty(this, "description", new String[] { "description" }, null);
        runStatus = BicepValue.defineProperty(this, "runStatus", new String[] { "runStatus" }, null);
        executionContext = BicepValue.defineProperty(this, "executionContext", new String[] { "executionContext" }, null);
    }

    public BicepValue<ProvisioningState> getProvisioningState() {
        return this.provisioningState;
    }

    public StorageTaskAssignmentProperties setProvisioningState(BicepValue<ProvisioningState> provisioningState) {
        this.provisioningState.assign(provisioningState);
        return this;
    }
    public BicepValue<ClientLogger> getLOGGER() {
        return this.lOGGER;
    }

    public StorageTaskAssignmentProperties setLOGGER(BicepValue<ClientLogger> lOGGER) {
        this.lOGGER.assign(lOGGER);
        return this;
    }
    public BicepValue<StorageTaskAssignmentReport> getReport() {
        return this.report;
    }

    public StorageTaskAssignmentProperties setReport(BicepValue<StorageTaskAssignmentReport> report) {
        this.report.assign(report);
        return this;
    }
    public BicepValue<Boolean> getEnabled() {
        return this.enabled;
    }

    public StorageTaskAssignmentProperties setEnabled(BicepValue<Boolean> enabled) {
        this.enabled.assign(enabled);
        return this;
    }
    public BicepValue<String> getTaskId() {
        return this.taskId;
    }

    public StorageTaskAssignmentProperties setTaskId(BicepValue<String> taskId) {
        this.taskId.assign(taskId);
        return this;
    }
    public BicepValue<String> getDescription() {
        return this.description;
    }

    public StorageTaskAssignmentProperties setDescription(BicepValue<String> description) {
        this.description.assign(description);
        return this;
    }
    public BicepValue<StorageTaskReportProperties> getRunStatus() {
        return this.runStatus;
    }

    public StorageTaskAssignmentProperties setRunStatus(BicepValue<StorageTaskReportProperties> runStatus) {
        this.runStatus.assign(runStatus);
        return this;
    }
    public BicepValue<StorageTaskAssignmentExecutionContext> getExecutionContext() {
        return this.executionContext;
    }

    public StorageTaskAssignmentProperties setExecutionContext(BicepValue<StorageTaskAssignmentExecutionContext> executionContext) {
        this.executionContext.assign(executionContext);
        return this;
    }
}
