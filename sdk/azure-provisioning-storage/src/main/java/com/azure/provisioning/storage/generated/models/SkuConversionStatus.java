// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated.models;

public enum SkuConversionStatus {

    IN_PROGRESS("InProgress"),

    SUCCEEDED("Succeeded"),

    FAILED("Failed");
    private final String value;
    SkuConversionStatus(String value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return this.value;
    }
}
