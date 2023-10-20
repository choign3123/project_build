package com.smu.som.domain.user.service.refresh;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\nH\u0017J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u000eH\u0012J\u0018\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00068\u0012X\u0093D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/smu/som/domain/user/service/refresh/RefreshServiceDB;", "Lcom/smu/som/domain/user/service/refresh/RefreshService;", "refreshRepository", "Lcom/smu/som/domain/user/service/refresh/RefreshTokenRepository;", "(Lcom/smu/som/domain/user/service/refresh/RefreshTokenRepository;)V", "refreshTokenExpiry", "", "deleteRefresh", "", "refreshToken", "", "getRefresh", "isValidate", "", "Lcom/smu/som/domain/user/entity/RefreshToken;", "storeRefresh", "jwtToken", "Lcom/smu/som/domain/user/dto/JwtTokenDTO;", "oauth2Id", "som"})
@org.springframework.transaction.annotation.Transactional(readOnly = true)
@org.springframework.stereotype.Service
public class RefreshServiceDB implements com.smu.som.domain.user.service.refresh.RefreshService {
    private final com.smu.som.domain.user.service.refresh.RefreshTokenRepository refreshRepository = null;
    @org.springframework.beans.factory.annotation.Value(value = "${jwt.refresh-token-expiry}")
    private final long refreshTokenExpiry = 0L;
    
    public RefreshServiceDB(@org.jetbrains.annotations.NotNull
    com.smu.som.domain.user.service.refresh.RefreshTokenRepository refreshRepository) {
        super();
    }
    
    @java.lang.Override
    @org.springframework.transaction.annotation.Transactional
    public void storeRefresh(@org.jetbrains.annotations.NotNull
    com.smu.som.domain.user.dto.JwtTokenDTO jwtToken, @org.jetbrains.annotations.NotNull
    java.lang.String oauth2Id) {
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    @org.springframework.transaction.annotation.Transactional
    public java.lang.String getRefresh(@org.jetbrains.annotations.NotNull
    java.lang.String refreshToken) {
        return null;
    }
    
    @java.lang.Override
    public void deleteRefresh(@org.jetbrains.annotations.NotNull
    java.lang.String refreshToken) {
    }
    
    private boolean isValidate(com.smu.som.domain.user.entity.RefreshToken refreshToken) {
        return false;
    }
}