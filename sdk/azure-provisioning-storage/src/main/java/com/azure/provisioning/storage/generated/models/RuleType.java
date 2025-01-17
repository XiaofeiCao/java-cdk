// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated.models;

public enum RuleType {

    LIFECYCLE("Lifecycle");
    private final String value;
    RuleType(String value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return this.value;
    }
}
