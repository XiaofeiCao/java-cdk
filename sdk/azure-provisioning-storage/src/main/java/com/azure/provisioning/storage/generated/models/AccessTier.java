// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated.models;

public enum AccessTier {

    HOT("Hot"),

    COOL("Cool"),

    PREMIUM("Premium"),

    COLD("Cold");
    private final String value;
    AccessTier(String value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return this.value;
    }
}
