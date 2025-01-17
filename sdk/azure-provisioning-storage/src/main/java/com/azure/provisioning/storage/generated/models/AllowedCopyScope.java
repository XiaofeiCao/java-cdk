// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated.models;

public enum AllowedCopyScope {

    PRIVATE_LINK("PrivateLink"),

    AAD("AAD");
    private final String value;
    AllowedCopyScope(String value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return this.value;
    }
}
