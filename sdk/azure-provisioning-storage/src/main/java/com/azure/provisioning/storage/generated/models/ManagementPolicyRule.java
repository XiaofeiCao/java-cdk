// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated.models;

import com.azure.core.util.logging.ClientLogger;
import com.azure.provisioning.storage.generated.models.RuleType;
import com.azure.provisioning.storage.generated.models.ManagementPolicyDefinition;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class ManagementPolicyRule extends ProvisioningConstruct {

    private final BicepValue<Boolean> enabled;
    private final BicepValue<ManagementPolicyDefinition> definition;
    private final BicepValue<ClientLogger> lOGGER;
    private final BicepValue<String> name;
    private final BicepValue<RuleType> type;

    public ManagementPolicyRule() {
        enabled = BicepValue.defineProperty(this, "enabled", new String[] { "enabled" }, null);
        definition = BicepValue.defineProperty(this, "definition", new String[] { "definition" }, null);
        lOGGER = BicepValue.defineProperty(this, "lOGGER", new String[] { "lOGGER" }, null);
        name = BicepValue.defineProperty(this, "name", new String[] { "name" }, null);
        type = BicepValue.defineProperty(this, "type", new String[] { "type" }, null);
    }

    public BicepValue<Boolean> getEnabled() {
        return this.enabled;
    }

    public ManagementPolicyRule setEnabled(BicepValue<Boolean> enabled) {
        this.enabled.assign(enabled);
        return this;
    }
    public ManagementPolicyRule setEnabled(Boolean enabled) {
        return this.setEnabled(BicepValue.from(enabled));
    }

    public BicepValue<ManagementPolicyDefinition> getDefinition() {
        return this.definition;
    }

    public ManagementPolicyRule setDefinition(BicepValue<ManagementPolicyDefinition> definition) {
        this.definition.assign(definition);
        return this;
    }
    public ManagementPolicyRule setDefinition(ManagementPolicyDefinition definition) {
        return this.setDefinition(BicepValue.from(definition));
    }

    public BicepValue<ClientLogger> getLOGGER() {
        return this.lOGGER;
    }

    public ManagementPolicyRule setLOGGER(BicepValue<ClientLogger> lOGGER) {
        this.lOGGER.assign(lOGGER);
        return this;
    }
    public ManagementPolicyRule setLOGGER(ClientLogger lOGGER) {
        return this.setLOGGER(BicepValue.from(lOGGER));
    }

    public BicepValue<String> getName() {
        return this.name;
    }

    public ManagementPolicyRule setName(BicepValue<String> name) {
        this.name.assign(name);
        return this;
    }
    public ManagementPolicyRule setName(String name) {
        return this.setName(BicepValue.from(name));
    }

    public BicepValue<RuleType> getType() {
        return this.type;
    }

    public ManagementPolicyRule setType(BicepValue<RuleType> type) {
        this.type.assign(type);
        return this;
    }
    public ManagementPolicyRule setType(RuleType type) {
        return this.setType(BicepValue.from(type));
    }

}
