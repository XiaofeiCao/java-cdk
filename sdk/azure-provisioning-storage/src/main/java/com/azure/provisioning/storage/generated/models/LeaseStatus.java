// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated.models;

public enum LeaseStatus {

    LOCKED("Locked"),

    UNLOCKED("Unlocked");
    private final String value;
    LeaseStatus(String value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return this.value;
    }
}
