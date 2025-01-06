// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated.models;

import com.azure.provisioning.storage.generated.models.EncryptionService;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class EncryptionServices extends ProvisioningConstruct {

    private final BicepValue<EncryptionService> file;
    private final BicepValue<EncryptionService> blob;
    private final BicepValue<EncryptionService> table;
    private final BicepValue<EncryptionService> queue;

    public EncryptionServices() {
        file = BicepValue.defineProperty(this, "file", new String[] { "temp", "file" }, null);
        blob = BicepValue.defineProperty(this, "blob", new String[] { "temp", "blob" }, null);
        table = BicepValue.defineProperty(this, "table", new String[] { "temp", "table" }, null);
        queue = BicepValue.defineProperty(this, "queue", new String[] { "temp", "queue" }, null);
    }

    public BicepValue<EncryptionService> getFile() {
        return this.file;
    }

    public EncryptionServices setFile(BicepValue<EncryptionService> file) {
        this.file.assign(file);
        return this;
    }
    public BicepValue<EncryptionService> getBlob() {
        return this.blob;
    }

    public EncryptionServices setBlob(BicepValue<EncryptionService> blob) {
        this.blob.assign(blob);
        return this;
    }
    public BicepValue<EncryptionService> getTable() {
        return this.table;
    }

    public EncryptionServices setTable(BicepValue<EncryptionService> table) {
        this.table.assign(table);
        return this;
    }
    public BicepValue<EncryptionService> getQueue() {
        return this.queue;
    }

    public EncryptionServices setQueue(BicepValue<EncryptionService> queue) {
        this.queue.assign(queue);
        return this;
    }
}
