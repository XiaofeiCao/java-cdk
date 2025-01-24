// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.keyvault.generated.models;

import com.azure.provisioning.keyvault.generated.models.MhsmGeoReplicatedRegionInner;
import com.azure.provisioning.keyvault.generated.models.MhsmPrivateEndpointConnectionItem;
import java.util.List;
import java.time.OffsetDateTime;
import com.azure.provisioning.keyvault.generated.models.PublicNetworkAccess;
import com.azure.provisioning.keyvault.generated.models.CreateMode;
import com.azure.provisioning.keyvault.generated.models.MhsmNetworkRuleSet;
import com.azure.provisioning.keyvault.generated.models.ProvisioningState;
import java.util.UUID;
import java.lang.String;
import com.azure.provisioning.keyvault.generated.models.ActivationStatus;
import com.azure.provisioning.BicepList;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class ManagedHsmProperties extends ProvisioningConstruct {

    private final BicepValue<CreateMode> createMode;
    private final BicepList<MhsmGeoReplicatedRegionInner> regions;
    private final BicepValue<ProvisioningState> provisioningState;
    private final BicepValue<String> activationStatusMessage;
    private final BicepValue<Integer> softDeleteRetentionInDays;
    private final BicepValue<Boolean> enablePurgeProtection;
    private final BicepValue<UUID> tenantId;
    private final BicepValue<Boolean> enableSoftDelete;
    private final BicepValue<ActivationStatus> activationStatus;
    private final BicepValue<MhsmNetworkRuleSet> networkAcls;
    private final BicepValue<OffsetDateTime> scheduledPurgeDate;
    private final BicepList<String> initialAdminObjectIds;
    private final BicepList<MhsmPrivateEndpointConnectionItem> privateEndpointConnections;
    private final BicepValue<PublicNetworkAccess> publicNetworkAccess;
    private final BicepValue<String> hsmUri;
    private final BicepValue<String> statusMessage;

    public ManagedHsmProperties() {
        createMode = BicepValue.defineProperty(this, "createMode", new String[] { "createMode" }, null);
        regions = BicepList.defineProperty(this, "regions", new String[] { "regions" }, false, false);
        provisioningState = BicepValue.defineProperty(this, "provisioningState", new String[] { "provisioningState" }, null);
        activationStatusMessage = BicepValue.defineProperty(this, "activationStatusMessage", new String[] { "activationStatusMessage" }, null);
        softDeleteRetentionInDays = BicepValue.defineProperty(this, "softDeleteRetentionInDays", new String[] { "softDeleteRetentionInDays" }, null);
        enablePurgeProtection = BicepValue.defineProperty(this, "enablePurgeProtection", new String[] { "enablePurgeProtection" }, null);
        tenantId = BicepValue.defineProperty(this, "tenantId", new String[] { "tenantId" }, null);
        enableSoftDelete = BicepValue.defineProperty(this, "enableSoftDelete", new String[] { "enableSoftDelete" }, null);
        activationStatus = BicepValue.defineProperty(this, "activationStatus", new String[] { "activationStatus" }, null);
        networkAcls = BicepValue.defineProperty(this, "networkAcls", new String[] { "networkAcls" }, null);
        scheduledPurgeDate = BicepValue.defineProperty(this, "scheduledPurgeDate", new String[] { "scheduledPurgeDate" }, null);
        initialAdminObjectIds = BicepList.defineProperty(this, "initialAdminObjectIds", new String[] { "initialAdminObjectIds" }, false, false);
        privateEndpointConnections = BicepList.defineProperty(this, "privateEndpointConnections", new String[] { "privateEndpointConnections" }, false, false);
        publicNetworkAccess = BicepValue.defineProperty(this, "publicNetworkAccess", new String[] { "publicNetworkAccess" }, null);
        hsmUri = BicepValue.defineProperty(this, "hsmUri", new String[] { "hsmUri" }, null);
        statusMessage = BicepValue.defineProperty(this, "statusMessage", new String[] { "statusMessage" }, null);
    }

    public BicepValue<CreateMode> getCreateMode() {
        return this.createMode;
    }

    public ManagedHsmProperties setCreateMode(BicepValue<CreateMode> createMode) {
        this.createMode.assign(createMode);
        return this;
    }
    public ManagedHsmProperties setCreateMode(CreateMode createMode) {
        return this.setCreateMode(BicepValue.from(createMode));
    }

    public BicepList<MhsmGeoReplicatedRegionInner> getRegions() {
        return this.regions;
    }

    public ManagedHsmProperties setRegions(BicepList<MhsmGeoReplicatedRegionInner> regions) {
        this.regions.assign(regions);
        return this;
    }
    public ManagedHsmProperties setRegions(List<MhsmGeoReplicatedRegionInner> regions) {
        return this.setRegions(BicepList.from(regions));
    }

    public BicepValue<ProvisioningState> getProvisioningState() {
        return this.provisioningState;
    }

    public ManagedHsmProperties setProvisioningState(BicepValue<ProvisioningState> provisioningState) {
        this.provisioningState.assign(provisioningState);
        return this;
    }
    public ManagedHsmProperties setProvisioningState(ProvisioningState provisioningState) {
        return this.setProvisioningState(BicepValue.from(provisioningState));
    }

    public BicepValue<String> getActivationStatusMessage() {
        return this.activationStatusMessage;
    }

    public ManagedHsmProperties setActivationStatusMessage(BicepValue<String> activationStatusMessage) {
        this.activationStatusMessage.assign(activationStatusMessage);
        return this;
    }
    public ManagedHsmProperties setActivationStatusMessage(String activationStatusMessage) {
        return this.setActivationStatusMessage(BicepValue.from(activationStatusMessage));
    }

    public BicepValue<Integer> getSoftDeleteRetentionInDays() {
        return this.softDeleteRetentionInDays;
    }

    public ManagedHsmProperties setSoftDeleteRetentionInDays(BicepValue<Integer> softDeleteRetentionInDays) {
        this.softDeleteRetentionInDays.assign(softDeleteRetentionInDays);
        return this;
    }
    public ManagedHsmProperties setSoftDeleteRetentionInDays(Integer softDeleteRetentionInDays) {
        return this.setSoftDeleteRetentionInDays(BicepValue.from(softDeleteRetentionInDays));
    }

    public BicepValue<Boolean> getEnablePurgeProtection() {
        return this.enablePurgeProtection;
    }

    public ManagedHsmProperties setEnablePurgeProtection(BicepValue<Boolean> enablePurgeProtection) {
        this.enablePurgeProtection.assign(enablePurgeProtection);
        return this;
    }
    public ManagedHsmProperties setEnablePurgeProtection(Boolean enablePurgeProtection) {
        return this.setEnablePurgeProtection(BicepValue.from(enablePurgeProtection));
    }

    public BicepValue<UUID> getTenantId() {
        return this.tenantId;
    }

    public ManagedHsmProperties setTenantId(BicepValue<UUID> tenantId) {
        this.tenantId.assign(tenantId);
        return this;
    }
    public ManagedHsmProperties setTenantId(UUID tenantId) {
        return this.setTenantId(BicepValue.from(tenantId));
    }

    public BicepValue<Boolean> getEnableSoftDelete() {
        return this.enableSoftDelete;
    }

    public ManagedHsmProperties setEnableSoftDelete(BicepValue<Boolean> enableSoftDelete) {
        this.enableSoftDelete.assign(enableSoftDelete);
        return this;
    }
    public ManagedHsmProperties setEnableSoftDelete(Boolean enableSoftDelete) {
        return this.setEnableSoftDelete(BicepValue.from(enableSoftDelete));
    }

    public BicepValue<ActivationStatus> getActivationStatus() {
        return this.activationStatus;
    }

    public ManagedHsmProperties setActivationStatus(BicepValue<ActivationStatus> activationStatus) {
        this.activationStatus.assign(activationStatus);
        return this;
    }
    public ManagedHsmProperties setActivationStatus(ActivationStatus activationStatus) {
        return this.setActivationStatus(BicepValue.from(activationStatus));
    }

    public BicepValue<MhsmNetworkRuleSet> getNetworkAcls() {
        return this.networkAcls;
    }

    public ManagedHsmProperties setNetworkAcls(BicepValue<MhsmNetworkRuleSet> networkAcls) {
        this.networkAcls.assign(networkAcls);
        return this;
    }
    public ManagedHsmProperties setNetworkAcls(MhsmNetworkRuleSet networkAcls) {
        return this.setNetworkAcls(BicepValue.from(networkAcls));
    }

    public BicepValue<OffsetDateTime> getScheduledPurgeDate() {
        return this.scheduledPurgeDate;
    }

    public ManagedHsmProperties setScheduledPurgeDate(BicepValue<OffsetDateTime> scheduledPurgeDate) {
        this.scheduledPurgeDate.assign(scheduledPurgeDate);
        return this;
    }
    public ManagedHsmProperties setScheduledPurgeDate(OffsetDateTime scheduledPurgeDate) {
        return this.setScheduledPurgeDate(BicepValue.from(scheduledPurgeDate));
    }

    public BicepList<String> getInitialAdminObjectIds() {
        return this.initialAdminObjectIds;
    }

    public ManagedHsmProperties setInitialAdminObjectIds(BicepList<String> initialAdminObjectIds) {
        this.initialAdminObjectIds.assign(initialAdminObjectIds);
        return this;
    }
    public ManagedHsmProperties setInitialAdminObjectIds(List<String> initialAdminObjectIds) {
        return this.setInitialAdminObjectIds(BicepList.from(initialAdminObjectIds));
    }

    public BicepList<MhsmPrivateEndpointConnectionItem> getPrivateEndpointConnections() {
        return this.privateEndpointConnections;
    }

    public ManagedHsmProperties setPrivateEndpointConnections(BicepList<MhsmPrivateEndpointConnectionItem> privateEndpointConnections) {
        this.privateEndpointConnections.assign(privateEndpointConnections);
        return this;
    }
    public ManagedHsmProperties setPrivateEndpointConnections(List<MhsmPrivateEndpointConnectionItem> privateEndpointConnections) {
        return this.setPrivateEndpointConnections(BicepList.from(privateEndpointConnections));
    }

    public BicepValue<PublicNetworkAccess> getPublicNetworkAccess() {
        return this.publicNetworkAccess;
    }

    public ManagedHsmProperties setPublicNetworkAccess(BicepValue<PublicNetworkAccess> publicNetworkAccess) {
        this.publicNetworkAccess.assign(publicNetworkAccess);
        return this;
    }
    public ManagedHsmProperties setPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        return this.setPublicNetworkAccess(BicepValue.from(publicNetworkAccess));
    }

    public BicepValue<String> getHsmUri() {
        return this.hsmUri;
    }

    public ManagedHsmProperties setHsmUri(BicepValue<String> hsmUri) {
        this.hsmUri.assign(hsmUri);
        return this;
    }
    public ManagedHsmProperties setHsmUri(String hsmUri) {
        return this.setHsmUri(BicepValue.from(hsmUri));
    }

    public BicepValue<String> getStatusMessage() {
        return this.statusMessage;
    }

    public ManagedHsmProperties setStatusMessage(BicepValue<String> statusMessage) {
        this.statusMessage.assign(statusMessage);
        return this;
    }
    public ManagedHsmProperties setStatusMessage(String statusMessage) {
        return this.setStatusMessage(BicepValue.from(statusMessage));
    }

}
