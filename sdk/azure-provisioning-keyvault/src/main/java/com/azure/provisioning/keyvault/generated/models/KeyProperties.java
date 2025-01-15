// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.keyvault.generated.models;

import com.azure.provisioning.keyvault.generated.models.JsonWebKeyType;
import java.util.List;
import com.azure.provisioning.keyvault.generated.models.JsonWebKeyCurveName;
import com.azure.provisioning.keyvault.generated.models.JsonWebKeyOperation;
import com.azure.provisioning.keyvault.generated.models.KeyAttributes;
import com.azure.provisioning.keyvault.generated.models.KeyReleasePolicy;
import com.azure.provisioning.keyvault.generated.models.RotationPolicy;
import com.azure.provisioning.BicepList;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class KeyProperties extends ProvisioningConstruct {

    private final BicepValue<KeyAttributes> attributes;
    private final BicepValue<String> keyUri;
    private final BicepValue<JsonWebKeyType> kty;
    private final BicepValue<Integer> keySize;
    private final BicepValue<JsonWebKeyCurveName> curveName;
    private final BicepValue<RotationPolicy> rotationPolicy;
    private final BicepValue<String> keyUriWithVersion;
    private final BicepList<JsonWebKeyOperation> keyOps;
    private final BicepValue<KeyReleasePolicy> releasePolicy;

    public KeyProperties() {
        attributes = BicepValue.defineProperty(this, "attributes", new String[] { "attributes" }, null);
        keyUri = BicepValue.defineProperty(this, "keyUri", new String[] { "keyUri" }, null);
        kty = BicepValue.defineProperty(this, "kty", new String[] { "kty" }, null);
        keySize = BicepValue.defineProperty(this, "keySize", new String[] { "keySize" }, null);
        curveName = BicepValue.defineProperty(this, "curveName", new String[] { "curveName" }, null);
        rotationPolicy = BicepValue.defineProperty(this, "rotationPolicy", new String[] { "rotationPolicy" }, null);
        keyUriWithVersion = BicepValue.defineProperty(this, "keyUriWithVersion", new String[] { "keyUriWithVersion" }, null);
        keyOps = BicepList.defineProperty(this, "keyOps", new String[] { "keyOps" }, false, false);
        releasePolicy = BicepValue.defineProperty(this, "releasePolicy", new String[] { "releasePolicy" }, null);
    }

    public BicepValue<KeyAttributes> getAttributes() {
        return this.attributes;
    }

    public KeyProperties setAttributes(BicepValue<KeyAttributes> attributes) {
        this.attributes.assign(attributes);
        return this;
    }
    public BicepValue<String> getKeyUri() {
        return this.keyUri;
    }

    public KeyProperties setKeyUri(BicepValue<String> keyUri) {
        this.keyUri.assign(keyUri);
        return this;
    }
    public BicepValue<JsonWebKeyType> getKty() {
        return this.kty;
    }

    public KeyProperties setKty(BicepValue<JsonWebKeyType> kty) {
        this.kty.assign(kty);
        return this;
    }
    public BicepValue<Integer> getKeySize() {
        return this.keySize;
    }

    public KeyProperties setKeySize(BicepValue<Integer> keySize) {
        this.keySize.assign(keySize);
        return this;
    }
    public BicepValue<JsonWebKeyCurveName> getCurveName() {
        return this.curveName;
    }

    public KeyProperties setCurveName(BicepValue<JsonWebKeyCurveName> curveName) {
        this.curveName.assign(curveName);
        return this;
    }
    public BicepValue<RotationPolicy> getRotationPolicy() {
        return this.rotationPolicy;
    }

    public KeyProperties setRotationPolicy(BicepValue<RotationPolicy> rotationPolicy) {
        this.rotationPolicy.assign(rotationPolicy);
        return this;
    }
    public BicepValue<String> getKeyUriWithVersion() {
        return this.keyUriWithVersion;
    }

    public KeyProperties setKeyUriWithVersion(BicepValue<String> keyUriWithVersion) {
        this.keyUriWithVersion.assign(keyUriWithVersion);
        return this;
    }
    public BicepList<JsonWebKeyOperation> getKeyOps() {
        return this.keyOps;
    }

    public KeyProperties setKeyOps(BicepList<JsonWebKeyOperation> keyOps) {
        this.keyOps.assign(keyOps);
        return this;
    }
    public BicepValue<KeyReleasePolicy> getReleasePolicy() {
        return this.releasePolicy;
    }

    public KeyProperties setReleasePolicy(BicepValue<KeyReleasePolicy> releasePolicy) {
        this.releasePolicy.assign(releasePolicy);
        return this;
    }
}
