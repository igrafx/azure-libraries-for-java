/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.compute;

import com.microsoft.azure.CloudException;
import com.microsoft.azure.management.apigeneration.Beta;
import com.microsoft.azure.management.apigeneration.Fluent;
import com.microsoft.azure.management.compute.implementation.ComputeManager;
import com.microsoft.azure.management.compute.implementation.VirtualMachineScaleSetsInner;
import com.microsoft.azure.management.resources.fluentcore.arm.collection.SupportsBatchDeletion;
import com.microsoft.azure.management.resources.fluentcore.arm.collection.SupportsDeletingByResourceGroup;
import com.microsoft.azure.management.resources.fluentcore.arm.collection.SupportsGettingByResourceGroup;
import com.microsoft.azure.management.resources.fluentcore.arm.collection.SupportsGettingById;
import com.microsoft.azure.management.resources.fluentcore.arm.collection.SupportsListingByResourceGroup;
import com.microsoft.azure.management.resources.fluentcore.arm.models.HasManager;
import com.microsoft.azure.management.resources.fluentcore.collection.SupportsBatchCreation;
import com.microsoft.azure.management.resources.fluentcore.collection.SupportsCreating;
import com.microsoft.azure.management.resources.fluentcore.collection.SupportsDeletingById;
import com.microsoft.azure.management.resources.fluentcore.collection.SupportsListing;
import com.microsoft.azure.management.resources.fluentcore.model.HasInner;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import rx.Completable;
import rx.Observable;

import java.io.IOException;
import java.util.List;

/**
 *  Entry point to virtual machine scale set management API.
 */
@Fluent
public interface VirtualMachineScaleSets extends
        SupportsListing<VirtualMachineScaleSet>,
        SupportsListingByResourceGroup<VirtualMachineScaleSet>,
        SupportsGettingByResourceGroup<VirtualMachineScaleSet>,
        SupportsGettingById<VirtualMachineScaleSet>,
        SupportsCreating<VirtualMachineScaleSet.DefinitionStages.Blank>,
        SupportsDeletingById,
        SupportsDeletingByResourceGroup,
        SupportsBatchCreation<VirtualMachineScaleSet>,
        SupportsBatchDeletion,
        HasManager<ComputeManager>,
        HasInner<VirtualMachineScaleSetsInner> {
    /**
     * Shuts down the virtual machines in the scale set and releases the compute resources.
     *
     * @param groupName the name of the resource group the virtual machine scale set is in
     * @param name the name of the virtual machine scale set
     * @throws CloudException thrown for an invalid response from the service.
     * @throws IOException exception thrown from serialization/deserialization
     * @throws InterruptedException exception thrown when the operation is interrupted
     */
    void deallocate(String groupName, String name) throws CloudException, IOException, InterruptedException;

    /**
     * Shuts down the virtual machines in the scale set and releases the compute resources asynchronously.
     *
     * @param groupName the name of the resource group the virtual machine scale set is in
     * @param name the name of the virtual machine scale set
     *
     * @return a representation of the deferred computation of this call
     */
    Completable deallocateAsync(String groupName, String name);

    /**
     * Shuts down the virtual machines in the scale set and releases the compute resources asynchronously.
     *
     * @param groupName the name of the resource group the virtual machine scale set is in
     * @param name the name of the virtual machine scale set
     * @param callback the callback to call on success or failure
     * @return a handle to cancel the request
     */
    ServiceFuture<Void> deallocateAsync(String groupName, String name, ServiceCallback<Void> callback);

    /**
     * Powers off (stops) the virtual machines in the scale set.
     *
     * @param groupName the name of the resource group the virtual machine scale set is in
     * @param name the name of the virtual machine scale set
     * @throws CloudException thrown for an invalid response from the service.
     * @throws IOException exception thrown from serialization/deserialization
     * @throws InterruptedException exception thrown when the operation is interrupted
     */
    void powerOff(String groupName, String name) throws CloudException, IOException, InterruptedException;

    /**
     * Powers off (stops) the virtual machines in the scale set asynchronously.
     * @param groupName the name of the resource group the virtual machine in the scale set is in
     * @param name the name of the virtual machine scale set
     *
     * @return a representation of the deferred computation of this call
     */
    Completable powerOffAsync(String groupName, String name);

    /**
     * Powers off (stop) the virtual machines in the scale set asynchronously.
     *
     * @param groupName the name of the resource group the virtual machine in the scale set is in
     * @param name the name of the virtual machine scale set
     * @param callback the callback to call on success or failure
     * @return a handle to cancel the request
     */
    ServiceFuture<Void> powerOffAsync(String groupName, String name, ServiceCallback<Void> callback);

    /**
     * Restarts the virtual machines in the scale set.
     *
     * @param groupName the name of the resource group the virtual machine scale set is in
     * @param name the name of the virtual machine scale set
     * @throws CloudException thrown for an invalid response from the service.
     * @throws IOException exception thrown from serialization/deserialization
     * @throws InterruptedException exception thrown when the operation is interrupted
     */
    void restart(String groupName, String name) throws CloudException, IOException, InterruptedException;

    /**
     * Restarts the virtual machines in the scale set asynchronously.
     *
     * @param groupName the name of the resource group the virtual machine scale set is in
     * @param name the virtual machine scale set name
     * @return a representation of the deferred computation of this call
     */
    Completable restartAsync(String groupName, String name);

    /**
     * Restarts the virtual machines in the scale set asynchronously.
     *
     * @param groupName the name of the resource group the virtual machine scale set is in
     * @param name the virtual machine scale set name
     * @param callback the callback to call on success or failure
     * @return a handle to cancel the request
     */
    ServiceFuture<Void> restartAsync(String groupName, String name, ServiceCallback<Void> callback);

    /**
     * Starts the virtual machines in the scale set.
     *
     * @param groupName the name of the resource group the virtual machine scale set is in
     * @param name the name of the virtual machine scale set
     * @throws CloudException thrown for an invalid response from the service.
     * @throws IOException exception thrown from serialization/deserialization
     * @throws InterruptedException exception thrown when the operation is interrupted
     */
    void start(String groupName, String name) throws CloudException, IOException, InterruptedException;

    /**
     * Starts the virtual machines in the scale set asynchronously.
     * @param groupName the name of the resource group the virtual machine scale set is in
     * @param name the name of the virtual machine scale set
     *
     * @return a representation of the deferred computation of this call
     */
    Completable startAsync(String groupName, String name);

    /**
     * Starts the virtual machines in the scale set asynchronously.
     *
     * @param groupName the name of the resource group the virtual machine scale set is in
     * @param name the name of the virtual machine scale set
     * @param callback the callback to call on success or failure
     * @return a handle to cancel the request
     */
    ServiceFuture<Void> startAsync(String groupName, String name, ServiceCallback<Void> callback);

    /**
     * Re-images (updates the version of the installed operating system) the virtual machines in the scale set.
     *
     * @param groupName the name of the resource group the virtual machine scale set is in
     * @param name the name of the virtual machine scale set
     * @throws CloudException thrown for an invalid response from the service.
     * @throws IOException exception thrown from serialization/deserialization
     * @throws InterruptedException exception thrown when the operation is interrupted
     */
    void reimage(String groupName, String name) throws CloudException, IOException, InterruptedException;

    /**
     * Re-images (updates the version of the installed operating system) the virtual machines in the scale set asynchronously.
     *
     * @param groupName the name of the resource group the virtual machine scale set is in
     * @param name the name of the virtual machine scale set
     *
     * @return a representation of the deferred computation of this call
     */
    Completable reimageAsync(String groupName, String name);

    /**
     * Re-images (updates the version of the installed operating system) the virtual machines in the scale set asynchronously.
     *
     * @param groupName the name of the resource group the virtual machine scale set is in
     * @param name the name of the virtual machine scale set
     * @param callback the callback to call on success or failure
     * @return a handle to cancel the request
     */
    ServiceFuture<Void> reimageAsync(String groupName, String name, ServiceCallback<Void> callback);

    /**
     * Run PowerShell script in a virtual machine instance in a scale set.
     *
     * @param groupName the resource group name
     * @param scaleSetName the virtual machine scale set name
     * @param vmId the virtual machine instance id
     * @param scriptLines PowerShell script lines
     * @param scriptParameters script parameters
     * @return result of PowerShell script execution
     */
    @Beta(Beta.SinceVersion.V1_14_0)
    RunCommandResult runPowerShellScriptInVMInstance(String groupName, String scaleSetName, String vmId, List<String> scriptLines, List<RunCommandInputParameter> scriptParameters);

    /**
     * Run PowerShell in a virtual machine instance in a scale set asynchronously.
     *
     * @param groupName the resource group name
     * @param scaleSetName the virtual machine scale set name
     * @param vmId the virtual machine instance id
     * @param scriptLines PowerShell script lines
     * @param scriptParameters script parameters
     * @return handle to the asynchronous execution
     */
    @Beta(Beta.SinceVersion.V1_14_0)
    Observable<RunCommandResult> runPowerShellScriptInVMInstanceAsync(String groupName, String scaleSetName, String vmId, List<String> scriptLines, List<RunCommandInputParameter> scriptParameters);

    /**
     * Run shell script in a virtual machine instance in a scale set.
     *
     * @param groupName the resource group name
     * @param scaleSetName the virtual machine scale set name
     * @param vmId the virtual machine instance id
     * @param scriptLines shell script lines
     * @param scriptParameters script parameters
     * @return result of shell script execution
     */
    @Beta(Beta.SinceVersion.V1_14_0)
    RunCommandResult runShellScriptInVMInstance(String groupName, String scaleSetName, String vmId, List<String> scriptLines, List<RunCommandInputParameter> scriptParameters);


    /**
     * Run shell script in a virtual machine instance in a scale set asynchronously.
     *
     * @param groupName the resource group name
     * @param scaleSetName the virtual machine scale set name
     * @param vmId the virtual machine instance id
     * @param scriptLines shell script lines
     * @param scriptParameters script parameters
     * @return handle to the asynchronous execution
     */
    @Beta(Beta.SinceVersion.V1_14_0)
    Observable<RunCommandResult> runShellScriptInVMInstanceAsync(String groupName, String scaleSetName, String vmId, List<String> scriptLines, List<RunCommandInputParameter> scriptParameters);

    /**
     * Run commands in a virtual machine instance in a scale set.
     *
     * @param groupName the resource group name
     * @param scaleSetName the virtual machine scale set name
     * @param vmId the virtual machine instance id
     * @param inputCommand command input
     * @return result of execution
     */
    @Beta(Beta.SinceVersion.V1_14_0)
    RunCommandResult runCommandInVMInstance(String groupName, String scaleSetName, String vmId, RunCommandInput inputCommand);

    /**
     * Run commands in a virtual machine instance in a scale set asynchronously.
     *
     * @param groupName the resource group name
     * @param scaleSetName the virtual machine scale set name
     * @param vmId the virtual machine instance id
     * @param inputCommand command input
     * @return handle to the asynchronous execution
     */
    @Beta(Beta.SinceVersion.V1_14_0)
    Observable<RunCommandResult> runCommandVMInstanceAsync(String groupName, String scaleSetName, String vmId, RunCommandInput inputCommand);
}
