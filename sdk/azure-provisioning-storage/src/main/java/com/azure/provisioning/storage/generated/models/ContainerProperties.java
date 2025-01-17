// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated.models;

import com.azure.provisioning.storage.generated.models.LeaseStatus;
import java.time.OffsetDateTime;
import com.azure.provisioning.BicepDictionary;
import com.azure.provisioning.storage.generated.models.ImmutableStorageWithVersioning;
import com.azure.provisioning.storage.generated.models.PublicAccess;
import com.azure.provisioning.storage.generated.models.LeaseDuration;
import java.util.Map;
import com.azure.provisioning.storage.generated.models.LeaseState;
import java.lang.String;
import com.azure.provisioning.storage.generated.models.LegalHoldProperties;
import com.azure.provisioning.storage.generated.models.ImmutabilityPolicyProperties;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class ContainerProperties extends ProvisioningConstruct {

    private final BicepValue<LeaseState> leaseState;
    private final BicepValue<Boolean> denyEncryptionScopeOverride;
    private final BicepValue<Boolean> deleted;
    private final BicepValue<Boolean> enableNfsV3AllSquash;
    private final BicepValue<ImmutableStorageWithVersioning> immutableStorageWithVersioning;
    private final BicepValue<LeaseDuration> leaseDuration;
    private final BicepValue<Boolean> enableNfsV3RootSquash;
    private final BicepValue<Boolean> hasImmutabilityPolicy;
    private final BicepValue<OffsetDateTime> deletedTime;
    private final BicepDictionary<String> metadata;
    private final BicepValue<ImmutabilityPolicyProperties> immutabilityPolicy;
    private final BicepValue<Boolean> hasLegalHold;
    private final BicepValue<LegalHoldProperties> legalHold;
    private final BicepValue<String> defaultEncryptionScope;
    private final BicepValue<String> version;
    private final BicepValue<OffsetDateTime> lastModifiedTime;
    private final BicepValue<LeaseStatus> leaseStatus;
    private final BicepValue<Integer> remainingRetentionDays;
    private final BicepValue<PublicAccess> publicAccess;

    public ContainerProperties() {
        leaseState = BicepValue.defineProperty(this, "leaseState", new String[] { "leaseState" }, null);
        denyEncryptionScopeOverride = BicepValue.defineProperty(this, "denyEncryptionScopeOverride", new String[] { "denyEncryptionScopeOverride" }, null);
        deleted = BicepValue.defineProperty(this, "deleted", new String[] { "deleted" }, null);
        enableNfsV3AllSquash = BicepValue.defineProperty(this, "enableNfsV3AllSquash", new String[] { "enableNfsV3AllSquash" }, null);
        immutableStorageWithVersioning = BicepValue.defineProperty(this, "immutableStorageWithVersioning", new String[] { "immutableStorageWithVersioning" }, null);
        leaseDuration = BicepValue.defineProperty(this, "leaseDuration", new String[] { "leaseDuration" }, null);
        enableNfsV3RootSquash = BicepValue.defineProperty(this, "enableNfsV3RootSquash", new String[] { "enableNfsV3RootSquash" }, null);
        hasImmutabilityPolicy = BicepValue.defineProperty(this, "hasImmutabilityPolicy", new String[] { "hasImmutabilityPolicy" }, null);
        deletedTime = BicepValue.defineProperty(this, "deletedTime", new String[] { "deletedTime" }, null);
        metadata = BicepDictionary.defineProperty(this, "metadata", new String[] { "metadata" }, false, false);
        immutabilityPolicy = BicepValue.defineProperty(this, "immutabilityPolicy", new String[] { "immutabilityPolicy" }, null);
        hasLegalHold = BicepValue.defineProperty(this, "hasLegalHold", new String[] { "hasLegalHold" }, null);
        legalHold = BicepValue.defineProperty(this, "legalHold", new String[] { "legalHold" }, null);
        defaultEncryptionScope = BicepValue.defineProperty(this, "defaultEncryptionScope", new String[] { "defaultEncryptionScope" }, null);
        version = BicepValue.defineProperty(this, "version", new String[] { "version" }, null);
        lastModifiedTime = BicepValue.defineProperty(this, "lastModifiedTime", new String[] { "lastModifiedTime" }, null);
        leaseStatus = BicepValue.defineProperty(this, "leaseStatus", new String[] { "leaseStatus" }, null);
        remainingRetentionDays = BicepValue.defineProperty(this, "remainingRetentionDays", new String[] { "remainingRetentionDays" }, null);
        publicAccess = BicepValue.defineProperty(this, "publicAccess", new String[] { "publicAccess" }, null);
    }

    public BicepValue<LeaseState> getLeaseState() {
        return this.leaseState;
    }

    public ContainerProperties setLeaseState(BicepValue<LeaseState> leaseState) {
        this.leaseState.assign(leaseState);
        return this;
    }
    public BicepValue<Boolean> getDenyEncryptionScopeOverride() {
        return this.denyEncryptionScopeOverride;
    }

    public ContainerProperties setDenyEncryptionScopeOverride(BicepValue<Boolean> denyEncryptionScopeOverride) {
        this.denyEncryptionScopeOverride.assign(denyEncryptionScopeOverride);
        return this;
    }
    public BicepValue<Boolean> getDeleted() {
        return this.deleted;
    }

    public ContainerProperties setDeleted(BicepValue<Boolean> deleted) {
        this.deleted.assign(deleted);
        return this;
    }
    public BicepValue<Boolean> getEnableNfsV3AllSquash() {
        return this.enableNfsV3AllSquash;
    }

    public ContainerProperties setEnableNfsV3AllSquash(BicepValue<Boolean> enableNfsV3AllSquash) {
        this.enableNfsV3AllSquash.assign(enableNfsV3AllSquash);
        return this;
    }
    public BicepValue<ImmutableStorageWithVersioning> getImmutableStorageWithVersioning() {
        return this.immutableStorageWithVersioning;
    }

    public ContainerProperties setImmutableStorageWithVersioning(BicepValue<ImmutableStorageWithVersioning> immutableStorageWithVersioning) {
        this.immutableStorageWithVersioning.assign(immutableStorageWithVersioning);
        return this;
    }
    public BicepValue<LeaseDuration> getLeaseDuration() {
        return this.leaseDuration;
    }

    public ContainerProperties setLeaseDuration(BicepValue<LeaseDuration> leaseDuration) {
        this.leaseDuration.assign(leaseDuration);
        return this;
    }
    public BicepValue<Boolean> getEnableNfsV3RootSquash() {
        return this.enableNfsV3RootSquash;
    }

    public ContainerProperties setEnableNfsV3RootSquash(BicepValue<Boolean> enableNfsV3RootSquash) {
        this.enableNfsV3RootSquash.assign(enableNfsV3RootSquash);
        return this;
    }
    public BicepValue<Boolean> getHasImmutabilityPolicy() {
        return this.hasImmutabilityPolicy;
    }

    public ContainerProperties setHasImmutabilityPolicy(BicepValue<Boolean> hasImmutabilityPolicy) {
        this.hasImmutabilityPolicy.assign(hasImmutabilityPolicy);
        return this;
    }
    public BicepValue<OffsetDateTime> getDeletedTime() {
        return this.deletedTime;
    }

    public ContainerProperties setDeletedTime(BicepValue<OffsetDateTime> deletedTime) {
        this.deletedTime.assign(deletedTime);
        return this;
    }
    public BicepDictionary<String> getMetadata() {
        return this.metadata;
    }

    public ContainerProperties setMetadata(BicepDictionary<String> metadata) {
        this.metadata.assign(metadata);
        return this;
    }
    public BicepValue<ImmutabilityPolicyProperties> getImmutabilityPolicy() {
        return this.immutabilityPolicy;
    }

    public ContainerProperties setImmutabilityPolicy(BicepValue<ImmutabilityPolicyProperties> immutabilityPolicy) {
        this.immutabilityPolicy.assign(immutabilityPolicy);
        return this;
    }
    public BicepValue<Boolean> getHasLegalHold() {
        return this.hasLegalHold;
    }

    public ContainerProperties setHasLegalHold(BicepValue<Boolean> hasLegalHold) {
        this.hasLegalHold.assign(hasLegalHold);
        return this;
    }
    public BicepValue<LegalHoldProperties> getLegalHold() {
        return this.legalHold;
    }

    public ContainerProperties setLegalHold(BicepValue<LegalHoldProperties> legalHold) {
        this.legalHold.assign(legalHold);
        return this;
    }
    public BicepValue<String> getDefaultEncryptionScope() {
        return this.defaultEncryptionScope;
    }

    public ContainerProperties setDefaultEncryptionScope(BicepValue<String> defaultEncryptionScope) {
        this.defaultEncryptionScope.assign(defaultEncryptionScope);
        return this;
    }
    public BicepValue<String> getVersion() {
        return this.version;
    }

    public ContainerProperties setVersion(BicepValue<String> version) {
        this.version.assign(version);
        return this;
    }
    public BicepValue<OffsetDateTime> getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    public ContainerProperties setLastModifiedTime(BicepValue<OffsetDateTime> lastModifiedTime) {
        this.lastModifiedTime.assign(lastModifiedTime);
        return this;
    }
    public BicepValue<LeaseStatus> getLeaseStatus() {
        return this.leaseStatus;
    }

    public ContainerProperties setLeaseStatus(BicepValue<LeaseStatus> leaseStatus) {
        this.leaseStatus.assign(leaseStatus);
        return this;
    }
    public BicepValue<Integer> getRemainingRetentionDays() {
        return this.remainingRetentionDays;
    }

    public ContainerProperties setRemainingRetentionDays(BicepValue<Integer> remainingRetentionDays) {
        this.remainingRetentionDays.assign(remainingRetentionDays);
        return this;
    }
    public BicepValue<PublicAccess> getPublicAccess() {
        return this.publicAccess;
    }

    public ContainerProperties setPublicAccess(BicepValue<PublicAccess> publicAccess) {
        this.publicAccess.assign(publicAccess);
        return this;
    }
}
