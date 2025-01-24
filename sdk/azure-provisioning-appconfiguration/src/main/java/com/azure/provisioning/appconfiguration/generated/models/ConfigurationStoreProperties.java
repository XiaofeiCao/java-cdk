// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.appconfiguration.generated.models;

import com.azure.provisioning.appconfiguration.generated.models.PrivateEndpointConnectionReference;
import java.util.List;
import com.azure.provisioning.appconfiguration.generated.models.ProvisioningState;
import java.time.OffsetDateTime;
import com.azure.provisioning.appconfiguration.generated.models.EncryptionProperties;
import com.azure.provisioning.appconfiguration.generated.models.CreateMode;
import com.azure.provisioning.appconfiguration.generated.models.PublicNetworkAccess;
import com.azure.provisioning.BicepList;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class ConfigurationStoreProperties extends ProvisioningConstruct {

    private final BicepValue<Boolean> enablePurgeProtection;
    private final BicepValue<String> endpoint;
    private final BicepValue<Boolean> disableLocalAuth;
    private final BicepValue<Integer> softDeleteRetentionInDays;
    private final BicepValue<ProvisioningState> provisioningState;
    private final BicepValue<EncryptionProperties> encryption;
    private final BicepList<PrivateEndpointConnectionReference> privateEndpointConnections;
    private final BicepValue<CreateMode> createMode;
    private final BicepValue<PublicNetworkAccess> publicNetworkAccess;
    private final BicepValue<OffsetDateTime> creationDate;

    public ConfigurationStoreProperties() {
        enablePurgeProtection = BicepValue.defineProperty(this, "enablePurgeProtection", new String[] { "enablePurgeProtection" }, null);
        endpoint = BicepValue.defineProperty(this, "endpoint", new String[] { "endpoint" }, null);
        disableLocalAuth = BicepValue.defineProperty(this, "disableLocalAuth", new String[] { "disableLocalAuth" }, null);
        softDeleteRetentionInDays = BicepValue.defineProperty(this, "softDeleteRetentionInDays", new String[] { "softDeleteRetentionInDays" }, null);
        provisioningState = BicepValue.defineProperty(this, "provisioningState", new String[] { "provisioningState" }, null);
        encryption = BicepValue.defineProperty(this, "encryption", new String[] { "encryption" }, null);
        privateEndpointConnections = BicepList.defineProperty(this, "privateEndpointConnections", new String[] { "privateEndpointConnections" }, false, false);
        createMode = BicepValue.defineProperty(this, "createMode", new String[] { "createMode" }, null);
        publicNetworkAccess = BicepValue.defineProperty(this, "publicNetworkAccess", new String[] { "publicNetworkAccess" }, null);
        creationDate = BicepValue.defineProperty(this, "creationDate", new String[] { "creationDate" }, null);
    }

    public BicepValue<Boolean> getEnablePurgeProtection() {
        return this.enablePurgeProtection;
    }

    public ConfigurationStoreProperties setEnablePurgeProtection(BicepValue<Boolean> enablePurgeProtection) {
        this.enablePurgeProtection.assign(enablePurgeProtection);
        return this;
    }
    public ConfigurationStoreProperties setEnablePurgeProtection(Boolean enablePurgeProtection) {
        return this.setEnablePurgeProtection(BicepValue.from(enablePurgeProtection));
    }

    public BicepValue<String> getEndpoint() {
        return this.endpoint;
    }

    public ConfigurationStoreProperties setEndpoint(BicepValue<String> endpoint) {
        this.endpoint.assign(endpoint);
        return this;
    }
    public ConfigurationStoreProperties setEndpoint(String endpoint) {
        return this.setEndpoint(BicepValue.from(endpoint));
    }

    public BicepValue<Boolean> getDisableLocalAuth() {
        return this.disableLocalAuth;
    }

    public ConfigurationStoreProperties setDisableLocalAuth(BicepValue<Boolean> disableLocalAuth) {
        this.disableLocalAuth.assign(disableLocalAuth);
        return this;
    }
    public ConfigurationStoreProperties setDisableLocalAuth(Boolean disableLocalAuth) {
        return this.setDisableLocalAuth(BicepValue.from(disableLocalAuth));
    }

    public BicepValue<Integer> getSoftDeleteRetentionInDays() {
        return this.softDeleteRetentionInDays;
    }

    public ConfigurationStoreProperties setSoftDeleteRetentionInDays(BicepValue<Integer> softDeleteRetentionInDays) {
        this.softDeleteRetentionInDays.assign(softDeleteRetentionInDays);
        return this;
    }
    public ConfigurationStoreProperties setSoftDeleteRetentionInDays(Integer softDeleteRetentionInDays) {
        return this.setSoftDeleteRetentionInDays(BicepValue.from(softDeleteRetentionInDays));
    }

    public BicepValue<ProvisioningState> getProvisioningState() {
        return this.provisioningState;
    }

    public ConfigurationStoreProperties setProvisioningState(BicepValue<ProvisioningState> provisioningState) {
        this.provisioningState.assign(provisioningState);
        return this;
    }
    public ConfigurationStoreProperties setProvisioningState(ProvisioningState provisioningState) {
        return this.setProvisioningState(BicepValue.from(provisioningState));
    }

    public BicepValue<EncryptionProperties> getEncryption() {
        return this.encryption;
    }

    public ConfigurationStoreProperties setEncryption(BicepValue<EncryptionProperties> encryption) {
        this.encryption.assign(encryption);
        return this;
    }
    public ConfigurationStoreProperties setEncryption(EncryptionProperties encryption) {
        return this.setEncryption(BicepValue.from(encryption));
    }

    public BicepList<PrivateEndpointConnectionReference> getPrivateEndpointConnections() {
        return this.privateEndpointConnections;
    }

    public ConfigurationStoreProperties setPrivateEndpointConnections(BicepList<PrivateEndpointConnectionReference> privateEndpointConnections) {
        this.privateEndpointConnections.assign(privateEndpointConnections);
        return this;
    }
    public ConfigurationStoreProperties setPrivateEndpointConnections(List<PrivateEndpointConnectionReference> privateEndpointConnections) {
        return this.setPrivateEndpointConnections(BicepList.from(privateEndpointConnections));
    }

    public BicepValue<CreateMode> getCreateMode() {
        return this.createMode;
    }

    public ConfigurationStoreProperties setCreateMode(BicepValue<CreateMode> createMode) {
        this.createMode.assign(createMode);
        return this;
    }
    public ConfigurationStoreProperties setCreateMode(CreateMode createMode) {
        return this.setCreateMode(BicepValue.from(createMode));
    }

    public BicepValue<PublicNetworkAccess> getPublicNetworkAccess() {
        return this.publicNetworkAccess;
    }

    public ConfigurationStoreProperties setPublicNetworkAccess(BicepValue<PublicNetworkAccess> publicNetworkAccess) {
        this.publicNetworkAccess.assign(publicNetworkAccess);
        return this;
    }
    public ConfigurationStoreProperties setPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        return this.setPublicNetworkAccess(BicepValue.from(publicNetworkAccess));
    }

    public BicepValue<OffsetDateTime> getCreationDate() {
        return this.creationDate;
    }

    public ConfigurationStoreProperties setCreationDate(BicepValue<OffsetDateTime> creationDate) {
        this.creationDate.assign(creationDate);
        return this;
    }
    public ConfigurationStoreProperties setCreationDate(OffsetDateTime creationDate) {
        return this.setCreationDate(BicepValue.from(creationDate));
    }

}
