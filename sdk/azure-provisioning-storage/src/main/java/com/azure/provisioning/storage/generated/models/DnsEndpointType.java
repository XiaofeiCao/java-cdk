// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated.models;

public enum DnsEndpointType {

    STANDARD("Standard"),

    AZURE_DNS_ZONE("AzureDnsZone");
    private final String value;
    DnsEndpointType(String value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return this.value;
    }
}
