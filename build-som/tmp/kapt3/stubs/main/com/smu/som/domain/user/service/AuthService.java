package com.smu.som.domain.user.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0017J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u000eH\u0017J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0017J\u0010\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0018H\u0017R\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/smu/som/domain/user/service/AuthService;", "", "oAuth2ServiceFactory", "Lcom/smu/som/domain/user/oauth/OAuth2ServiceFactory;", "userService", "Lcom/smu/som/domain/user/service/UserService;", "jwtService", "Lcom/smu/som/common/jwt/service/JwtService;", "refreshService", "Lcom/smu/som/domain/user/service/refresh/RefreshService;", "(Lcom/smu/som/domain/user/oauth/OAuth2ServiceFactory;Lcom/smu/som/domain/user/service/UserService;Lcom/smu/som/common/jwt/service/JwtService;Lcom/smu/som/domain/user/service/refresh/RefreshService;)V", "logout", "", "refreshToken", "", "accessToken", "refresh", "Lcom/smu/som/domain/user/dto/JwtTokenDTO;", "signUp", "Lcom/smu/som/domain/user/dto/SignUpResponseDTO;", "signUpRequestDTO", "Lcom/smu/som/domain/user/dto/SignUpRequestDTO;", "signin", "signInRequestDTO", "Lcom/smu/som/domain/user/dto/SignInRequestDTO;", "som"})
@org.springframework.transaction.annotation.Transactional(readOnly = true)
@org.springframework.stereotype.Service
public class AuthService {
    private final com.smu.som.domain.user.oauth.OAuth2ServiceFactory oAuth2ServiceFactory = null;
    private final com.smu.som.domain.user.service.UserService userService = null;
    private final com.smu.som.common.jwt.service.JwtService jwtService = null;
    private final com.smu.som.domain.user.service.refresh.RefreshService refreshService = null;
    
    public AuthService(@org.jetbrains.annotations.NotNull
    com.smu.som.domain.user.oauth.OAuth2ServiceFactory oAuth2ServiceFactory, @org.jetbrains.annotations.NotNull
    com.smu.som.domain.user.service.UserService userService, @org.jetbrains.annotations.NotNull
    com.smu.som.common.jwt.service.JwtService jwtService, @org.jetbrains.annotations.NotNull
    com.smu.som.domain.user.service.refresh.RefreshService refreshService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.transaction.annotation.Transactional
    public com.smu.som.domain.user.dto.SignUpResponseDTO signUp(@org.jetbrains.annotations.NotNull
    com.smu.som.domain.user.dto.SignUpRequestDTO signUpRequestDTO) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.transaction.annotation.Transactional
    public com.smu.som.domain.user.dto.JwtTokenDTO signin(@org.jetbrains.annotations.NotNull
    com.smu.som.domain.user.dto.SignInRequestDTO signInRequestDTO) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.transaction.annotation.Transactional
    public com.smu.som.domain.user.dto.JwtTokenDTO refresh(@org.jetbrains.annotations.NotNull
    java.lang.String refreshToken) {
        return null;
    }
    
    @org.springframework.transaction.annotation.Transactional
    public void logout(@org.jetbrains.annotations.NotNull
    java.lang.String refreshToken, @org.jetbrains.annotations.NotNull
    java.lang.String accessToken) {
    }
}