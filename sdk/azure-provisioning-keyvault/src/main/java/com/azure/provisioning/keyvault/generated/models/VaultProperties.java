// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.keyvault.generated.models;

import com.azure.provisioning.keyvault.generated.models.Sku;
import java.util.List;
import com.azure.provisioning.keyvault.generated.models.VaultProvisioningState;
import com.azure.provisioning.keyvault.generated.models.PrivateEndpointConnectionItem;
import com.azure.core.util.logging.ClientLogger;
import com.azure.provisioning.keyvault.generated.models.CreateMode;
import com.azure.provisioning.keyvault.generated.models.NetworkRuleSet;
import com.azure.provisioning.keyvault.generated.models.AccessPolicyEntry;
import java.util.UUID;
import com.azure.provisioning.BicepList;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class VaultProperties extends ProvisioningConstruct {

    private final BicepValue<Sku> sku;
    private final BicepValue<CreateMode> createMode;
    private final BicepList<AccessPolicyEntry> accessPolicies;
    private final BicepValue<VaultProvisioningState> provisioningState;
    private final BicepValue<Integer> softDeleteRetentionInDays;
    private final BicepValue<String> vaultUri;
    private final BicepValue<Boolean> enabledForDiskEncryption;
    private final BicepValue<Boolean> enablePurgeProtection;
    private final BicepValue<ClientLogger> lOGGER;
    private final BicepValue<UUID> tenantId;
    private final BicepValue<Boolean> enableSoftDelete;
    private final BicepValue<String> hsmPoolResourceId;
    private final BicepList<PrivateEndpointConnectionItem> privateEndpointConnections;
    private final BicepValue<Boolean> enabledForTemplateDeployment;
    private final BicepValue<Boolean> enabledForDeployment;
    private final BicepValue<NetworkRuleSet> networkAcls;
    private final BicepValue<Boolean> enableRbacAuthorization;
    private final BicepValue<String> publicNetworkAccess;

    public VaultProperties() {
        sku = BicepValue.defineProperty(this, "sku", new String[] { "sku" }, null);
        createMode = BicepValue.defineProperty(this, "createMode", new String[] { "createMode" }, null);
        accessPolicies = BicepList.defineProperty(this, "accessPolicies", new String[] { "accessPolicies" }, false, false);
        provisioningState = BicepValue.defineProperty(this, "provisioningState", new String[] { "provisioningState" }, null);
        softDeleteRetentionInDays = BicepValue.defineProperty(this, "softDeleteRetentionInDays", new String[] { "softDeleteRetentionInDays" }, null);
        vaultUri = BicepValue.defineProperty(this, "vaultUri", new String[] { "vaultUri" }, null);
        enabledForDiskEncryption = BicepValue.defineProperty(this, "enabledForDiskEncryption", new String[] { "enabledForDiskEncryption" }, null);
        enablePurgeProtection = BicepValue.defineProperty(this, "enablePurgeProtection", new String[] { "enablePurgeProtection" }, null);
        lOGGER = BicepValue.defineProperty(this, "lOGGER", new String[] { "lOGGER" }, null);
        tenantId = BicepValue.defineProperty(this, "tenantId", new String[] { "tenantId" }, null);
        enableSoftDelete = BicepValue.defineProperty(this, "enableSoftDelete", new String[] { "enableSoftDelete" }, null);
        hsmPoolResourceId = BicepValue.defineProperty(this, "hsmPoolResourceId", new String[] { "hsmPoolResourceId" }, null);
        privateEndpointConnections = BicepList.defineProperty(this, "privateEndpointConnections", new String[] { "privateEndpointConnections" }, false, false);
        enabledForTemplateDeployment = BicepValue.defineProperty(this, "enabledForTemplateDeployment", new String[] { "enabledForTemplateDeployment" }, null);
        enabledForDeployment = BicepValue.defineProperty(this, "enabledForDeployment", new String[] { "enabledForDeployment" }, null);
        networkAcls = BicepValue.defineProperty(this, "networkAcls", new String[] { "networkAcls" }, null);
        enableRbacAuthorization = BicepValue.defineProperty(this, "enableRbacAuthorization", new String[] { "enableRbacAuthorization" }, null);
        publicNetworkAccess = BicepValue.defineProperty(this, "publicNetworkAccess", new String[] { "publicNetworkAccess" }, null);
    }

    public BicepValue<Sku> getSku() {
        return this.sku;
    }

    public VaultProperties setSku(BicepValue<Sku> sku) {
        this.sku.assign(sku);
        return this;
    }
    public BicepValue<CreateMode> getCreateMode() {
        return this.createMode;
    }

    public VaultProperties setCreateMode(BicepValue<CreateMode> createMode) {
        this.createMode.assign(createMode);
        return this;
    }
    public BicepList<AccessPolicyEntry> getAccessPolicies() {
        return this.accessPolicies;
    }

    public VaultProperties setAccessPolicies(BicepList<AccessPolicyEntry> accessPolicies) {
        this.accessPolicies.assign(accessPolicies);
        return this;
    }
    public BicepValue<VaultProvisioningState> getProvisioningState() {
        return this.provisioningState;
    }

    public VaultProperties setProvisioningState(BicepValue<VaultProvisioningState> provisioningState) {
        this.provisioningState.assign(provisioningState);
        return this;
    }
    public BicepValue<Integer> getSoftDeleteRetentionInDays() {
        return this.softDeleteRetentionInDays;
    }

    public VaultProperties setSoftDeleteRetentionInDays(BicepValue<Integer> softDeleteRetentionInDays) {
        this.softDeleteRetentionInDays.assign(softDeleteRetentionInDays);
        return this;
    }
    public BicepValue<String> getVaultUri() {
        return this.vaultUri;
    }

    public VaultProperties setVaultUri(BicepValue<String> vaultUri) {
        this.vaultUri.assign(vaultUri);
        return this;
    }
    public BicepValue<Boolean> getEnabledForDiskEncryption() {
        return this.enabledForDiskEncryption;
    }

    public VaultProperties setEnabledForDiskEncryption(BicepValue<Boolean> enabledForDiskEncryption) {
        this.enabledForDiskEncryption.assign(enabledForDiskEncryption);
        return this;
    }
    public BicepValue<Boolean> getEnablePurgeProtection() {
        return this.enablePurgeProtection;
    }

    public VaultProperties setEnablePurgeProtection(BicepValue<Boolean> enablePurgeProtection) {
        this.enablePurgeProtection.assign(enablePurgeProtection);
        return this;
    }
    public BicepValue<ClientLogger> getLOGGER() {
        return this.lOGGER;
    }

    public VaultProperties setLOGGER(BicepValue<ClientLogger> lOGGER) {
        this.lOGGER.assign(lOGGER);
        return this;
    }
    public BicepValue<UUID> getTenantId() {
        return this.tenantId;
    }

    public VaultProperties setTenantId(BicepValue<UUID> tenantId) {
        this.tenantId.assign(tenantId);
        return this;
    }
    public BicepValue<Boolean> getEnableSoftDelete() {
        return this.enableSoftDelete;
    }

    public VaultProperties setEnableSoftDelete(BicepValue<Boolean> enableSoftDelete) {
        this.enableSoftDelete.assign(enableSoftDelete);
        return this;
    }
    public BicepValue<String> getHsmPoolResourceId() {
        return this.hsmPoolResourceId;
    }

    public VaultProperties setHsmPoolResourceId(BicepValue<String> hsmPoolResourceId) {
        this.hsmPoolResourceId.assign(hsmPoolResourceId);
        return this;
    }
    public BicepList<PrivateEndpointConnectionItem> getPrivateEndpointConnections() {
        return this.privateEndpointConnections;
    }

    public VaultProperties setPrivateEndpointConnections(BicepList<PrivateEndpointConnectionItem> privateEndpointConnections) {
        this.privateEndpointConnections.assign(privateEndpointConnections);
        return this;
    }
    public BicepValue<Boolean> getEnabledForTemplateDeployment() {
        return this.enabledForTemplateDeployment;
    }

    public VaultProperties setEnabledForTemplateDeployment(BicepValue<Boolean> enabledForTemplateDeployment) {
        this.enabledForTemplateDeployment.assign(enabledForTemplateDeployment);
        return this;
    }
    public BicepValue<Boolean> getEnabledForDeployment() {
        return this.enabledForDeployment;
    }

    public VaultProperties setEnabledForDeployment(BicepValue<Boolean> enabledForDeployment) {
        this.enabledForDeployment.assign(enabledForDeployment);
        return this;
    }
    public BicepValue<NetworkRuleSet> getNetworkAcls() {
        return this.networkAcls;
    }

    public VaultProperties setNetworkAcls(BicepValue<NetworkRuleSet> networkAcls) {
        this.networkAcls.assign(networkAcls);
        return this;
    }
    public BicepValue<Boolean> getEnableRbacAuthorization() {
        return this.enableRbacAuthorization;
    }

    public VaultProperties setEnableRbacAuthorization(BicepValue<Boolean> enableRbacAuthorization) {
        this.enableRbacAuthorization.assign(enableRbacAuthorization);
        return this;
    }
    public BicepValue<String> getPublicNetworkAccess() {
        return this.publicNetworkAccess;
    }

    public VaultProperties setPublicNetworkAccess(BicepValue<String> publicNetworkAccess) {
        this.publicNetworkAccess.assign(publicNetworkAccess);
        return this;
    }
}
