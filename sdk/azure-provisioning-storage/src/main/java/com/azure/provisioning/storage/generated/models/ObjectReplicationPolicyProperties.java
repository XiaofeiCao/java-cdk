// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated.models;

import java.util.List;
import com.azure.provisioning.storage.generated.models.ObjectReplicationPolicyRule;
import java.time.OffsetDateTime;
import com.azure.core.util.logging.ClientLogger;
import com.azure.provisioning.BicepList;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class ObjectReplicationPolicyProperties extends ProvisioningConstruct {

    private final BicepValue<ClientLogger> lOGGER;
    private final BicepValue<String> sourceAccount;
    private final BicepList<ObjectReplicationPolicyRule> rules;
    private final BicepValue<String> destinationAccount;
    private final BicepValue<String> policyId;
    private final BicepValue<OffsetDateTime> enabledTime;

    public ObjectReplicationPolicyProperties() {
        lOGGER = BicepValue.defineProperty(this, "lOGGER", new String[] { "lOGGER" }, null);
        sourceAccount = BicepValue.defineProperty(this, "sourceAccount", new String[] { "sourceAccount" }, null);
        rules = BicepList.defineProperty(this, "rules", new String[] { "rules" }, false, false);
        destinationAccount = BicepValue.defineProperty(this, "destinationAccount", new String[] { "destinationAccount" }, null);
        policyId = BicepValue.defineProperty(this, "policyId", new String[] { "policyId" }, null);
        enabledTime = BicepValue.defineProperty(this, "enabledTime", new String[] { "enabledTime" }, null);
    }

    public BicepValue<ClientLogger> getLOGGER() {
        return this.lOGGER;
    }

    public ObjectReplicationPolicyProperties setLOGGER(BicepValue<ClientLogger> lOGGER) {
        this.lOGGER.assign(lOGGER);
        return this;
    }
    public BicepValue<String> getSourceAccount() {
        return this.sourceAccount;
    }

    public ObjectReplicationPolicyProperties setSourceAccount(BicepValue<String> sourceAccount) {
        this.sourceAccount.assign(sourceAccount);
        return this;
    }
    public BicepList<ObjectReplicationPolicyRule> getRules() {
        return this.rules;
    }

    public ObjectReplicationPolicyProperties setRules(BicepList<ObjectReplicationPolicyRule> rules) {
        this.rules.assign(rules);
        return this;
    }
    public BicepValue<String> getDestinationAccount() {
        return this.destinationAccount;
    }

    public ObjectReplicationPolicyProperties setDestinationAccount(BicepValue<String> destinationAccount) {
        this.destinationAccount.assign(destinationAccount);
        return this;
    }
    public BicepValue<String> getPolicyId() {
        return this.policyId;
    }

    public ObjectReplicationPolicyProperties setPolicyId(BicepValue<String> policyId) {
        this.policyId.assign(policyId);
        return this;
    }
    public BicepValue<OffsetDateTime> getEnabledTime() {
        return this.enabledTime;
    }

    public ObjectReplicationPolicyProperties setEnabledTime(BicepValue<OffsetDateTime> enabledTime) {
        this.enabledTime.assign(enabledTime);
        return this;
    }
}
