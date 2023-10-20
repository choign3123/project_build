package com.smu.som.domain.question.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0017\u0018\u00002\u00020\u0001B5\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\tR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0096\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0096\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0096\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\u0013\u0010\u000b\"\u0004\b\u0014\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0005X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u00a8\u0006\u0019"}, d2 = {"Lcom/smu/som/domain/question/entity/PlayCount;", "", "id", "", "userId", "", "couple", "married", "family", "(JLjava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V", "getCouple", "()Ljava/lang/Long;", "setCouple", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getFamily", "setFamily", "getId", "()J", "getMarried", "setMarried", "getUserId", "()Ljava/lang/String;", "setUserId", "(Ljava/lang/String;)V", "som"})
@javax.persistence.Table(name = "play_count")
@javax.persistence.Entity
public class PlayCount {
    @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @javax.persistence.Id
    private final long id = 0L;
    @org.jetbrains.annotations.NotNull
    private java.lang.String userId;
    @org.jetbrains.annotations.Nullable
    private java.lang.Long couple;
    @org.jetbrains.annotations.Nullable
    private java.lang.Long married;
    @org.jetbrains.annotations.Nullable
    private java.lang.Long family;
    
    public PlayCount(long id, @org.jetbrains.annotations.NotNull
    java.lang.String userId, @org.jetbrains.annotations.Nullable
    java.lang.Long couple, @org.jetbrains.annotations.Nullable
    java.lang.Long married, @org.jetbrains.annotations.Nullable
    java.lang.Long family) {
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
    public java.lang.Long getCouple() {
        return null;
    }
    
    public void setCouple(@org.jetbrains.annotations.Nullable
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public java.lang.Long getMarried() {
        return null;
    }
    
    public void setMarried(@org.jetbrains.annotations.Nullable
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public java.lang.Long getFamily() {
        return null;
    }
    
    public void setFamily(@org.jetbrains.annotations.Nullable
    java.lang.Long p0) {
    }
}