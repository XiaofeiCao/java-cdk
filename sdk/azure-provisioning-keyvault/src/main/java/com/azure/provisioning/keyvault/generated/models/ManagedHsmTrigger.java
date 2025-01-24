// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.keyvault.generated.models;

import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class ManagedHsmTrigger extends ProvisioningConstruct {

    private final BicepValue<String> timeBeforeExpiry;
    private final BicepValue<String> timeAfterCreate;

    public ManagedHsmTrigger() {
        timeBeforeExpiry = BicepValue.defineProperty(this, "timeBeforeExpiry", new String[] { "timeBeforeExpiry" }, null);
        timeAfterCreate = BicepValue.defineProperty(this, "timeAfterCreate", new String[] { "timeAfterCreate" }, null);
    }

    public BicepValue<String> getTimeBeforeExpiry() {
        return this.timeBeforeExpiry;
    }

    public ManagedHsmTrigger setTimeBeforeExpiry(BicepValue<String> timeBeforeExpiry) {
        this.timeBeforeExpiry.assign(timeBeforeExpiry);
        return this;
    }
    public ManagedHsmTrigger setTimeBeforeExpiry(String timeBeforeExpiry) {
        return this.setTimeBeforeExpiry(BicepValue.from(timeBeforeExpiry));
    }

    public BicepValue<String> getTimeAfterCreate() {
        return this.timeAfterCreate;
    }

    public ManagedHsmTrigger setTimeAfterCreate(BicepValue<String> timeAfterCreate) {
        this.timeAfterCreate.assign(timeAfterCreate);
        return this;
    }
    public ManagedHsmTrigger setTimeAfterCreate(String timeAfterCreate) {
        return this.setTimeAfterCreate(BicepValue.from(timeAfterCreate));
    }

}
