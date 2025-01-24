// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated.models;

import com.azure.core.util.logging.ClientLogger;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class StorageTaskAssignmentReport extends ProvisioningConstruct {

    private final BicepValue<ClientLogger> lOGGER;
    private final BicepValue<String> prefix;

    public StorageTaskAssignmentReport() {
        lOGGER = BicepValue.defineProperty(this, "lOGGER", new String[] { "lOGGER" }, null);
        prefix = BicepValue.defineProperty(this, "prefix", new String[] { "prefix" }, null);
    }

    public BicepValue<ClientLogger> getLOGGER() {
        return this.lOGGER;
    }

    public StorageTaskAssignmentReport setLOGGER(BicepValue<ClientLogger> lOGGER) {
        this.lOGGER.assign(lOGGER);
        return this;
    }
    public StorageTaskAssignmentReport setLOGGER(ClientLogger lOGGER) {
        return this.setLOGGER(BicepValue.from(lOGGER));
    }

    public BicepValue<String> getPrefix() {
        return this.prefix;
    }

    public StorageTaskAssignmentReport setPrefix(BicepValue<String> prefix) {
        this.prefix.assign(prefix);
        return this;
    }
    public StorageTaskAssignmentReport setPrefix(String prefix) {
        return this.setPrefix(BicepValue.from(prefix));
    }

}
