// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated.models;

import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class ResourceAccessRule extends ProvisioningConstruct {

    private final BicepValue<String> tenantId;
    private final BicepValue<String> resourceId;

    public ResourceAccessRule() {
        tenantId = BicepValue.defineProperty(this, "tenantId", new String[] { "temp", "tenantId" }, null);
        resourceId = BicepValue.defineProperty(this, "resourceId", new String[] { "temp", "resourceId" }, null);
    }

    public BicepValue<String> getTenantId() {
        return this.tenantId;
    }

    public ResourceAccessRule setTenantId(BicepValue<String> tenantId) {
        this.tenantId.assign(tenantId);
        return this;
    }
    public BicepValue<String> getResourceId() {
        return this.resourceId;
    }

    public ResourceAccessRule setResourceId(BicepValue<String> resourceId) {
        this.resourceId.assign(resourceId);
        return this;
    }
}
