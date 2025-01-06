// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.keyvault.generated;

import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.Resource;
import com.azure.provisioning.tmp.ResourceType;

public class KeyResource extends Resource {


    public KeyResource(String identifierName) {
        this(identifierName, null);
    }

    public KeyResource(String identifierName, String resourceVersion) {
        super(identifierName, new ResourceType("null"), resourceVersion);
    }

}
