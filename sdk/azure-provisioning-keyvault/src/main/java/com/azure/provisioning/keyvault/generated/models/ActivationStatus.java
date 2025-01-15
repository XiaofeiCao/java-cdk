// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.keyvault.generated.models;

public enum ActivationStatus {

    ACTIVE("ACTIVE"),

    NOT_ACTIVATED("NOT_ACTIVATED"),

    UNKNOWN("UNKNOWN"),

    FAILED("FAILED");
    private final String value;
    ActivationStatus(String value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return this.value;
    }
}
