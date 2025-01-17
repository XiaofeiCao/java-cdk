// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated.models;

import java.util.List;
import java.time.OffsetDateTime;
import com.azure.provisioning.storage.generated.models.BlobRestoreRange;
import com.azure.core.util.logging.ClientLogger;
import com.azure.provisioning.BicepList;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class BlobRestoreParameters extends ProvisioningConstruct {

    private final BicepValue<ClientLogger> lOGGER;
    private final BicepValue<OffsetDateTime> timeToRestore;
    private final BicepList<BlobRestoreRange> blobRanges;

    public BlobRestoreParameters() {
        lOGGER = BicepValue.defineProperty(this, "lOGGER", new String[] { "lOGGER" }, null);
        timeToRestore = BicepValue.defineProperty(this, "timeToRestore", new String[] { "timeToRestore" }, null);
        blobRanges = BicepList.defineProperty(this, "blobRanges", new String[] { "blobRanges" }, false, false);
    }

    public BicepValue<ClientLogger> getLOGGER() {
        return this.lOGGER;
    }

    public BlobRestoreParameters setLOGGER(BicepValue<ClientLogger> lOGGER) {
        this.lOGGER.assign(lOGGER);
        return this;
    }
    public BicepValue<OffsetDateTime> getTimeToRestore() {
        return this.timeToRestore;
    }

    public BlobRestoreParameters setTimeToRestore(BicepValue<OffsetDateTime> timeToRestore) {
        this.timeToRestore.assign(timeToRestore);
        return this;
    }
    public BicepList<BlobRestoreRange> getBlobRanges() {
        return this.blobRanges;
    }

    public BlobRestoreParameters setBlobRanges(BicepList<BlobRestoreRange> blobRanges) {
        this.blobRanges.assign(blobRanges);
        return this;
    }
}
