// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated.models;

public enum GeoReplicationStatus {

    LIVE("Live"),

    BOOTSTRAP("Bootstrap"),

    UNAVAILABLE("Unavailable");
    private final String value;
    GeoReplicationStatus(String value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return this.value;
    }
}
