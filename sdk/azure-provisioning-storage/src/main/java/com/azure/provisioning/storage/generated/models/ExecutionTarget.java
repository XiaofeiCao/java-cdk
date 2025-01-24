// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated.models;

import java.util.List;
import java.lang.String;
import com.azure.provisioning.BicepList;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class ExecutionTarget extends ProvisioningConstruct {

    private final BicepList<String> prefix;
    private final BicepList<String> excludePrefix;

    public ExecutionTarget() {
        prefix = BicepList.defineProperty(this, "prefix", new String[] { "prefix" }, false, false);
        excludePrefix = BicepList.defineProperty(this, "excludePrefix", new String[] { "excludePrefix" }, false, false);
    }

    public BicepList<String> getPrefix() {
        return this.prefix;
    }

    public ExecutionTarget setPrefix(BicepList<String> prefix) {
        this.prefix.assign(prefix);
        return this;
    }
    public ExecutionTarget setPrefix(List<String> prefix) {
        return this.setPrefix(BicepList.from(prefix));
    }

    public BicepList<String> getExcludePrefix() {
        return this.excludePrefix;
    }

    public ExecutionTarget setExcludePrefix(BicepList<String> excludePrefix) {
        this.excludePrefix.assign(excludePrefix);
        return this;
    }
    public ExecutionTarget setExcludePrefix(List<String> excludePrefix) {
        return this.setExcludePrefix(BicepList.from(excludePrefix));
    }

}
