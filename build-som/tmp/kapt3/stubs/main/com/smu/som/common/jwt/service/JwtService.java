package com.smu.som.common.jwt.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000eH\u0012J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000eH\u0012J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000eH\u0016J\u0018\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/smu/som/common/jwt/service/JwtService;", "", "jwtProvider", "Lcom/smu/som/common/jwt/util/JwtProvider;", "jwtResolver", "Lcom/smu/som/common/jwt/util/JwtResolver;", "userService", "Lcom/smu/som/domain/user/service/UserService;", "oAuth2ServiceFactory", "Lcom/smu/som/domain/user/oauth/OAuth2ServiceFactory;", "(Lcom/smu/som/common/jwt/util/JwtProvider;Lcom/smu/som/common/jwt/util/JwtResolver;Lcom/smu/som/domain/user/service/UserService;Lcom/smu/som/domain/user/oauth/OAuth2ServiceFactory;)V", "getRemainExpiry", "", "token", "", "isRefreshable", "", "refreshToken", "isValidate", "issue", "Lcom/smu/som/domain/user/dto/JwtTokenDTO;", "oauth2Provider", "oauth2AccessToken", "refresh", "oauth2Id", "som"})
@org.springframework.stereotype.Service
public class JwtService {
    private final com.smu.som.common.jwt.util.JwtProvider jwtProvider = null;
    private final com.smu.som.common.jwt.util.JwtResolver jwtResolver = null;
    private final com.smu.som.domain.user.service.UserService userService = null;
    private final com.smu.som.domain.user.oauth.OAuth2ServiceFactory oAuth2ServiceFactory = null;
    
    public JwtService(@org.jetbrains.annotations.NotNull
    com.smu.som.common.jwt.util.JwtProvider jwtProvider, @org.jetbrains.annotations.NotNull
    com.smu.som.common.jwt.util.JwtResolver jwtResolver, @org.jetbrains.annotations.NotNull
    com.smu.som.domain.user.service.UserService userService, @org.jetbrains.annotations.NotNull
    com.smu.som.domain.user.oauth.OAuth2ServiceFactory oAuth2ServiceFactory) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public com.smu.som.domain.user.dto.JwtTokenDTO issue(@org.jetbrains.annotations.NotNull
    java.lang.String oauth2Provider, @org.jetbrains.annotations.NotNull
    java.lang.String oauth2AccessToken) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public com.smu.som.domain.user.dto.JwtTokenDTO refresh(@org.jetbrains.annotations.NotNull
    java.lang.String refreshToken, @org.jetbrains.annotations.NotNull
    java.lang.String oauth2Id) {
        return null;
    }
    
    public long getRemainExpiry(@org.jetbrains.annotations.NotNull
    java.lang.String token) {
        return 0L;
    }
    
    private boolean isValidate(java.lang.String refreshToken) {
        return false;
    }
    
    private boolean isRefreshable(java.lang.String refreshToken) {
        return false;
    }
}