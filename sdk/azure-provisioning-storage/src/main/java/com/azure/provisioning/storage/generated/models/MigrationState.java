// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated.models;

public enum MigrationState {

    IN_PROGRESS("InProgress"),

    COMPLETED("Completed");
    private final String value;
    MigrationState(String value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return this.value;
    }
}
