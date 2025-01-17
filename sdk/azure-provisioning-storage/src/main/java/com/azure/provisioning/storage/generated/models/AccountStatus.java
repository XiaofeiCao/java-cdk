// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated.models;

public enum AccountStatus {

    AVAILABLE("available"),

    UNAVAILABLE("unavailable");
    private final String value;
    AccountStatus(String value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return this.value;
    }
}
