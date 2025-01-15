// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.keyvault.generated.models;

import java.util.List;
import com.azure.provisioning.keyvault.generated.models.NetworkRuleBypassOptions;
import com.azure.provisioning.keyvault.generated.models.NetworkRuleAction;
import com.azure.provisioning.keyvault.generated.models.MhsmVirtualNetworkRule;
import com.azure.provisioning.keyvault.generated.models.MhsmipRule;
import com.azure.provisioning.BicepList;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class MhsmNetworkRuleSet extends ProvisioningConstruct {

    private final BicepValue<NetworkRuleAction> defaultAction;
    private final BicepList<MhsmipRule> ipRules;
    private final BicepList<MhsmVirtualNetworkRule> virtualNetworkRules;
    private final BicepValue<NetworkRuleBypassOptions> bypass;

    public MhsmNetworkRuleSet() {
        defaultAction = BicepValue.defineProperty(this, "defaultAction", new String[] { "defaultAction" }, null);
        ipRules = BicepList.defineProperty(this, "ipRules", new String[] { "ipRules" }, false, false);
        virtualNetworkRules = BicepList.defineProperty(this, "virtualNetworkRules", new String[] { "virtualNetworkRules" }, false, false);
        bypass = BicepValue.defineProperty(this, "bypass", new String[] { "bypass" }, null);
    }

    public BicepValue<NetworkRuleAction> getDefaultAction() {
        return this.defaultAction;
    }

    public MhsmNetworkRuleSet setDefaultAction(BicepValue<NetworkRuleAction> defaultAction) {
        this.defaultAction.assign(defaultAction);
        return this;
    }
    public BicepList<MhsmipRule> getIpRules() {
        return this.ipRules;
    }

    public MhsmNetworkRuleSet setIpRules(BicepList<MhsmipRule> ipRules) {
        this.ipRules.assign(ipRules);
        return this;
    }
    public BicepList<MhsmVirtualNetworkRule> getVirtualNetworkRules() {
        return this.virtualNetworkRules;
    }

    public MhsmNetworkRuleSet setVirtualNetworkRules(BicepList<MhsmVirtualNetworkRule> virtualNetworkRules) {
        this.virtualNetworkRules.assign(virtualNetworkRules);
        return this;
    }
    public BicepValue<NetworkRuleBypassOptions> getBypass() {
        return this.bypass;
    }

    public MhsmNetworkRuleSet setBypass(BicepValue<NetworkRuleBypassOptions> bypass) {
        this.bypass.assign(bypass);
        return this;
    }
}
