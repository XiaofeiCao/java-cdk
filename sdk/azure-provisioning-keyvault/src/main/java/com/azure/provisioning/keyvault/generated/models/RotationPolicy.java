// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.keyvault.generated.models;

import com.azure.provisioning.keyvault.generated.models.LifetimeAction;
import java.util.List;
import com.azure.provisioning.keyvault.generated.models.KeyRotationPolicyAttributes;
import com.azure.provisioning.BicepList;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class RotationPolicy extends ProvisioningConstruct {

    private final BicepValue<KeyRotationPolicyAttributes> attributes;
    private final BicepList<LifetimeAction> lifetimeActions;

    public RotationPolicy() {
        attributes = BicepValue.defineProperty(this, "attributes", new String[] { "attributes" }, null);
        lifetimeActions = BicepList.defineProperty(this, "lifetimeActions", new String[] { "lifetimeActions" }, false, false);
    }

    public BicepValue<KeyRotationPolicyAttributes> getAttributes() {
        return this.attributes;
    }

    public RotationPolicy setAttributes(BicepValue<KeyRotationPolicyAttributes> attributes) {
        this.attributes.assign(attributes);
        return this;
    }
    public BicepList<LifetimeAction> getLifetimeActions() {
        return this.lifetimeActions;
    }

    public RotationPolicy setLifetimeActions(BicepList<LifetimeAction> lifetimeActions) {
        this.lifetimeActions.assign(lifetimeActions);
        return this;
    }
}
