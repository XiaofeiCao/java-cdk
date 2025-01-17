// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated.models;

import com.azure.provisioning.storage.generated.models.KeyType;
import java.time.OffsetDateTime;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class EncryptionService extends ProvisioningConstruct {

    private final BicepValue<Boolean> enabled;
    private final BicepValue<KeyType> keyType;
    private final BicepValue<OffsetDateTime> lastEnabledTime;

    public EncryptionService() {
        enabled = BicepValue.defineProperty(this, "enabled", new String[] { "enabled" }, null);
        keyType = BicepValue.defineProperty(this, "keyType", new String[] { "keyType" }, null);
        lastEnabledTime = BicepValue.defineProperty(this, "lastEnabledTime", new String[] { "lastEnabledTime" }, null);
    }

    public BicepValue<Boolean> getEnabled() {
        return this.enabled;
    }

    public EncryptionService setEnabled(BicepValue<Boolean> enabled) {
        this.enabled.assign(enabled);
        return this;
    }
    public BicepValue<KeyType> getKeyType() {
        return this.keyType;
    }

    public EncryptionService setKeyType(BicepValue<KeyType> keyType) {
        this.keyType.assign(keyType);
        return this;
    }
    public BicepValue<OffsetDateTime> getLastEnabledTime() {
        return this.lastEnabledTime;
    }

    public EncryptionService setLastEnabledTime(BicepValue<OffsetDateTime> lastEnabledTime) {
        this.lastEnabledTime.assign(lastEnabledTime);
        return this;
    }
}
