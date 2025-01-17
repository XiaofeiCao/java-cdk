// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated.models;

import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class EncryptionIdentity extends ProvisioningConstruct {

    private final BicepValue<String> encryptionUserAssignedIdentity;
    private final BicepValue<String> encryptionFederatedIdentityClientId;

    public EncryptionIdentity() {
        encryptionUserAssignedIdentity = BicepValue.defineProperty(this, "encryptionUserAssignedIdentity", new String[] { "encryptionUserAssignedIdentity" }, null);
        encryptionFederatedIdentityClientId = BicepValue.defineProperty(this, "encryptionFederatedIdentityClientId", new String[] { "encryptionFederatedIdentityClientId" }, null);
    }

    public BicepValue<String> getEncryptionUserAssignedIdentity() {
        return this.encryptionUserAssignedIdentity;
    }

    public EncryptionIdentity setEncryptionUserAssignedIdentity(BicepValue<String> encryptionUserAssignedIdentity) {
        this.encryptionUserAssignedIdentity.assign(encryptionUserAssignedIdentity);
        return this;
    }
    public BicepValue<String> getEncryptionFederatedIdentityClientId() {
        return this.encryptionFederatedIdentityClientId;
    }

    public EncryptionIdentity setEncryptionFederatedIdentityClientId(BicepValue<String> encryptionFederatedIdentityClientId) {
        this.encryptionFederatedIdentityClientId.assign(encryptionFederatedIdentityClientId);
        return this;
    }
}
