// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated.models;

public enum KeyType {

    SERVICE("Service"),

    ACCOUNT("Account");
    private final String value;
    KeyType(String value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return this.value;
    }
}
