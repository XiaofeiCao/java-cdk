// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated.models;

import com.azure.provisioning.storage.generated.models.IpRule;
import com.azure.provisioning.storage.generated.models.ResourceAccessRule;
import com.azure.provisioning.storage.generated.models.DefaultAction;
import java.util.List;
import com.azure.core.util.logging.ClientLogger;
import com.azure.provisioning.storage.generated.models.VirtualNetworkRule;
import com.azure.provisioning.storage.generated.models.Bypass;
import com.azure.provisioning.BicepList;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class NetworkRuleSet extends ProvisioningConstruct {

    private final BicepValue<Bypass> bypass;
    private final BicepList<IpRule> ipRules;
    private final BicepList<ResourceAccessRule> resourceAccessRules;
    private final BicepValue<DefaultAction> defaultAction;
    private final BicepValue<ClientLogger> lOGGER;
    private final BicepList<VirtualNetworkRule> virtualNetworkRules;

    public NetworkRuleSet() {
        bypass = BicepValue.defineProperty(this, "bypass", new String[] { "temp", "bypass" }, null);
        ipRules = BicepList.defineProperty(this, "ipRules", new String[] { "temp", "ipRules" }, false, false);
        resourceAccessRules = BicepList.defineProperty(this, "resourceAccessRules", new String[] { "temp", "resourceAccessRules" }, false, false);
        defaultAction = BicepValue.defineProperty(this, "defaultAction", new String[] { "temp", "defaultAction" }, null);
        lOGGER = BicepValue.defineProperty(this, "lOGGER", new String[] { "temp", "lOGGER" }, null);
        virtualNetworkRules = BicepList.defineProperty(this, "virtualNetworkRules", new String[] { "temp", "virtualNetworkRules" }, false, false);
    }

    public BicepValue<Bypass> getBypass() {
        return this.bypass;
    }

    public NetworkRuleSet setBypass(BicepValue<Bypass> bypass) {
        this.bypass.assign(bypass);
        return this;
    }
    public BicepValue<List<IpRule>> getIpRules() {
        return this.ipRules;
    }

    public NetworkRuleSet setIpRules(BicepValue<List<IpRule>> ipRules) {
        this.ipRules.assign(ipRules);
        return this;
    }
    public BicepValue<List<ResourceAccessRule>> getResourceAccessRules() {
        return this.resourceAccessRules;
    }

    public NetworkRuleSet setResourceAccessRules(BicepValue<List<ResourceAccessRule>> resourceAccessRules) {
        this.resourceAccessRules.assign(resourceAccessRules);
        return this;
    }
    public BicepValue<DefaultAction> getDefaultAction() {
        return this.defaultAction;
    }

    public NetworkRuleSet setDefaultAction(BicepValue<DefaultAction> defaultAction) {
        this.defaultAction.assign(defaultAction);
        return this;
    }
    public BicepValue<ClientLogger> getLOGGER() {
        return this.lOGGER;
    }

    public NetworkRuleSet setLOGGER(BicepValue<ClientLogger> lOGGER) {
        this.lOGGER.assign(lOGGER);
        return this;
    }
    public BicepValue<List<VirtualNetworkRule>> getVirtualNetworkRules() {
        return this.virtualNetworkRules;
    }

    public NetworkRuleSet setVirtualNetworkRules(BicepValue<List<VirtualNetworkRule>> virtualNetworkRules) {
        this.virtualNetworkRules.assign(virtualNetworkRules);
        return this;
    }
}
