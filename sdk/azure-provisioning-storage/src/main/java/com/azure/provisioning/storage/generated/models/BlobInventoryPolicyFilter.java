// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated.models;

import java.util.List;
import com.azure.provisioning.storage.generated.models.BlobInventoryCreationTime;
import java.lang.String;
import com.azure.provisioning.BicepList;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class BlobInventoryPolicyFilter extends ProvisioningConstruct {

    private final BicepValue<Boolean> includeBlobVersions;
    private final BicepValue<Boolean> includeDeleted;
    private final BicepValue<Boolean> includeSnapshots;
    private final BicepList<String> blobTypes;
    private final BicepList<String> prefixMatch;
    private final BicepValue<BlobInventoryCreationTime> creationTime;
    private final BicepList<String> excludePrefix;

    public BlobInventoryPolicyFilter() {
        includeBlobVersions = BicepValue.defineProperty(this, "includeBlobVersions", new String[] { "includeBlobVersions" }, null);
        includeDeleted = BicepValue.defineProperty(this, "includeDeleted", new String[] { "includeDeleted" }, null);
        includeSnapshots = BicepValue.defineProperty(this, "includeSnapshots", new String[] { "includeSnapshots" }, null);
        blobTypes = BicepList.defineProperty(this, "blobTypes", new String[] { "blobTypes" }, false, false);
        prefixMatch = BicepList.defineProperty(this, "prefixMatch", new String[] { "prefixMatch" }, false, false);
        creationTime = BicepValue.defineProperty(this, "creationTime", new String[] { "creationTime" }, null);
        excludePrefix = BicepList.defineProperty(this, "excludePrefix", new String[] { "excludePrefix" }, false, false);
    }

    public BicepValue<Boolean> getIncludeBlobVersions() {
        return this.includeBlobVersions;
    }

    public BlobInventoryPolicyFilter setIncludeBlobVersions(BicepValue<Boolean> includeBlobVersions) {
        this.includeBlobVersions.assign(includeBlobVersions);
        return this;
    }
    public BicepValue<Boolean> getIncludeDeleted() {
        return this.includeDeleted;
    }

    public BlobInventoryPolicyFilter setIncludeDeleted(BicepValue<Boolean> includeDeleted) {
        this.includeDeleted.assign(includeDeleted);
        return this;
    }
    public BicepValue<Boolean> getIncludeSnapshots() {
        return this.includeSnapshots;
    }

    public BlobInventoryPolicyFilter setIncludeSnapshots(BicepValue<Boolean> includeSnapshots) {
        this.includeSnapshots.assign(includeSnapshots);
        return this;
    }
    public BicepList<String> getBlobTypes() {
        return this.blobTypes;
    }

    public BlobInventoryPolicyFilter setBlobTypes(BicepList<String> blobTypes) {
        this.blobTypes.assign(blobTypes);
        return this;
    }
    public BicepList<String> getPrefixMatch() {
        return this.prefixMatch;
    }

    public BlobInventoryPolicyFilter setPrefixMatch(BicepList<String> prefixMatch) {
        this.prefixMatch.assign(prefixMatch);
        return this;
    }
    public BicepValue<BlobInventoryCreationTime> getCreationTime() {
        return this.creationTime;
    }

    public BlobInventoryPolicyFilter setCreationTime(BicepValue<BlobInventoryCreationTime> creationTime) {
        this.creationTime.assign(creationTime);
        return this;
    }
    public BicepList<String> getExcludePrefix() {
        return this.excludePrefix;
    }

    public BlobInventoryPolicyFilter setExcludePrefix(BicepList<String> excludePrefix) {
        this.excludePrefix.assign(excludePrefix);
        return this;
    }
}
