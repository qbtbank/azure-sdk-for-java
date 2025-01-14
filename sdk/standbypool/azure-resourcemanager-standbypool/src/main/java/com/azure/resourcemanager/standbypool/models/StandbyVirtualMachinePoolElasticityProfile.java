// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.standbypool.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Details of the elasticity profile.
 */
@Fluent
public final class StandbyVirtualMachinePoolElasticityProfile {
    /*
     * Specifies the maximum number of virtual machines in the standby virtual machine pool.
     */
    @JsonProperty(value = "maxReadyCapacity", required = true)
    private long maxReadyCapacity;

    /**
     * Creates an instance of StandbyVirtualMachinePoolElasticityProfile class.
     */
    public StandbyVirtualMachinePoolElasticityProfile() {
    }

    /**
     * Get the maxReadyCapacity property: Specifies the maximum number of virtual machines in the standby virtual
     * machine pool.
     * 
     * @return the maxReadyCapacity value.
     */
    public long maxReadyCapacity() {
        return this.maxReadyCapacity;
    }

    /**
     * Set the maxReadyCapacity property: Specifies the maximum number of virtual machines in the standby virtual
     * machine pool.
     * 
     * @param maxReadyCapacity the maxReadyCapacity value to set.
     * @return the StandbyVirtualMachinePoolElasticityProfile object itself.
     */
    public StandbyVirtualMachinePoolElasticityProfile withMaxReadyCapacity(long maxReadyCapacity) {
        this.maxReadyCapacity = maxReadyCapacity;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
