// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.keyvault.generated.models;

import com.azure.provisioning.keyvault.generated.models.MhsmPrivateEndpointConnectionProperties;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class MhsmPrivateEndpointConnectionItem extends ProvisioningConstruct {

    private final BicepValue<String> etag;
    private final BicepValue<String> id;
    private final BicepValue<MhsmPrivateEndpointConnectionProperties> properties;

    public MhsmPrivateEndpointConnectionItem() {
        etag = BicepValue.defineProperty(this, "etag", new String[] { "etag" }, null);
        id = BicepValue.defineProperty(this, "id", new String[] { "id" }, null);
        properties = BicepValue.defineProperty(this, "properties", new String[] { "properties" }, null);
    }

    public BicepValue<String> getEtag() {
        return this.etag;
    }

    public MhsmPrivateEndpointConnectionItem setEtag(BicepValue<String> etag) {
        this.etag.assign(etag);
        return this;
    }
    public MhsmPrivateEndpointConnectionItem setEtag(String etag) {
        return this.setEtag(BicepValue.from(etag));
    }

    public BicepValue<String> getId() {
        return this.id;
    }

    public MhsmPrivateEndpointConnectionItem setId(BicepValue<String> id) {
        this.id.assign(id);
        return this;
    }
    public MhsmPrivateEndpointConnectionItem setId(String id) {
        return this.setId(BicepValue.from(id));
    }

    public BicepValue<MhsmPrivateEndpointConnectionProperties> getProperties() {
        return this.properties;
    }

    public MhsmPrivateEndpointConnectionItem setProperties(BicepValue<MhsmPrivateEndpointConnectionProperties> properties) {
        this.properties.assign(properties);
        return this;
    }
    public MhsmPrivateEndpointConnectionItem setProperties(MhsmPrivateEndpointConnectionProperties properties) {
        return this.setProperties(BicepValue.from(properties));
    }

}
