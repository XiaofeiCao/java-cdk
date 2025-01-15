// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.keyvault.generated.models;

public enum KeyPermissions {

    ALL("ALL"),

    ENCRYPT("ENCRYPT"),

    DECRYPT("DECRYPT"),

    WRAP_KEY("WRAP_KEY"),

    UNWRAP_KEY("UNWRAP_KEY"),

    SIGN("SIGN"),

    VERIFY("VERIFY"),

    GET("GET"),

    LIST("LIST"),

    CREATE("CREATE"),

    UPDATE("UPDATE"),

    IMPORT("IMPORT"),

    DELETE("DELETE"),

    BACKUP("BACKUP"),

    RESTORE("RESTORE"),

    RECOVER("RECOVER"),

    PURGE("PURGE"),

    RELEASE("RELEASE"),

    ROTATE("ROTATE"),

    GETROTATIONPOLICY("GETROTATIONPOLICY"),

    SETROTATIONPOLICY("SETROTATIONPOLICY");
    private final String value;
    KeyPermissions(String value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return this.value;
    }
}
