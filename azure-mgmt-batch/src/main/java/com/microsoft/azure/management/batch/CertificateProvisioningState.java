/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batch;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for CertificateProvisioningState.
 */
public enum CertificateProvisioningState {
    /** Enum value Succeeded. */
    SUCCEEDED("Succeeded"),

    /** Enum value Deleting. */
    DELETING("Deleting"),

    /** Enum value Failed. */
    FAILED("Failed");

    /** The actual serialized value for a CertificateProvisioningState instance. */
    private String value;

    CertificateProvisioningState(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a CertificateProvisioningState instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed CertificateProvisioningState object, or null if unable to parse.
     */
    @JsonCreator
    public static CertificateProvisioningState fromString(String value) {
        CertificateProvisioningState[] items = CertificateProvisioningState.values();
        for (CertificateProvisioningState item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
