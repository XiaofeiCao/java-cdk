// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated.models;

public enum SkuName {

    STANDARD_LRS("Standard_LRS"),

    STANDARD_GRS("Standard_GRS"),

    STANDARD_RAGRS("Standard_RAGRS"),

    STANDARD_ZRS("Standard_ZRS"),

    PREMIUM_LRS("Premium_LRS"),

    PREMIUM_ZRS("Premium_ZRS"),

    STANDARD_GZRS("Standard_GZRS"),

    STANDARD_RAGZRS("Standard_RAGZRS");
    private final String value;
    SkuName(String value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return this.value;
    }
}
