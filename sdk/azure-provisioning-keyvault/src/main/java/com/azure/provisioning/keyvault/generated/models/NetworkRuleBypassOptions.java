// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.keyvault.generated.models;

public enum NetworkRuleBypassOptions {

    AZURE_SERVICES("AzureServices"),

    NONE("None");
    private final String value;
    NetworkRuleBypassOptions(String value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return this.value;
    }
}
