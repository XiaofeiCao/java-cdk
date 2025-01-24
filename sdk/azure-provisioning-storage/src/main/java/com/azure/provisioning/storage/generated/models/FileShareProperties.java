// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated.models;

import com.azure.provisioning.storage.generated.models.RootSquashType;
import com.azure.provisioning.storage.generated.models.LeaseStatus;
import com.azure.provisioning.storage.generated.models.EnabledProtocols;
import com.azure.provisioning.BicepList;
import java.util.List;
import java.time.OffsetDateTime;
import com.azure.provisioning.BicepDictionary;
import com.azure.provisioning.storage.generated.models.SignedIdentifier;
import com.azure.provisioning.storage.generated.models.LeaseDuration;
import java.util.Map;
import com.azure.provisioning.storage.generated.models.ShareAccessTier;
import com.azure.provisioning.storage.generated.models.LeaseState;
import java.lang.String;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class FileShareProperties extends ProvisioningConstruct {

    private final BicepValue<OffsetDateTime> accessTierChangeTime;
    private final BicepValue<Long> shareUsageBytes;
    private final BicepValue<Boolean> deleted;
    private final BicepValue<String> accessTierStatus;
    private final BicepValue<Integer> shareQuota;
    private final BicepValue<RootSquashType> rootSquash;
    private final BicepList<SignedIdentifier> signedIdentifiers;
    private final BicepValue<OffsetDateTime> snapshotTime;
    private final BicepValue<LeaseStatus> leaseStatus;
    private final BicepValue<OffsetDateTime> deletedTime;
    private final BicepDictionary<String> metadata;
    private final BicepValue<EnabledProtocols> enabledProtocols;
    private final BicepValue<LeaseDuration> leaseDuration;
    private final BicepValue<OffsetDateTime> lastModifiedTime;
    private final BicepValue<String> version;
    private final BicepValue<ShareAccessTier> accessTier;
    private final BicepValue<Integer> remainingRetentionDays;
    private final BicepValue<LeaseState> leaseState;

    public FileShareProperties() {
        accessTierChangeTime = BicepValue.defineProperty(this, "accessTierChangeTime", new String[] { "accessTierChangeTime" }, null);
        shareUsageBytes = BicepValue.defineProperty(this, "shareUsageBytes", new String[] { "shareUsageBytes" }, null);
        deleted = BicepValue.defineProperty(this, "deleted", new String[] { "deleted" }, null);
        accessTierStatus = BicepValue.defineProperty(this, "accessTierStatus", new String[] { "accessTierStatus" }, null);
        shareQuota = BicepValue.defineProperty(this, "shareQuota", new String[] { "shareQuota" }, null);
        rootSquash = BicepValue.defineProperty(this, "rootSquash", new String[] { "rootSquash" }, null);
        signedIdentifiers = BicepList.defineProperty(this, "signedIdentifiers", new String[] { "signedIdentifiers" }, false, false);
        snapshotTime = BicepValue.defineProperty(this, "snapshotTime", new String[] { "snapshotTime" }, null);
        leaseStatus = BicepValue.defineProperty(this, "leaseStatus", new String[] { "leaseStatus" }, null);
        deletedTime = BicepValue.defineProperty(this, "deletedTime", new String[] { "deletedTime" }, null);
        metadata = BicepDictionary.defineProperty(this, "metadata", new String[] { "metadata" }, false, false);
        enabledProtocols = BicepValue.defineProperty(this, "enabledProtocols", new String[] { "enabledProtocols" }, null);
        leaseDuration = BicepValue.defineProperty(this, "leaseDuration", new String[] { "leaseDuration" }, null);
        lastModifiedTime = BicepValue.defineProperty(this, "lastModifiedTime", new String[] { "lastModifiedTime" }, null);
        version = BicepValue.defineProperty(this, "version", new String[] { "version" }, null);
        accessTier = BicepValue.defineProperty(this, "accessTier", new String[] { "accessTier" }, null);
        remainingRetentionDays = BicepValue.defineProperty(this, "remainingRetentionDays", new String[] { "remainingRetentionDays" }, null);
        leaseState = BicepValue.defineProperty(this, "leaseState", new String[] { "leaseState" }, null);
    }

    public BicepValue<OffsetDateTime> getAccessTierChangeTime() {
        return this.accessTierChangeTime;
    }

    public FileShareProperties setAccessTierChangeTime(BicepValue<OffsetDateTime> accessTierChangeTime) {
        this.accessTierChangeTime.assign(accessTierChangeTime);
        return this;
    }
    public FileShareProperties setAccessTierChangeTime(OffsetDateTime accessTierChangeTime) {
        return this.setAccessTierChangeTime(BicepValue.from(accessTierChangeTime));
    }

    public BicepValue<Long> getShareUsageBytes() {
        return this.shareUsageBytes;
    }

    public FileShareProperties setShareUsageBytes(BicepValue<Long> shareUsageBytes) {
        this.shareUsageBytes.assign(shareUsageBytes);
        return this;
    }
    public FileShareProperties setShareUsageBytes(Long shareUsageBytes) {
        return this.setShareUsageBytes(BicepValue.from(shareUsageBytes));
    }

    public BicepValue<Boolean> getDeleted() {
        return this.deleted;
    }

    public FileShareProperties setDeleted(BicepValue<Boolean> deleted) {
        this.deleted.assign(deleted);
        return this;
    }
    public FileShareProperties setDeleted(Boolean deleted) {
        return this.setDeleted(BicepValue.from(deleted));
    }

    public BicepValue<String> getAccessTierStatus() {
        return this.accessTierStatus;
    }

    public FileShareProperties setAccessTierStatus(BicepValue<String> accessTierStatus) {
        this.accessTierStatus.assign(accessTierStatus);
        return this;
    }
    public FileShareProperties setAccessTierStatus(String accessTierStatus) {
        return this.setAccessTierStatus(BicepValue.from(accessTierStatus));
    }

    public BicepValue<Integer> getShareQuota() {
        return this.shareQuota;
    }

    public FileShareProperties setShareQuota(BicepValue<Integer> shareQuota) {
        this.shareQuota.assign(shareQuota);
        return this;
    }
    public FileShareProperties setShareQuota(Integer shareQuota) {
        return this.setShareQuota(BicepValue.from(shareQuota));
    }

    public BicepValue<RootSquashType> getRootSquash() {
        return this.rootSquash;
    }

    public FileShareProperties setRootSquash(BicepValue<RootSquashType> rootSquash) {
        this.rootSquash.assign(rootSquash);
        return this;
    }
    public FileShareProperties setRootSquash(RootSquashType rootSquash) {
        return this.setRootSquash(BicepValue.from(rootSquash));
    }

    public BicepList<SignedIdentifier> getSignedIdentifiers() {
        return this.signedIdentifiers;
    }

    public FileShareProperties setSignedIdentifiers(BicepList<SignedIdentifier> signedIdentifiers) {
        this.signedIdentifiers.assign(signedIdentifiers);
        return this;
    }
    public FileShareProperties setSignedIdentifiers(List<SignedIdentifier> signedIdentifiers) {
        return this.setSignedIdentifiers(BicepList.from(signedIdentifiers));
    }

    public BicepValue<OffsetDateTime> getSnapshotTime() {
        return this.snapshotTime;
    }

    public FileShareProperties setSnapshotTime(BicepValue<OffsetDateTime> snapshotTime) {
        this.snapshotTime.assign(snapshotTime);
        return this;
    }
    public FileShareProperties setSnapshotTime(OffsetDateTime snapshotTime) {
        return this.setSnapshotTime(BicepValue.from(snapshotTime));
    }

    public BicepValue<LeaseStatus> getLeaseStatus() {
        return this.leaseStatus;
    }

    public FileShareProperties setLeaseStatus(BicepValue<LeaseStatus> leaseStatus) {
        this.leaseStatus.assign(leaseStatus);
        return this;
    }
    public FileShareProperties setLeaseStatus(LeaseStatus leaseStatus) {
        return this.setLeaseStatus(BicepValue.from(leaseStatus));
    }

    public BicepValue<OffsetDateTime> getDeletedTime() {
        return this.deletedTime;
    }

    public FileShareProperties setDeletedTime(BicepValue<OffsetDateTime> deletedTime) {
        this.deletedTime.assign(deletedTime);
        return this;
    }
    public FileShareProperties setDeletedTime(OffsetDateTime deletedTime) {
        return this.setDeletedTime(BicepValue.from(deletedTime));
    }

    public BicepDictionary<String> getMetadata() {
        return this.metadata;
    }

    public FileShareProperties setMetadata(BicepDictionary<String> metadata) {
        this.metadata.assign(metadata);
        return this;
    }
    public FileShareProperties setMetadata(Map<String,String> metadata) {
        return this.setMetadata(BicepValue.from(metadata));
    }

    public BicepValue<EnabledProtocols> getEnabledProtocols() {
        return this.enabledProtocols;
    }

    public FileShareProperties setEnabledProtocols(BicepValue<EnabledProtocols> enabledProtocols) {
        this.enabledProtocols.assign(enabledProtocols);
        return this;
    }
    public FileShareProperties setEnabledProtocols(EnabledProtocols enabledProtocols) {
        return this.setEnabledProtocols(BicepValue.from(enabledProtocols));
    }

    public BicepValue<LeaseDuration> getLeaseDuration() {
        return this.leaseDuration;
    }

    public FileShareProperties setLeaseDuration(BicepValue<LeaseDuration> leaseDuration) {
        this.leaseDuration.assign(leaseDuration);
        return this;
    }
    public FileShareProperties setLeaseDuration(LeaseDuration leaseDuration) {
        return this.setLeaseDuration(BicepValue.from(leaseDuration));
    }

    public BicepValue<OffsetDateTime> getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    public FileShareProperties setLastModifiedTime(BicepValue<OffsetDateTime> lastModifiedTime) {
        this.lastModifiedTime.assign(lastModifiedTime);
        return this;
    }
    public FileShareProperties setLastModifiedTime(OffsetDateTime lastModifiedTime) {
        return this.setLastModifiedTime(BicepValue.from(lastModifiedTime));
    }

    public BicepValue<String> getVersion() {
        return this.version;
    }

    public FileShareProperties setVersion(BicepValue<String> version) {
        this.version.assign(version);
        return this;
    }
    public FileShareProperties setVersion(String version) {
        return this.setVersion(BicepValue.from(version));
    }

    public BicepValue<ShareAccessTier> getAccessTier() {
        return this.accessTier;
    }

    public FileShareProperties setAccessTier(BicepValue<ShareAccessTier> accessTier) {
        this.accessTier.assign(accessTier);
        return this;
    }
    public FileShareProperties setAccessTier(ShareAccessTier accessTier) {
        return this.setAccessTier(BicepValue.from(accessTier));
    }

    public BicepValue<Integer> getRemainingRetentionDays() {
        return this.remainingRetentionDays;
    }

    public FileShareProperties setRemainingRetentionDays(BicepValue<Integer> remainingRetentionDays) {
        this.remainingRetentionDays.assign(remainingRetentionDays);
        return this;
    }
    public FileShareProperties setRemainingRetentionDays(Integer remainingRetentionDays) {
        return this.setRemainingRetentionDays(BicepValue.from(remainingRetentionDays));
    }

    public BicepValue<LeaseState> getLeaseState() {
        return this.leaseState;
    }

    public FileShareProperties setLeaseState(BicepValue<LeaseState> leaseState) {
        this.leaseState.assign(leaseState);
        return this;
    }
    public FileShareProperties setLeaseState(LeaseState leaseState) {
        return this.setLeaseState(BicepValue.from(leaseState));
    }

}
