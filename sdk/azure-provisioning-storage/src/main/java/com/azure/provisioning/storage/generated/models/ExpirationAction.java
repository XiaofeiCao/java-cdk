// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated.models;

public enum ExpirationAction {

    LOG("Log"),

    BLOCK("Block");
    private final String value;
    ExpirationAction(String value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return this.value;
    }
}
