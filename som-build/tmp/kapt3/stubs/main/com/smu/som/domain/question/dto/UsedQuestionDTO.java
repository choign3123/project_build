package com.smu.som.domain.question.dto;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\'\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0007J\u0006\u0010\u0013\u001a\u00020\u0014R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0015"}, d2 = {"Lcom/smu/som/domain/question/dto/UsedQuestionDTO;", "", "userId", "", "used", "", "pass", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)V", "getPass", "()Ljava/lang/Long;", "setPass", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getUsed", "setUsed", "getUserId", "()Ljava/lang/String;", "setUserId", "(Ljava/lang/String;)V", "toEntity", "Lcom/smu/som/domain/question/entity/UsedQuestion;", "som"})
public final class UsedQuestionDTO {
    @org.jetbrains.annotations.NotNull
    private java.lang.String userId;
    @org.jetbrains.annotations.Nullable
    private java.lang.Long used;
    @org.jetbrains.annotations.Nullable
    private java.lang.Long pass;
    
    public UsedQuestionDTO(@org.jetbrains.annotations.NotNull
    @com.fasterxml.jackson.annotation.JsonProperty(value = "userId")
    java.lang.String userId, @org.jetbrains.annotations.Nullable
    @com.fasterxml.jackson.annotation.JsonProperty(value = "used")
    java.lang.Long used, @org.jetbrains.annotations.Nullable
    @com.fasterxml.jackson.annotation.JsonProperty(value = "pass")
    java.lang.Long pass) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getUserId() {
        return null;
    }
    
    public final void setUserId(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Long getUsed() {
        return null;
    }
    
    public final void setUsed(@org.jetbrains.annotations.Nullable
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Long getPass() {
        return null;
    }
    
    public final void setPass(@org.jetbrains.annotations.Nullable
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.smu.som.domain.question.entity.UsedQuestion toEntity() {
        return null;
    }
}