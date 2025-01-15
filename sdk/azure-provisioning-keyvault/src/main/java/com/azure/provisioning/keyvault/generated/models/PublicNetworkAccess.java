// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.keyvault.generated.models;

public enum PublicNetworkAccess {

    ENABLED("ENABLED"),

    DISABLED("DISABLED");
    private final String value;
    PublicNetworkAccess(String value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return this.value;
    }
}
