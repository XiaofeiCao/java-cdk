// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated.models;

import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class KeyPolicy extends ProvisioningConstruct {

    private final BicepValue<int> keyExpirationPeriodInDays;

    public KeyPolicy() {
        keyExpirationPeriodInDays = BicepValue.defineProperty(this, "keyExpirationPeriodInDays", new String[] { "temp", "keyExpirationPeriodInDays" }, null);
    }

    public BicepValue<int> getKeyExpirationPeriodInDays() {
        return this.keyExpirationPeriodInDays;
    }

    public KeyPolicy setKeyExpirationPeriodInDays(BicepValue<int> keyExpirationPeriodInDays) {
        this.keyExpirationPeriodInDays.assign(keyExpirationPeriodInDays);
        return this;
    }
}
