// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.keyvault.generated.models;

public enum JsonWebKeyCurveName {

    P_256("P-256"),

    P_384("P-384"),

    P_521("P-521"),

    P_256K("P-256K");
    private final String value;
    JsonWebKeyCurveName(String value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return this.value;
    }
}
