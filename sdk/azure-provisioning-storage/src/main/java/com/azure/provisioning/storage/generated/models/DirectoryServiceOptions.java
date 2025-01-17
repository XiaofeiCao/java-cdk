// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated.models;

public enum DirectoryServiceOptions {

    NONE("None"),

    AADDS("AADDS"),

    AD("AD"),

    AADKERB("AADKERB");
    private final String value;
    DirectoryServiceOptions(String value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return this.value;
    }
}
