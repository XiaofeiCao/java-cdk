// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated.models;

import com.azure.core.util.logging.ClientLogger;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class BlobRestoreRange extends ProvisioningConstruct {

    private final BicepValue<String> startRange;
    private final BicepValue<ClientLogger> lOGGER;
    private final BicepValue<String> endRange;

    public BlobRestoreRange() {
        startRange = BicepValue.defineProperty(this, "startRange", new String[] { "startRange" }, null);
        lOGGER = BicepValue.defineProperty(this, "lOGGER", new String[] { "lOGGER" }, null);
        endRange = BicepValue.defineProperty(this, "endRange", new String[] { "endRange" }, null);
    }

    public BicepValue<String> getStartRange() {
        return this.startRange;
    }

    public BlobRestoreRange setStartRange(BicepValue<String> startRange) {
        this.startRange.assign(startRange);
        return this;
    }
    public BicepValue<ClientLogger> getLOGGER() {
        return this.lOGGER;
    }

    public BlobRestoreRange setLOGGER(BicepValue<ClientLogger> lOGGER) {
        this.lOGGER.assign(lOGGER);
        return this;
    }
    public BicepValue<String> getEndRange() {
        return this.endRange;
    }

    public BlobRestoreRange setEndRange(BicepValue<String> endRange) {
        this.endRange.assign(endRange);
        return this;
    }
}
