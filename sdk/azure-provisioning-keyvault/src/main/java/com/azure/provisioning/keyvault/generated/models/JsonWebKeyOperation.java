// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.keyvault.generated.models;

public enum JsonWebKeyOperation {

    ENCRYPT("ENCRYPT"),

    DECRYPT("DECRYPT"),

    SIGN("SIGN"),

    VERIFY("VERIFY"),

    WRAP_KEY("WRAP_KEY"),

    UNWRAP_KEY("UNWRAP_KEY"),

    IMPORT("IMPORT"),

    RELEASE("RELEASE");
    private final String value;
    JsonWebKeyOperation(String value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return this.value;
    }
}
