// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated.models;

public enum KeySource {

    MICROSOFT_STORAGE("Microsoft.Storage"),

    MICROSOFT_KEYVAULT("Microsoft.Keyvault");
    private final String value;
    KeySource(String value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return this.value;
    }
}
