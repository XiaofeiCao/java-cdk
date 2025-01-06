// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.keyvault.generated;

import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.Resource;
import com.azure.provisioning.tmp.ResourceType;

public class ManagedHsmKeyResource extends Resource {


    public ManagedHsmKeyResource(String identifierName) {
        this(identifierName, null);
    }

    public ManagedHsmKeyResource(String identifierName, String resourceVersion) {
        super(identifierName, new ResourceType("null"), resourceVersion);
    }

}
