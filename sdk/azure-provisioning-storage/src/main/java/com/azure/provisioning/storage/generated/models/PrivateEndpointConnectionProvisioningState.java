// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated.models;

public enum PrivateEndpointConnectionProvisioningState {

    SUCCEEDED("Succeeded"),

    CREATING("Creating"),

    DELETING("Deleting"),

    FAILED("Failed");
    private final String value;
    PrivateEndpointConnectionProvisioningState(String value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return this.value;
    }
}
