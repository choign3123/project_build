package com.smu.som.domain.question.dto;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B-\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\bJ\u0006\u0010\u0015\u001a\u00020\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0017"}, d2 = {"Lcom/smu/som/domain/question/dto/PlayCountDTO;", "", "userId", "", "couple", "", "married", "family", "(Ljava/lang/String;JJJ)V", "getCouple", "()J", "setCouple", "(J)V", "getFamily", "setFamily", "getMarried", "setMarried", "getUserId", "()Ljava/lang/String;", "setUserId", "(Ljava/lang/String;)V", "toEntity", "Lcom/smu/som/domain/question/entity/PlayCount;", "som"})
public final class PlayCountDTO {
    @org.jetbrains.annotations.NotNull
    private java.lang.String userId;
    private long couple;
    private long married;
    private long family;
    
    public PlayCountDTO(@org.jetbrains.annotations.NotNull
    @com.fasterxml.jackson.annotation.JsonProperty(value = "userId")
    java.lang.String userId, @com.fasterxml.jackson.annotation.JsonProperty(value = "couple")
    long couple, @com.fasterxml.jackson.annotation.JsonProperty(value = "married")
    long married, @com.fasterxml.jackson.annotation.JsonProperty(value = "family")
    long family) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getUserId() {
        return null;
    }
    
    public final void setUserId(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final long getCouple() {
        return 0L;
    }
    
    public final void setCouple(long p0) {
    }
    
    public final long getMarried() {
        return 0L;
    }
    
    public final void setMarried(long p0) {
    }
    
    public final long getFamily() {
        return 0L;
    }
    
    public final void setFamily(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.smu.som.domain.question.entity.PlayCount toEntity() {
        return null;
    }
}