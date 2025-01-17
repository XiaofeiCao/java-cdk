// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated.models;

public enum BlobRestoreProgressStatus {

    IN_PROGRESS("InProgress"),

    COMPLETE("Complete"),

    FAILED("Failed");
    private final String value;
    BlobRestoreProgressStatus(String value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return this.value;
    }
}
