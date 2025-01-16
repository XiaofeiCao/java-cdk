// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.keyvault.generated.models;

public enum ProvisioningState {

    SUCCEEDED("Succeeded"),

    PROVISIONING("Provisioning"),

    FAILED("Failed"),

    UPDATING("Updating"),

    DELETING("Deleting"),

    ACTIVATED("Activated"),

    SECURITY_DOMAIN_RESTORE("SecurityDomainRestore"),

    RESTORING("Restoring");
    private final String value;
    ProvisioningState(String value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return this.value;
    }
}
