// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.provisioning.storage.generated.models;

import java.util.List;
import com.azure.provisioning.storage.generated.models.TableSignedIdentifier;
import com.azure.provisioning.BicepList;
import com.azure.provisioning.BicepValue;
import com.azure.provisioning.primitives.ProvisioningConstruct;

public class TableProperties extends ProvisioningConstruct {

    private final BicepList<TableSignedIdentifier> signedIdentifiers;
    private final BicepValue<String> tableName;

    public TableProperties() {
        signedIdentifiers = BicepList.defineProperty(this, "signedIdentifiers", new String[] { "signedIdentifiers" }, false, false);
        tableName = BicepValue.defineProperty(this, "tableName", new String[] { "tableName" }, null);
    }

    public BicepList<TableSignedIdentifier> getSignedIdentifiers() {
        return this.signedIdentifiers;
    }

    public TableProperties setSignedIdentifiers(BicepList<TableSignedIdentifier> signedIdentifiers) {
        this.signedIdentifiers.assign(signedIdentifiers);
        return this;
    }
    public BicepValue<String> getTableName() {
        return this.tableName;
    }

    public TableProperties setTableName(BicepValue<String> tableName) {
        this.tableName.assign(tableName);
        return this;
    }
}
