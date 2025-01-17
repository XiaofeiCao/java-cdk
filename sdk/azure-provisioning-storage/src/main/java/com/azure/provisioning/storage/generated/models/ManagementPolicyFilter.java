// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated.models;

import java.util.List;
import com.azure.core.util.logging.ClientLogger;
import com.azure.provisioning.storage.generated.models.TagFilter;
import java.lang.String;
import com.azure.provisioning.BicepList;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class ManagementPolicyFilter extends ProvisioningConstruct {

    private final BicepValue<ClientLogger> lOGGER;
    private final BicepList<TagFilter> blobIndexMatch;
    private final BicepList<String> prefixMatch;
    private final BicepList<String> blobTypes;

    public ManagementPolicyFilter() {
        lOGGER = BicepValue.defineProperty(this, "lOGGER", new String[] { "lOGGER" }, null);
        blobIndexMatch = BicepList.defineProperty(this, "blobIndexMatch", new String[] { "blobIndexMatch" }, false, false);
        prefixMatch = BicepList.defineProperty(this, "prefixMatch", new String[] { "prefixMatch" }, false, false);
        blobTypes = BicepList.defineProperty(this, "blobTypes", new String[] { "blobTypes" }, false, false);
    }

    public BicepValue<ClientLogger> getLOGGER() {
        return this.lOGGER;
    }

    public ManagementPolicyFilter setLOGGER(BicepValue<ClientLogger> lOGGER) {
        this.lOGGER.assign(lOGGER);
        return this;
    }
    public BicepList<TagFilter> getBlobIndexMatch() {
        return this.blobIndexMatch;
    }

    public ManagementPolicyFilter setBlobIndexMatch(BicepList<TagFilter> blobIndexMatch) {
        this.blobIndexMatch.assign(blobIndexMatch);
        return this;
    }
    public BicepList<String> getPrefixMatch() {
        return this.prefixMatch;
    }

    public ManagementPolicyFilter setPrefixMatch(BicepList<String> prefixMatch) {
        this.prefixMatch.assign(prefixMatch);
        return this;
    }
    public BicepList<String> getBlobTypes() {
        return this.blobTypes;
    }

    public ManagementPolicyFilter setBlobTypes(BicepList<String> blobTypes) {
        this.blobTypes.assign(blobTypes);
        return this;
    }
}
