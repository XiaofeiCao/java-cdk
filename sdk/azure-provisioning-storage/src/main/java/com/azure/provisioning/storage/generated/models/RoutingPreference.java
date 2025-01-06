// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated.models;

import com.azure.provisioning.storage.generated.models.RoutingChoice;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class RoutingPreference extends ProvisioningConstruct {

    private final BicepValue<Boolean> publishMicrosoftEndpoints;
    private final BicepValue<RoutingChoice> routingChoice;
    private final BicepValue<Boolean> publishInternetEndpoints;

    public RoutingPreference() {
        publishMicrosoftEndpoints = BicepValue.defineProperty(this, "publishMicrosoftEndpoints", new String[] { "temp", "publishMicrosoftEndpoints" }, null);
        routingChoice = BicepValue.defineProperty(this, "routingChoice", new String[] { "temp", "routingChoice" }, null);
        publishInternetEndpoints = BicepValue.defineProperty(this, "publishInternetEndpoints", new String[] { "temp", "publishInternetEndpoints" }, null);
    }

    public BicepValue<Boolean> getPublishMicrosoftEndpoints() {
        return this.publishMicrosoftEndpoints;
    }

    public RoutingPreference setPublishMicrosoftEndpoints(BicepValue<Boolean> publishMicrosoftEndpoints) {
        this.publishMicrosoftEndpoints.assign(publishMicrosoftEndpoints);
        return this;
    }
    public BicepValue<RoutingChoice> getRoutingChoice() {
        return this.routingChoice;
    }

    public RoutingPreference setRoutingChoice(BicepValue<RoutingChoice> routingChoice) {
        this.routingChoice.assign(routingChoice);
        return this;
    }
    public BicepValue<Boolean> getPublishInternetEndpoints() {
        return this.publishInternetEndpoints;
    }

    public RoutingPreference setPublishInternetEndpoints(BicepValue<Boolean> publishInternetEndpoints) {
        this.publishInternetEndpoints.assign(publishInternetEndpoints);
        return this;
    }
}
