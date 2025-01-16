// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.keyvault.generated.models;

public enum SkuName {

    STANDARD("standard"),

    PREMIUM("premium");
    private final String value;
    SkuName(String value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return this.value;
    }
}
