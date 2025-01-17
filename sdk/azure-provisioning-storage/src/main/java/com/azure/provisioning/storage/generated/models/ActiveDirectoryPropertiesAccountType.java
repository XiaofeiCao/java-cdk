// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated.models;

public enum ActiveDirectoryPropertiesAccountType {

    USER("User"),

    COMPUTER("Computer");
    private final String value;
    ActiveDirectoryPropertiesAccountType(String value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return this.value;
    }
}
