// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated.models;

public enum DefaultSharePermission {

    NONE("None"),

    STORAGE_FILE_DATA_SMB_SHARE_READER("StorageFileDataSmbShareReader"),

    STORAGE_FILE_DATA_SMB_SHARE_CONTRIBUTOR("StorageFileDataSmbShareContributor"),

    STORAGE_FILE_DATA_SMB_SHARE_ELEVATED_CONTRIBUTOR("StorageFileDataSmbShareElevatedContributor");
    private final String value;
    DefaultSharePermission(String value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return this.value;
    }
}
