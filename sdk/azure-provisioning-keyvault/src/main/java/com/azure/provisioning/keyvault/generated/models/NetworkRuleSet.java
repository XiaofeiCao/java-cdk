// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.keyvault.generated.models;

import java.util.List;
import com.azure.provisioning.keyvault.generated.models.NetworkRuleBypassOptions;
import com.azure.provisioning.keyvault.generated.models.NetworkRuleAction;
import com.azure.provisioning.keyvault.generated.models.VirtualNetworkRule;
import com.azure.provisioning.BicepList;
import com.azure.provisioning.keyvault.generated.models.IpRule;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class NetworkRuleSet extends ProvisioningConstruct {

    private final BicepList<VirtualNetworkRule> virtualNetworkRules;
    private final BicepValue<NetworkRuleAction> defaultAction;
    private final BicepValue<NetworkRuleBypassOptions> bypass;
    private final BicepList<IpRule> ipRules;

    public NetworkRuleSet() {
        virtualNetworkRules = BicepList.defineProperty(this, "virtualNetworkRules", new String[] { "virtualNetworkRules" }, false, false);
        defaultAction = BicepValue.defineProperty(this, "defaultAction", new String[] { "defaultAction" }, null);
        bypass = BicepValue.defineProperty(this, "bypass", new String[] { "bypass" }, null);
        ipRules = BicepList.defineProperty(this, "ipRules", new String[] { "ipRules" }, false, false);
    }

    public BicepList<VirtualNetworkRule> getVirtualNetworkRules() {
        return this.virtualNetworkRules;
    }

    public NetworkRuleSet setVirtualNetworkRules(BicepList<VirtualNetworkRule> virtualNetworkRules) {
        this.virtualNetworkRules.assign(virtualNetworkRules);
        return this;
    }
    public NetworkRuleSet setVirtualNetworkRules(List<VirtualNetworkRule> virtualNetworkRules) {
        return this.setVirtualNetworkRules(BicepList.from(virtualNetworkRules));
    }

    public BicepValue<NetworkRuleAction> getDefaultAction() {
        return this.defaultAction;
    }

    public NetworkRuleSet setDefaultAction(BicepValue<NetworkRuleAction> defaultAction) {
        this.defaultAction.assign(defaultAction);
        return this;
    }
    public NetworkRuleSet setDefaultAction(NetworkRuleAction defaultAction) {
        return this.setDefaultAction(BicepValue.from(defaultAction));
    }

    public BicepValue<NetworkRuleBypassOptions> getBypass() {
        return this.bypass;
    }

    public NetworkRuleSet setBypass(BicepValue<NetworkRuleBypassOptions> bypass) {
        this.bypass.assign(bypass);
        return this;
    }
    public NetworkRuleSet setBypass(NetworkRuleBypassOptions bypass) {
        return this.setBypass(BicepValue.from(bypass));
    }

    public BicepList<IpRule> getIpRules() {
        return this.ipRules;
    }

    public NetworkRuleSet setIpRules(BicepList<IpRule> ipRules) {
        this.ipRules.assign(ipRules);
        return this;
    }
    public NetworkRuleSet setIpRules(List<IpRule> ipRules) {
        return this.setIpRules(BicepList.from(ipRules));
    }

}
