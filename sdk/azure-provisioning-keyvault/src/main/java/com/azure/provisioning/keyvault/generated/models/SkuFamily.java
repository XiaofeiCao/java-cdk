// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.keyvault.generated.models;

public enum SkuFamily {

    A("A");
    private final String value;
    SkuFamily(String value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return this.value;
    }
}
