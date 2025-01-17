// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated.models;

public enum RoutingChoice {

    MICROSOFT_ROUTING("MicrosoftRouting"),

    INTERNET_ROUTING("InternetRouting");
    private final String value;
    RoutingChoice(String value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return this.value;
    }
}
