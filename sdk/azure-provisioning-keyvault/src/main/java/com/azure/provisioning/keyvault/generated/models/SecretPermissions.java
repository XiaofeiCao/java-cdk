// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.keyvault.generated.models;

public enum SecretPermissions {

    ALL("ALL"),

    GET("GET"),

    LIST("LIST"),

    SET("SET"),

    DELETE("DELETE"),

    BACKUP("BACKUP"),

    RESTORE("RESTORE"),

    RECOVER("RECOVER"),

    PURGE("PURGE");
    private final String value;
    SecretPermissions(String value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return this.value;
    }
}
