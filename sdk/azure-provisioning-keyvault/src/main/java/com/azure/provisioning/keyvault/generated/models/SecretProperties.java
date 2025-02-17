// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.keyvault.generated.models;

import com.azure.provisioning.keyvault.generated.models.SecretAttributes;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class SecretProperties extends ProvisioningConstruct {

    private final BicepValue<String> contentType;
    private final BicepValue<String> value;
    private final BicepValue<SecretAttributes> attributes;
    private final BicepValue<String> secretUri;
    private final BicepValue<String> secretUriWithVersion;

    public SecretProperties() {
        contentType = BicepValue.defineProperty(this, "contentType", new String[] { "contentType" }, null);
        value = BicepValue.defineProperty(this, "value", new String[] { "value" }, null);
        attributes = BicepValue.defineProperty(this, "attributes", new String[] { "attributes" }, null);
        secretUri = BicepValue.defineProperty(this, "secretUri", new String[] { "secretUri" }, null);
        secretUriWithVersion = BicepValue.defineProperty(this, "secretUriWithVersion", new String[] { "secretUriWithVersion" }, null);
    }

    public BicepValue<String> getContentType() {
        return this.contentType;
    }

    public SecretProperties setContentType(BicepValue<String> contentType) {
        this.contentType.assign(contentType);
        return this;
    }
    public SecretProperties setContentType(String contentType) {
        return this.setContentType(BicepValue.from(contentType));
    }

    public BicepValue<String> getValue() {
        return this.value;
    }

    public SecretProperties setValue(BicepValue<String> value) {
        this.value.assign(value);
        return this;
    }
    public SecretProperties setValue(String value) {
        return this.setValue(BicepValue.from(value));
    }

    public BicepValue<SecretAttributes> getAttributes() {
        return this.attributes;
    }

    public SecretProperties setAttributes(BicepValue<SecretAttributes> attributes) {
        this.attributes.assign(attributes);
        return this;
    }
    public SecretProperties setAttributes(SecretAttributes attributes) {
        return this.setAttributes(BicepValue.from(attributes));
    }

    public BicepValue<String> getSecretUri() {
        return this.secretUri;
    }

    public SecretProperties setSecretUri(BicepValue<String> secretUri) {
        this.secretUri.assign(secretUri);
        return this;
    }
    public SecretProperties setSecretUri(String secretUri) {
        return this.setSecretUri(BicepValue.from(secretUri));
    }

    public BicepValue<String> getSecretUriWithVersion() {
        return this.secretUriWithVersion;
    }

    public SecretProperties setSecretUriWithVersion(BicepValue<String> secretUriWithVersion) {
        this.secretUriWithVersion.assign(secretUriWithVersion);
        return this;
    }
    public SecretProperties setSecretUriWithVersion(String secretUriWithVersion) {
        return this.setSecretUriWithVersion(BicepValue.from(secretUriWithVersion));
    }

}
