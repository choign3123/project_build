package com.smu.som.common.jwt.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B#\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003H\u0016J\b\u0010\r\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/smu/som/common/jwt/util/JwtProvider;", "", "secretKey", "", "accessTokenValidTime", "", "refreshTokenValidTime", "", "(Ljava/lang/String;IJ)V", "key", "Ljava/security/Key;", "createAccessToken", "oAuth2Id", "createRefreshToken", "som"})
@org.springframework.transaction.annotation.Transactional(readOnly = true)
@org.springframework.stereotype.Component
public class JwtProvider {
    private final java.lang.String secretKey = null;
    private final int accessTokenValidTime = 0;
    private final long refreshTokenValidTime = 0L;
    private final java.security.Key key = null;
    
    public JwtProvider(@org.jetbrains.annotations.NotNull
    @org.springframework.beans.factory.annotation.Value(value = "${jwt.secret}")
    java.lang.String secretKey, @org.springframework.beans.factory.annotation.Value(value = "${jwt.access-token-expiry}")
    int accessTokenValidTime, @org.springframework.beans.factory.annotation.Value(value = "${jwt.refresh-token-expiry}")
    long refreshTokenValidTime) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public java.lang.String createAccessToken(@org.jetbrains.annotations.NotNull
    java.lang.String oAuth2Id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public java.lang.String createRefreshToken() {
        return null;
    }
}