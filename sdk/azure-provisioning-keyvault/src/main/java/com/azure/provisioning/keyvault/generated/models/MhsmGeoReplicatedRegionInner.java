// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.keyvault.generated.models;

import com.azure.provisioning.keyvault.generated.models.GeoReplicationRegionProvisioningState;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class MhsmGeoReplicatedRegionInner extends ProvisioningConstruct {

    private final BicepValue<GeoReplicationRegionProvisioningState> provisioningState;
    private final BicepValue<Boolean> isPrimary;
    private final BicepValue<String> name;

    public MhsmGeoReplicatedRegionInner() {
        provisioningState = BicepValue.defineProperty(this, "provisioningState", new String[] { "provisioningState" }, null);
        isPrimary = BicepValue.defineProperty(this, "isPrimary", new String[] { "isPrimary" }, null);
        name = BicepValue.defineProperty(this, "name", new String[] { "name" }, null);
    }

    public BicepValue<GeoReplicationRegionProvisioningState> getProvisioningState() {
        return this.provisioningState;
    }

    public MhsmGeoReplicatedRegionInner setProvisioningState(BicepValue<GeoReplicationRegionProvisioningState> provisioningState) {
        this.provisioningState.assign(provisioningState);
        return this;
    }
    public BicepValue<Boolean> getIsPrimary() {
        return this.isPrimary;
    }

    public MhsmGeoReplicatedRegionInner setIsPrimary(BicepValue<Boolean> isPrimary) {
        this.isPrimary.assign(isPrimary);
        return this;
    }
    public BicepValue<String> getName() {
        return this.name;
    }

    public MhsmGeoReplicatedRegionInner setName(BicepValue<String> name) {
        this.name.assign(name);
        return this;
    }
}
