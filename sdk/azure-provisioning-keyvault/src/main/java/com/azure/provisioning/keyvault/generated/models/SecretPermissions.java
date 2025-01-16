// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.keyvault.generated.models;

public enum SecretPermissions {

    ALL("all"),

    GET("get"),

    LIST("list"),

    SET("set"),

    DELETE("delete"),

    BACKUP("backup"),

    RESTORE("restore"),

    RECOVER("recover"),

    PURGE("purge");
    private final String value;
    SecretPermissions(String value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return this.value;
    }
}
