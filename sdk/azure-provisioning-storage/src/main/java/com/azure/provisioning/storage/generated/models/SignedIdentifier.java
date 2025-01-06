// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated.models;

import com.azure.provisioning.storage.generated.models.AccessPolicy;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class SignedIdentifier extends ProvisioningConstruct {

    private final BicepValue<String> id;
    private final BicepValue<AccessPolicy> accessPolicy;

    public SignedIdentifier() {
        id = BicepValue.defineProperty(this, "id", new String[] { "temp", "id" }, null);
        accessPolicy = BicepValue.defineProperty(this, "accessPolicy", new String[] { "temp", "accessPolicy" }, null);
    }

    public BicepValue<String> getId() {
        return this.id;
    }

    public SignedIdentifier setId(BicepValue<String> id) {
        this.id.assign(id);
        return this;
    }
    public BicepValue<AccessPolicy> getAccessPolicy() {
        return this.accessPolicy;
    }

    public SignedIdentifier setAccessPolicy(BicepValue<AccessPolicy> accessPolicy) {
        this.accessPolicy.assign(accessPolicy);
        return this;
    }
}
