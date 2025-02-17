// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.keyvault.generated.models;

import com.azure.core.util.Base64Url;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class KeyReleasePolicy extends ProvisioningConstruct {

    private final BicepValue<String> contentType;
    private final BicepValue<Base64Url> data;

    public KeyReleasePolicy() {
        contentType = BicepValue.defineProperty(this, "contentType", new String[] { "contentType" }, null);
        data = BicepValue.defineProperty(this, "data", new String[] { "data" }, null);
    }

    public BicepValue<String> getContentType() {
        return this.contentType;
    }

    public KeyReleasePolicy setContentType(BicepValue<String> contentType) {
        this.contentType.assign(contentType);
        return this;
    }
    public KeyReleasePolicy setContentType(String contentType) {
        return this.setContentType(BicepValue.from(contentType));
    }

    public BicepValue<Base64Url> getData() {
        return this.data;
    }

    public KeyReleasePolicy setData(BicepValue<Base64Url> data) {
        this.data.assign(data);
        return this;
    }
    public KeyReleasePolicy setData(Base64Url data) {
        return this.setData(BicepValue.from(data));
    }

}
