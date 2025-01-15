// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.keyvault.generated.models;

import java.util.List;
import com.azure.provisioning.keyvault.generated.models.JsonWebKeyType;
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
    private final BicepValue<ManagedHsmKeyAttributes> attributes;
    private final BicepValue<Integer> keySize;
    private final BicepValue<String> keyUri;
    private final BicepValue<ManagedHsmRotationPolicy> rotationPolicy;
    private final BicepList<JsonWebKeyOperation> keyOps;
    private final BicepValue<JsonWebKeyType> kty;
    private final BicepValue<String> keyUriWithVersion;
    private final BicepValue<JsonWebKeyCurveName> curveName;

    public ManagedHsmKeyProperties() {
        releasePolicy = BicepValue.defineProperty(this, "releasePolicy", new String[] { "releasePolicy" }, null);
        attributes = BicepValue.defineProperty(this, "attributes", new String[] { "attributes" }, null);
        keySize = BicepValue.defineProperty(this, "keySize", new String[] { "keySize" }, null);
        keyUri = BicepValue.defineProperty(this, "keyUri", new String[] { "keyUri" }, null);
        rotationPolicy = BicepValue.defineProperty(this, "rotationPolicy", new String[] { "rotationPolicy" }, null);
        keyOps = BicepList.defineProperty(this, "keyOps", new String[] { "keyOps" }, false, false);
        kty = BicepValue.defineProperty(this, "kty", new String[] { "kty" }, null);
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
    public BicepValue<ManagedHsmKeyAttributes> getAttributes() {
        return this.attributes;
    }

    public ManagedHsmKeyProperties setAttributes(BicepValue<ManagedHsmKeyAttributes> attributes) {
        this.attributes.assign(attributes);
        return this;
    }
    public BicepValue<Integer> getKeySize() {
        return this.keySize;
    }

    public ManagedHsmKeyProperties setKeySize(BicepValue<Integer> keySize) {
        this.keySize.assign(keySize);
        return this;
    }
    public BicepValue<String> getKeyUri() {
        return this.keyUri;
    }

    public ManagedHsmKeyProperties setKeyUri(BicepValue<String> keyUri) {
        this.keyUri.assign(keyUri);
        return this;
    }
    public BicepValue<ManagedHsmRotationPolicy> getRotationPolicy() {
        return this.rotationPolicy;
    }

    public ManagedHsmKeyProperties setRotationPolicy(BicepValue<ManagedHsmRotationPolicy> rotationPolicy) {
        this.rotationPolicy.assign(rotationPolicy);
        return this;
    }
    public BicepList<JsonWebKeyOperation> getKeyOps() {
        return this.keyOps;
    }

    public ManagedHsmKeyProperties setKeyOps(BicepList<JsonWebKeyOperation> keyOps) {
        this.keyOps.assign(keyOps);
        return this;
    }
    public BicepValue<JsonWebKeyType> getKty() {
        return this.kty;
    }

    public ManagedHsmKeyProperties setKty(BicepValue<JsonWebKeyType> kty) {
        this.kty.assign(kty);
        return this;
    }
    public BicepValue<String> getKeyUriWithVersion() {
        return this.keyUriWithVersion;
    }

    public ManagedHsmKeyProperties setKeyUriWithVersion(BicepValue<String> keyUriWithVersion) {
        this.keyUriWithVersion.assign(keyUriWithVersion);
        return this;
    }
    public BicepValue<JsonWebKeyCurveName> getCurveName() {
        return this.curveName;
    }

    public ManagedHsmKeyProperties setCurveName(BicepValue<JsonWebKeyCurveName> curveName) {
        this.curveName.assign(curveName);
        return this;
    }
}
