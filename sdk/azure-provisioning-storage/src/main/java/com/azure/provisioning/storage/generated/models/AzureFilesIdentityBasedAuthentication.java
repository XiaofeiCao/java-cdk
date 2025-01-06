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

    private final BicepValue<String> domainName;
    private final BicepValue<String> domainGuid;
    private final BicepValue<ClientLogger> lOGGER;
    private final BicepValue<DirectoryServiceOptions> directoryServiceOptions;
    private final BicepValue<String> samAccountName;
    private final BicepValue<String> azureStorageSid;
    private final BicepValue<String> forestName;
    private final BicepValue<ActiveDirectoryPropertiesAccountType> accountType;
    private final BicepValue<DefaultSharePermission> defaultSharePermission;
    private final BicepValue<String> netBiosDomainName;
    private final BicepValue<String> domainSid;

    public AzureFilesIdentityBasedAuthentication() {
        domainName = BicepValue.defineProperty(this, "domainName", new String[] { "temp", "domainName" }, null);
        domainGuid = BicepValue.defineProperty(this, "domainGuid", new String[] { "temp", "domainGuid" }, null);
        lOGGER = BicepValue.defineProperty(this, "lOGGER", new String[] { "temp", "lOGGER" }, null);
        directoryServiceOptions = BicepValue.defineProperty(this, "directoryServiceOptions", new String[] { "temp", "directoryServiceOptions" }, null);
        samAccountName = BicepValue.defineProperty(this, "samAccountName", new String[] { "temp", "samAccountName" }, null);
        azureStorageSid = BicepValue.defineProperty(this, "azureStorageSid", new String[] { "temp", "azureStorageSid" }, null);
        forestName = BicepValue.defineProperty(this, "forestName", new String[] { "temp", "forestName" }, null);
        accountType = BicepValue.defineProperty(this, "accountType", new String[] { "temp", "accountType" }, null);
        defaultSharePermission = BicepValue.defineProperty(this, "defaultSharePermission", new String[] { "temp", "defaultSharePermission" }, null);
        netBiosDomainName = BicepValue.defineProperty(this, "netBiosDomainName", new String[] { "temp", "netBiosDomainName" }, null);
        domainSid = BicepValue.defineProperty(this, "domainSid", new String[] { "temp", "domainSid" }, null);
    }

    public BicepValue<String> getDomainName() {
        return this.domainName;
    }

    public AzureFilesIdentityBasedAuthentication setDomainName(BicepValue<String> domainName) {
        this.domainName.assign(domainName);
        return this;
    }
    public BicepValue<String> getDomainGuid() {
        return this.domainGuid;
    }

    public AzureFilesIdentityBasedAuthentication setDomainGuid(BicepValue<String> domainGuid) {
        this.domainGuid.assign(domainGuid);
        return this;
    }
    public BicepValue<ClientLogger> getLOGGER() {
        return this.lOGGER;
    }

    public AzureFilesIdentityBasedAuthentication setLOGGER(BicepValue<ClientLogger> lOGGER) {
        this.lOGGER.assign(lOGGER);
        return this;
    }
    public BicepValue<DirectoryServiceOptions> getDirectoryServiceOptions() {
        return this.directoryServiceOptions;
    }

    public AzureFilesIdentityBasedAuthentication setDirectoryServiceOptions(BicepValue<DirectoryServiceOptions> directoryServiceOptions) {
        this.directoryServiceOptions.assign(directoryServiceOptions);
        return this;
    }
    public BicepValue<String> getSamAccountName() {
        return this.samAccountName;
    }

    public AzureFilesIdentityBasedAuthentication setSamAccountName(BicepValue<String> samAccountName) {
        this.samAccountName.assign(samAccountName);
        return this;
    }
    public BicepValue<String> getAzureStorageSid() {
        return this.azureStorageSid;
    }

    public AzureFilesIdentityBasedAuthentication setAzureStorageSid(BicepValue<String> azureStorageSid) {
        this.azureStorageSid.assign(azureStorageSid);
        return this;
    }
    public BicepValue<String> getForestName() {
        return this.forestName;
    }

    public AzureFilesIdentityBasedAuthentication setForestName(BicepValue<String> forestName) {
        this.forestName.assign(forestName);
        return this;
    }
    public BicepValue<ActiveDirectoryPropertiesAccountType> getAccountType() {
        return this.accountType;
    }

    public AzureFilesIdentityBasedAuthentication setAccountType(BicepValue<ActiveDirectoryPropertiesAccountType> accountType) {
        this.accountType.assign(accountType);
        return this;
    }
    public BicepValue<DefaultSharePermission> getDefaultSharePermission() {
        return this.defaultSharePermission;
    }

    public AzureFilesIdentityBasedAuthentication setDefaultSharePermission(BicepValue<DefaultSharePermission> defaultSharePermission) {
        this.defaultSharePermission.assign(defaultSharePermission);
        return this;
    }
    public BicepValue<String> getNetBiosDomainName() {
        return this.netBiosDomainName;
    }

    public AzureFilesIdentityBasedAuthentication setNetBiosDomainName(BicepValue<String> netBiosDomainName) {
        this.netBiosDomainName.assign(netBiosDomainName);
        return this;
    }
    public BicepValue<String> getDomainSid() {
        return this.domainSid;
    }

    public AzureFilesIdentityBasedAuthentication setDomainSid(BicepValue<String> domainSid) {
        this.domainSid.assign(domainSid);
        return this;
    }
}
