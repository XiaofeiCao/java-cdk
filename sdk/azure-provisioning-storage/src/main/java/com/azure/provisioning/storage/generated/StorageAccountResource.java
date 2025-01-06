// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated;

import com.azure.provisioning.storage.generated.models.AllowedCopyScope;
import com.azure.provisioning.storage.generated.models.AccessTier;
import com.azure.provisioning.storage.generated.models.NetworkRuleSet;
import com.azure.provisioning.storage.generated.models.KeyPolicy;
import com.azure.provisioning.storage.generated.models.MinimumTlsVersion;
import com.azure.provisioning.storage.generated.models.RoutingPreference;
import com.azure.provisioning.storage.generated.models.Encryption;
import com.azure.provisioning.storage.generated.models.SasPolicy;
import com.azure.provisioning.storage.generated.models.PublicNetworkAccess;
import com.azure.provisioning.storage.generated.models.ImmutableStorageAccount;
import com.azure.provisioning.storage.generated.models.LargeFileSharesState;
import com.azure.provisioning.storage.generated.models.AzureFilesIdentityBasedAuthentication;
import com.azure.provisioning.storage.generated.models.DnsEndpointType;
import com.azure.provisioning.storage.generated.models.CustomDomain;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.Resource;
import com.azure.provisioning.tmp.ResourceType;

public class StorageAccountResource extends Resource {

    private final BicepValue<Boolean> enableExtendedGroups;
    private final BicepValue<Encryption> encryption;
    private final BicepValue<DnsEndpointType> dnsEndpointType;
    private final BicepValue<Boolean> allowCrossTenantReplication;
    private final BicepValue<String> location;
    private final BicepValue<Boolean> isHnsEnabled;
    private final BicepValue<String> arg0;
    private final BicepValue<AzureFilesIdentityBasedAuthentication> azureFilesIdentityBasedAuthentication;
    private final BicepValue<Boolean> allowBlobPublicAccess;
    private final BicepValue<KeyPolicy> keyPolicy;
    private final BicepValue<Boolean> isLocalUserEnabled;
    private final BicepValue<Boolean> allowSharedKeyAccess;
    private final BicepValue<SasPolicy> sasPolicy;
    private final BicepValue<ImmutableStorageAccount> immutableStorageWithVersioning;
    private final BicepValue<Boolean> enableNfsV3;
    private final BicepValue<String> arg1;
    private final BicepValue<NetworkRuleSet> networkRuleSet;
    private final BicepValue<Boolean> defaultToOAuthAuthentication;
    private final BicepValue<AllowedCopyScope> allowedCopyScope;
    private final BicepValue<MinimumTlsVersion> minimumTlsVersion;
    private final BicepValue<CustomDomain> customDomain;
    private final BicepValue<Boolean> enableHttpsTrafficOnly;
    private final BicepValue<RoutingPreference> routingPreference;
    private final BicepValue<LargeFileSharesState> largeFileSharesState;
    private final BicepValue<Boolean> isSftpEnabled;
    private final BicepValue<PublicNetworkAccess> publicNetworkAccess;
    private final BicepValue<AccessTier> accessTier;

    public StorageAccountResource(String identifierName) {
        this(identifierName, null);
    }

    public StorageAccountResource(String identifierName, String resourceVersion) {
        super(identifierName, new ResourceType("Microsoft.Storage/storageAccounts"), resourceVersion);
        enableExtendedGroups = BicepValue.defineProperty(this, "enableExtendedGroups", new String[] { "temp", "enableExtendedGroups" }, false, false, false, null);
        encryption = BicepValue.defineProperty(this, "encryption", new String[] { "temp", "encryption" }, false, false, false, null);
        dnsEndpointType = BicepValue.defineProperty(this, "dnsEndpointType", new String[] { "temp", "dnsEndpointType" }, false, false, false, null);
        allowCrossTenantReplication = BicepValue.defineProperty(this, "allowCrossTenantReplication", new String[] { "temp", "allowCrossTenantReplication" }, false, false, false, null);
        location = BicepValue.defineProperty(this, "location", new String[] { "temp", "location" }, false, false, false, null);
        isHnsEnabled = BicepValue.defineProperty(this, "isHnsEnabled", new String[] { "temp", "isHnsEnabled" }, false, false, false, null);
        arg0 = BicepValue.defineProperty(this, "arg0", new String[] { "temp", "arg0" }, false, false, false, null);
        azureFilesIdentityBasedAuthentication = BicepValue.defineProperty(this, "azureFilesIdentityBasedAuthentication", new String[] { "temp", "azureFilesIdentityBasedAuthentication" }, false, false, false, null);
        allowBlobPublicAccess = BicepValue.defineProperty(this, "allowBlobPublicAccess", new String[] { "temp", "allowBlobPublicAccess" }, false, false, false, null);
        keyPolicy = BicepValue.defineProperty(this, "keyPolicy", new String[] { "temp", "keyPolicy" }, false, false, false, null);
        isLocalUserEnabled = BicepValue.defineProperty(this, "isLocalUserEnabled", new String[] { "temp", "isLocalUserEnabled" }, false, false, false, null);
        allowSharedKeyAccess = BicepValue.defineProperty(this, "allowSharedKeyAccess", new String[] { "temp", "allowSharedKeyAccess" }, false, false, false, null);
        sasPolicy = BicepValue.defineProperty(this, "sasPolicy", new String[] { "temp", "sasPolicy" }, false, false, false, null);
        immutableStorageWithVersioning = BicepValue.defineProperty(this, "immutableStorageWithVersioning", new String[] { "temp", "immutableStorageWithVersioning" }, false, false, false, null);
        enableNfsV3 = BicepValue.defineProperty(this, "enableNfsV3", new String[] { "temp", "enableNfsV3" }, false, false, false, null);
        arg1 = BicepValue.defineProperty(this, "arg1", new String[] { "temp", "arg1" }, false, false, false, null);
        networkRuleSet = BicepValue.defineProperty(this, "networkRuleSet", new String[] { "temp", "networkRuleSet" }, false, false, false, null);
        defaultToOAuthAuthentication = BicepValue.defineProperty(this, "defaultToOAuthAuthentication", new String[] { "temp", "defaultToOAuthAuthentication" }, false, false, false, null);
        allowedCopyScope = BicepValue.defineProperty(this, "allowedCopyScope", new String[] { "temp", "allowedCopyScope" }, false, false, false, null);
        minimumTlsVersion = BicepValue.defineProperty(this, "minimumTlsVersion", new String[] { "temp", "minimumTlsVersion" }, false, false, false, null);
        customDomain = BicepValue.defineProperty(this, "customDomain", new String[] { "temp", "customDomain" }, false, false, false, null);
        enableHttpsTrafficOnly = BicepValue.defineProperty(this, "enableHttpsTrafficOnly", new String[] { "temp", "enableHttpsTrafficOnly" }, false, false, false, null);
        routingPreference = BicepValue.defineProperty(this, "routingPreference", new String[] { "temp", "routingPreference" }, false, false, false, null);
        largeFileSharesState = BicepValue.defineProperty(this, "largeFileSharesState", new String[] { "temp", "largeFileSharesState" }, false, false, false, null);
        isSftpEnabled = BicepValue.defineProperty(this, "isSftpEnabled", new String[] { "temp", "isSftpEnabled" }, false, false, false, null);
        publicNetworkAccess = BicepValue.defineProperty(this, "publicNetworkAccess", new String[] { "temp", "publicNetworkAccess" }, false, false, false, null);
        accessTier = BicepValue.defineProperty(this, "accessTier", new String[] { "temp", "accessTier" }, false, false, false, null);
    }

    public BicepValue<Boolean> getEnableExtendedGroups() {
        return this.enableExtendedGroups;
    }

    public StorageAccountResource setEnableExtendedGroups(BicepValue<Boolean> enableExtendedGroups) {
        this.enableExtendedGroups.assign(enableExtendedGroups);
        return this;
    }

    public StorageAccountResource setEnableExtendedGroups(Boolean enableExtendedGroups) {
        return this.setEnableExtendedGroups(BicepValue.from(enableExtendedGroups));
    }

    public BicepValue<Encryption> getEncryption() {
        return this.encryption;
    }

    public StorageAccountResource setEncryption(BicepValue<Encryption> encryption) {
        this.encryption.assign(encryption);
        return this;
    }

    public StorageAccountResource setEncryption(Encryption encryption) {
        return this.setEncryption(BicepValue.from(encryption));
    }

    public BicepValue<DnsEndpointType> getDnsEndpointType() {
        return this.dnsEndpointType;
    }

    public StorageAccountResource setDnsEndpointType(BicepValue<DnsEndpointType> dnsEndpointType) {
        this.dnsEndpointType.assign(dnsEndpointType);
        return this;
    }

    public StorageAccountResource setDnsEndpointType(DnsEndpointType dnsEndpointType) {
        return this.setDnsEndpointType(BicepValue.from(dnsEndpointType));
    }

    public BicepValue<Boolean> getAllowCrossTenantReplication() {
        return this.allowCrossTenantReplication;
    }

    public StorageAccountResource setAllowCrossTenantReplication(BicepValue<Boolean> allowCrossTenantReplication) {
        this.allowCrossTenantReplication.assign(allowCrossTenantReplication);
        return this;
    }

    public StorageAccountResource setAllowCrossTenantReplication(Boolean allowCrossTenantReplication) {
        return this.setAllowCrossTenantReplication(BicepValue.from(allowCrossTenantReplication));
    }

    public BicepValue<String> getLocation() {
        return this.location;
    }

    public StorageAccountResource setLocation(BicepValue<String> location) {
        this.location.assign(location);
        return this;
    }

    public StorageAccountResource setLocation(String location) {
        return this.setLocation(BicepValue.from(location));
    }

    public BicepValue<Boolean> getIsHnsEnabled() {
        return this.isHnsEnabled;
    }

    public StorageAccountResource setIsHnsEnabled(BicepValue<Boolean> isHnsEnabled) {
        this.isHnsEnabled.assign(isHnsEnabled);
        return this;
    }

    public StorageAccountResource setIsHnsEnabled(Boolean isHnsEnabled) {
        return this.setIsHnsEnabled(BicepValue.from(isHnsEnabled));
    }

    public BicepValue<String> getArg0() {
        return this.arg0;
    }

    public StorageAccountResource setArg0(BicepValue<String> arg0) {
        this.arg0.assign(arg0);
        return this;
    }

    public StorageAccountResource setArg0(String arg0) {
        return this.setArg0(BicepValue.from(arg0));
    }

    public BicepValue<AzureFilesIdentityBasedAuthentication> getAzureFilesIdentityBasedAuthentication() {
        return this.azureFilesIdentityBasedAuthentication;
    }

    public StorageAccountResource setAzureFilesIdentityBasedAuthentication(BicepValue<AzureFilesIdentityBasedAuthentication> azureFilesIdentityBasedAuthentication) {
        this.azureFilesIdentityBasedAuthentication.assign(azureFilesIdentityBasedAuthentication);
        return this;
    }

    public StorageAccountResource setAzureFilesIdentityBasedAuthentication(AzureFilesIdentityBasedAuthentication azureFilesIdentityBasedAuthentication) {
        return this.setAzureFilesIdentityBasedAuthentication(BicepValue.from(azureFilesIdentityBasedAuthentication));
    }

    public BicepValue<Boolean> getAllowBlobPublicAccess() {
        return this.allowBlobPublicAccess;
    }

    public StorageAccountResource setAllowBlobPublicAccess(BicepValue<Boolean> allowBlobPublicAccess) {
        this.allowBlobPublicAccess.assign(allowBlobPublicAccess);
        return this;
    }

    public StorageAccountResource setAllowBlobPublicAccess(Boolean allowBlobPublicAccess) {
        return this.setAllowBlobPublicAccess(BicepValue.from(allowBlobPublicAccess));
    }

    public BicepValue<KeyPolicy> getKeyPolicy() {
        return this.keyPolicy;
    }

    public StorageAccountResource setKeyPolicy(BicepValue<KeyPolicy> keyPolicy) {
        this.keyPolicy.assign(keyPolicy);
        return this;
    }

    public StorageAccountResource setKeyPolicy(KeyPolicy keyPolicy) {
        return this.setKeyPolicy(BicepValue.from(keyPolicy));
    }

    public BicepValue<Boolean> getIsLocalUserEnabled() {
        return this.isLocalUserEnabled;
    }

    public StorageAccountResource setIsLocalUserEnabled(BicepValue<Boolean> isLocalUserEnabled) {
        this.isLocalUserEnabled.assign(isLocalUserEnabled);
        return this;
    }

    public StorageAccountResource setIsLocalUserEnabled(Boolean isLocalUserEnabled) {
        return this.setIsLocalUserEnabled(BicepValue.from(isLocalUserEnabled));
    }

    public BicepValue<Boolean> getAllowSharedKeyAccess() {
        return this.allowSharedKeyAccess;
    }

    public StorageAccountResource setAllowSharedKeyAccess(BicepValue<Boolean> allowSharedKeyAccess) {
        this.allowSharedKeyAccess.assign(allowSharedKeyAccess);
        return this;
    }

    public StorageAccountResource setAllowSharedKeyAccess(Boolean allowSharedKeyAccess) {
        return this.setAllowSharedKeyAccess(BicepValue.from(allowSharedKeyAccess));
    }

    public BicepValue<SasPolicy> getSasPolicy() {
        return this.sasPolicy;
    }

    public StorageAccountResource setSasPolicy(BicepValue<SasPolicy> sasPolicy) {
        this.sasPolicy.assign(sasPolicy);
        return this;
    }

    public StorageAccountResource setSasPolicy(SasPolicy sasPolicy) {
        return this.setSasPolicy(BicepValue.from(sasPolicy));
    }

    public BicepValue<ImmutableStorageAccount> getImmutableStorageWithVersioning() {
        return this.immutableStorageWithVersioning;
    }

    public StorageAccountResource setImmutableStorageWithVersioning(BicepValue<ImmutableStorageAccount> immutableStorageWithVersioning) {
        this.immutableStorageWithVersioning.assign(immutableStorageWithVersioning);
        return this;
    }

    public StorageAccountResource setImmutableStorageWithVersioning(ImmutableStorageAccount immutableStorageWithVersioning) {
        return this.setImmutableStorageWithVersioning(BicepValue.from(immutableStorageWithVersioning));
    }

    public BicepValue<Boolean> getEnableNfsV3() {
        return this.enableNfsV3;
    }

    public StorageAccountResource setEnableNfsV3(BicepValue<Boolean> enableNfsV3) {
        this.enableNfsV3.assign(enableNfsV3);
        return this;
    }

    public StorageAccountResource setEnableNfsV3(Boolean enableNfsV3) {
        return this.setEnableNfsV3(BicepValue.from(enableNfsV3));
    }

    public BicepValue<String> getArg1() {
        return this.arg1;
    }

    public StorageAccountResource setArg1(BicepValue<String> arg1) {
        this.arg1.assign(arg1);
        return this;
    }

    public StorageAccountResource setArg1(String arg1) {
        return this.setArg1(BicepValue.from(arg1));
    }

    public BicepValue<NetworkRuleSet> getNetworkRuleSet() {
        return this.networkRuleSet;
    }

    public StorageAccountResource setNetworkRuleSet(BicepValue<NetworkRuleSet> networkRuleSet) {
        this.networkRuleSet.assign(networkRuleSet);
        return this;
    }

    public StorageAccountResource setNetworkRuleSet(NetworkRuleSet networkRuleSet) {
        return this.setNetworkRuleSet(BicepValue.from(networkRuleSet));
    }

    public BicepValue<Boolean> getDefaultToOAuthAuthentication() {
        return this.defaultToOAuthAuthentication;
    }

    public StorageAccountResource setDefaultToOAuthAuthentication(BicepValue<Boolean> defaultToOAuthAuthentication) {
        this.defaultToOAuthAuthentication.assign(defaultToOAuthAuthentication);
        return this;
    }

    public StorageAccountResource setDefaultToOAuthAuthentication(Boolean defaultToOAuthAuthentication) {
        return this.setDefaultToOAuthAuthentication(BicepValue.from(defaultToOAuthAuthentication));
    }

    public BicepValue<AllowedCopyScope> getAllowedCopyScope() {
        return this.allowedCopyScope;
    }

    public StorageAccountResource setAllowedCopyScope(BicepValue<AllowedCopyScope> allowedCopyScope) {
        this.allowedCopyScope.assign(allowedCopyScope);
        return this;
    }

    public StorageAccountResource setAllowedCopyScope(AllowedCopyScope allowedCopyScope) {
        return this.setAllowedCopyScope(BicepValue.from(allowedCopyScope));
    }

    public BicepValue<MinimumTlsVersion> getMinimumTlsVersion() {
        return this.minimumTlsVersion;
    }

    public StorageAccountResource setMinimumTlsVersion(BicepValue<MinimumTlsVersion> minimumTlsVersion) {
        this.minimumTlsVersion.assign(minimumTlsVersion);
        return this;
    }

    public StorageAccountResource setMinimumTlsVersion(MinimumTlsVersion minimumTlsVersion) {
        return this.setMinimumTlsVersion(BicepValue.from(minimumTlsVersion));
    }

    public BicepValue<CustomDomain> getCustomDomain() {
        return this.customDomain;
    }

    public StorageAccountResource setCustomDomain(BicepValue<CustomDomain> customDomain) {
        this.customDomain.assign(customDomain);
        return this;
    }

    public StorageAccountResource setCustomDomain(CustomDomain customDomain) {
        return this.setCustomDomain(BicepValue.from(customDomain));
    }

    public BicepValue<Boolean> getEnableHttpsTrafficOnly() {
        return this.enableHttpsTrafficOnly;
    }

    public StorageAccountResource setEnableHttpsTrafficOnly(BicepValue<Boolean> enableHttpsTrafficOnly) {
        this.enableHttpsTrafficOnly.assign(enableHttpsTrafficOnly);
        return this;
    }

    public StorageAccountResource setEnableHttpsTrafficOnly(Boolean enableHttpsTrafficOnly) {
        return this.setEnableHttpsTrafficOnly(BicepValue.from(enableHttpsTrafficOnly));
    }

    public BicepValue<RoutingPreference> getRoutingPreference() {
        return this.routingPreference;
    }

    public StorageAccountResource setRoutingPreference(BicepValue<RoutingPreference> routingPreference) {
        this.routingPreference.assign(routingPreference);
        return this;
    }

    public StorageAccountResource setRoutingPreference(RoutingPreference routingPreference) {
        return this.setRoutingPreference(BicepValue.from(routingPreference));
    }

    public BicepValue<LargeFileSharesState> getLargeFileSharesState() {
        return this.largeFileSharesState;
    }

    public StorageAccountResource setLargeFileSharesState(BicepValue<LargeFileSharesState> largeFileSharesState) {
        this.largeFileSharesState.assign(largeFileSharesState);
        return this;
    }

    public StorageAccountResource setLargeFileSharesState(LargeFileSharesState largeFileSharesState) {
        return this.setLargeFileSharesState(BicepValue.from(largeFileSharesState));
    }

    public BicepValue<Boolean> getIsSftpEnabled() {
        return this.isSftpEnabled;
    }

    public StorageAccountResource setIsSftpEnabled(BicepValue<Boolean> isSftpEnabled) {
        this.isSftpEnabled.assign(isSftpEnabled);
        return this;
    }

    public StorageAccountResource setIsSftpEnabled(Boolean isSftpEnabled) {
        return this.setIsSftpEnabled(BicepValue.from(isSftpEnabled));
    }

    public BicepValue<PublicNetworkAccess> getPublicNetworkAccess() {
        return this.publicNetworkAccess;
    }

    public StorageAccountResource setPublicNetworkAccess(BicepValue<PublicNetworkAccess> publicNetworkAccess) {
        this.publicNetworkAccess.assign(publicNetworkAccess);
        return this;
    }

    public StorageAccountResource setPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        return this.setPublicNetworkAccess(BicepValue.from(publicNetworkAccess));
    }

    public BicepValue<AccessTier> getAccessTier() {
        return this.accessTier;
    }

    public StorageAccountResource setAccessTier(BicepValue<AccessTier> accessTier) {
        this.accessTier.assign(accessTier);
        return this;
    }

    public StorageAccountResource setAccessTier(AccessTier accessTier) {
        return this.setAccessTier(BicepValue.from(accessTier));
    }


    public static class ResourceVersions {

        public static final String V2024_01_01 = "2024-01-01";

        public static final String V2023_05_01 = "2023-05-01";

        public static final String V2023_04_01 = "2023-04-01";

        public static final String V2023_01_01 = "2023-01-01";

        public static final String V2022_09_01 = "2022-09-01";

        public static final String V2022_05_01 = "2022-05-01";

        public static final String V2021_09_01 = "2021-09-01";

        public static final String V2021_08_01 = "2021-08-01";

        public static final String V2021_06_01 = "2021-06-01";

        public static final String V2021_05_01 = "2021-05-01";

        public static final String V2021_04_01 = "2021-04-01";

        public static final String V2021_02_01 = "2021-02-01";

        public static final String V2021_01_01 = "2021-01-01";

        public static final String V2019_06_01 = "2019-06-01";

        public static final String V2019_04_01 = "2019-04-01";

        public static final String V2018_11_01 = "2018-11-01";

        public static final String V2018_07_01 = "2018-07-01";

        public static final String V2018_02_01 = "2018-02-01";

        public static final String V2017_10_01 = "2017-10-01";

        public static final String V2017_06_01 = "2017-06-01";

        public static final String V2016_12_01 = "2016-12-01";

        public static final String V2016_05_01 = "2016-05-01";

        public static final String V2016_01_01 = "2016-01-01";

        public static final String V2015_06_15 = "2015-06-15";

    }
}
