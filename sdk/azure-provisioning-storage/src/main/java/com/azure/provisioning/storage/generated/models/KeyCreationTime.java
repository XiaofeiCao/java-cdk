// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated.models;

import java.time.OffsetDateTime;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class KeyCreationTime extends ProvisioningConstruct {

    private final BicepValue<OffsetDateTime> key1;
    private final BicepValue<OffsetDateTime> key2;

    public KeyCreationTime() {
        key1 = BicepValue.defineProperty(this, "key1", new String[] { "key1" }, null);
        key2 = BicepValue.defineProperty(this, "key2", new String[] { "key2" }, null);
    }

    public BicepValue<OffsetDateTime> getKey1() {
        return this.key1;
    }

    public KeyCreationTime setKey1(BicepValue<OffsetDateTime> key1) {
        this.key1.assign(key1);
        return this;
    }
    public KeyCreationTime setKey1(OffsetDateTime key1) {
        return this.setKey1(BicepValue.from(key1));
    }

    public BicepValue<OffsetDateTime> getKey2() {
        return this.key2;
    }

    public KeyCreationTime setKey2(BicepValue<OffsetDateTime> key2) {
        this.key2.assign(key2);
        return this;
    }
    public KeyCreationTime setKey2(OffsetDateTime key2) {
        return this.setKey2(BicepValue.from(key2));
    }

}
