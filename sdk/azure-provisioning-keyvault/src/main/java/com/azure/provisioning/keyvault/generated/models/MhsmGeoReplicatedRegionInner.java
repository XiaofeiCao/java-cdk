// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.keyvault.generated.models;

import com.azure.provisioning.keyvault.generated.models.GeoReplicationRegionProvisioningState;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class MhsmGeoReplicatedRegionInner extends ProvisioningConstruct {

    private final BicepValue<Boolean> isPrimary;
    private final BicepValue<String> name;
    private final BicepValue<GeoReplicationRegionProvisioningState> provisioningState;

    public MhsmGeoReplicatedRegionInner() {
        isPrimary = BicepValue.defineProperty(this, "isPrimary", new String[] { "isPrimary" }, null);
        name = BicepValue.defineProperty(this, "name", new String[] { "name" }, null);
        provisioningState = BicepValue.defineProperty(this, "provisioningState", new String[] { "provisioningState" }, null);
    }

    public BicepValue<Boolean> getIsPrimary() {
        return this.isPrimary;
    }

    public MhsmGeoReplicatedRegionInner setIsPrimary(BicepValue<Boolean> isPrimary) {
        this.isPrimary.assign(isPrimary);
        return this;
    }
    public MhsmGeoReplicatedRegionInner setIsPrimary(Boolean isPrimary) {
        return this.setIsPrimary(BicepValue.from(isPrimary));
    }

    public BicepValue<String> getName() {
        return this.name;
    }

    public MhsmGeoReplicatedRegionInner setName(BicepValue<String> name) {
        this.name.assign(name);
        return this;
    }
    public MhsmGeoReplicatedRegionInner setName(String name) {
        return this.setName(BicepValue.from(name));
    }

    public BicepValue<GeoReplicationRegionProvisioningState> getProvisioningState() {
        return this.provisioningState;
    }

    public MhsmGeoReplicatedRegionInner setProvisioningState(BicepValue<GeoReplicationRegionProvisioningState> provisioningState) {
        this.provisioningState.assign(provisioningState);
        return this;
    }
    public MhsmGeoReplicatedRegionInner setProvisioningState(GeoReplicationRegionProvisioningState provisioningState) {
        return this.setProvisioningState(BicepValue.from(provisioningState));
    }

}
