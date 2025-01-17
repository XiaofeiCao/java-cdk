// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated.models;

public enum Bypass {

    NONE("None"),

    LOGGING("Logging"),

    METRICS("Metrics"),

    AZURE_SERVICES("AzureServices");
    private final String value;
    Bypass(String value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return this.value;
    }
}
