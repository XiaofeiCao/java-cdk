// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.keyvault.generated.models;

public enum CertificatePermissions {

    ALL("all"),

    GET("get"),

    LIST("list"),

    DELETE("delete"),

    CREATE("create"),

    IMPORT("import"),

    UPDATE("update"),

    MANAGECONTACTS("managecontacts"),

    GETISSUERS("getissuers"),

    LISTISSUERS("listissuers"),

    SETISSUERS("setissuers"),

    DELETEISSUERS("deleteissuers"),

    MANAGEISSUERS("manageissuers"),

    RECOVER("recover"),

    PURGE("purge"),

    BACKUP("backup"),

    RESTORE("restore");
    private final String value;
    CertificatePermissions(String value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return this.value;
    }
}
