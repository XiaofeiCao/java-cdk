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

    private final BicepValue<String> keyUri;
    private final BicepValue<RotationPolicy> rotationPolicy;
    private final BicepValue<JsonWebKeyCurveName> curveName;
    private final BicepValue<JsonWebKeyType> kty;
    private final BicepList<JsonWebKeyOperation> keyOps;
    private final BicepValue<KeyAttributes> attributes;
    private final BicepValue<Integer> keySize;
    private final BicepValue<String> keyUriWithVersion;
    private final BicepValue<KeyReleasePolicy> release_policy;

    public KeyProperties() {
        keyUri = BicepValue.defineProperty(this, "keyUri", new String[] { "keyUri" }, null);
        rotationPolicy = BicepValue.defineProperty(this, "rotationPolicy", new String[] { "rotationPolicy" }, null);
        curveName = BicepValue.defineProperty(this, "curveName", new String[] { "curveName" }, null);
        kty = BicepValue.defineProperty(this, "kty", new String[] { "kty" }, null);
        keyOps = BicepList.defineProperty(this, "keyOps", new String[] { "keyOps" }, false, false);
        attributes = BicepValue.defineProperty(this, "attributes", new String[] { "attributes" }, null);
        keySize = BicepValue.defineProperty(this, "keySize", new String[] { "keySize" }, null);
        keyUriWithVersion = BicepValue.defineProperty(this, "keyUriWithVersion", new String[] { "keyUriWithVersion" }, null);
        release_policy = BicepValue.defineProperty(this, "release_policy", new String[] { "release_policy" }, null);
    }

    public BicepValue<String> getKeyUri() {
        return this.keyUri;
    }

    public KeyProperties setKeyUri(BicepValue<String> keyUri) {
        this.keyUri.assign(keyUri);
        return this;
    }
    public KeyProperties setKeyUri(String keyUri) {
        return this.setKeyUri(BicepValue.from(keyUri));
    }

    public BicepValue<RotationPolicy> getRotationPolicy() {
        return this.rotationPolicy;
    }

    public KeyProperties setRotationPolicy(BicepValue<RotationPolicy> rotationPolicy) {
        this.rotationPolicy.assign(rotationPolicy);
        return this;
    }
    public KeyProperties setRotationPolicy(RotationPolicy rotationPolicy) {
        return this.setRotationPolicy(BicepValue.from(rotationPolicy));
    }

    public BicepValue<JsonWebKeyCurveName> getCurveName() {
        return this.curveName;
    }

    public KeyProperties setCurveName(BicepValue<JsonWebKeyCurveName> curveName) {
        this.curveName.assign(curveName);
        return this;
    }
    public KeyProperties setCurveName(JsonWebKeyCurveName curveName) {
        return this.setCurveName(BicepValue.from(curveName));
    }

    public BicepValue<JsonWebKeyType> getKty() {
        return this.kty;
    }

    public KeyProperties setKty(BicepValue<JsonWebKeyType> kty) {
        this.kty.assign(kty);
        return this;
    }
    public KeyProperties setKty(JsonWebKeyType kty) {
        return this.setKty(BicepValue.from(kty));
    }

    public BicepList<JsonWebKeyOperation> getKeyOps() {
        return this.keyOps;
    }

    public KeyProperties setKeyOps(BicepList<JsonWebKeyOperation> keyOps) {
        this.keyOps.assign(keyOps);
        return this;
    }
    public KeyProperties setKeyOps(List<JsonWebKeyOperation> keyOps) {
        return this.setKeyOps(BicepList.from(keyOps));
    }

    public BicepValue<KeyAttributes> getAttributes() {
        return this.attributes;
    }

    public KeyProperties setAttributes(BicepValue<KeyAttributes> attributes) {
        this.attributes.assign(attributes);
        return this;
    }
    public KeyProperties setAttributes(KeyAttributes attributes) {
        return this.setAttributes(BicepValue.from(attributes));
    }

    public BicepValue<Integer> getKeySize() {
        return this.keySize;
    }

    public KeyProperties setKeySize(BicepValue<Integer> keySize) {
        this.keySize.assign(keySize);
        return this;
    }
    public KeyProperties setKeySize(Integer keySize) {
        return this.setKeySize(BicepValue.from(keySize));
    }

    public BicepValue<String> getKeyUriWithVersion() {
        return this.keyUriWithVersion;
    }

    public KeyProperties setKeyUriWithVersion(BicepValue<String> keyUriWithVersion) {
        this.keyUriWithVersion.assign(keyUriWithVersion);
        return this;
    }
    public KeyProperties setKeyUriWithVersion(String keyUriWithVersion) {
        return this.setKeyUriWithVersion(BicepValue.from(keyUriWithVersion));
    }

    public BicepValue<KeyReleasePolicy> getReleasePolicy() {
        return this.release_policy;
    }

    public KeyProperties setReleasePolicy(BicepValue<KeyReleasePolicy> release_policy) {
        this.release_policy.assign(release_policy);
        return this;
    }
    public KeyProperties setReleasePolicy(KeyReleasePolicy release_policy) {
        return this.setReleasePolicy(BicepValue.from(release_policy));
    }

}
