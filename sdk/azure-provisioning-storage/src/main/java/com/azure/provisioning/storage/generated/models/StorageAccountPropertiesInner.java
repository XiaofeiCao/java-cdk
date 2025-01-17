// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated.models;

import com.azure.provisioning.storage.generated.models.AllowedCopyScope;
import com.azure.provisioning.storage.generated.models.AccessTier;
import com.azure.provisioning.storage.generated.models.MinimumTlsVersion;
import com.azure.provisioning.storage.generated.models.RoutingPreference;
import com.azure.provisioning.storage.generated.models.StorageAccountSkuConversionStatus;
import com.azure.provisioning.storage.generated.models.Encryption;
import com.azure.provisioning.storage.generated.models.KeyCreationTime;
import com.azure.provisioning.BicepList;
import com.azure.provisioning.storage.generated.models.AccountStatus;
import com.azure.provisioning.storage.generated.models.Endpoints;
import com.azure.provisioning.storage.generated.models.ImmutableStorageAccount;
import com.azure.provisioning.storage.generated.models.LargeFileSharesState;
import com.azure.provisioning.storage.generated.models.AzureFilesIdentityBasedAuthentication;
import com.azure.provisioning.storage.generated.models.PrivateEndpointConnectionInner;
import com.azure.provisioning.storage.generated.models.NetworkRuleSet;
import com.azure.provisioning.storage.generated.models.KeyPolicy;
import com.azure.provisioning.storage.generated.models.ProvisioningState;
import com.azure.provisioning.storage.generated.models.BlobRestoreStatusInner;
import java.util.List;
import java.time.OffsetDateTime;
import com.azure.provisioning.storage.generated.models.SasPolicy;
import com.azure.provisioning.storage.generated.models.PublicNetworkAccess;
import com.azure.provisioning.storage.generated.models.DnsEndpointType;
import com.azure.provisioning.storage.generated.models.GeoReplicationStats;
import com.azure.provisioning.storage.generated.models.CustomDomain;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class StorageAccountPropertiesInner extends ProvisioningConstruct {

    private final BicepValue<KeyPolicy> keyPolicy;
    private final BicepValue<KeyCreationTime> keyCreationTime;
    private final BicepValue<PublicNetworkAccess> publicNetworkAccess;
    private final BicepList<PrivateEndpointConnectionInner> privateEndpointConnections;
    private final BicepValue<ImmutableStorageAccount> immutableStorageWithVersioning;
    private final BicepValue<LargeFileSharesState> largeFileSharesState;
    private final BicepValue<Boolean> defaultToOAuthAuthentication;
    private final BicepValue<StorageAccountSkuConversionStatus> storageAccountSkuConversionStatus;
    private final BicepValue<Encryption> encryption;
    private final BicepValue<AzureFilesIdentityBasedAuthentication> azureFilesIdentityBasedAuthentication;
    private final BicepValue<Boolean> enableExtendedGroups;
    private final BicepValue<MinimumTlsVersion> minimumTlsVersion;
    private final BicepValue<Boolean> isSftpEnabled;
    private final BicepValue<AccessTier> accessTier;
    private final BicepValue<GeoReplicationStats> geoReplicationStats;
    private final BicepValue<String> secondaryLocation;
    private final BicepValue<BlobRestoreStatusInner> blobRestoreStatus;
    private final BicepValue<AccountStatus> statusOfSecondary;
    private final BicepValue<Boolean> isSkuConversionBlocked;
    private final BicepValue<Boolean> allowBlobPublicAccess;
    private final BicepValue<Endpoints> primaryEndpoints;
    private final BicepValue<CustomDomain> customDomain;
    private final BicepValue<Boolean> enableNfsV3;
    private final BicepValue<Endpoints> secondaryEndpoints;
    private final BicepValue<AccountStatus> statusOfPrimary;
    private final BicepValue<Boolean> enableHttpsTrafficOnly;
    private final BicepValue<AllowedCopyScope> allowedCopyScope;
    private final BicepValue<RoutingPreference> routingPreference;
    private final BicepValue<Boolean> accountMigrationInProgress;
    private final BicepValue<Boolean> allowCrossTenantReplication;
    private final BicepValue<Boolean> isHnsEnabled;
    private final BicepValue<Boolean> allowSharedKeyAccess;
    private final BicepValue<OffsetDateTime> lastGeoFailoverTime;
    private final BicepValue<ProvisioningState> provisioningState;
    private final BicepValue<OffsetDateTime> creationTime;
    private final BicepValue<Boolean> isLocalUserEnabled;
    private final BicepValue<String> primaryLocation;
    private final BicepValue<SasPolicy> sasPolicy;
    private final BicepValue<Boolean> failoverInProgress;
    private final BicepValue<NetworkRuleSet> networkRuleSet;
    private final BicepValue<DnsEndpointType> dnsEndpointType;

    public StorageAccountPropertiesInner() {
        keyPolicy = BicepValue.defineProperty(this, "keyPolicy", new String[] { "keyPolicy" }, null);
        keyCreationTime = BicepValue.defineProperty(this, "keyCreationTime", new String[] { "keyCreationTime" }, null);
        publicNetworkAccess = BicepValue.defineProperty(this, "publicNetworkAccess", new String[] { "publicNetworkAccess" }, null);
        privateEndpointConnections = BicepList.defineProperty(this, "privateEndpointConnections", new String[] { "privateEndpointConnections" }, false, false);
        immutableStorageWithVersioning = BicepValue.defineProperty(this, "immutableStorageWithVersioning", new String[] { "immutableStorageWithVersioning" }, null);
        largeFileSharesState = BicepValue.defineProperty(this, "largeFileSharesState", new String[] { "largeFileSharesState" }, null);
        defaultToOAuthAuthentication = BicepValue.defineProperty(this, "defaultToOAuthAuthentication", new String[] { "defaultToOAuthAuthentication" }, null);
        storageAccountSkuConversionStatus = BicepValue.defineProperty(this, "storageAccountSkuConversionStatus", new String[] { "storageAccountSkuConversionStatus" }, null);
        encryption = BicepValue.defineProperty(this, "encryption", new String[] { "encryption" }, null);
        azureFilesIdentityBasedAuthentication = BicepValue.defineProperty(this, "azureFilesIdentityBasedAuthentication", new String[] { "azureFilesIdentityBasedAuthentication" }, null);
        enableExtendedGroups = BicepValue.defineProperty(this, "enableExtendedGroups", new String[] { "enableExtendedGroups" }, null);
        minimumTlsVersion = BicepValue.defineProperty(this, "minimumTlsVersion", new String[] { "minimumTlsVersion" }, null);
        isSftpEnabled = BicepValue.defineProperty(this, "isSftpEnabled", new String[] { "isSftpEnabled" }, null);
        accessTier = BicepValue.defineProperty(this, "accessTier", new String[] { "accessTier" }, null);
        geoReplicationStats = BicepValue.defineProperty(this, "geoReplicationStats", new String[] { "geoReplicationStats" }, null);
        secondaryLocation = BicepValue.defineProperty(this, "secondaryLocation", new String[] { "secondaryLocation" }, null);
        blobRestoreStatus = BicepValue.defineProperty(this, "blobRestoreStatus", new String[] { "blobRestoreStatus" }, null);
        statusOfSecondary = BicepValue.defineProperty(this, "statusOfSecondary", new String[] { "statusOfSecondary" }, null);
        isSkuConversionBlocked = BicepValue.defineProperty(this, "isSkuConversionBlocked", new String[] { "isSkuConversionBlocked" }, null);
        allowBlobPublicAccess = BicepValue.defineProperty(this, "allowBlobPublicAccess", new String[] { "allowBlobPublicAccess" }, null);
        primaryEndpoints = BicepValue.defineProperty(this, "primaryEndpoints", new String[] { "primaryEndpoints" }, null);
        customDomain = BicepValue.defineProperty(this, "customDomain", new String[] { "customDomain" }, null);
        enableNfsV3 = BicepValue.defineProperty(this, "enableNfsV3", new String[] { "enableNfsV3" }, null);
        secondaryEndpoints = BicepValue.defineProperty(this, "secondaryEndpoints", new String[] { "secondaryEndpoints" }, null);
        statusOfPrimary = BicepValue.defineProperty(this, "statusOfPrimary", new String[] { "statusOfPrimary" }, null);
        enableHttpsTrafficOnly = BicepValue.defineProperty(this, "enableHttpsTrafficOnly", new String[] { "enableHttpsTrafficOnly" }, null);
        allowedCopyScope = BicepValue.defineProperty(this, "allowedCopyScope", new String[] { "allowedCopyScope" }, null);
        routingPreference = BicepValue.defineProperty(this, "routingPreference", new String[] { "routingPreference" }, null);
        accountMigrationInProgress = BicepValue.defineProperty(this, "accountMigrationInProgress", new String[] { "accountMigrationInProgress" }, null);
        allowCrossTenantReplication = BicepValue.defineProperty(this, "allowCrossTenantReplication", new String[] { "allowCrossTenantReplication" }, null);
        isHnsEnabled = BicepValue.defineProperty(this, "isHnsEnabled", new String[] { "isHnsEnabled" }, null);
        allowSharedKeyAccess = BicepValue.defineProperty(this, "allowSharedKeyAccess", new String[] { "allowSharedKeyAccess" }, null);
        lastGeoFailoverTime = BicepValue.defineProperty(this, "lastGeoFailoverTime", new String[] { "lastGeoFailoverTime" }, null);
        provisioningState = BicepValue.defineProperty(this, "provisioningState", new String[] { "provisioningState" }, null);
        creationTime = BicepValue.defineProperty(this, "creationTime", new String[] { "creationTime" }, null);
        isLocalUserEnabled = BicepValue.defineProperty(this, "isLocalUserEnabled", new String[] { "isLocalUserEnabled" }, null);
        primaryLocation = BicepValue.defineProperty(this, "primaryLocation", new String[] { "primaryLocation" }, null);
        sasPolicy = BicepValue.defineProperty(this, "sasPolicy", new String[] { "sasPolicy" }, null);
        failoverInProgress = BicepValue.defineProperty(this, "failoverInProgress", new String[] { "failoverInProgress" }, null);
        networkRuleSet = BicepValue.defineProperty(this, "networkRuleSet", new String[] { "networkRuleSet" }, null);
        dnsEndpointType = BicepValue.defineProperty(this, "dnsEndpointType", new String[] { "dnsEndpointType" }, null);
    }

    public BicepValue<KeyPolicy> getKeyPolicy() {
        return this.keyPolicy;
    }

    public StorageAccountPropertiesInner setKeyPolicy(BicepValue<KeyPolicy> keyPolicy) {
        this.keyPolicy.assign(keyPolicy);
        return this;
    }
    public BicepValue<KeyCreationTime> getKeyCreationTime() {
        return this.keyCreationTime;
    }

    public StorageAccountPropertiesInner setKeyCreationTime(BicepValue<KeyCreationTime> keyCreationTime) {
        this.keyCreationTime.assign(keyCreationTime);
        return this;
    }
    public BicepValue<PublicNetworkAccess> getPublicNetworkAccess() {
        return this.publicNetworkAccess;
    }

    public StorageAccountPropertiesInner setPublicNetworkAccess(BicepValue<PublicNetworkAccess> publicNetworkAccess) {
        this.publicNetworkAccess.assign(publicNetworkAccess);
        return this;
    }
    public BicepList<PrivateEndpointConnectionInner> getPrivateEndpointConnections() {
        return this.privateEndpointConnections;
    }

    public StorageAccountPropertiesInner setPrivateEndpointConnections(BicepList<PrivateEndpointConnectionInner> privateEndpointConnections) {
        this.privateEndpointConnections.assign(privateEndpointConnections);
        return this;
    }
    public BicepValue<ImmutableStorageAccount> getImmutableStorageWithVersioning() {
        return this.immutableStorageWithVersioning;
    }

    public StorageAccountPropertiesInner setImmutableStorageWithVersioning(BicepValue<ImmutableStorageAccount> immutableStorageWithVersioning) {
        this.immutableStorageWithVersioning.assign(immutableStorageWithVersioning);
        return this;
    }
    public BicepValue<LargeFileSharesState> getLargeFileSharesState() {
        return this.largeFileSharesState;
    }

    public StorageAccountPropertiesInner setLargeFileSharesState(BicepValue<LargeFileSharesState> largeFileSharesState) {
        this.largeFileSharesState.assign(largeFileSharesState);
        return this;
    }
    public BicepValue<Boolean> getDefaultToOAuthAuthentication() {
        return this.defaultToOAuthAuthentication;
    }

    public StorageAccountPropertiesInner setDefaultToOAuthAuthentication(BicepValue<Boolean> defaultToOAuthAuthentication) {
        this.defaultToOAuthAuthentication.assign(defaultToOAuthAuthentication);
        return this;
    }
    public BicepValue<StorageAccountSkuConversionStatus> getStorageAccountSkuConversionStatus() {
        return this.storageAccountSkuConversionStatus;
    }

    public StorageAccountPropertiesInner setStorageAccountSkuConversionStatus(BicepValue<StorageAccountSkuConversionStatus> storageAccountSkuConversionStatus) {
        this.storageAccountSkuConversionStatus.assign(storageAccountSkuConversionStatus);
        return this;
    }
    public BicepValue<Encryption> getEncryption() {
        return this.encryption;
    }

    public StorageAccountPropertiesInner setEncryption(BicepValue<Encryption> encryption) {
        this.encryption.assign(encryption);
        return this;
    }
    public BicepValue<AzureFilesIdentityBasedAuthentication> getAzureFilesIdentityBasedAuthentication() {
        return this.azureFilesIdentityBasedAuthentication;
    }

    public StorageAccountPropertiesInner setAzureFilesIdentityBasedAuthentication(BicepValue<AzureFilesIdentityBasedAuthentication> azureFilesIdentityBasedAuthentication) {
        this.azureFilesIdentityBasedAuthentication.assign(azureFilesIdentityBasedAuthentication);
        return this;
    }
    public BicepValue<Boolean> getEnableExtendedGroups() {
        return this.enableExtendedGroups;
    }

    public StorageAccountPropertiesInner setEnableExtendedGroups(BicepValue<Boolean> enableExtendedGroups) {
        this.enableExtendedGroups.assign(enableExtendedGroups);
        return this;
    }
    public BicepValue<MinimumTlsVersion> getMinimumTlsVersion() {
        return this.minimumTlsVersion;
    }

    public StorageAccountPropertiesInner setMinimumTlsVersion(BicepValue<MinimumTlsVersion> minimumTlsVersion) {
        this.minimumTlsVersion.assign(minimumTlsVersion);
        return this;
    }
    public BicepValue<Boolean> getIsSftpEnabled() {
        return this.isSftpEnabled;
    }

    public StorageAccountPropertiesInner setIsSftpEnabled(BicepValue<Boolean> isSftpEnabled) {
        this.isSftpEnabled.assign(isSftpEnabled);
        return this;
    }
    public BicepValue<AccessTier> getAccessTier() {
        return this.accessTier;
    }

    public StorageAccountPropertiesInner setAccessTier(BicepValue<AccessTier> accessTier) {
        this.accessTier.assign(accessTier);
        return this;
    }
    public BicepValue<GeoReplicationStats> getGeoReplicationStats() {
        return this.geoReplicationStats;
    }

    public StorageAccountPropertiesInner setGeoReplicationStats(BicepValue<GeoReplicationStats> geoReplicationStats) {
        this.geoReplicationStats.assign(geoReplicationStats);
        return this;
    }
    public BicepValue<String> getSecondaryLocation() {
        return this.secondaryLocation;
    }

    public StorageAccountPropertiesInner setSecondaryLocation(BicepValue<String> secondaryLocation) {
        this.secondaryLocation.assign(secondaryLocation);
        return this;
    }
    public BicepValue<BlobRestoreStatusInner> getBlobRestoreStatus() {
        return this.blobRestoreStatus;
    }

    public StorageAccountPropertiesInner setBlobRestoreStatus(BicepValue<BlobRestoreStatusInner> blobRestoreStatus) {
        this.blobRestoreStatus.assign(blobRestoreStatus);
        return this;
    }
    public BicepValue<AccountStatus> getStatusOfSecondary() {
        return this.statusOfSecondary;
    }

    public StorageAccountPropertiesInner setStatusOfSecondary(BicepValue<AccountStatus> statusOfSecondary) {
        this.statusOfSecondary.assign(statusOfSecondary);
        return this;
    }
    public BicepValue<Boolean> getIsSkuConversionBlocked() {
        return this.isSkuConversionBlocked;
    }

    public StorageAccountPropertiesInner setIsSkuConversionBlocked(BicepValue<Boolean> isSkuConversionBlocked) {
        this.isSkuConversionBlocked.assign(isSkuConversionBlocked);
        return this;
    }
    public BicepValue<Boolean> getAllowBlobPublicAccess() {
        return this.allowBlobPublicAccess;
    }

    public StorageAccountPropertiesInner setAllowBlobPublicAccess(BicepValue<Boolean> allowBlobPublicAccess) {
        this.allowBlobPublicAccess.assign(allowBlobPublicAccess);
        return this;
    }
    public BicepValue<Endpoints> getPrimaryEndpoints() {
        return this.primaryEndpoints;
    }

    public StorageAccountPropertiesInner setPrimaryEndpoints(BicepValue<Endpoints> primaryEndpoints) {
        this.primaryEndpoints.assign(primaryEndpoints);
        return this;
    }
    public BicepValue<CustomDomain> getCustomDomain() {
        return this.customDomain;
    }

    public StorageAccountPropertiesInner setCustomDomain(BicepValue<CustomDomain> customDomain) {
        this.customDomain.assign(customDomain);
        return this;
    }
    public BicepValue<Boolean> getEnableNfsV3() {
        return this.enableNfsV3;
    }

    public StorageAccountPropertiesInner setEnableNfsV3(BicepValue<Boolean> enableNfsV3) {
        this.enableNfsV3.assign(enableNfsV3);
        return this;
    }
    public BicepValue<Endpoints> getSecondaryEndpoints() {
        return this.secondaryEndpoints;
    }

    public StorageAccountPropertiesInner setSecondaryEndpoints(BicepValue<Endpoints> secondaryEndpoints) {
        this.secondaryEndpoints.assign(secondaryEndpoints);
        return this;
    }
    public BicepValue<AccountStatus> getStatusOfPrimary() {
        return this.statusOfPrimary;
    }

    public StorageAccountPropertiesInner setStatusOfPrimary(BicepValue<AccountStatus> statusOfPrimary) {
        this.statusOfPrimary.assign(statusOfPrimary);
        return this;
    }
    public BicepValue<Boolean> getEnableHttpsTrafficOnly() {
        return this.enableHttpsTrafficOnly;
    }

    public StorageAccountPropertiesInner setEnableHttpsTrafficOnly(BicepValue<Boolean> enableHttpsTrafficOnly) {
        this.enableHttpsTrafficOnly.assign(enableHttpsTrafficOnly);
        return this;
    }
    public BicepValue<AllowedCopyScope> getAllowedCopyScope() {
        return this.allowedCopyScope;
    }

    public StorageAccountPropertiesInner setAllowedCopyScope(BicepValue<AllowedCopyScope> allowedCopyScope) {
        this.allowedCopyScope.assign(allowedCopyScope);
        return this;
    }
    public BicepValue<RoutingPreference> getRoutingPreference() {
        return this.routingPreference;
    }

    public StorageAccountPropertiesInner setRoutingPreference(BicepValue<RoutingPreference> routingPreference) {
        this.routingPreference.assign(routingPreference);
        return this;
    }
    public BicepValue<Boolean> getAccountMigrationInProgress() {
        return this.accountMigrationInProgress;
    }

    public StorageAccountPropertiesInner setAccountMigrationInProgress(BicepValue<Boolean> accountMigrationInProgress) {
        this.accountMigrationInProgress.assign(accountMigrationInProgress);
        return this;
    }
    public BicepValue<Boolean> getAllowCrossTenantReplication() {
        return this.allowCrossTenantReplication;
    }

    public StorageAccountPropertiesInner setAllowCrossTenantReplication(BicepValue<Boolean> allowCrossTenantReplication) {
        this.allowCrossTenantReplication.assign(allowCrossTenantReplication);
        return this;
    }
    public BicepValue<Boolean> getIsHnsEnabled() {
        return this.isHnsEnabled;
    }

    public StorageAccountPropertiesInner setIsHnsEnabled(BicepValue<Boolean> isHnsEnabled) {
        this.isHnsEnabled.assign(isHnsEnabled);
        return this;
    }
    public BicepValue<Boolean> getAllowSharedKeyAccess() {
        return this.allowSharedKeyAccess;
    }

    public StorageAccountPropertiesInner setAllowSharedKeyAccess(BicepValue<Boolean> allowSharedKeyAccess) {
        this.allowSharedKeyAccess.assign(allowSharedKeyAccess);
        return this;
    }
    public BicepValue<OffsetDateTime> getLastGeoFailoverTime() {
        return this.lastGeoFailoverTime;
    }

    public StorageAccountPropertiesInner setLastGeoFailoverTime(BicepValue<OffsetDateTime> lastGeoFailoverTime) {
        this.lastGeoFailoverTime.assign(lastGeoFailoverTime);
        return this;
    }
    public BicepValue<ProvisioningState> getProvisioningState() {
        return this.provisioningState;
    }

    public StorageAccountPropertiesInner setProvisioningState(BicepValue<ProvisioningState> provisioningState) {
        this.provisioningState.assign(provisioningState);
        return this;
    }
    public BicepValue<OffsetDateTime> getCreationTime() {
        return this.creationTime;
    }

    public StorageAccountPropertiesInner setCreationTime(BicepValue<OffsetDateTime> creationTime) {
        this.creationTime.assign(creationTime);
        return this;
    }
    public BicepValue<Boolean> getIsLocalUserEnabled() {
        return this.isLocalUserEnabled;
    }

    public StorageAccountPropertiesInner setIsLocalUserEnabled(BicepValue<Boolean> isLocalUserEnabled) {
        this.isLocalUserEnabled.assign(isLocalUserEnabled);
        return this;
    }
    public BicepValue<String> getPrimaryLocation() {
        return this.primaryLocation;
    }

    public StorageAccountPropertiesInner setPrimaryLocation(BicepValue<String> primaryLocation) {
        this.primaryLocation.assign(primaryLocation);
        return this;
    }
    public BicepValue<SasPolicy> getSasPolicy() {
        return this.sasPolicy;
    }

    public StorageAccountPropertiesInner setSasPolicy(BicepValue<SasPolicy> sasPolicy) {
        this.sasPolicy.assign(sasPolicy);
        return this;
    }
    public BicepValue<Boolean> getFailoverInProgress() {
        return this.failoverInProgress;
    }

    public StorageAccountPropertiesInner setFailoverInProgress(BicepValue<Boolean> failoverInProgress) {
        this.failoverInProgress.assign(failoverInProgress);
        return this;
    }
    public BicepValue<NetworkRuleSet> getNetworkRuleSet() {
        return this.networkRuleSet;
    }

    public StorageAccountPropertiesInner setNetworkRuleSet(BicepValue<NetworkRuleSet> networkRuleSet) {
        this.networkRuleSet.assign(networkRuleSet);
        return this;
    }
    public BicepValue<DnsEndpointType> getDnsEndpointType() {
        return this.dnsEndpointType;
    }

    public StorageAccountPropertiesInner setDnsEndpointType(BicepValue<DnsEndpointType> dnsEndpointType) {
        this.dnsEndpointType.assign(dnsEndpointType);
        return this;
    }
}
