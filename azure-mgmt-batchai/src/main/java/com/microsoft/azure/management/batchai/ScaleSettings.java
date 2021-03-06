/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batchai;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * At least one of manual or autoScale settings must be specified. Only one of
 * manual or autoScale settings can be specified. If autoScale settings are
 * specified, the system automatically scales the cluster up and down (within
 * the supplied limits) based on the pending jobs on the cluster.
 */
public class ScaleSettings {
    /**
     * Manual scale settings.
     * Manual scale settings for the cluster.
     */
    @JsonProperty(value = "manual")
    private ManualScaleSettings manual;

    /**
     * Auto-scale settings.
     * Auto-scale settings for the cluster.
     */
    @JsonProperty(value = "autoScale")
    private AutoScaleSettings autoScale;

    /**
     * Get manual scale settings for the cluster.
     *
     * @return the manual value
     */
    public ManualScaleSettings manual() {
        return this.manual;
    }

    /**
     * Set manual scale settings for the cluster.
     *
     * @param manual the manual value to set
     * @return the ScaleSettings object itself.
     */
    public ScaleSettings withManual(ManualScaleSettings manual) {
        this.manual = manual;
        return this;
    }

    /**
     * Get auto-scale settings for the cluster.
     *
     * @return the autoScale value
     */
    public AutoScaleSettings autoScale() {
        return this.autoScale;
    }

    /**
     * Set auto-scale settings for the cluster.
     *
     * @param autoScale the autoScale value to set
     * @return the ScaleSettings object itself.
     */
    public ScaleSettings withAutoScale(AutoScaleSettings autoScale) {
        this.autoScale = autoScale;
        return this;
    }

}
