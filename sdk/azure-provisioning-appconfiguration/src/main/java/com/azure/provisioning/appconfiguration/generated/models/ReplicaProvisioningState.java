// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.appconfiguration.generated.models;

public enum ReplicaProvisioningState {

    CREATING("Creating"),

    SUCCEEDED("Succeeded"),

    DELETING("Deleting"),

    FAILED("Failed"),

    CANCELED("Canceled");
    private final String value;
    ReplicaProvisioningState(String value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return this.value;
    }
}
