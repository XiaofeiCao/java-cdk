// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated.models;

public enum TriggerType {

    RUN_ONCE("RunOnce"),

    ON_SCHEDULE("OnSchedule");
    private final String value;
    TriggerType(String value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return this.value;
    }
}
