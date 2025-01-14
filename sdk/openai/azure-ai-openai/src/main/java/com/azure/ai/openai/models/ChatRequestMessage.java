// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * An abstract representation of a chat message as provided in a request.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "role", defaultImpl = ChatRequestMessage.class, visible = true)
@JsonTypeName("ChatRequestMessage")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "system", value = ChatRequestSystemMessage.class),
    @JsonSubTypes.Type(name = "user", value = ChatRequestUserMessage.class),
    @JsonSubTypes.Type(name = "assistant", value = ChatRequestAssistantMessage.class),
    @JsonSubTypes.Type(name = "tool", value = ChatRequestToolMessage.class),
    @JsonSubTypes.Type(name = "function", value = ChatRequestFunctionMessage.class) })
@Immutable
public class ChatRequestMessage {

    /**
     * Creates an instance of ChatRequestMessage class.
     */
    @Generated
    public ChatRequestMessage() {
        this.role = ChatRole.fromString("ChatRequestMessage");
    }

    /*
     * The chat role associated with this message.
     */
    @Generated
    @JsonTypeId
    @JsonProperty(value = "role")
    private ChatRole role;

    /**
     * Get the role property: The chat role associated with this message.
     *
     * @return the role value.
     */
    @Generated
    public ChatRole getRole() {
        return this.role;
    }
}
