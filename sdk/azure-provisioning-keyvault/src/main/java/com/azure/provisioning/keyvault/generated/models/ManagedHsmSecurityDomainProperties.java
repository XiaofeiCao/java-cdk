// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.keyvault.generated.models;

import com.azure.provisioning.keyvault.generated.models.ActivationStatus;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class ManagedHsmSecurityDomainProperties extends ProvisioningConstruct {

    private final BicepValue<String> activationStatusMessage;
    private final BicepValue<ActivationStatus> activationStatus;

    public ManagedHsmSecurityDomainProperties() {
        activationStatusMessage = BicepValue.defineProperty(this, "activationStatusMessage", new String[] { "activationStatusMessage" }, null);
        activationStatus = BicepValue.defineProperty(this, "activationStatus", new String[] { "activationStatus" }, null);
    }

    public BicepValue<String> getActivationStatusMessage() {
        return this.activationStatusMessage;
    }

    public ManagedHsmSecurityDomainProperties setActivationStatusMessage(BicepValue<String> activationStatusMessage) {
        this.activationStatusMessage.assign(activationStatusMessage);
        return this;
    }
    public ManagedHsmSecurityDomainProperties setActivationStatusMessage(String activationStatusMessage) {
        return this.setActivationStatusMessage(BicepValue.from(activationStatusMessage));
    }

    public BicepValue<ActivationStatus> getActivationStatus() {
        return this.activationStatus;
    }

    public ManagedHsmSecurityDomainProperties setActivationStatus(BicepValue<ActivationStatus> activationStatus) {
        this.activationStatus.assign(activationStatus);
        return this;
    }
    public ManagedHsmSecurityDomainProperties setActivationStatus(ActivationStatus activationStatus) {
        return this.setActivationStatus(BicepValue.from(activationStatus));
    }

}
