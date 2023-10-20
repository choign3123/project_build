package com.smu.som.domain.user.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0017\u0018\u00002\u00020\u0001B!\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007R\u001a\u0010\u0006\u001a\u00020\u0005X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0013"}, d2 = {"Lcom/smu/som/domain/user/entity/RefreshToken;", "Lcom/smu/som/common/entity/BaseEntity;", "refreshTokenId", "", "refreshToken", "", "oauth2Id", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)V", "getOauth2Id", "()Ljava/lang/String;", "setOauth2Id", "(Ljava/lang/String;)V", "getRefreshToken", "setRefreshToken", "getRefreshTokenId", "()Ljava/lang/Long;", "setRefreshTokenId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "som"})
@javax.persistence.Table(name = "refresh_token")
@javax.persistence.Entity
public class RefreshToken extends com.smu.som.common.entity.BaseEntity {
    @org.jetbrains.annotations.Nullable
    @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @javax.persistence.Id
    private java.lang.Long refreshTokenId;
    @org.jetbrains.annotations.NotNull
    private java.lang.String refreshToken;
    @org.jetbrains.annotations.NotNull
    private java.lang.String oauth2Id;
    
    public RefreshToken(@org.jetbrains.annotations.Nullable
    java.lang.Long refreshTokenId, @org.jetbrains.annotations.NotNull
    java.lang.String refreshToken, @org.jetbrains.annotations.NotNull
    java.lang.String oauth2Id) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public java.lang.Long getRefreshTokenId() {
        return null;
    }
    
    public void setRefreshTokenId(@org.jetbrains.annotations.Nullable
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public java.lang.String getRefreshToken() {
        return null;
    }
    
    public void setRefreshToken(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public java.lang.String getOauth2Id() {
        return null;
    }
    
    public void setOauth2Id(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
}