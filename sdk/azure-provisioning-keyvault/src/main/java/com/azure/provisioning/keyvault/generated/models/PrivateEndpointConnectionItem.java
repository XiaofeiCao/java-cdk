// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.keyvault.generated.models;

import com.azure.provisioning.keyvault.generated.models.PrivateEndpointConnectionProperties;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class PrivateEndpointConnectionItem extends ProvisioningConstruct {

    private final BicepValue<String> id;
    private final BicepValue<String> etag;
    private final BicepValue<PrivateEndpointConnectionProperties> properties;

    public PrivateEndpointConnectionItem() {
        id = BicepValue.defineProperty(this, "id", new String[] { "id" }, null);
        etag = BicepValue.defineProperty(this, "etag", new String[] { "etag" }, null);
        properties = BicepValue.defineProperty(this, "properties", new String[] { "properties" }, null);
    }

    public BicepValue<String> getId() {
        return this.id;
    }

    public PrivateEndpointConnectionItem setId(BicepValue<String> id) {
        this.id.assign(id);
        return this;
    }
    public PrivateEndpointConnectionItem setId(String id) {
        return this.setId(BicepValue.from(id));
    }

    public BicepValue<String> getEtag() {
        return this.etag;
    }

    public PrivateEndpointConnectionItem setEtag(BicepValue<String> etag) {
        this.etag.assign(etag);
        return this;
    }
    public PrivateEndpointConnectionItem setEtag(String etag) {
        return this.setEtag(BicepValue.from(etag));
    }

    public BicepValue<PrivateEndpointConnectionProperties> getProperties() {
        return this.properties;
    }

    public PrivateEndpointConnectionItem setProperties(BicepValue<PrivateEndpointConnectionProperties> properties) {
        this.properties.assign(properties);
        return this;
    }
    public PrivateEndpointConnectionItem setProperties(PrivateEndpointConnectionProperties properties) {
        return this.setProperties(BicepValue.from(properties));
    }

}
