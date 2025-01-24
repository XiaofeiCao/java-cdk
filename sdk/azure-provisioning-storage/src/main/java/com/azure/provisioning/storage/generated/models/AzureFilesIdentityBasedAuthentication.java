// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated.models;

import com.azure.provisioning.storage.generated.models.DirectoryServiceOptions;
import com.azure.provisioning.storage.generated.models.ActiveDirectoryPropertiesAccountType;
import com.azure.core.util.logging.ClientLogger;
import com.azure.provisioning.storage.generated.models.DefaultSharePermission;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class AzureFilesIdentityBasedAuthentication extends ProvisioningConstruct {

    private final BicepValue<String> samAccountName;
    private final BicepValue<String> domainName;
    private final BicepValue<ClientLogger> lOGGER;
    private final BicepValue<DirectoryServiceOptions> directoryServiceOptions;
    private final BicepValue<String> azureStorageSid;
    private final BicepValue<String> netBiosDomainName;
    private final BicepValue<String> domainGuid;
    private final BicepValue<ActiveDirectoryPropertiesAccountType> accountType;
    private final BicepValue<String> forestName;
    private final BicepValue<DefaultSharePermission> defaultSharePermission;
    private final BicepValue<String> domainSid;

    public AzureFilesIdentityBasedAuthentication() {
        samAccountName = BicepValue.defineProperty(this, "samAccountName", new String[] { "samAccountName" }, null);
        domainName = BicepValue.defineProperty(this, "domainName", new String[] { "domainName" }, null);
        lOGGER = BicepValue.defineProperty(this, "lOGGER", new String[] { "lOGGER" }, null);
        directoryServiceOptions = BicepValue.defineProperty(this, "directoryServiceOptions", new String[] { "directoryServiceOptions" }, null);
        azureStorageSid = BicepValue.defineProperty(this, "azureStorageSid", new String[] { "azureStorageSid" }, null);
        netBiosDomainName = BicepValue.defineProperty(this, "netBiosDomainName", new String[] { "netBiosDomainName" }, null);
        domainGuid = BicepValue.defineProperty(this, "domainGuid", new String[] { "domainGuid" }, null);
        accountType = BicepValue.defineProperty(this, "accountType", new String[] { "accountType" }, null);
        forestName = BicepValue.defineProperty(this, "forestName", new String[] { "forestName" }, null);
        defaultSharePermission = BicepValue.defineProperty(this, "defaultSharePermission", new String[] { "defaultSharePermission" }, null);
        domainSid = BicepValue.defineProperty(this, "domainSid", new String[] { "domainSid" }, null);
    }

    public BicepValue<String> getSamAccountName() {
        return this.samAccountName;
    }

    public AzureFilesIdentityBasedAuthentication setSamAccountName(BicepValue<String> samAccountName) {
        this.samAccountName.assign(samAccountName);
        return this;
    }
    public AzureFilesIdentityBasedAuthentication setSamAccountName(String samAccountName) {
        return this.setSamAccountName(BicepValue.from(samAccountName));
    }

    public BicepValue<String> getDomainName() {
        return this.domainName;
    }

    public AzureFilesIdentityBasedAuthentication setDomainName(BicepValue<String> domainName) {
        this.domainName.assign(domainName);
        return this;
    }
    public AzureFilesIdentityBasedAuthentication setDomainName(String domainName) {
        return this.setDomainName(BicepValue.from(domainName));
    }

    public BicepValue<ClientLogger> getLOGGER() {
        return this.lOGGER;
    }

    public AzureFilesIdentityBasedAuthentication setLOGGER(BicepValue<ClientLogger> lOGGER) {
        this.lOGGER.assign(lOGGER);
        return this;
    }
    public AzureFilesIdentityBasedAuthentication setLOGGER(ClientLogger lOGGER) {
        return this.setLOGGER(BicepValue.from(lOGGER));
    }

    public BicepValue<DirectoryServiceOptions> getDirectoryServiceOptions() {
        return this.directoryServiceOptions;
    }

    public AzureFilesIdentityBasedAuthentication setDirectoryServiceOptions(BicepValue<DirectoryServiceOptions> directoryServiceOptions) {
        this.directoryServiceOptions.assign(directoryServiceOptions);
        return this;
    }
    public AzureFilesIdentityBasedAuthentication setDirectoryServiceOptions(DirectoryServiceOptions directoryServiceOptions) {
        return this.setDirectoryServiceOptions(BicepValue.from(directoryServiceOptions));
    }

    public BicepValue<String> getAzureStorageSid() {
        return this.azureStorageSid;
    }

    public AzureFilesIdentityBasedAuthentication setAzureStorageSid(BicepValue<String> azureStorageSid) {
        this.azureStorageSid.assign(azureStorageSid);
        return this;
    }
    public AzureFilesIdentityBasedAuthentication setAzureStorageSid(String azureStorageSid) {
        return this.setAzureStorageSid(BicepValue.from(azureStorageSid));
    }

    public BicepValue<String> getNetBiosDomainName() {
        return this.netBiosDomainName;
    }

    public AzureFilesIdentityBasedAuthentication setNetBiosDomainName(BicepValue<String> netBiosDomainName) {
        this.netBiosDomainName.assign(netBiosDomainName);
        return this;
    }
    public AzureFilesIdentityBasedAuthentication setNetBiosDomainName(String netBiosDomainName) {
        return this.setNetBiosDomainName(BicepValue.from(netBiosDomainName));
    }

    public BicepValue<String> getDomainGuid() {
        return this.domainGuid;
    }

    public AzureFilesIdentityBasedAuthentication setDomainGuid(BicepValue<String> domainGuid) {
        this.domainGuid.assign(domainGuid);
        return this;
    }
    public AzureFilesIdentityBasedAuthentication setDomainGuid(String domainGuid) {
        return this.setDomainGuid(BicepValue.from(domainGuid));
    }

    public BicepValue<ActiveDirectoryPropertiesAccountType> getAccountType() {
        return this.accountType;
    }

    public AzureFilesIdentityBasedAuthentication setAccountType(BicepValue<ActiveDirectoryPropertiesAccountType> accountType) {
        this.accountType.assign(accountType);
        return this;
    }
    public AzureFilesIdentityBasedAuthentication setAccountType(ActiveDirectoryPropertiesAccountType accountType) {
        return this.setAccountType(BicepValue.from(accountType));
    }

    public BicepValue<String> getForestName() {
        return this.forestName;
    }

    public AzureFilesIdentityBasedAuthentication setForestName(BicepValue<String> forestName) {
        this.forestName.assign(forestName);
        return this;
    }
    public AzureFilesIdentityBasedAuthentication setForestName(String forestName) {
        return this.setForestName(BicepValue.from(forestName));
    }

    public BicepValue<DefaultSharePermission> getDefaultSharePermission() {
        return this.defaultSharePermission;
    }

    public AzureFilesIdentityBasedAuthentication setDefaultSharePermission(BicepValue<DefaultSharePermission> defaultSharePermission) {
        this.defaultSharePermission.assign(defaultSharePermission);
        return this;
    }
    public AzureFilesIdentityBasedAuthentication setDefaultSharePermission(DefaultSharePermission defaultSharePermission) {
        return this.setDefaultSharePermission(BicepValue.from(defaultSharePermission));
    }

    public BicepValue<String> getDomainSid() {
        return this.domainSid;
    }

    public AzureFilesIdentityBasedAuthentication setDomainSid(BicepValue<String> domainSid) {
        this.domainSid.assign(domainSid);
        return this;
    }
    public AzureFilesIdentityBasedAuthentication setDomainSid(String domainSid) {
        return this.setDomainSid(BicepValue.from(domainSid));
    }

}
