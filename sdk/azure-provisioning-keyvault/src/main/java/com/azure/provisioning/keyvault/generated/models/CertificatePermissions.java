// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.keyvault.generated.models;

public enum CertificatePermissions {

    ALL("ALL"),

    GET("GET"),

    LIST("LIST"),

    DELETE("DELETE"),

    CREATE("CREATE"),

    IMPORT("IMPORT"),

    UPDATE("UPDATE"),

    MANAGECONTACTS("MANAGECONTACTS"),

    GETISSUERS("GETISSUERS"),

    LISTISSUERS("LISTISSUERS"),

    SETISSUERS("SETISSUERS"),

    DELETEISSUERS("DELETEISSUERS"),

    MANAGEISSUERS("MANAGEISSUERS"),

    RECOVER("RECOVER"),

    PURGE("PURGE"),

    BACKUP("BACKUP"),

    RESTORE("RESTORE");
    private final String value;
    CertificatePermissions(String value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return this.value;
    }
}
