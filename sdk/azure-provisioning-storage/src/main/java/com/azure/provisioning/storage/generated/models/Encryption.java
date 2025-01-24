// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated.models;

import com.azure.provisioning.storage.generated.models.EncryptionServices;
import java.time.OffsetDateTime;
import com.azure.provisioning.storage.generated.models.EncryptionIdentity;
import com.azure.provisioning.storage.generated.models.KeySource;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class Encryption extends ProvisioningConstruct {

    private final BicepValue<String> currentVersionedKeyIdentifier;
    private final BicepValue<KeySource> keySource;
    private final BicepValue<String> keyVersion;
    private final BicepValue<String> keyVaultUri;
    private final BicepValue<Boolean> requireInfrastructureEncryption;
    private final BicepValue<EncryptionIdentity> encryptionIdentity;
    private final BicepValue<OffsetDateTime> lastKeyRotationTimestamp;
    private final BicepValue<String> keyName;
    private final BicepValue<OffsetDateTime> currentVersionedKeyExpirationTimestamp;
    private final BicepValue<EncryptionServices> services;

    public Encryption() {
        currentVersionedKeyIdentifier = BicepValue.defineProperty(this, "currentVersionedKeyIdentifier", new String[] { "currentVersionedKeyIdentifier" }, null);
        keySource = BicepValue.defineProperty(this, "keySource", new String[] { "keySource" }, null);
        keyVersion = BicepValue.defineProperty(this, "keyVersion", new String[] { "keyVersion" }, null);
        keyVaultUri = BicepValue.defineProperty(this, "keyVaultUri", new String[] { "keyVaultUri" }, null);
        requireInfrastructureEncryption = BicepValue.defineProperty(this, "requireInfrastructureEncryption", new String[] { "requireInfrastructureEncryption" }, null);
        encryptionIdentity = BicepValue.defineProperty(this, "encryptionIdentity", new String[] { "encryptionIdentity" }, null);
        lastKeyRotationTimestamp = BicepValue.defineProperty(this, "lastKeyRotationTimestamp", new String[] { "lastKeyRotationTimestamp" }, null);
        keyName = BicepValue.defineProperty(this, "keyName", new String[] { "keyName" }, null);
        currentVersionedKeyExpirationTimestamp = BicepValue.defineProperty(this, "currentVersionedKeyExpirationTimestamp", new String[] { "currentVersionedKeyExpirationTimestamp" }, null);
        services = BicepValue.defineProperty(this, "services", new String[] { "services" }, null);
    }

    public BicepValue<String> getCurrentVersionedKeyIdentifier() {
        return this.currentVersionedKeyIdentifier;
    }

    public Encryption setCurrentVersionedKeyIdentifier(BicepValue<String> currentVersionedKeyIdentifier) {
        this.currentVersionedKeyIdentifier.assign(currentVersionedKeyIdentifier);
        return this;
    }
    public Encryption setCurrentVersionedKeyIdentifier(String currentVersionedKeyIdentifier) {
        return this.setCurrentVersionedKeyIdentifier(BicepValue.from(currentVersionedKeyIdentifier));
    }

    public BicepValue<KeySource> getKeySource() {
        return this.keySource;
    }

    public Encryption setKeySource(BicepValue<KeySource> keySource) {
        this.keySource.assign(keySource);
        return this;
    }
    public Encryption setKeySource(KeySource keySource) {
        return this.setKeySource(BicepValue.from(keySource));
    }

    public BicepValue<String> getKeyVersion() {
        return this.keyVersion;
    }

    public Encryption setKeyVersion(BicepValue<String> keyVersion) {
        this.keyVersion.assign(keyVersion);
        return this;
    }
    public Encryption setKeyVersion(String keyVersion) {
        return this.setKeyVersion(BicepValue.from(keyVersion));
    }

    public BicepValue<String> getKeyVaultUri() {
        return this.keyVaultUri;
    }

    public Encryption setKeyVaultUri(BicepValue<String> keyVaultUri) {
        this.keyVaultUri.assign(keyVaultUri);
        return this;
    }
    public Encryption setKeyVaultUri(String keyVaultUri) {
        return this.setKeyVaultUri(BicepValue.from(keyVaultUri));
    }

    public BicepValue<Boolean> getRequireInfrastructureEncryption() {
        return this.requireInfrastructureEncryption;
    }

    public Encryption setRequireInfrastructureEncryption(BicepValue<Boolean> requireInfrastructureEncryption) {
        this.requireInfrastructureEncryption.assign(requireInfrastructureEncryption);
        return this;
    }
    public Encryption setRequireInfrastructureEncryption(Boolean requireInfrastructureEncryption) {
        return this.setRequireInfrastructureEncryption(BicepValue.from(requireInfrastructureEncryption));
    }

    public BicepValue<EncryptionIdentity> getEncryptionIdentity() {
        return this.encryptionIdentity;
    }

    public Encryption setEncryptionIdentity(BicepValue<EncryptionIdentity> encryptionIdentity) {
        this.encryptionIdentity.assign(encryptionIdentity);
        return this;
    }
    public Encryption setEncryptionIdentity(EncryptionIdentity encryptionIdentity) {
        return this.setEncryptionIdentity(BicepValue.from(encryptionIdentity));
    }

    public BicepValue<OffsetDateTime> getLastKeyRotationTimestamp() {
        return this.lastKeyRotationTimestamp;
    }

    public Encryption setLastKeyRotationTimestamp(BicepValue<OffsetDateTime> lastKeyRotationTimestamp) {
        this.lastKeyRotationTimestamp.assign(lastKeyRotationTimestamp);
        return this;
    }
    public Encryption setLastKeyRotationTimestamp(OffsetDateTime lastKeyRotationTimestamp) {
        return this.setLastKeyRotationTimestamp(BicepValue.from(lastKeyRotationTimestamp));
    }

    public BicepValue<String> getKeyName() {
        return this.keyName;
    }

    public Encryption setKeyName(BicepValue<String> keyName) {
        this.keyName.assign(keyName);
        return this;
    }
    public Encryption setKeyName(String keyName) {
        return this.setKeyName(BicepValue.from(keyName));
    }

    public BicepValue<OffsetDateTime> getCurrentVersionedKeyExpirationTimestamp() {
        return this.currentVersionedKeyExpirationTimestamp;
    }

    public Encryption setCurrentVersionedKeyExpirationTimestamp(BicepValue<OffsetDateTime> currentVersionedKeyExpirationTimestamp) {
        this.currentVersionedKeyExpirationTimestamp.assign(currentVersionedKeyExpirationTimestamp);
        return this;
    }
    public Encryption setCurrentVersionedKeyExpirationTimestamp(OffsetDateTime currentVersionedKeyExpirationTimestamp) {
        return this.setCurrentVersionedKeyExpirationTimestamp(BicepValue.from(currentVersionedKeyExpirationTimestamp));
    }

    public BicepValue<EncryptionServices> getServices() {
        return this.services;
    }

    public Encryption setServices(BicepValue<EncryptionServices> services) {
        this.services.assign(services);
        return this;
    }
    public Encryption setServices(EncryptionServices services) {
        return this.setServices(BicepValue.from(services));
    }

}
