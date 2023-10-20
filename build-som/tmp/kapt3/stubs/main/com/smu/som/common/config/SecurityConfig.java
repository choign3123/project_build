package com.smu.som.common.config;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0017J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0017J\n\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/smu/som/common/config/SecurityConfig;", "", "jwtResolver", "Lcom/smu/som/common/jwt/util/JwtResolver;", "(Lcom/smu/som/common/jwt/util/JwtResolver;)V", "encoder", "Lorg/springframework/security/crypto/password/PasswordEncoder;", "filterChain", "Lorg/springframework/security/web/SecurityFilterChain;", "http", "Lorg/springframework/security/config/annotation/web/builders/HttpSecurity;", "webSecurityCustomizer", "Lorg/springframework/security/config/annotation/web/configuration/WebSecurityCustomizer;", "som"})
@org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
public class SecurityConfig {
    private final com.smu.som.common.jwt.util.JwtResolver jwtResolver = null;
    
    public SecurityConfig(@org.jetbrains.annotations.NotNull
    com.smu.som.common.jwt.util.JwtResolver jwtResolver) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @org.springframework.context.annotation.Bean
    public org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer webSecurityCustomizer() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.context.annotation.Bean
    public org.springframework.security.web.SecurityFilterChain filterChain(@org.jetbrains.annotations.Nullable
    org.springframework.security.config.annotation.web.builders.HttpSecurity http) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.context.annotation.Bean
    public org.springframework.security.crypto.password.PasswordEncoder encoder() {
        return null;
    }
}