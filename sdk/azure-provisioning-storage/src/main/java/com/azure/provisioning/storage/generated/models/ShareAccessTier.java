// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated.models;

public enum ShareAccessTier {

    TRANSACTION_OPTIMIZED("TransactionOptimized"),

    HOT("Hot"),

    COOL("Cool"),

    PREMIUM("Premium");
    private final String value;
    ShareAccessTier(String value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return this.value;
    }
}
