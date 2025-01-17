// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.appconfiguration.generated;

import com.azure.provisioning.appconfiguration.generated.models.PrivateEndpointConnectionProperties;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.Resource;
import com.azure.provisioning.tmp.ResourceType;

public class PrivateEndpointConnectionResource extends Resource {

    private final BicepValue<PrivateEndpointConnectionProperties> properties;

    public PrivateEndpointConnectionResource(String identifierName) {
        this(identifierName, null);
    }

    public PrivateEndpointConnectionResource(String identifierName, String resourceVersion) {
        super(identifierName, new ResourceType("Microsoft.AppConfiguration/configurationStores/privateEndpointConnections"), resourceVersion);
        properties = BicepValue.defineProperty(this, "properties", new String[] { "properties" }, false, false, false, null);
    }

    public BicepValue<PrivateEndpointConnectionProperties> getProperties() {
        return this.properties;
    }

    public PrivateEndpointConnectionResource setProperties(BicepValue<PrivateEndpointConnectionProperties> properties) {
        this.properties.assign(properties);
        return this;
    }

    public PrivateEndpointConnectionResource setProperties(PrivateEndpointConnectionProperties properties) {
        return this.setProperties(BicepValue.from(properties));
    }

}
