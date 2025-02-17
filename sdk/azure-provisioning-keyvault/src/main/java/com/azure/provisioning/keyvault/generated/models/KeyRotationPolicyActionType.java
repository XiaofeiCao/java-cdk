// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.keyvault.generated.models;

public enum KeyRotationPolicyActionType {

    ROTATE("rotate"),

    NOTIFY("notify");
    private final String value;
    KeyRotationPolicyActionType(String value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return this.value;
    }
}
