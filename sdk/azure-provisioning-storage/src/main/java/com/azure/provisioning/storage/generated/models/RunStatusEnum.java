// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated.models;

public enum RunStatusEnum {

    IN_PROGRESS("InProgress"),

    FINISHED("Finished");
    private final String value;
    RunStatusEnum(String value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return this.value;
    }
}
