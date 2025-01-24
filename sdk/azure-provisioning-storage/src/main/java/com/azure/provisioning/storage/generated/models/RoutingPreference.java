// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated.models;

import com.azure.provisioning.storage.generated.models.RoutingChoice;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class RoutingPreference extends ProvisioningConstruct {

    private final BicepValue<Boolean> publishMicrosoftEndpoints;
    private final BicepValue<Boolean> publishInternetEndpoints;
    private final BicepValue<RoutingChoice> routingChoice;

    public RoutingPreference() {
        publishMicrosoftEndpoints = BicepValue.defineProperty(this, "publishMicrosoftEndpoints", new String[] { "publishMicrosoftEndpoints" }, null);
        publishInternetEndpoints = BicepValue.defineProperty(this, "publishInternetEndpoints", new String[] { "publishInternetEndpoints" }, null);
        routingChoice = BicepValue.defineProperty(this, "routingChoice", new String[] { "routingChoice" }, null);
    }

    public BicepValue<Boolean> getPublishMicrosoftEndpoints() {
        return this.publishMicrosoftEndpoints;
    }

    public RoutingPreference setPublishMicrosoftEndpoints(BicepValue<Boolean> publishMicrosoftEndpoints) {
        this.publishMicrosoftEndpoints.assign(publishMicrosoftEndpoints);
        return this;
    }
    public RoutingPreference setPublishMicrosoftEndpoints(Boolean publishMicrosoftEndpoints) {
        return this.setPublishMicrosoftEndpoints(BicepValue.from(publishMicrosoftEndpoints));
    }

    public BicepValue<Boolean> getPublishInternetEndpoints() {
        return this.publishInternetEndpoints;
    }

    public RoutingPreference setPublishInternetEndpoints(BicepValue<Boolean> publishInternetEndpoints) {
        this.publishInternetEndpoints.assign(publishInternetEndpoints);
        return this;
    }
    public RoutingPreference setPublishInternetEndpoints(Boolean publishInternetEndpoints) {
        return this.setPublishInternetEndpoints(BicepValue.from(publishInternetEndpoints));
    }

    public BicepValue<RoutingChoice> getRoutingChoice() {
        return this.routingChoice;
    }

    public RoutingPreference setRoutingChoice(BicepValue<RoutingChoice> routingChoice) {
        this.routingChoice.assign(routingChoice);
        return this;
    }
    public RoutingPreference setRoutingChoice(RoutingChoice routingChoice) {
        return this.setRoutingChoice(BicepValue.from(routingChoice));
    }

}
