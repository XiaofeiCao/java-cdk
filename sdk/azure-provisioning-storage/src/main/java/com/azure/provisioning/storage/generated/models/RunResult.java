// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated.models;

public enum RunResult {

    SUCCEEDED("Succeeded"),

    FAILED("Failed");
    private final String value;
    RunResult(String value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return this.value;
    }
}
