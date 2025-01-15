// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.keyvault.generated.models;

public enum DeletionRecoveryLevel {

    PURGEABLE("PURGEABLE"),

    RECOVERABLE_PURGEABLE("RECOVERABLE_PURGEABLE"),

    RECOVERABLE("RECOVERABLE"),

    RECOVERABLE_PROTECTED_SUBSCRIPTION("RECOVERABLE_PROTECTED_SUBSCRIPTION");
    private final String value;
    DeletionRecoveryLevel(String value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return this.value;
    }
}
