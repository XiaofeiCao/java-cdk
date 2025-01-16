// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.keyvault.generated.models;

public enum PrivateEndpointServiceConnectionStatus {

    PENDING("Pending"),

    APPROVED("Approved"),

    REJECTED("Rejected"),

    DISCONNECTED("Disconnected");
    private final String value;
    PrivateEndpointServiceConnectionStatus(String value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return this.value;
    }
}
