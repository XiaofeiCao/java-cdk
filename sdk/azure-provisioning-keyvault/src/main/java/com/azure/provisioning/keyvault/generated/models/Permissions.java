// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.keyvault.generated.models;

import com.azure.provisioning.keyvault.generated.models.SecretPermissions;
import java.util.List;
import com.azure.provisioning.keyvault.generated.models.CertificatePermissions;
import com.azure.provisioning.keyvault.generated.models.KeyPermissions;
import com.azure.provisioning.keyvault.generated.models.StoragePermissions;
import com.azure.provisioning.BicepList;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class Permissions extends ProvisioningConstruct {

    private final BicepList<CertificatePermissions> certificates;
    private final BicepList<KeyPermissions> keys;
    private final BicepList<SecretPermissions> secrets;
    private final BicepList<StoragePermissions> storage;

    public Permissions() {
        certificates = BicepList.defineProperty(this, "certificates", new String[] { "certificates" }, false, false);
        keys = BicepList.defineProperty(this, "keys", new String[] { "keys" }, false, false);
        secrets = BicepList.defineProperty(this, "secrets", new String[] { "secrets" }, false, false);
        storage = BicepList.defineProperty(this, "storage", new String[] { "storage" }, false, false);
    }

    public BicepList<CertificatePermissions> getCertificates() {
        return this.certificates;
    }

    public Permissions setCertificates(BicepList<CertificatePermissions> certificates) {
        this.certificates.assign(certificates);
        return this;
    }
    public BicepList<KeyPermissions> getKeys() {
        return this.keys;
    }

    public Permissions setKeys(BicepList<KeyPermissions> keys) {
        this.keys.assign(keys);
        return this;
    }
    public BicepList<SecretPermissions> getSecrets() {
        return this.secrets;
    }

    public Permissions setSecrets(BicepList<SecretPermissions> secrets) {
        this.secrets.assign(secrets);
        return this;
    }
    public BicepList<StoragePermissions> getStorage() {
        return this.storage;
    }

    public Permissions setStorage(BicepList<StoragePermissions> storage) {
        this.storage.assign(storage);
        return this;
    }
}
