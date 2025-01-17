// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated.models;

public enum State {

    PROVISIONING("Provisioning"),

    DEPROVISIONING("Deprovisioning"),

    SUCCEEDED("Succeeded"),

    FAILED("Failed"),

    NETWORK_SOURCE_DELETED("NetworkSourceDeleted");
    private final String value;
    State(String value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return this.value;
    }
}
