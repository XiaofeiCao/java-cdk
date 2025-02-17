// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.keyvault.generated.models;

public enum KeyPermissions {

    ALL("all"),

    ENCRYPT("encrypt"),

    DECRYPT("decrypt"),

    WRAP_KEY("wrapKey"),

    UNWRAP_KEY("unwrapKey"),

    SIGN("sign"),

    VERIFY("verify"),

    GET("get"),

    LIST("list"),

    CREATE("create"),

    UPDATE("update"),

    IMPORT("import"),

    DELETE("delete"),

    BACKUP("backup"),

    RESTORE("restore"),

    RECOVER("recover"),

    PURGE("purge"),

    RELEASE("release"),

    ROTATE("rotate"),

    GETROTATIONPOLICY("getrotationpolicy"),

    SETROTATIONPOLICY("setrotationpolicy");
    private final String value;
    KeyPermissions(String value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return this.value;
    }
}
