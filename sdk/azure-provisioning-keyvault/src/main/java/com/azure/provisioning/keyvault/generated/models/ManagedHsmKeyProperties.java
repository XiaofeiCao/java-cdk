// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.keyvault.generated.models;

import com.azure.provisioning.keyvault.generated.models.JsonWebKeyType;
import java.util.List;
import com.azure.provisioning.keyvault.generated.models.ManagedHsmRotationPolicy;
import com.azure.provisioning.keyvault.generated.models.JsonWebKeyCurveName;
import com.azure.provisioning.keyvault.generated.models.ManagedHsmKeyReleasePolicy;
import com.azure.provisioning.keyvault.generated.models.JsonWebKeyOperation;
import com.azure.provisioning.keyvault.generated.models.ManagedHsmKeyAttributes;
import com.azure.provisioning.BicepList;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class ManagedHsmKeyProperties extends ProvisioningConstruct {

    private final BicepValue<ManagedHsmKeyReleasePolicy> releasePolicy;
    private final BicepValue<String> keyUri;
    private final BicepValue<JsonWebKeyType> kty;
    private final BicepValue<Integer> keySize;
    private final BicepValue<ManagedHsmRotationPolicy> rotationPolicy;
    private final BicepValue<ManagedHsmKeyAttributes> attributes;
    private final BicepList<JsonWebKeyOperation> keyOps;
    private final BicepValue<String> keyUriWithVersion;
    private final BicepValue<JsonWebKeyCurveName> curveName;

    public ManagedHsmKeyProperties() {
        releasePolicy = BicepValue.defineProperty(this, "releasePolicy", new String[] { "releasePolicy" }, null);
        keyUri = BicepValue.defineProperty(this, "keyUri", new String[] { "keyUri" }, null);
        kty = BicepValue.defineProperty(this, "kty", new String[] { "kty" }, null);
        keySize = BicepValue.defineProperty(this, "keySize", new String[] { "keySize" }, null);
        rotationPolicy = BicepValue.defineProperty(this, "rotationPolicy", new String[] { "rotationPolicy" }, null);
        attributes = BicepValue.defineProperty(this, "attributes", new String[] { "attributes" }, null);
        keyOps = BicepList.defineProperty(this, "keyOps", new String[] { "keyOps" }, false, false);
        keyUriWithVersion = BicepValue.defineProperty(this, "keyUriWithVersion", new String[] { "keyUriWithVersion" }, null);
        curveName = BicepValue.defineProperty(this, "curveName", new String[] { "curveName" }, null);
    }

    public BicepValue<ManagedHsmKeyReleasePolicy> getReleasePolicy() {
        return this.releasePolicy;
    }

    public ManagedHsmKeyProperties setReleasePolicy(BicepValue<ManagedHsmKeyReleasePolicy> releasePolicy) {
        this.releasePolicy.assign(releasePolicy);
        return this;
    }
    public ManagedHsmKeyProperties setReleasePolicy(ManagedHsmKeyReleasePolicy releasePolicy) {
        return this.setReleasePolicy(BicepValue.from(releasePolicy));
    }

    public BicepValue<String> getKeyUri() {
        return this.keyUri;
    }

    public ManagedHsmKeyProperties setKeyUri(BicepValue<String> keyUri) {
        this.keyUri.assign(keyUri);
        return this;
    }
    public ManagedHsmKeyProperties setKeyUri(String keyUri) {
        return this.setKeyUri(BicepValue.from(keyUri));
    }

    public BicepValue<JsonWebKeyType> getKty() {
        return this.kty;
    }

    public ManagedHsmKeyProperties setKty(BicepValue<JsonWebKeyType> kty) {
        this.kty.assign(kty);
        return this;
    }
    public ManagedHsmKeyProperties setKty(JsonWebKeyType kty) {
        return this.setKty(BicepValue.from(kty));
    }

    public BicepValue<Integer> getKeySize() {
        return this.keySize;
    }

    public ManagedHsmKeyProperties setKeySize(BicepValue<Integer> keySize) {
        this.keySize.assign(keySize);
        return this;
    }
    public ManagedHsmKeyProperties setKeySize(Integer keySize) {
        return this.setKeySize(BicepValue.from(keySize));
    }

    public BicepValue<ManagedHsmRotationPolicy> getRotationPolicy() {
        return this.rotationPolicy;
    }

    public ManagedHsmKeyProperties setRotationPolicy(BicepValue<ManagedHsmRotationPolicy> rotationPolicy) {
        this.rotationPolicy.assign(rotationPolicy);
        return this;
    }
    public ManagedHsmKeyProperties setRotationPolicy(ManagedHsmRotationPolicy rotationPolicy) {
        return this.setRotationPolicy(BicepValue.from(rotationPolicy));
    }

    public BicepValue<ManagedHsmKeyAttributes> getAttributes() {
        return this.attributes;
    }

    public ManagedHsmKeyProperties setAttributes(BicepValue<ManagedHsmKeyAttributes> attributes) {
        this.attributes.assign(attributes);
        return this;
    }
    public ManagedHsmKeyProperties setAttributes(ManagedHsmKeyAttributes attributes) {
        return this.setAttributes(BicepValue.from(attributes));
    }

    public BicepList<JsonWebKeyOperation> getKeyOps() {
        return this.keyOps;
    }

    public ManagedHsmKeyProperties setKeyOps(BicepList<JsonWebKeyOperation> keyOps) {
        this.keyOps.assign(keyOps);
        return this;
    }
    public ManagedHsmKeyProperties setKeyOps(List<JsonWebKeyOperation> keyOps) {
        return this.setKeyOps(BicepList.from(keyOps));
    }

    public BicepValue<String> getKeyUriWithVersion() {
        return this.keyUriWithVersion;
    }

    public ManagedHsmKeyProperties setKeyUriWithVersion(BicepValue<String> keyUriWithVersion) {
        this.keyUriWithVersion.assign(keyUriWithVersion);
        return this;
    }
    public ManagedHsmKeyProperties setKeyUriWithVersion(String keyUriWithVersion) {
        return this.setKeyUriWithVersion(BicepValue.from(keyUriWithVersion));
    }

    public BicepValue<JsonWebKeyCurveName> getCurveName() {
        return this.curveName;
    }

    public ManagedHsmKeyProperties setCurveName(BicepValue<JsonWebKeyCurveName> curveName) {
        this.curveName.assign(curveName);
        return this;
    }
    public ManagedHsmKeyProperties setCurveName(JsonWebKeyCurveName curveName) {
        return this.setCurveName(BicepValue.from(curveName));
    }

}
