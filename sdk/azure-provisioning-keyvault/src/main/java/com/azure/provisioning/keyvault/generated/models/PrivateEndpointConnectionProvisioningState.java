// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.keyvault.generated.models;

public enum PrivateEndpointConnectionProvisioningState {

    SUCCEEDED("Succeeded"),

    CREATING("Creating"),

    UPDATING("Updating"),

    DELETING("Deleting"),

    FAILED("Failed"),

    DISCONNECTED("Disconnected");
    private final String value;
    PrivateEndpointConnectionProvisioningState(String value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return this.value;
    }
}
