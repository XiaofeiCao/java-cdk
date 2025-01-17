// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated.models;

import com.azure.core.util.logging.ClientLogger;
import com.azure.provisioning.storage.generated.models.ExpirationAction;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class SasPolicy extends ProvisioningConstruct {

    private final BicepValue<ClientLogger> lOGGER;
    private final BicepValue<ExpirationAction> expirationAction;
    private final BicepValue<String> sasExpirationPeriod;

    public SasPolicy() {
        lOGGER = BicepValue.defineProperty(this, "lOGGER", new String[] { "lOGGER" }, null);
        expirationAction = BicepValue.defineProperty(this, "expirationAction", new String[] { "expirationAction" }, null);
        sasExpirationPeriod = BicepValue.defineProperty(this, "sasExpirationPeriod", new String[] { "sasExpirationPeriod" }, null);
    }

    public BicepValue<ClientLogger> getLOGGER() {
        return this.lOGGER;
    }

    public SasPolicy setLOGGER(BicepValue<ClientLogger> lOGGER) {
        this.lOGGER.assign(lOGGER);
        return this;
    }
    public BicepValue<ExpirationAction> getExpirationAction() {
        return this.expirationAction;
    }

    public SasPolicy setExpirationAction(BicepValue<ExpirationAction> expirationAction) {
        this.expirationAction.assign(expirationAction);
        return this;
    }
    public BicepValue<String> getSasExpirationPeriod() {
        return this.sasExpirationPeriod;
    }

    public SasPolicy setSasExpirationPeriod(BicepValue<String> sasExpirationPeriod) {
        this.sasExpirationPeriod.assign(sasExpirationPeriod);
        return this;
    }
}
