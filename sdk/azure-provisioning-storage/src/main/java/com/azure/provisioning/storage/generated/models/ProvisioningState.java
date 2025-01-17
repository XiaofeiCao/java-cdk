// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated.models;

public enum ProvisioningState {

    CREATING("Creating"),

    RESOLVING_DNS("ResolvingDNS"),

    SUCCEEDED("Succeeded"),

    VALIDATE_SUBSCRIPTION_QUOTA_BEGIN("ValidateSubscriptionQuotaBegin"),

    VALIDATE_SUBSCRIPTION_QUOTA_END("ValidateSubscriptionQuotaEnd"),

    DELETING("Deleting"),

    CANCELED("Canceled"),

    FAILED("Failed");
    private final String value;
    ProvisioningState(String value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return this.value;
    }
}
