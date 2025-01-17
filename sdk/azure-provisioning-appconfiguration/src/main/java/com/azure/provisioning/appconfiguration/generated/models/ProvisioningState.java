// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.appconfiguration.generated.models;

public enum ProvisioningState {

    CREATING("Creating"),

    UPDATING("Updating"),

    DELETING("Deleting"),

    SUCCEEDED("Succeeded"),

    FAILED("Failed"),

    CANCELED("Canceled");
    private final String value;
    ProvisioningState(String value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return this.value;
    }
}
