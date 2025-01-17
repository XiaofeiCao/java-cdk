// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.appconfiguration.generated.models;

public enum ConnectionStatus {

    PENDING("Pending"),

    APPROVED("Approved"),

    REJECTED("Rejected"),

    DISCONNECTED("Disconnected");
    private final String value;
    ConnectionStatus(String value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return this.value;
    }
}
