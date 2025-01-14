// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.developer.devcenter.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Hardware specifications for the Dev Box.
 */
@Immutable
public final class DevBoxHardwareProfile implements JsonSerializable<DevBoxHardwareProfile> {

    /*
     * The name of the SKU
     */
    @Generated
    private SkuName skuName;

    /*
     * The number of vCPUs available for the Dev Box.
     */
    @Generated
    private Integer vCpus;

    /*
     * The amount of memory available for the Dev Box.
     */
    @Generated
    private Integer memoryGb;

    /**
     * Creates an instance of DevBoxHardwareProfile class.
     */
    @Generated
    private DevBoxHardwareProfile() {
    }

    /**
     * Get the skuName property: The name of the SKU.
     *
     * @return the skuName value.
     */
    @Generated
    public SkuName getSkuName() {
        return this.skuName;
    }

    /**
     * Get the vCpus property: The number of vCPUs available for the Dev Box.
     *
     * @return the vCpus value.
     */
    @Generated
    public Integer getVCpus() {
        return this.vCpus;
    }

    /**
     * Get the memoryGb property: The amount of memory available for the Dev Box.
     *
     * @return the memoryGb value.
     */
    @Generated
    public Integer getMemoryGb() {
        return this.memoryGb;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DevBoxHardwareProfile from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of DevBoxHardwareProfile if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the DevBoxHardwareProfile.
     */
    @Generated
    public static DevBoxHardwareProfile fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DevBoxHardwareProfile deserializedDevBoxHardwareProfile = new DevBoxHardwareProfile();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("skuName".equals(fieldName)) {
                    deserializedDevBoxHardwareProfile.skuName = SkuName.fromString(reader.getString());
                } else if ("vCPUs".equals(fieldName)) {
                    deserializedDevBoxHardwareProfile.vCpus = reader.getNullable(JsonReader::getInt);
                } else if ("memoryGB".equals(fieldName)) {
                    deserializedDevBoxHardwareProfile.memoryGb = reader.getNullable(JsonReader::getInt);
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedDevBoxHardwareProfile;
        });
    }
}
