// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated.models;

import java.util.List;
import java.lang.String;
import com.azure.provisioning.BicepList;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class ObjectReplicationPolicyFilter extends ProvisioningConstruct {

    private final BicepValue<String> minCreationTime;
    private final BicepList<String> prefixMatch;

    public ObjectReplicationPolicyFilter() {
        minCreationTime = BicepValue.defineProperty(this, "minCreationTime", new String[] { "minCreationTime" }, null);
        prefixMatch = BicepList.defineProperty(this, "prefixMatch", new String[] { "prefixMatch" }, false, false);
    }

    public BicepValue<String> getMinCreationTime() {
        return this.minCreationTime;
    }

    public ObjectReplicationPolicyFilter setMinCreationTime(BicepValue<String> minCreationTime) {
        this.minCreationTime.assign(minCreationTime);
        return this;
    }
    public BicepList<String> getPrefixMatch() {
        return this.prefixMatch;
    }

    public ObjectReplicationPolicyFilter setPrefixMatch(BicepList<String> prefixMatch) {
        this.prefixMatch.assign(prefixMatch);
        return this;
    }
}
