// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated.models;

public enum LeaseDuration {

    INFINITE("Infinite"),

    FIXED("Fixed");
    private final String value;
    LeaseDuration(String value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return this.value;
    }
}
