// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.keyvault.generated.models;

import com.azure.provisioning.keyvault.generated.models.SecretAttributes;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class SecretProperties extends ProvisioningConstruct {

    private final BicepValue<String> value;
    private final BicepValue<String> secretUri;
    private final BicepValue<String> secretUriWithVersion;
    private final BicepValue<String> contentType;
    private final BicepValue<SecretAttributes> attributes;

    public SecretProperties() {
        value = BicepValue.defineProperty(this, "value", new String[] { "value" }, null);
        secretUri = BicepValue.defineProperty(this, "secretUri", new String[] { "secretUri" }, null);
        secretUriWithVersion = BicepValue.defineProperty(this, "secretUriWithVersion", new String[] { "secretUriWithVersion" }, null);
        contentType = BicepValue.defineProperty(this, "contentType", new String[] { "contentType" }, null);
        attributes = BicepValue.defineProperty(this, "attributes", new String[] { "attributes" }, null);
    }

    public BicepValue<String> getValue() {
        return this.value;
    }

    public SecretProperties setValue(BicepValue<String> value) {
        this.value.assign(value);
        return this;
    }
    public BicepValue<String> getSecretUri() {
        return this.secretUri;
    }

    public SecretProperties setSecretUri(BicepValue<String> secretUri) {
        this.secretUri.assign(secretUri);
        return this;
    }
    public BicepValue<String> getSecretUriWithVersion() {
        return this.secretUriWithVersion;
    }

    public SecretProperties setSecretUriWithVersion(BicepValue<String> secretUriWithVersion) {
        this.secretUriWithVersion.assign(secretUriWithVersion);
        return this;
    }
    public BicepValue<String> getContentType() {
        return this.contentType;
    }

    public SecretProperties setContentType(BicepValue<String> contentType) {
        this.contentType.assign(contentType);
        return this;
    }
    public BicepValue<SecretAttributes> getAttributes() {
        return this.attributes;
    }

    public SecretProperties setAttributes(BicepValue<SecretAttributes> attributes) {
        this.attributes.assign(attributes);
        return this;
    }
}
