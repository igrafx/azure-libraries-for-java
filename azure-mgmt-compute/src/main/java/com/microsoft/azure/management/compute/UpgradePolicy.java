/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes an upgrade policy - automatic, manual, or rolling.
 */
public class UpgradePolicy {
    /**
     * Specifies the mode of an upgrade to virtual machines in the scale
     * set.&lt;br /&gt;&lt;br /&gt; Possible values are:&lt;br /&gt;&lt;br
     * /&gt; **Manual** - You  control the application of updates to virtual
     * machines in the scale set. You do this by using the manualUpgrade
     * action.&lt;br /&gt;&lt;br /&gt; **Automatic** - All virtual machines in
     * the scale set are  automatically updated at the same time. Possible
     * values include: 'Automatic', 'Manual', 'Rolling'.
     */
    @JsonProperty(value = "mode")
    private UpgradeMode mode;

    /**
     * The configuration parameters used while performing a rolling upgrade.
     */
    @JsonProperty(value = "rollingUpgradePolicy")
    private RollingUpgradePolicy rollingUpgradePolicy;

    /**
     * Whether OS upgrades should automatically be applied to scale set
     * instances in a rolling fashion when a newer version of the image becomes
     * available.
     */
    @JsonProperty(value = "automaticOSUpgrade")
    private Boolean automaticOSUpgrade;

    /**
     * Configuration parameters used for performing automatic OS Upgrade.
     */
    @JsonProperty(value = "autoOSUpgradePolicy")
    private AutoOSUpgradePolicy autoOSUpgradePolicy;

    /**
     * Get specifies the mode of an upgrade to virtual machines in the scale set.&lt;br /&gt;&lt;br /&gt; Possible values are:&lt;br /&gt;&lt;br /&gt; **Manual** - You  control the application of updates to virtual machines in the scale set. You do this by using the manualUpgrade action.&lt;br /&gt;&lt;br /&gt; **Automatic** - All virtual machines in the scale set are  automatically updated at the same time. Possible values include: 'Automatic', 'Manual', 'Rolling'.
     *
     * @return the mode value
     */
    public UpgradeMode mode() {
        return this.mode;
    }

    /**
     * Set specifies the mode of an upgrade to virtual machines in the scale set.&lt;br /&gt;&lt;br /&gt; Possible values are:&lt;br /&gt;&lt;br /&gt; **Manual** - You  control the application of updates to virtual machines in the scale set. You do this by using the manualUpgrade action.&lt;br /&gt;&lt;br /&gt; **Automatic** - All virtual machines in the scale set are  automatically updated at the same time. Possible values include: 'Automatic', 'Manual', 'Rolling'.
     *
     * @param mode the mode value to set
     * @return the UpgradePolicy object itself.
     */
    public UpgradePolicy withMode(UpgradeMode mode) {
        this.mode = mode;
        return this;
    }

    /**
     * Get the configuration parameters used while performing a rolling upgrade.
     *
     * @return the rollingUpgradePolicy value
     */
    public RollingUpgradePolicy rollingUpgradePolicy() {
        return this.rollingUpgradePolicy;
    }

    /**
     * Set the configuration parameters used while performing a rolling upgrade.
     *
     * @param rollingUpgradePolicy the rollingUpgradePolicy value to set
     * @return the UpgradePolicy object itself.
     */
    public UpgradePolicy withRollingUpgradePolicy(RollingUpgradePolicy rollingUpgradePolicy) {
        this.rollingUpgradePolicy = rollingUpgradePolicy;
        return this;
    }

    /**
     * Get whether OS upgrades should automatically be applied to scale set instances in a rolling fashion when a newer version of the image becomes available.
     *
     * @return the automaticOSUpgrade value
     */
    public Boolean automaticOSUpgrade() {
        return this.automaticOSUpgrade;
    }

    /**
     * Set whether OS upgrades should automatically be applied to scale set instances in a rolling fashion when a newer version of the image becomes available.
     *
     * @param automaticOSUpgrade the automaticOSUpgrade value to set
     * @return the UpgradePolicy object itself.
     */
    public UpgradePolicy withAutomaticOSUpgrade(Boolean automaticOSUpgrade) {
        this.automaticOSUpgrade = automaticOSUpgrade;
        return this;
    }

    /**
     * Get configuration parameters used for performing automatic OS Upgrade.
     *
     * @return the autoOSUpgradePolicy value
     */
    public AutoOSUpgradePolicy autoOSUpgradePolicy() {
        return this.autoOSUpgradePolicy;
    }

    /**
     * Set configuration parameters used for performing automatic OS Upgrade.
     *
     * @param autoOSUpgradePolicy the autoOSUpgradePolicy value to set
     * @return the UpgradePolicy object itself.
     */
    public UpgradePolicy withAutoOSUpgradePolicy(AutoOSUpgradePolicy autoOSUpgradePolicy) {
        this.autoOSUpgradePolicy = autoOSUpgradePolicy;
        return this;
    }

}
