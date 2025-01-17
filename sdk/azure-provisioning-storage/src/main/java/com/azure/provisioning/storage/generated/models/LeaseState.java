// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated.models;

public enum LeaseState {

    AVAILABLE("Available"),

    LEASED("Leased"),

    EXPIRED("Expired"),

    BREAKING("Breaking"),

    BROKEN("Broken");
    private final String value;
    LeaseState(String value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return this.value;
    }
}
