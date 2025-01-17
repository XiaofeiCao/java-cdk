// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated.models;

import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class StorageAccountMicrosoftEndpoints extends ProvisioningConstruct {

    private final BicepValue<String> web;
    private final BicepValue<String> file;
    private final BicepValue<String> queue;
    private final BicepValue<String> table;
    private final BicepValue<String> blob;
    private final BicepValue<String> dfs;

    public StorageAccountMicrosoftEndpoints() {
        web = BicepValue.defineProperty(this, "web", new String[] { "web" }, null);
        file = BicepValue.defineProperty(this, "file", new String[] { "file" }, null);
        queue = BicepValue.defineProperty(this, "queue", new String[] { "queue" }, null);
        table = BicepValue.defineProperty(this, "table", new String[] { "table" }, null);
        blob = BicepValue.defineProperty(this, "blob", new String[] { "blob" }, null);
        dfs = BicepValue.defineProperty(this, "dfs", new String[] { "dfs" }, null);
    }

    public BicepValue<String> getWeb() {
        return this.web;
    }

    public StorageAccountMicrosoftEndpoints setWeb(BicepValue<String> web) {
        this.web.assign(web);
        return this;
    }
    public BicepValue<String> getFile() {
        return this.file;
    }

    public StorageAccountMicrosoftEndpoints setFile(BicepValue<String> file) {
        this.file.assign(file);
        return this;
    }
    public BicepValue<String> getQueue() {
        return this.queue;
    }

    public StorageAccountMicrosoftEndpoints setQueue(BicepValue<String> queue) {
        this.queue.assign(queue);
        return this;
    }
    public BicepValue<String> getTable() {
        return this.table;
    }

    public StorageAccountMicrosoftEndpoints setTable(BicepValue<String> table) {
        this.table.assign(table);
        return this;
    }
    public BicepValue<String> getBlob() {
        return this.blob;
    }

    public StorageAccountMicrosoftEndpoints setBlob(BicepValue<String> blob) {
        this.blob.assign(blob);
        return this;
    }
    public BicepValue<String> getDfs() {
        return this.dfs;
    }

    public StorageAccountMicrosoftEndpoints setDfs(BicepValue<String> dfs) {
        this.dfs.assign(dfs);
        return this;
    }
}
