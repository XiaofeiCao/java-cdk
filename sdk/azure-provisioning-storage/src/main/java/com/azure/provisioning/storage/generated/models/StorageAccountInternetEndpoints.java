// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated.models;

import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class StorageAccountInternetEndpoints extends ProvisioningConstruct {

    private final BicepValue<String> web;
    private final BicepValue<String> file;
    private final BicepValue<String> blob;
    private final BicepValue<String> dfs;

    public StorageAccountInternetEndpoints() {
        web = BicepValue.defineProperty(this, "web", new String[] { "web" }, null);
        file = BicepValue.defineProperty(this, "file", new String[] { "file" }, null);
        blob = BicepValue.defineProperty(this, "blob", new String[] { "blob" }, null);
        dfs = BicepValue.defineProperty(this, "dfs", new String[] { "dfs" }, null);
    }

    public BicepValue<String> getWeb() {
        return this.web;
    }

    public StorageAccountInternetEndpoints setWeb(BicepValue<String> web) {
        this.web.assign(web);
        return this;
    }
    public StorageAccountInternetEndpoints setWeb(String web) {
        return this.setWeb(BicepValue.from(web));
    }

    public BicepValue<String> getFile() {
        return this.file;
    }

    public StorageAccountInternetEndpoints setFile(BicepValue<String> file) {
        this.file.assign(file);
        return this;
    }
    public StorageAccountInternetEndpoints setFile(String file) {
        return this.setFile(BicepValue.from(file));
    }

    public BicepValue<String> getBlob() {
        return this.blob;
    }

    public StorageAccountInternetEndpoints setBlob(BicepValue<String> blob) {
        this.blob.assign(blob);
        return this;
    }
    public StorageAccountInternetEndpoints setBlob(String blob) {
        return this.setBlob(BicepValue.from(blob));
    }

    public BicepValue<String> getDfs() {
        return this.dfs;
    }

    public StorageAccountInternetEndpoints setDfs(BicepValue<String> dfs) {
        this.dfs.assign(dfs);
        return this;
    }
    public StorageAccountInternetEndpoints setDfs(String dfs) {
        return this.setDfs(BicepValue.from(dfs));
    }

}
