// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.keyvault.generated.models;

import java.util.List;
import com.azure.provisioning.keyvault.generated.models.JsonWebKeyType;
import com.azure.provisioning.keyvault.generated.models.JsonWebKeyCurveName;
import com.azure.provisioning.keyvault.generated.models.ManagedHsmRotationPolicy;
import com.azure.provisioning.keyvault.generated.models.JsonWebKeyOperation;
import com.azure.provisioning.keyvault.generated.models.ManagedHsmKeyReleasePolicy;
import com.azure.provisioning.BicepList;
import com.azure.provisioning.keyvault.generated.models.ManagedHsmKeyAttributes;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class ManagedHsmKeyProperties extends ProvisioningConstruct {

    private final BicepList<JsonWebKeyOperation> keyOps;
    private final BicepValue<JsonWebKeyCurveName> curveName;
    private final BicepValue<JsonWebKeyType> kty;
    private final BicepValue<String> keyUriWithVersion;
    private final BicepValue<ManagedHsmRotationPolicy> rotationPolicy;
    private final BicepValue<Integer> keySize;
    private final BicepValue<ManagedHsmKeyAttributes> attributes;
    private final BicepValue<String> keyUri;
    private final BicepValue<ManagedHsmKeyReleasePolicy> release_policy;

    public ManagedHsmKeyProperties() {
        keyOps = BicepList.defineProperty(this, "keyOps", new String[] { "keyOps" }, false, false);
        curveName = BicepValue.defineProperty(this, "curveName", new String[] { "curveName" }, null);
        kty = BicepValue.defineProperty(this, "kty", new String[] { "kty" }, null);
        keyUriWithVersion = BicepValue.defineProperty(this, "keyUriWithVersion", new String[] { "keyUriWithVersion" }, null);
        rotationPolicy = BicepValue.defineProperty(this, "rotationPolicy", new String[] { "rotationPolicy" }, null);
        keySize = BicepValue.defineProperty(this, "keySize", new String[] { "keySize" }, null);
        attributes = BicepValue.defineProperty(this, "attributes", new String[] { "attributes" }, null);
        keyUri = BicepValue.defineProperty(this, "keyUri", new String[] { "keyUri" }, null);
        release_policy = BicepValue.defineProperty(this, "release_policy", new String[] { "release_policy" }, null);
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

    public BicepValue<ManagedHsmKeyReleasePolicy> getReleasePolicy() {
        return this.release_policy;
    }

    public ManagedHsmKeyProperties setReleasePolicy(BicepValue<ManagedHsmKeyReleasePolicy> release_policy) {
        this.release_policy.assign(release_policy);
        return this;
    }
    public ManagedHsmKeyProperties setReleasePolicy(ManagedHsmKeyReleasePolicy release_policy) {
        return this.setReleasePolicy(BicepValue.from(release_policy));
    }

}
