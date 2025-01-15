// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.keyvault.generated.models;

public enum ProvisioningState {

    SUCCEEDED("SUCCEEDED"),

    PROVISIONING("PROVISIONING"),

    FAILED("FAILED"),

    UPDATING("UPDATING"),

    DELETING("DELETING"),

    ACTIVATED("ACTIVATED"),

    SECURITY_DOMAIN_RESTORE("SECURITY_DOMAIN_RESTORE"),

    RESTORING("RESTORING");
    private final String value;
    ProvisioningState(String value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return this.value;
    }
}
