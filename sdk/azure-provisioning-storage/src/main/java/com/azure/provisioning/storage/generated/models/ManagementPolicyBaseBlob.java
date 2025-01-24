// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated.models;

import com.azure.provisioning.storage.generated.models.DateAfterModification;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class ManagementPolicyBaseBlob extends ProvisioningConstruct {

    private final BicepValue<DateAfterModification> tierToHot;
    private final BicepValue<DateAfterModification> tierToCool;
    private final BicepValue<DateAfterModification> tierToArchive;
    private final BicepValue<DateAfterModification> tierToCold;
    private final BicepValue<DateAfterModification> delete;
    private final BicepValue<Boolean> enableAutoTierToHotFromCool;

    public ManagementPolicyBaseBlob() {
        tierToHot = BicepValue.defineProperty(this, "tierToHot", new String[] { "tierToHot" }, null);
        tierToCool = BicepValue.defineProperty(this, "tierToCool", new String[] { "tierToCool" }, null);
        tierToArchive = BicepValue.defineProperty(this, "tierToArchive", new String[] { "tierToArchive" }, null);
        tierToCold = BicepValue.defineProperty(this, "tierToCold", new String[] { "tierToCold" }, null);
        delete = BicepValue.defineProperty(this, "delete", new String[] { "delete" }, null);
        enableAutoTierToHotFromCool = BicepValue.defineProperty(this, "enableAutoTierToHotFromCool", new String[] { "enableAutoTierToHotFromCool" }, null);
    }

    public BicepValue<DateAfterModification> getTierToHot() {
        return this.tierToHot;
    }

    public ManagementPolicyBaseBlob setTierToHot(BicepValue<DateAfterModification> tierToHot) {
        this.tierToHot.assign(tierToHot);
        return this;
    }
    public ManagementPolicyBaseBlob setTierToHot(DateAfterModification tierToHot) {
        return this.setTierToHot(BicepValue.from(tierToHot));
    }

    public BicepValue<DateAfterModification> getTierToCool() {
        return this.tierToCool;
    }

    public ManagementPolicyBaseBlob setTierToCool(BicepValue<DateAfterModification> tierToCool) {
        this.tierToCool.assign(tierToCool);
        return this;
    }
    public ManagementPolicyBaseBlob setTierToCool(DateAfterModification tierToCool) {
        return this.setTierToCool(BicepValue.from(tierToCool));
    }

    public BicepValue<DateAfterModification> getTierToArchive() {
        return this.tierToArchive;
    }

    public ManagementPolicyBaseBlob setTierToArchive(BicepValue<DateAfterModification> tierToArchive) {
        this.tierToArchive.assign(tierToArchive);
        return this;
    }
    public ManagementPolicyBaseBlob setTierToArchive(DateAfterModification tierToArchive) {
        return this.setTierToArchive(BicepValue.from(tierToArchive));
    }

    public BicepValue<DateAfterModification> getTierToCold() {
        return this.tierToCold;
    }

    public ManagementPolicyBaseBlob setTierToCold(BicepValue<DateAfterModification> tierToCold) {
        this.tierToCold.assign(tierToCold);
        return this;
    }
    public ManagementPolicyBaseBlob setTierToCold(DateAfterModification tierToCold) {
        return this.setTierToCold(BicepValue.from(tierToCold));
    }

    public BicepValue<DateAfterModification> getDelete() {
        return this.delete;
    }

    public ManagementPolicyBaseBlob setDelete(BicepValue<DateAfterModification> delete) {
        this.delete.assign(delete);
        return this;
    }
    public ManagementPolicyBaseBlob setDelete(DateAfterModification delete) {
        return this.setDelete(BicepValue.from(delete));
    }

    public BicepValue<Boolean> getEnableAutoTierToHotFromCool() {
        return this.enableAutoTierToHotFromCool;
    }

    public ManagementPolicyBaseBlob setEnableAutoTierToHotFromCool(BicepValue<Boolean> enableAutoTierToHotFromCool) {
        this.enableAutoTierToHotFromCool.assign(enableAutoTierToHotFromCool);
        return this;
    }
    public ManagementPolicyBaseBlob setEnableAutoTierToHotFromCool(Boolean enableAutoTierToHotFromCool) {
        return this.setEnableAutoTierToHotFromCool(BicepValue.from(enableAutoTierToHotFromCool));
    }

}
