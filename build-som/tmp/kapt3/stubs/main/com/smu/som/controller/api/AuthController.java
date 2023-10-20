package com.smu.som.controller.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0012J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH\u0017J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\f2\u0006\u0010\r\u001a\u00020\u000eH\u0017J\u0018\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\f2\b\b\u0001\u0010\u0012\u001a\u00020\u0013H\u0017J\u0018\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\f2\b\b\u0001\u0010\t\u001a\u00020\nH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/smu/som/controller/api/AuthController;", "", "authService", "Lcom/smu/som/domain/user/service/AuthService;", "jwtResolver", "Lcom/smu/som/common/jwt/util/JwtResolver;", "(Lcom/smu/som/domain/user/service/AuthService;Lcom/smu/som/common/jwt/util/JwtResolver;)V", "isValidSignUpRequest", "", "signUpRequestDTO", "Lcom/smu/som/domain/user/dto/SignUpRequestDTO;", "logout", "Lorg/springframework/http/ResponseEntity;", "request", "Ljavax/servlet/http/HttpServletRequest;", "refresh", "Lcom/smu/som/domain/user/dto/JwtTokenDTO;", "signin", "signInRequestDTO", "Lcom/smu/som/domain/user/dto/SignInRequestDTO;", "signup", "Lcom/smu/som/domain/user/dto/SignUpResponseDTO;", "som"})
@org.springframework.web.bind.annotation.RequestMapping(value = {"/api/auth"})
@org.springframework.web.bind.annotation.RestController
public class AuthController {
    private final com.smu.som.domain.user.service.AuthService authService = null;
    private final com.smu.som.common.jwt.util.JwtResolver jwtResolver = null;
    
    public AuthController(@org.jetbrains.annotations.NotNull
    com.smu.som.domain.user.service.AuthService authService, @org.jetbrains.annotations.NotNull
    com.smu.som.common.jwt.util.JwtResolver jwtResolver) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.PostMapping(value = {"/signup"})
    public org.springframework.http.ResponseEntity<com.smu.som.domain.user.dto.SignUpResponseDTO> signup(@org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.RequestBody
    com.smu.som.domain.user.dto.SignUpRequestDTO signUpRequestDTO) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.PostMapping(value = {"/signin"})
    public org.springframework.http.ResponseEntity<com.smu.som.domain.user.dto.JwtTokenDTO> signin(@org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.RequestBody
    com.smu.som.domain.user.dto.SignInRequestDTO signInRequestDTO) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.PostMapping(value = {"/refresh"})
    public org.springframework.http.ResponseEntity<com.smu.som.domain.user.dto.JwtTokenDTO> refresh(@org.jetbrains.annotations.NotNull
    javax.servlet.http.HttpServletRequest request) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.PostMapping(value = {"/logout"})
    public org.springframework.http.ResponseEntity<java.lang.Object> logout(@org.jetbrains.annotations.NotNull
    javax.servlet.http.HttpServletRequest request) {
        return null;
    }
    
    private boolean isValidSignUpRequest(com.smu.som.domain.user.dto.SignUpRequestDTO signUpRequestDTO) {
        return false;
    }
}