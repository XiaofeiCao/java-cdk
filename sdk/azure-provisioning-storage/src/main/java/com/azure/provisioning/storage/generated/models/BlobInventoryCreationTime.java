// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated.models;

import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class BlobInventoryCreationTime extends ProvisioningConstruct {

    private final BicepValue<Integer> lastNDays;

    public BlobInventoryCreationTime() {
        lastNDays = BicepValue.defineProperty(this, "lastNDays", new String[] { "lastNDays" }, null);
    }

    public BicepValue<Integer> getLastNDays() {
        return this.lastNDays;
    }

    public BlobInventoryCreationTime setLastNDays(BicepValue<Integer> lastNDays) {
        this.lastNDays.assign(lastNDays);
        return this;
    }
    public BlobInventoryCreationTime setLastNDays(Integer lastNDays) {
        return this.setLastNDays(BicepValue.from(lastNDays));
    }

}
