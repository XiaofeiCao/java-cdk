// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated.models;

import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class ResourceAccessRule extends ProvisioningConstruct {

    private final BicepValue<String> resourceId;
    private final BicepValue<String> tenantId;

    public ResourceAccessRule() {
        resourceId = BicepValue.defineProperty(this, "resourceId", new String[] { "resourceId" }, null);
        tenantId = BicepValue.defineProperty(this, "tenantId", new String[] { "tenantId" }, null);
    }

    public BicepValue<String> getResourceId() {
        return this.resourceId;
    }

    public ResourceAccessRule setResourceId(BicepValue<String> resourceId) {
        this.resourceId.assign(resourceId);
        return this;
    }
    public ResourceAccessRule setResourceId(String resourceId) {
        return this.setResourceId(BicepValue.from(resourceId));
    }

    public BicepValue<String> getTenantId() {
        return this.tenantId;
    }

    public ResourceAccessRule setTenantId(BicepValue<String> tenantId) {
        this.tenantId.assign(tenantId);
        return this;
    }
    public ResourceAccessRule setTenantId(String tenantId) {
        return this.setTenantId(BicepValue.from(tenantId));
    }

}
