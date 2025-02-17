// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.keyvault.generated.models;

public enum NetworkRuleAction {

    ALLOW("Allow"),

    DENY("Deny");
    private final String value;
    NetworkRuleAction(String value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return this.value;
    }
}
