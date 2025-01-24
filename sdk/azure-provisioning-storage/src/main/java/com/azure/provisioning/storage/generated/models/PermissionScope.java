// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated.models;

import com.azure.core.util.logging.ClientLogger;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class PermissionScope extends ProvisioningConstruct {

    private final BicepValue<ClientLogger> lOGGER;
    private final BicepValue<String> permissions;
    private final BicepValue<String> resourceName;
    private final BicepValue<String> service;

    public PermissionScope() {
        lOGGER = BicepValue.defineProperty(this, "lOGGER", new String[] { "lOGGER" }, null);
        permissions = BicepValue.defineProperty(this, "permissions", new String[] { "permissions" }, null);
        resourceName = BicepValue.defineProperty(this, "resourceName", new String[] { "resourceName" }, null);
        service = BicepValue.defineProperty(this, "service", new String[] { "service" }, null);
    }

    public BicepValue<ClientLogger> getLOGGER() {
        return this.lOGGER;
    }

    public PermissionScope setLOGGER(BicepValue<ClientLogger> lOGGER) {
        this.lOGGER.assign(lOGGER);
        return this;
    }
    public PermissionScope setLOGGER(ClientLogger lOGGER) {
        return this.setLOGGER(BicepValue.from(lOGGER));
    }

    public BicepValue<String> getPermissions() {
        return this.permissions;
    }

    public PermissionScope setPermissions(BicepValue<String> permissions) {
        this.permissions.assign(permissions);
        return this;
    }
    public PermissionScope setPermissions(String permissions) {
        return this.setPermissions(BicepValue.from(permissions));
    }

    public BicepValue<String> getResourceName() {
        return this.resourceName;
    }

    public PermissionScope setResourceName(BicepValue<String> resourceName) {
        this.resourceName.assign(resourceName);
        return this;
    }
    public PermissionScope setResourceName(String resourceName) {
        return this.setResourceName(BicepValue.from(resourceName));
    }

    public BicepValue<String> getService() {
        return this.service;
    }

    public PermissionScope setService(BicepValue<String> service) {
        this.service.assign(service);
        return this;
    }
    public PermissionScope setService(String service) {
        return this.setService(BicepValue.from(service));
    }

}
