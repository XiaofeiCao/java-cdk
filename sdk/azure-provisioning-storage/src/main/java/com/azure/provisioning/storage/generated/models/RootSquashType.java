// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated.models;

public enum RootSquashType {

    NO_ROOT_SQUASH("NoRootSquash"),

    ROOT_SQUASH("RootSquash"),

    ALL_SQUASH("AllSquash");
    private final String value;
    RootSquashType(String value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return this.value;
    }
}
