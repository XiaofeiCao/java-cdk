// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.keyvault.generated.models;

public enum DeletionRecoveryLevel {

    PURGEABLE("Purgeable"),

    RECOVERABLE_PURGEABLE("Recoverable+Purgeable"),

    RECOVERABLE("Recoverable"),

    RECOVERABLE_PROTECTED_SUBSCRIPTION("Recoverable+ProtectedSubscription");
    private final String value;
    DeletionRecoveryLevel(String value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return this.value;
    }
}
