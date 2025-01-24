// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated.models;

import com.azure.provisioning.storage.generated.models.BlobInventoryPolicyRule;
import java.util.List;
import com.azure.provisioning.storage.generated.models.InventoryRuleType;
import com.azure.core.util.logging.ClientLogger;
import com.azure.provisioning.BicepList;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class BlobInventoryPolicySchema extends ProvisioningConstruct {

    private final BicepValue<ClientLogger> lOGGER;
    private final BicepList<BlobInventoryPolicyRule> rules;
    private final BicepValue<String> destination;
    private final BicepValue<Boolean> enabled;
    private final BicepValue<InventoryRuleType> type;

    public BlobInventoryPolicySchema() {
        lOGGER = BicepValue.defineProperty(this, "lOGGER", new String[] { "lOGGER" }, null);
        rules = BicepList.defineProperty(this, "rules", new String[] { "rules" }, false, false);
        destination = BicepValue.defineProperty(this, "destination", new String[] { "destination" }, null);
        enabled = BicepValue.defineProperty(this, "enabled", new String[] { "enabled" }, null);
        type = BicepValue.defineProperty(this, "type", new String[] { "type" }, null);
    }

    public BicepValue<ClientLogger> getLOGGER() {
        return this.lOGGER;
    }

    public BlobInventoryPolicySchema setLOGGER(BicepValue<ClientLogger> lOGGER) {
        this.lOGGER.assign(lOGGER);
        return this;
    }
    public BlobInventoryPolicySchema setLOGGER(ClientLogger lOGGER) {
        return this.setLOGGER(BicepValue.from(lOGGER));
    }

    public BicepList<BlobInventoryPolicyRule> getRules() {
        return this.rules;
    }

    public BlobInventoryPolicySchema setRules(BicepList<BlobInventoryPolicyRule> rules) {
        this.rules.assign(rules);
        return this;
    }
    public BlobInventoryPolicySchema setRules(List<BlobInventoryPolicyRule> rules) {
        return this.setRules(BicepList.from(rules));
    }

    public BicepValue<String> getDestination() {
        return this.destination;
    }

    public BlobInventoryPolicySchema setDestination(BicepValue<String> destination) {
        this.destination.assign(destination);
        return this;
    }
    public BlobInventoryPolicySchema setDestination(String destination) {
        return this.setDestination(BicepValue.from(destination));
    }

    public BicepValue<Boolean> getEnabled() {
        return this.enabled;
    }

    public BlobInventoryPolicySchema setEnabled(BicepValue<Boolean> enabled) {
        this.enabled.assign(enabled);
        return this;
    }
    public BlobInventoryPolicySchema setEnabled(boolean enabled) {
        return this.setEnabled(BicepValue.from(enabled));
    }

    public BicepValue<InventoryRuleType> getType() {
        return this.type;
    }

    public BlobInventoryPolicySchema setType(BicepValue<InventoryRuleType> type) {
        this.type.assign(type);
        return this;
    }
    public BlobInventoryPolicySchema setType(InventoryRuleType type) {
        return this.setType(BicepValue.from(type));
    }

}
