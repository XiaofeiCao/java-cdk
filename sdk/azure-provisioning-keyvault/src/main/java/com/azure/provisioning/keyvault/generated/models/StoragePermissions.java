// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.keyvault.generated.models;

public enum StoragePermissions {

    ALL("ALL"),

    GET("GET"),

    LIST("LIST"),

    DELETE("DELETE"),

    SET("SET"),

    UPDATE("UPDATE"),

    REGENERATEKEY("REGENERATEKEY"),

    RECOVER("RECOVER"),

    PURGE("PURGE"),

    BACKUP("BACKUP"),

    RESTORE("RESTORE"),

    SETSAS("SETSAS"),

    LISTSAS("LISTSAS"),

    GETSAS("GETSAS"),

    DELETESAS("DELETESAS");
    private final String value;
    StoragePermissions(String value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return this.value;
    }
}
