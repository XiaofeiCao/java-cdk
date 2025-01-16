// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.keyvault.generated.models;

import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class MhsmPrivateEndpoint extends ProvisioningConstruct {

    private final BicepValue<String> id;

    public MhsmPrivateEndpoint() {
        id = BicepValue.defineProperty(this, "id", new String[] { "id" }, null);
    }

    public BicepValue<String> getId() {
        return this.id;
    }

    public MhsmPrivateEndpoint setId(BicepValue<String> id) {
        this.id.assign(id);
        return this;
    }
}
