// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated.models;

import java.time.OffsetDateTime;
import com.azure.provisioning.storage.generated.models.ManagementPolicySchema;
import com.azure.core.util.logging.ClientLogger;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class ManagementPolicyProperties extends ProvisioningConstruct {

    private final BicepValue<ClientLogger> lOGGER;
    private final BicepValue<OffsetDateTime> lastModifiedTime;
    private final BicepValue<ManagementPolicySchema> policy;

    public ManagementPolicyProperties() {
        lOGGER = BicepValue.defineProperty(this, "lOGGER", new String[] { "lOGGER" }, null);
        lastModifiedTime = BicepValue.defineProperty(this, "lastModifiedTime", new String[] { "lastModifiedTime" }, null);
        policy = BicepValue.defineProperty(this, "policy", new String[] { "policy" }, null);
    }

    public BicepValue<ClientLogger> getLOGGER() {
        return this.lOGGER;
    }

    public ManagementPolicyProperties setLOGGER(BicepValue<ClientLogger> lOGGER) {
        this.lOGGER.assign(lOGGER);
        return this;
    }
    public ManagementPolicyProperties setLOGGER(ClientLogger lOGGER) {
        return this.setLOGGER(BicepValue.from(lOGGER));
    }

    public BicepValue<OffsetDateTime> getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    public ManagementPolicyProperties setLastModifiedTime(BicepValue<OffsetDateTime> lastModifiedTime) {
        this.lastModifiedTime.assign(lastModifiedTime);
        return this;
    }
    public ManagementPolicyProperties setLastModifiedTime(OffsetDateTime lastModifiedTime) {
        return this.setLastModifiedTime(BicepValue.from(lastModifiedTime));
    }

    public BicepValue<ManagementPolicySchema> getPolicy() {
        return this.policy;
    }

    public ManagementPolicyProperties setPolicy(BicepValue<ManagementPolicySchema> policy) {
        this.policy.assign(policy);
        return this;
    }
    public ManagementPolicyProperties setPolicy(ManagementPolicySchema policy) {
        return this.setPolicy(BicepValue.from(policy));
    }

}
