// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated.models;

public enum MinimumTlsVersion {

    TLS1_0("TLS1_0"),

    TLS1_1("TLS1_1"),

    TLS1_2("TLS1_2"),

    TLS1_3("TLS1_3");
    private final String value;
    MinimumTlsVersion(String value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return this.value;
    }
}
