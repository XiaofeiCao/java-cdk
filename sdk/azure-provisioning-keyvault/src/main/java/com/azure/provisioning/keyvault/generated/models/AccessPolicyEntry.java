// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.keyvault.generated.models;

import com.azure.core.util.logging.ClientLogger;
import com.azure.provisioning.keyvault.generated.models.Permissions;
import java.util.UUID;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class AccessPolicyEntry extends ProvisioningConstruct {

    private final BicepValue<ClientLogger> lOGGER;
    private final BicepValue<String> objectId;
    private final BicepValue<UUID> applicationId;
    private final BicepValue<UUID> tenantId;
    private final BicepValue<Permissions> permissions;

    public AccessPolicyEntry() {
        lOGGER = BicepValue.defineProperty(this, "lOGGER", new String[] { "lOGGER" }, null);
        objectId = BicepValue.defineProperty(this, "objectId", new String[] { "objectId" }, null);
        applicationId = BicepValue.defineProperty(this, "applicationId", new String[] { "applicationId" }, null);
        tenantId = BicepValue.defineProperty(this, "tenantId", new String[] { "tenantId" }, null);
        permissions = BicepValue.defineProperty(this, "permissions", new String[] { "permissions" }, null);
    }

    public BicepValue<ClientLogger> getLOGGER() {
        return this.lOGGER;
    }

    public AccessPolicyEntry setLOGGER(BicepValue<ClientLogger> lOGGER) {
        this.lOGGER.assign(lOGGER);
        return this;
    }
    public BicepValue<String> getObjectId() {
        return this.objectId;
    }

    public AccessPolicyEntry setObjectId(BicepValue<String> objectId) {
        this.objectId.assign(objectId);
        return this;
    }
    public BicepValue<UUID> getApplicationId() {
        return this.applicationId;
    }

    public AccessPolicyEntry setApplicationId(BicepValue<UUID> applicationId) {
        this.applicationId.assign(applicationId);
        return this;
    }
    public BicepValue<UUID> getTenantId() {
        return this.tenantId;
    }

    public AccessPolicyEntry setTenantId(BicepValue<UUID> tenantId) {
        this.tenantId.assign(tenantId);
        return this;
    }
    public BicepValue<Permissions> getPermissions() {
        return this.permissions;
    }

    public AccessPolicyEntry setPermissions(BicepValue<Permissions> permissions) {
        this.permissions.assign(permissions);
        return this;
    }
}
