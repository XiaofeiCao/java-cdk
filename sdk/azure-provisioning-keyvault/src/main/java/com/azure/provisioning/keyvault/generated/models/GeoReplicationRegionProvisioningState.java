// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.keyvault.generated.models;

public enum GeoReplicationRegionProvisioningState {

    PREPROVISIONING("Preprovisioning"),

    PROVISIONING("Provisioning"),

    SUCCEEDED("Succeeded"),

    FAILED("Failed"),

    DELETING("Deleting"),

    CLEANUP("Cleanup");
    private final String value;
    GeoReplicationRegionProvisioningState(String value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return this.value;
    }
}
