// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.keyvault.generated.models;

public enum StoragePermissions {

    ALL("all"),

    GET("get"),

    LIST("list"),

    DELETE("delete"),

    SET("set"),

    UPDATE("update"),

    REGENERATEKEY("regeneratekey"),

    RECOVER("recover"),

    PURGE("purge"),

    BACKUP("backup"),

    RESTORE("restore"),

    SETSAS("setsas"),

    LISTSAS("listsas"),

    GETSAS("getsas"),

    DELETESAS("deletesas");
    private final String value;
    StoragePermissions(String value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return this.value;
    }
}
