// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated.models;

public enum IntervalUnit {

    DAYS("Days");
    private final String value;
    IntervalUnit(String value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return this.value;
    }
}
