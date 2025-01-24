// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated.models;

import com.azure.core.util.logging.ClientLogger;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class CustomDomain extends ProvisioningConstruct {

    private final BicepValue<ClientLogger> lOGGER;
    private final BicepValue<String> name;
    private final BicepValue<Boolean> useSubDomainName;

    public CustomDomain() {
        lOGGER = BicepValue.defineProperty(this, "lOGGER", new String[] { "lOGGER" }, null);
        name = BicepValue.defineProperty(this, "name", new String[] { "name" }, null);
        useSubDomainName = BicepValue.defineProperty(this, "useSubDomainName", new String[] { "useSubDomainName" }, null);
    }

    public BicepValue<ClientLogger> getLOGGER() {
        return this.lOGGER;
    }

    public CustomDomain setLOGGER(BicepValue<ClientLogger> lOGGER) {
        this.lOGGER.assign(lOGGER);
        return this;
    }
    public CustomDomain setLOGGER(ClientLogger lOGGER) {
        return this.setLOGGER(BicepValue.from(lOGGER));
    }

    public BicepValue<String> getName() {
        return this.name;
    }

    public CustomDomain setName(BicepValue<String> name) {
        this.name.assign(name);
        return this;
    }
    public CustomDomain setName(String name) {
        return this.setName(BicepValue.from(name));
    }

    public BicepValue<Boolean> getUseSubDomainName() {
        return this.useSubDomainName;
    }

    public CustomDomain setUseSubDomainName(BicepValue<Boolean> useSubDomainName) {
        this.useSubDomainName.assign(useSubDomainName);
        return this;
    }
    public CustomDomain setUseSubDomainName(Boolean useSubDomainName) {
        return this.setUseSubDomainName(BicepValue.from(useSubDomainName));
    }

}
