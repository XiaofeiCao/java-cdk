// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.keyvault.generated.models;

public enum ActionsRequired {

    NONE("NONE");
    private final String value;
    ActionsRequired(String value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return this.value;
    }
}
