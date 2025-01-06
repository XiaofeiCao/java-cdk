package com.azure.provisioning.generator.specifications;

import com.azure.provisioning.generator.model.Specification;

import java.lang.reflect.Type;

public class KeyVaultSpecification extends Specification {
    public KeyVaultSpecification(String name, String provisioningPackage) {
        super(name, provisioningPackage);
    }

    public KeyVaultSpecification(String name, String provisioningPackage, Type armType, String description, String providerName) {
        super(name, provisioningPackage, armType, description, providerName);
    }

    @Override
    protected void customize() {
    }
}
