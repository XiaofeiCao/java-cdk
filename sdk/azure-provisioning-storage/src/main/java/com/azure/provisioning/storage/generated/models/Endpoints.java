// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated.models;

import com.azure.provisioning.storage.generated.models.StorageAccountMicrosoftEndpoints;
import com.azure.provisioning.storage.generated.models.StorageAccountInternetEndpoints;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class Endpoints extends ProvisioningConstruct {

    private final BicepValue<StorageAccountMicrosoftEndpoints> microsoftEndpoints;
    private final BicepValue<StorageAccountInternetEndpoints> internetEndpoints;
    private final BicepValue<String> web;
    private final BicepValue<String> file;
    private final BicepValue<String> queue;
    private final BicepValue<String> table;
    private final BicepValue<String> blob;
    private final BicepValue<String> dfs;

    public Endpoints() {
        microsoftEndpoints = BicepValue.defineProperty(this, "microsoftEndpoints", new String[] { "microsoftEndpoints" }, null);
        internetEndpoints = BicepValue.defineProperty(this, "internetEndpoints", new String[] { "internetEndpoints" }, null);
        web = BicepValue.defineProperty(this, "web", new String[] { "web" }, null);
        file = BicepValue.defineProperty(this, "file", new String[] { "file" }, null);
        queue = BicepValue.defineProperty(this, "queue", new String[] { "queue" }, null);
        table = BicepValue.defineProperty(this, "table", new String[] { "table" }, null);
        blob = BicepValue.defineProperty(this, "blob", new String[] { "blob" }, null);
        dfs = BicepValue.defineProperty(this, "dfs", new String[] { "dfs" }, null);
    }

    public BicepValue<StorageAccountMicrosoftEndpoints> getMicrosoftEndpoints() {
        return this.microsoftEndpoints;
    }

    public Endpoints setMicrosoftEndpoints(BicepValue<StorageAccountMicrosoftEndpoints> microsoftEndpoints) {
        this.microsoftEndpoints.assign(microsoftEndpoints);
        return this;
    }
    public Endpoints setMicrosoftEndpoints(StorageAccountMicrosoftEndpoints microsoftEndpoints) {
        return this.setMicrosoftEndpoints(BicepValue.from(microsoftEndpoints));
    }

    public BicepValue<StorageAccountInternetEndpoints> getInternetEndpoints() {
        return this.internetEndpoints;
    }

    public Endpoints setInternetEndpoints(BicepValue<StorageAccountInternetEndpoints> internetEndpoints) {
        this.internetEndpoints.assign(internetEndpoints);
        return this;
    }
    public Endpoints setInternetEndpoints(StorageAccountInternetEndpoints internetEndpoints) {
        return this.setInternetEndpoints(BicepValue.from(internetEndpoints));
    }

    public BicepValue<String> getWeb() {
        return this.web;
    }

    public Endpoints setWeb(BicepValue<String> web) {
        this.web.assign(web);
        return this;
    }
    public Endpoints setWeb(String web) {
        return this.setWeb(BicepValue.from(web));
    }

    public BicepValue<String> getFile() {
        return this.file;
    }

    public Endpoints setFile(BicepValue<String> file) {
        this.file.assign(file);
        return this;
    }
    public Endpoints setFile(String file) {
        return this.setFile(BicepValue.from(file));
    }

    public BicepValue<String> getQueue() {
        return this.queue;
    }

    public Endpoints setQueue(BicepValue<String> queue) {
        this.queue.assign(queue);
        return this;
    }
    public Endpoints setQueue(String queue) {
        return this.setQueue(BicepValue.from(queue));
    }

    public BicepValue<String> getTable() {
        return this.table;
    }

    public Endpoints setTable(BicepValue<String> table) {
        this.table.assign(table);
        return this;
    }
    public Endpoints setTable(String table) {
        return this.setTable(BicepValue.from(table));
    }

    public BicepValue<String> getBlob() {
        return this.blob;
    }

    public Endpoints setBlob(BicepValue<String> blob) {
        this.blob.assign(blob);
        return this;
    }
    public Endpoints setBlob(String blob) {
        return this.setBlob(BicepValue.from(blob));
    }

    public BicepValue<String> getDfs() {
        return this.dfs;
    }

    public Endpoints setDfs(BicepValue<String> dfs) {
        this.dfs.assign(dfs);
        return this;
    }
    public Endpoints setDfs(String dfs) {
        return this.setDfs(BicepValue.from(dfs));
    }

}
