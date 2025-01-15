// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.keyvault.generated.models;

public enum VaultProvisioningState {

    SUCCEEDED("SUCCEEDED"),

    REGISTERING_DNS("REGISTERING_DNS");
    private final String value;
    VaultProvisioningState(String value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return this.value;
    }
}
