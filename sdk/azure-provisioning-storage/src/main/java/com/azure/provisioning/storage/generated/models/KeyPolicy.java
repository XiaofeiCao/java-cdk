// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated.models;

import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class KeyPolicy extends ProvisioningConstruct {

    private final BicepValue<Integer> keyExpirationPeriodInDays;

    public KeyPolicy() {
        keyExpirationPeriodInDays = BicepValue.defineProperty(this, "keyExpirationPeriodInDays", new String[] { "keyExpirationPeriodInDays" }, null);
    }

    public BicepValue<Integer> getKeyExpirationPeriodInDays() {
        return this.keyExpirationPeriodInDays;
    }

    public KeyPolicy setKeyExpirationPeriodInDays(BicepValue<Integer> keyExpirationPeriodInDays) {
        this.keyExpirationPeriodInDays.assign(keyExpirationPeriodInDays);
        return this;
    }
    public KeyPolicy setKeyExpirationPeriodInDays(int keyExpirationPeriodInDays) {
        return this.setKeyExpirationPeriodInDays(BicepValue.from(keyExpirationPeriodInDays));
    }

}
