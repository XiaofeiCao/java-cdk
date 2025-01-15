// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.keyvault.generated.models;

public enum CreateMode {

    RECOVER("recover"),

    DEFAULT("default");
    private final String value;
    CreateMode(String value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return this.value;
    }
}
