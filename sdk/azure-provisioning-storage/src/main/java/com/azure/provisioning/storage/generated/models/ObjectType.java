// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated.models;

public enum ObjectType {

    BLOB("Blob"),

    CONTAINER("Container");
    private final String value;
    ObjectType(String value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return this.value;
    }
}
