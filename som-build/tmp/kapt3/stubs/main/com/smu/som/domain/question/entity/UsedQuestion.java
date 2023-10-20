package com.smu.som.domain.question.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0017\u0018\u00002\u00020\u0001B+\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0096\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0096\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0005X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006\u0016"}, d2 = {"Lcom/smu/som/domain/question/entity/UsedQuestion;", "", "id", "", "userId", "", "used", "pass", "(JLjava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)V", "getId", "()J", "getPass", "()Ljava/lang/Long;", "setPass", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getUsed", "setUsed", "getUserId", "()Ljava/lang/String;", "setUserId", "(Ljava/lang/String;)V", "som"})
@javax.persistence.Table(name = "used_question")
@javax.persistence.Entity
public class UsedQuestion {
    @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @javax.persistence.Id
    private final long id = 0L;
    @org.jetbrains.annotations.NotNull
    private java.lang.String userId;
    @org.jetbrains.annotations.Nullable
    private java.lang.Long used;
    @org.jetbrains.annotations.Nullable
    private java.lang.Long pass;
    
    public UsedQuestion(long id, @org.jetbrains.annotations.NotNull
    java.lang.String userId, @org.jetbrains.annotations.Nullable
    java.lang.Long used, @org.jetbrains.annotations.Nullable
    java.lang.Long pass) {
        super();
    }
    
    public long getId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull
    public java.lang.String getUserId() {
        return null;
    }
    
    public void setUserId(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public java.lang.Long getUsed() {
        return null;
    }
    
    public void setUsed(@org.jetbrains.annotations.Nullable
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public java.lang.Long getPass() {
        return null;
    }
    
    public void setPass(@org.jetbrains.annotations.Nullable
    java.lang.Long p0) {
    }
}