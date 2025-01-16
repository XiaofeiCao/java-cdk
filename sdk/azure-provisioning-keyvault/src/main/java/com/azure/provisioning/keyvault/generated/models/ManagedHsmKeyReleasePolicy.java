// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.keyvault.generated.models;

import com.azure.core.util.Base64Url;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class ManagedHsmKeyReleasePolicy extends ProvisioningConstruct {

    private final BicepValue<Base64Url> data;
    private final BicepValue<byte[]> eMPTY_BYTE_ARRAY;
    private final BicepValue<String> contentType;

    public ManagedHsmKeyReleasePolicy() {
        data = BicepValue.defineProperty(this, "data", new String[] { "data" }, null);
        eMPTY_BYTE_ARRAY = BicepValue.defineProperty(this, "eMPTY_BYTE_ARRAY", new String[] { "eMPTY_BYTE_ARRAY" }, null);
        contentType = BicepValue.defineProperty(this, "contentType", new String[] { "contentType" }, null);
    }

    public BicepValue<Base64Url> getData() {
        return this.data;
    }

    public ManagedHsmKeyReleasePolicy setData(BicepValue<Base64Url> data) {
        this.data.assign(data);
        return this;
    }
    public BicepValue<byte[]> getEMPTYBYTEARRAY() {
        return this.eMPTY_BYTE_ARRAY;
    }

    public ManagedHsmKeyReleasePolicy setEMPTYBYTEARRAY(BicepValue<byte[]> eMPTY_BYTE_ARRAY) {
        this.eMPTY_BYTE_ARRAY.assign(eMPTY_BYTE_ARRAY);
        return this;
    }
    public BicepValue<String> getContentType() {
        return this.contentType;
    }

    public ManagedHsmKeyReleasePolicy setContentType(BicepValue<String> contentType) {
        this.contentType.assign(contentType);
        return this;
    }
}
