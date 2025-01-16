// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.keyvault.generated.models;

import com.azure.core.util.logging.ClientLogger;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class MhsmVirtualNetworkRule extends ProvisioningConstruct {

    private final BicepValue<String> id;
    private final BicepValue<ClientLogger> lOGGER;

    public MhsmVirtualNetworkRule() {
        id = BicepValue.defineProperty(this, "id", new String[] { "id" }, null);
        lOGGER = BicepValue.defineProperty(this, "lOGGER", new String[] { "lOGGER" }, null);
    }

    public BicepValue<String> getId() {
        return this.id;
    }

    public MhsmVirtualNetworkRule setId(BicepValue<String> id) {
        this.id.assign(id);
        return this;
    }
    public BicepValue<ClientLogger> getLOGGER() {
        return this.lOGGER;
    }

    public MhsmVirtualNetworkRule setLOGGER(BicepValue<ClientLogger> lOGGER) {
        this.lOGGER.assign(lOGGER);
        return this;
    }
}
