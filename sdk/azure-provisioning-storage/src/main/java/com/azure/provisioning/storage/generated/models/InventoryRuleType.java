// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated.models;

public enum InventoryRuleType {

    INVENTORY("Inventory");
    private final String value;
    InventoryRuleType(String value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return this.value;
    }
}
