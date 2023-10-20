package com.smu.som.common.jwt.filter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0013H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/smu/som/common/jwt/filter/JwtAuthenticationFilter;", "Lorg/springframework/web/filter/GenericFilterBean;", "jwtResolver", "Lcom/smu/som/common/jwt/util/JwtResolver;", "(Lcom/smu/som/common/jwt/util/JwtResolver;)V", "doFilter", "", "request", "Ljavax/servlet/ServletRequest;", "response", "Ljavax/servlet/ServletResponse;", "chain", "Ljavax/servlet/FilterChain;", "sendErrorResponse", "Ljavax/servlet/http/HttpServletResponse;", "errorCode", "Lcom/smu/som/controller/error/ErrorCode;", "setAuthentication", "accessToken", "", "som"})
public final class JwtAuthenticationFilter extends org.springframework.web.filter.GenericFilterBean {
    private final com.smu.som.common.jwt.util.JwtResolver jwtResolver = null;
    
    public JwtAuthenticationFilter(@org.jetbrains.annotations.NotNull
    com.smu.som.common.jwt.util.JwtResolver jwtResolver) {
        super();
    }
    
    @java.lang.Override
    public void doFilter(@org.jetbrains.annotations.NotNull
    javax.servlet.ServletRequest request, @org.jetbrains.annotations.NotNull
    javax.servlet.ServletResponse response, @org.jetbrains.annotations.NotNull
    javax.servlet.FilterChain chain) {
    }
    
    private final void setAuthentication(java.lang.String accessToken) {
    }
    
    private final void sendErrorResponse(javax.servlet.http.HttpServletResponse response, com.smu.som.controller.error.ErrorCode errorCode) {
    }
}