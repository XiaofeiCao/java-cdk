// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated.models;

import java.time.OffsetDateTime;
import com.azure.core.util.logging.ClientLogger;
import com.azure.provisioning.storage.generated.models.BlobInventoryPolicySchema;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class BlobInventoryPolicyProperties extends ProvisioningConstruct {

    private final BicepValue<ClientLogger> lOGGER;
    private final BicepValue<BlobInventoryPolicySchema> policy;
    private final BicepValue<OffsetDateTime> lastModifiedTime;

    public BlobInventoryPolicyProperties() {
        lOGGER = BicepValue.defineProperty(this, "lOGGER", new String[] { "lOGGER" }, null);
        policy = BicepValue.defineProperty(this, "policy", new String[] { "policy" }, null);
        lastModifiedTime = BicepValue.defineProperty(this, "lastModifiedTime", new String[] { "lastModifiedTime" }, null);
    }

    public BicepValue<ClientLogger> getLOGGER() {
        return this.lOGGER;
    }

    public BlobInventoryPolicyProperties setLOGGER(BicepValue<ClientLogger> lOGGER) {
        this.lOGGER.assign(lOGGER);
        return this;
    }
    public BicepValue<BlobInventoryPolicySchema> getPolicy() {
        return this.policy;
    }

    public BlobInventoryPolicyProperties setPolicy(BicepValue<BlobInventoryPolicySchema> policy) {
        this.policy.assign(policy);
        return this;
    }
    public BicepValue<OffsetDateTime> getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    public BlobInventoryPolicyProperties setLastModifiedTime(BicepValue<OffsetDateTime> lastModifiedTime) {
        this.lastModifiedTime.assign(lastModifiedTime);
        return this;
    }
}
