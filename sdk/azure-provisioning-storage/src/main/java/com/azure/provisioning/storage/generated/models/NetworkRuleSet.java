// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated.models;

import com.azure.provisioning.storage.generated.models.ResourceAccessRule;
import com.azure.provisioning.storage.generated.models.IpRule;
import com.azure.provisioning.storage.generated.models.DefaultAction;
import java.util.List;
import com.azure.core.util.logging.ClientLogger;
import com.azure.provisioning.storage.generated.models.VirtualNetworkRule;
import com.azure.provisioning.BicepList;
import com.azure.provisioning.storage.generated.models.Bypass;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class NetworkRuleSet extends ProvisioningConstruct {

    private final BicepValue<ClientLogger> lOGGER;
    private final BicepList<ResourceAccessRule> resourceAccessRules;
    private final BicepValue<DefaultAction> defaultAction;
    private final BicepValue<Bypass> bypass;
    private final BicepList<VirtualNetworkRule> virtualNetworkRules;
    private final BicepList<IpRule> ipRules;

    public NetworkRuleSet() {
        lOGGER = BicepValue.defineProperty(this, "lOGGER", new String[] { "lOGGER" }, null);
        resourceAccessRules = BicepList.defineProperty(this, "resourceAccessRules", new String[] { "resourceAccessRules" }, false, false);
        defaultAction = BicepValue.defineProperty(this, "defaultAction", new String[] { "defaultAction" }, null);
        bypass = BicepValue.defineProperty(this, "bypass", new String[] { "bypass" }, null);
        virtualNetworkRules = BicepList.defineProperty(this, "virtualNetworkRules", new String[] { "virtualNetworkRules" }, false, false);
        ipRules = BicepList.defineProperty(this, "ipRules", new String[] { "ipRules" }, false, false);
    }

    public BicepValue<ClientLogger> getLOGGER() {
        return this.lOGGER;
    }

    public NetworkRuleSet setLOGGER(BicepValue<ClientLogger> lOGGER) {
        this.lOGGER.assign(lOGGER);
        return this;
    }
    public NetworkRuleSet setLOGGER(ClientLogger lOGGER) {
        return this.setLOGGER(BicepValue.from(lOGGER));
    }

    public BicepList<ResourceAccessRule> getResourceAccessRules() {
        return this.resourceAccessRules;
    }

    public NetworkRuleSet setResourceAccessRules(BicepList<ResourceAccessRule> resourceAccessRules) {
        this.resourceAccessRules.assign(resourceAccessRules);
        return this;
    }
    public NetworkRuleSet setResourceAccessRules(List<ResourceAccessRule> resourceAccessRules) {
        return this.setResourceAccessRules(BicepList.from(resourceAccessRules));
    }

    public BicepValue<DefaultAction> getDefaultAction() {
        return this.defaultAction;
    }

    public NetworkRuleSet setDefaultAction(BicepValue<DefaultAction> defaultAction) {
        this.defaultAction.assign(defaultAction);
        return this;
    }
    public NetworkRuleSet setDefaultAction(DefaultAction defaultAction) {
        return this.setDefaultAction(BicepValue.from(defaultAction));
    }

    public BicepValue<Bypass> getBypass() {
        return this.bypass;
    }

    public NetworkRuleSet setBypass(BicepValue<Bypass> bypass) {
        this.bypass.assign(bypass);
        return this;
    }
    public NetworkRuleSet setBypass(Bypass bypass) {
        return this.setBypass(BicepValue.from(bypass));
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
