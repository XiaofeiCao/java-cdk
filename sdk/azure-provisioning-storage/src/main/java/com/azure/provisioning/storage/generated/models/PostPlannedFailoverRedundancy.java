// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated.models;

public enum PostPlannedFailoverRedundancy {

    STANDARD_GRS("Standard_GRS"),

    STANDARD_GZRS("Standard_GZRS"),

    STANDARD_RAGRS("Standard_RAGRS"),

    STANDARD_RAGZRS("Standard_RAGZRS");
    private final String value;
    PostPlannedFailoverRedundancy(String value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return this.value;
    }
}
