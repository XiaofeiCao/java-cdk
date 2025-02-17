// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.keyvault.generated.models;

public enum JsonWebKeyOperation {

    ENCRYPT("encrypt"),

    DECRYPT("decrypt"),

    SIGN("sign"),

    VERIFY("verify"),

    WRAP_KEY("wrapKey"),

    UNWRAP_KEY("unwrapKey"),

    IMPORT("import"),

    RELEASE("release");
    private final String value;
    JsonWebKeyOperation(String value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return this.value;
    }
}
