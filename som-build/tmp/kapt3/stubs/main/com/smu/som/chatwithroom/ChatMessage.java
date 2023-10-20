package com.smu.som.chatwithroom;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J9\u0010\u0019\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001J\t\u0010\u001f\u001a\u00020\u0005H\u00d6\u0001R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006 "}, d2 = {"Lcom/smu/som/chatwithroom/ChatMessage;", "", "type", "Lcom/smu/som/chatwithroom/MessageType;", "roomId", "", "sender", "message", "(Lcom/smu/som/chatwithroom/MessageType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "getRoomId", "setRoomId", "getSender", "setSender", "getType", "()Lcom/smu/som/chatwithroom/MessageType;", "setType", "(Lcom/smu/som/chatwithroom/MessageType;)V", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "som"})
public final class ChatMessage {
    @org.jetbrains.annotations.Nullable
    private com.smu.som.chatwithroom.MessageType type;
    @org.jetbrains.annotations.Nullable
    private java.lang.String roomId;
    @org.jetbrains.annotations.Nullable
    private java.lang.String sender;
    @org.jetbrains.annotations.Nullable
    private java.lang.String message;
    
    @org.jetbrains.annotations.NotNull
    public final com.smu.som.chatwithroom.ChatMessage copy(@org.jetbrains.annotations.Nullable
    @com.fasterxml.jackson.annotation.JsonProperty(value = "messageType")
    com.smu.som.chatwithroom.MessageType type, @org.jetbrains.annotations.Nullable
    @com.fasterxml.jackson.annotation.JsonProperty(value = "chatRoomId")
    java.lang.String roomId, @org.jetbrains.annotations.Nullable
    @com.fasterxml.jackson.annotation.JsonProperty(value = "sender")
    java.lang.String sender, @org.jetbrains.annotations.Nullable
    java.lang.String message) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public ChatMessage(@org.jetbrains.annotations.Nullable
    @com.fasterxml.jackson.annotation.JsonProperty(value = "messageType")
    com.smu.som.chatwithroom.MessageType type, @org.jetbrains.annotations.Nullable
    @com.fasterxml.jackson.annotation.JsonProperty(value = "chatRoomId")
    java.lang.String roomId, @org.jetbrains.annotations.Nullable
    @com.fasterxml.jackson.annotation.JsonProperty(value = "sender")
    java.lang.String sender, @org.jetbrains.annotations.Nullable
    java.lang.String message) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.smu.som.chatwithroom.MessageType component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.smu.som.chatwithroom.MessageType getType() {
        return null;
    }
    
    public final void setType(@org.jetbrains.annotations.Nullable
    com.smu.som.chatwithroom.MessageType p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getRoomId() {
        return null;
    }
    
    public final void setRoomId(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getSender() {
        return null;
    }
    
    public final void setSender(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getMessage() {
        return null;
    }
    
    public final void setMessage(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
}