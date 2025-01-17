// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated.models;

public enum PostFailoverRedundancy {

    STANDARD_LRS("Standard_LRS"),

    STANDARD_ZRS("Standard_ZRS");
    private final String value;
    PostFailoverRedundancy(String value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return this.value;
    }
}
