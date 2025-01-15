// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.keyvault.generated.models;

import com.azure.provisioning.keyvault.generated.models.MhsmPrivateEndpointConnectionItem;
import com.azure.provisioning.keyvault.generated.models.MhsmGeoReplicatedRegionInner;
import java.util.List;
import java.time.OffsetDateTime;
import com.azure.provisioning.keyvault.generated.models.PublicNetworkAccess;
import com.azure.provisioning.keyvault.generated.models.MhsmNetworkRuleSet;
import com.azure.provisioning.keyvault.generated.models.CreateMode;
import java.lang.String;
import java.util.UUID;
import com.azure.provisioning.keyvault.generated.models.ProvisioningState;
import com.azure.provisioning.keyvault.generated.models.ActivationStatus;
import com.azure.provisioning.BicepList;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class ManagedHsmProperties extends ProvisioningConstruct {

    private final BicepValue<Integer> softDeleteRetentionInDays;
    private final BicepValue<MhsmNetworkRuleSet> networkAcls;
    private final BicepValue<String> statusMessage;
    private final BicepValue<OffsetDateTime> scheduledPurgeDate;
    private final BicepList<MhsmPrivateEndpointConnectionItem> privateEndpointConnections;
    private final BicepValue<Boolean> enableSoftDelete;
    private final BicepValue<String> activationStatusMessage;
    private final BicepList<String> initialAdminObjectIds;
    private final BicepValue<Boolean> enablePurgeProtection;
    private final BicepValue<UUID> tenantId;
    private final BicepValue<ActivationStatus> activationStatus;
    private final BicepValue<String> hsmUri;
    private final BicepValue<PublicNetworkAccess> publicNetworkAccess;
    private final BicepValue<CreateMode> createMode;
    private final BicepList<MhsmGeoReplicatedRegionInner> regions;
    private final BicepValue<ProvisioningState> provisioningState;

    public ManagedHsmProperties() {
        softDeleteRetentionInDays = BicepValue.defineProperty(this, "softDeleteRetentionInDays", new String[] { "softDeleteRetentionInDays" }, null);
        networkAcls = BicepValue.defineProperty(this, "networkAcls", new String[] { "networkAcls" }, null);
        statusMessage = BicepValue.defineProperty(this, "statusMessage", new String[] { "statusMessage" }, null);
        scheduledPurgeDate = BicepValue.defineProperty(this, "scheduledPurgeDate", new String[] { "scheduledPurgeDate" }, null);
        privateEndpointConnections = BicepList.defineProperty(this, "privateEndpointConnections", new String[] { "privateEndpointConnections" }, false, false);
        enableSoftDelete = BicepValue.defineProperty(this, "enableSoftDelete", new String[] { "enableSoftDelete" }, null);
        activationStatusMessage = BicepValue.defineProperty(this, "activationStatusMessage", new String[] { "activationStatusMessage" }, null);
        initialAdminObjectIds = BicepList.defineProperty(this, "initialAdminObjectIds", new String[] { "initialAdminObjectIds" }, false, false);
        enablePurgeProtection = BicepValue.defineProperty(this, "enablePurgeProtection", new String[] { "enablePurgeProtection" }, null);
        tenantId = BicepValue.defineProperty(this, "tenantId", new String[] { "tenantId" }, null);
        activationStatus = BicepValue.defineProperty(this, "activationStatus", new String[] { "activationStatus" }, null);
        hsmUri = BicepValue.defineProperty(this, "hsmUri", new String[] { "hsmUri" }, null);
        publicNetworkAccess = BicepValue.defineProperty(this, "publicNetworkAccess", new String[] { "publicNetworkAccess" }, null);
        createMode = BicepValue.defineProperty(this, "createMode", new String[] { "createMode" }, null);
        regions = BicepList.defineProperty(this, "regions", new String[] { "regions" }, false, false);
        provisioningState = BicepValue.defineProperty(this, "provisioningState", new String[] { "provisioningState" }, null);
    }

    public BicepValue<Integer> getSoftDeleteRetentionInDays() {
        return this.softDeleteRetentionInDays;
    }

    public ManagedHsmProperties setSoftDeleteRetentionInDays(BicepValue<Integer> softDeleteRetentionInDays) {
        this.softDeleteRetentionInDays.assign(softDeleteRetentionInDays);
        return this;
    }
    public BicepValue<MhsmNetworkRuleSet> getNetworkAcls() {
        return this.networkAcls;
    }

    public ManagedHsmProperties setNetworkAcls(BicepValue<MhsmNetworkRuleSet> networkAcls) {
        this.networkAcls.assign(networkAcls);
        return this;
    }
    public BicepValue<String> getStatusMessage() {
        return this.statusMessage;
    }

    public ManagedHsmProperties setStatusMessage(BicepValue<String> statusMessage) {
        this.statusMessage.assign(statusMessage);
        return this;
    }
    public BicepValue<OffsetDateTime> getScheduledPurgeDate() {
        return this.scheduledPurgeDate;
    }

    public ManagedHsmProperties setScheduledPurgeDate(BicepValue<OffsetDateTime> scheduledPurgeDate) {
        this.scheduledPurgeDate.assign(scheduledPurgeDate);
        return this;
    }
    public BicepList<MhsmPrivateEndpointConnectionItem> getPrivateEndpointConnections() {
        return this.privateEndpointConnections;
    }

    public ManagedHsmProperties setPrivateEndpointConnections(BicepList<MhsmPrivateEndpointConnectionItem> privateEndpointConnections) {
        this.privateEndpointConnections.assign(privateEndpointConnections);
        return this;
    }
    public BicepValue<Boolean> getEnableSoftDelete() {
        return this.enableSoftDelete;
    }

    public ManagedHsmProperties setEnableSoftDelete(BicepValue<Boolean> enableSoftDelete) {
        this.enableSoftDelete.assign(enableSoftDelete);
        return this;
    }
    public BicepValue<String> getActivationStatusMessage() {
        return this.activationStatusMessage;
    }

    public ManagedHsmProperties setActivationStatusMessage(BicepValue<String> activationStatusMessage) {
        this.activationStatusMessage.assign(activationStatusMessage);
        return this;
    }
    public BicepList<String> getInitialAdminObjectIds() {
        return this.initialAdminObjectIds;
    }

    public ManagedHsmProperties setInitialAdminObjectIds(BicepList<String> initialAdminObjectIds) {
        this.initialAdminObjectIds.assign(initialAdminObjectIds);
        return this;
    }
    public BicepValue<Boolean> getEnablePurgeProtection() {
        return this.enablePurgeProtection;
    }

    public ManagedHsmProperties setEnablePurgeProtection(BicepValue<Boolean> enablePurgeProtection) {
        this.enablePurgeProtection.assign(enablePurgeProtection);
        return this;
    }
    public BicepValue<UUID> getTenantId() {
        return this.tenantId;
    }

    public ManagedHsmProperties setTenantId(BicepValue<UUID> tenantId) {
        this.tenantId.assign(tenantId);
        return this;
    }
    public BicepValue<ActivationStatus> getActivationStatus() {
        return this.activationStatus;
    }

    public ManagedHsmProperties setActivationStatus(BicepValue<ActivationStatus> activationStatus) {
        this.activationStatus.assign(activationStatus);
        return this;
    }
    public BicepValue<String> getHsmUri() {
        return this.hsmUri;
    }

    public ManagedHsmProperties setHsmUri(BicepValue<String> hsmUri) {
        this.hsmUri.assign(hsmUri);
        return this;
    }
    public BicepValue<PublicNetworkAccess> getPublicNetworkAccess() {
        return this.publicNetworkAccess;
    }

    public ManagedHsmProperties setPublicNetworkAccess(BicepValue<PublicNetworkAccess> publicNetworkAccess) {
        this.publicNetworkAccess.assign(publicNetworkAccess);
        return this;
    }
    public BicepValue<CreateMode> getCreateMode() {
        return this.createMode;
    }

    public ManagedHsmProperties setCreateMode(BicepValue<CreateMode> createMode) {
        this.createMode.assign(createMode);
        return this;
    }
    public BicepList<MhsmGeoReplicatedRegionInner> getRegions() {
        return this.regions;
    }

    public ManagedHsmProperties setRegions(BicepList<MhsmGeoReplicatedRegionInner> regions) {
        this.regions.assign(regions);
        return this;
    }
    public BicepValue<ProvisioningState> getProvisioningState() {
        return this.provisioningState;
    }

    public ManagedHsmProperties setProvisioningState(BicepValue<ProvisioningState> provisioningState) {
        this.provisioningState.assign(provisioningState);
        return this;
    }
}
