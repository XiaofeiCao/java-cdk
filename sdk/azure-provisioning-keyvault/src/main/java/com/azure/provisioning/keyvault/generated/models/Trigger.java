// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.keyvault.generated.models;

import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class Trigger extends ProvisioningConstruct {

    private final BicepValue<String> timeBeforeExpiry;
    private final BicepValue<String> timeAfterCreate;

    public Trigger() {
        timeBeforeExpiry = BicepValue.defineProperty(this, "timeBeforeExpiry", new String[] { "timeBeforeExpiry" }, null);
        timeAfterCreate = BicepValue.defineProperty(this, "timeAfterCreate", new String[] { "timeAfterCreate" }, null);
    }

    public BicepValue<String> getTimeBeforeExpiry() {
        return this.timeBeforeExpiry;
    }

    public Trigger setTimeBeforeExpiry(BicepValue<String> timeBeforeExpiry) {
        this.timeBeforeExpiry.assign(timeBeforeExpiry);
        return this;
    }
    public Trigger setTimeBeforeExpiry(String timeBeforeExpiry) {
        return this.setTimeBeforeExpiry(BicepValue.from(timeBeforeExpiry));
    }

    public BicepValue<String> getTimeAfterCreate() {
        return this.timeAfterCreate;
    }

    public Trigger setTimeAfterCreate(BicepValue<String> timeAfterCreate) {
        this.timeAfterCreate.assign(timeAfterCreate);
        return this;
    }
    public Trigger setTimeAfterCreate(String timeAfterCreate) {
        return this.setTimeAfterCreate(BicepValue.from(timeAfterCreate));
    }

}
