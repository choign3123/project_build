package com.smu.som.domain.user.service.refresh;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H&\u00a8\u0006\u000b"}, d2 = {"Lcom/smu/som/domain/user/service/refresh/RefreshService;", "", "deleteRefresh", "", "refreshToken", "", "getRefresh", "storeRefresh", "jwtToken", "Lcom/smu/som/domain/user/dto/JwtTokenDTO;", "oauth2Id", "som"})
public abstract interface RefreshService {
    
    public abstract void storeRefresh(@org.jetbrains.annotations.NotNull
    com.smu.som.domain.user.dto.JwtTokenDTO jwtToken, @org.jetbrains.annotations.NotNull
    java.lang.String oauth2Id);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.String getRefresh(@org.jetbrains.annotations.NotNull
    java.lang.String refreshToken);
    
    public abstract void deleteRefresh(@org.jetbrains.annotations.NotNull
    java.lang.String refreshToken);
}