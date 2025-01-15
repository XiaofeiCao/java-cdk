// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.keyvault.generated.models;

public enum JsonWebKeyType {

    EC("EC"),

    EC_HSM("EC_HSM"),

    RSA("RSA"),

    RSA_HSM("RSA_HSM");
    private final String value;
    JsonWebKeyType(String value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return this.value;
    }
}
