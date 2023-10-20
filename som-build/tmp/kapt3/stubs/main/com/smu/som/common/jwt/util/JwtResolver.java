package com.smu.som.common.jwt.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B+\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0003H\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0012J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\r\u001a\u00020\u0003H\u0016J\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001aH\u0016R\u000e\u0010\u0004\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/smu/som/common/jwt/util/JwtResolver;", "", "SECRET_KEY", "", "ACCESS_TOKEN_HEADER", "REFRESH_TOKEN_HEADER", "userDetailsService", "Lcom/smu/som/common/jwt/user/UserDetailsServiceImpl;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/smu/som/common/jwt/user/UserDetailsServiceImpl;)V", "key", "Ljava/security/Key;", "getAuthentication", "Lorg/springframework/security/core/Authentication;", "token", "getFromSecurityContextHolder", "Lcom/smu/som/common/jwt/user/UserDetailsImpl;", "getUserPk", "isExpired", "", "date", "Ljava/util/Date;", "parseToken", "Lio/jsonwebtoken/Jws;", "Lio/jsonwebtoken/Claims;", "resolveAccessToken", "request", "Ljavax/servlet/http/HttpServletRequest;", "resolveRefreshToken", "som"})
@org.springframework.transaction.annotation.Transactional(readOnly = true)
@org.springframework.stereotype.Component
public class JwtResolver {
    private final java.lang.String SECRET_KEY = null;
    private final java.lang.String ACCESS_TOKEN_HEADER = null;
    private final java.lang.String REFRESH_TOKEN_HEADER = null;
    private final com.smu.som.common.jwt.user.UserDetailsServiceImpl userDetailsService = null;
    private final java.security.Key key = null;
    
    public JwtResolver(@org.jetbrains.annotations.NotNull
    @org.springframework.beans.factory.annotation.Value(value = "${jwt.secret}")
    java.lang.String SECRET_KEY, @org.jetbrains.annotations.NotNull
    @org.springframework.beans.factory.annotation.Value(value = "${jwt.access-token-header}")
    java.lang.String ACCESS_TOKEN_HEADER, @org.jetbrains.annotations.NotNull
    @org.springframework.beans.factory.annotation.Value(value = "${jwt.refresh-token-header}")
    java.lang.String REFRESH_TOKEN_HEADER, @org.jetbrains.annotations.NotNull
    com.smu.som.common.jwt.user.UserDetailsServiceImpl userDetailsService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public org.springframework.security.core.Authentication getAuthentication(@org.jetbrains.annotations.NotNull
    java.lang.String token) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public com.smu.som.common.jwt.user.UserDetailsImpl getFromSecurityContextHolder() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public java.lang.String resolveAccessToken(@org.jetbrains.annotations.NotNull
    javax.servlet.http.HttpServletRequest request) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public java.lang.String resolveRefreshToken(@org.jetbrains.annotations.NotNull
    javax.servlet.http.HttpServletRequest request) {
        return null;
    }
    
    public boolean isExpired(@org.jetbrains.annotations.NotNull
    java.lang.String token, @org.jetbrains.annotations.NotNull
    java.util.Date date) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public io.jsonwebtoken.Jws<io.jsonwebtoken.Claims> parseToken(@org.jetbrains.annotations.NotNull
    java.lang.String token) {
        return null;
    }
    
    private java.lang.String getUserPk(java.lang.String token) {
        return null;
    }
}