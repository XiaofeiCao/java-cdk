// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.keyvault.generated.models;

import com.azure.provisioning.keyvault.generated.models.ManagedHsmLifetimeAction;
import java.util.List;
import com.azure.provisioning.keyvault.generated.models.ManagedHsmKeyRotationPolicyAttributes;
import com.azure.provisioning.BicepList;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class ManagedHsmRotationPolicy extends ProvisioningConstruct {

    private final BicepValue<ManagedHsmKeyRotationPolicyAttributes> attributes;
    private final BicepList<ManagedHsmLifetimeAction> lifetimeActions;

    public ManagedHsmRotationPolicy() {
        attributes = BicepValue.defineProperty(this, "attributes", new String[] { "attributes" }, null);
        lifetimeActions = BicepList.defineProperty(this, "lifetimeActions", new String[] { "lifetimeActions" }, false, false);
    }

    public BicepValue<ManagedHsmKeyRotationPolicyAttributes> getAttributes() {
        return this.attributes;
    }

    public ManagedHsmRotationPolicy setAttributes(BicepValue<ManagedHsmKeyRotationPolicyAttributes> attributes) {
        this.attributes.assign(attributes);
        return this;
    }
    public ManagedHsmRotationPolicy setAttributes(ManagedHsmKeyRotationPolicyAttributes attributes) {
        return this.setAttributes(BicepValue.from(attributes));
    }

    public BicepList<ManagedHsmLifetimeAction> getLifetimeActions() {
        return this.lifetimeActions;
    }

    public ManagedHsmRotationPolicy setLifetimeActions(BicepList<ManagedHsmLifetimeAction> lifetimeActions) {
        this.lifetimeActions.assign(lifetimeActions);
        return this;
    }
    public ManagedHsmRotationPolicy setLifetimeActions(List<ManagedHsmLifetimeAction> lifetimeActions) {
        return this.setLifetimeActions(BicepList.from(lifetimeActions));
    }

}
