// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated.models;

import java.util.List;
import com.azure.provisioning.storage.generated.models.SshPublicKey;
import com.azure.provisioning.storage.generated.models.PermissionScope;
import java.lang.Integer;
import com.azure.provisioning.BicepList;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class LocalUserProperties extends ProvisioningConstruct {

    private final BicepValue<Integer> groupId;
    private final BicepList<PermissionScope> permissionScopes;
    private final BicepList<Integer> extendedGroups;
    private final BicepValue<String> sid;
    private final BicepValue<Boolean> hasSharedKey;
    private final BicepValue<Integer> userId;
    private final BicepValue<Boolean> allowAclAuthorization;
    private final BicepList<SshPublicKey> sshAuthorizedKeys;
    private final BicepValue<String> homeDirectory;
    private final BicepValue<Boolean> hasSshKey;
    private final BicepValue<Boolean> hasSshPassword;
    private final BicepValue<Boolean> isNFSv3Enabled;

    public LocalUserProperties() {
        groupId = BicepValue.defineProperty(this, "groupId", new String[] { "groupId" }, null);
        permissionScopes = BicepList.defineProperty(this, "permissionScopes", new String[] { "permissionScopes" }, false, false);
        extendedGroups = BicepList.defineProperty(this, "extendedGroups", new String[] { "extendedGroups" }, false, false);
        sid = BicepValue.defineProperty(this, "sid", new String[] { "sid" }, null);
        hasSharedKey = BicepValue.defineProperty(this, "hasSharedKey", new String[] { "hasSharedKey" }, null);
        userId = BicepValue.defineProperty(this, "userId", new String[] { "userId" }, null);
        allowAclAuthorization = BicepValue.defineProperty(this, "allowAclAuthorization", new String[] { "allowAclAuthorization" }, null);
        sshAuthorizedKeys = BicepList.defineProperty(this, "sshAuthorizedKeys", new String[] { "sshAuthorizedKeys" }, false, false);
        homeDirectory = BicepValue.defineProperty(this, "homeDirectory", new String[] { "homeDirectory" }, null);
        hasSshKey = BicepValue.defineProperty(this, "hasSshKey", new String[] { "hasSshKey" }, null);
        hasSshPassword = BicepValue.defineProperty(this, "hasSshPassword", new String[] { "hasSshPassword" }, null);
        isNFSv3Enabled = BicepValue.defineProperty(this, "isNFSv3Enabled", new String[] { "isNFSv3Enabled" }, null);
    }

    public BicepValue<Integer> getGroupId() {
        return this.groupId;
    }

    public LocalUserProperties setGroupId(BicepValue<Integer> groupId) {
        this.groupId.assign(groupId);
        return this;
    }
    public BicepList<PermissionScope> getPermissionScopes() {
        return this.permissionScopes;
    }

    public LocalUserProperties setPermissionScopes(BicepList<PermissionScope> permissionScopes) {
        this.permissionScopes.assign(permissionScopes);
        return this;
    }
    public BicepList<Integer> getExtendedGroups() {
        return this.extendedGroups;
    }

    public LocalUserProperties setExtendedGroups(BicepList<Integer> extendedGroups) {
        this.extendedGroups.assign(extendedGroups);
        return this;
    }
    public BicepValue<String> getSid() {
        return this.sid;
    }

    public LocalUserProperties setSid(BicepValue<String> sid) {
        this.sid.assign(sid);
        return this;
    }
    public BicepValue<Boolean> getHasSharedKey() {
        return this.hasSharedKey;
    }

    public LocalUserProperties setHasSharedKey(BicepValue<Boolean> hasSharedKey) {
        this.hasSharedKey.assign(hasSharedKey);
        return this;
    }
    public BicepValue<Integer> getUserId() {
        return this.userId;
    }

    public LocalUserProperties setUserId(BicepValue<Integer> userId) {
        this.userId.assign(userId);
        return this;
    }
    public BicepValue<Boolean> getAllowAclAuthorization() {
        return this.allowAclAuthorization;
    }

    public LocalUserProperties setAllowAclAuthorization(BicepValue<Boolean> allowAclAuthorization) {
        this.allowAclAuthorization.assign(allowAclAuthorization);
        return this;
    }
    public BicepList<SshPublicKey> getSshAuthorizedKeys() {
        return this.sshAuthorizedKeys;
    }

    public LocalUserProperties setSshAuthorizedKeys(BicepList<SshPublicKey> sshAuthorizedKeys) {
        this.sshAuthorizedKeys.assign(sshAuthorizedKeys);
        return this;
    }
    public BicepValue<String> getHomeDirectory() {
        return this.homeDirectory;
    }

    public LocalUserProperties setHomeDirectory(BicepValue<String> homeDirectory) {
        this.homeDirectory.assign(homeDirectory);
        return this;
    }
    public BicepValue<Boolean> getHasSshKey() {
        return this.hasSshKey;
    }

    public LocalUserProperties setHasSshKey(BicepValue<Boolean> hasSshKey) {
        this.hasSshKey.assign(hasSshKey);
        return this;
    }
    public BicepValue<Boolean> getHasSshPassword() {
        return this.hasSshPassword;
    }

    public LocalUserProperties setHasSshPassword(BicepValue<Boolean> hasSshPassword) {
        this.hasSshPassword.assign(hasSshPassword);
        return this;
    }
    public BicepValue<Boolean> getIsNFSv3Enabled() {
        return this.isNFSv3Enabled;
    }

    public LocalUserProperties setIsNFSv3Enabled(BicepValue<Boolean> isNFSv3Enabled) {
        this.isNFSv3Enabled.assign(isNFSv3Enabled);
        return this;
    }
}
