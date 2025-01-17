// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated.models;

public enum Schedule {

    DAILY("Daily"),

    WEEKLY("Weekly");
    private final String value;
    Schedule(String value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return this.value;
    }
}
