// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated.models;

import com.azure.provisioning.BicepDictionary;
import java.util.Map;
import java.lang.String;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class QueueProperties extends ProvisioningConstruct {

    private final BicepValue<Integer> approximateMessageCount;
    private final BicepDictionary<String> metadata;

    public QueueProperties() {
        approximateMessageCount = BicepValue.defineProperty(this, "approximateMessageCount", new String[] { "approximateMessageCount" }, null);
        metadata = BicepDictionary.defineProperty(this, "metadata", new String[] { "metadata" }, false, false);
    }

    public BicepValue<Integer> getApproximateMessageCount() {
        return this.approximateMessageCount;
    }

    public QueueProperties setApproximateMessageCount(BicepValue<Integer> approximateMessageCount) {
        this.approximateMessageCount.assign(approximateMessageCount);
        return this;
    }
    public QueueProperties setApproximateMessageCount(Integer approximateMessageCount) {
        return this.setApproximateMessageCount(BicepValue.from(approximateMessageCount));
    }

    public BicepDictionary<String> getMetadata() {
        return this.metadata;
    }

    public QueueProperties setMetadata(BicepDictionary<String> metadata) {
        this.metadata.assign(metadata);
        return this;
    }
    public QueueProperties setMetadata(Map<String,String> metadata) {
        return this.setMetadata(BicepValue.from(metadata));
    }

}
