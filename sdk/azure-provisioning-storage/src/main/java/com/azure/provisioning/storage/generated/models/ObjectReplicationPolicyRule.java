// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated.models;

import com.azure.provisioning.storage.generated.models.ObjectReplicationPolicyFilter;
import com.azure.core.util.logging.ClientLogger;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class ObjectReplicationPolicyRule extends ProvisioningConstruct {

    private final BicepValue<String> sourceContainer;
    private final BicepValue<ClientLogger> lOGGER;
    private final BicepValue<String> destinationContainer;
    private final BicepValue<ObjectReplicationPolicyFilter> filters;
    private final BicepValue<String> ruleId;

    public ObjectReplicationPolicyRule() {
        sourceContainer = BicepValue.defineProperty(this, "sourceContainer", new String[] { "sourceContainer" }, null);
        lOGGER = BicepValue.defineProperty(this, "lOGGER", new String[] { "lOGGER" }, null);
        destinationContainer = BicepValue.defineProperty(this, "destinationContainer", new String[] { "destinationContainer" }, null);
        filters = BicepValue.defineProperty(this, "filters", new String[] { "filters" }, null);
        ruleId = BicepValue.defineProperty(this, "ruleId", new String[] { "ruleId" }, null);
    }

    public BicepValue<String> getSourceContainer() {
        return this.sourceContainer;
    }

    public ObjectReplicationPolicyRule setSourceContainer(BicepValue<String> sourceContainer) {
        this.sourceContainer.assign(sourceContainer);
        return this;
    }
    public ObjectReplicationPolicyRule setSourceContainer(String sourceContainer) {
        return this.setSourceContainer(BicepValue.from(sourceContainer));
    }

    public BicepValue<ClientLogger> getLOGGER() {
        return this.lOGGER;
    }

    public ObjectReplicationPolicyRule setLOGGER(BicepValue<ClientLogger> lOGGER) {
        this.lOGGER.assign(lOGGER);
        return this;
    }
    public ObjectReplicationPolicyRule setLOGGER(ClientLogger lOGGER) {
        return this.setLOGGER(BicepValue.from(lOGGER));
    }

    public BicepValue<String> getDestinationContainer() {
        return this.destinationContainer;
    }

    public ObjectReplicationPolicyRule setDestinationContainer(BicepValue<String> destinationContainer) {
        this.destinationContainer.assign(destinationContainer);
        return this;
    }
    public ObjectReplicationPolicyRule setDestinationContainer(String destinationContainer) {
        return this.setDestinationContainer(BicepValue.from(destinationContainer));
    }

    public BicepValue<ObjectReplicationPolicyFilter> getFilters() {
        return this.filters;
    }

    public ObjectReplicationPolicyRule setFilters(BicepValue<ObjectReplicationPolicyFilter> filters) {
        this.filters.assign(filters);
        return this;
    }
    public ObjectReplicationPolicyRule setFilters(ObjectReplicationPolicyFilter filters) {
        return this.setFilters(BicepValue.from(filters));
    }

    public BicepValue<String> getRuleId() {
        return this.ruleId;
    }

    public ObjectReplicationPolicyRule setRuleId(BicepValue<String> ruleId) {
        this.ruleId.assign(ruleId);
        return this;
    }
    public ObjectReplicationPolicyRule setRuleId(String ruleId) {
        return this.setRuleId(BicepValue.from(ruleId));
    }

}
