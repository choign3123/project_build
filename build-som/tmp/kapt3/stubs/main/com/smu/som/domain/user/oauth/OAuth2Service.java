package com.smu.som.domain.user.oauth;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/smu/som/domain/user/oauth/OAuth2Service;", "", "getOAuth2User", "Lcom/smu/som/domain/user/dto/Oauth2UserDTO;", "oAuth2AccessToken", "", "som"})
@org.springframework.stereotype.Service
public abstract interface OAuth2Service {
    
    @org.jetbrains.annotations.NotNull
    public abstract com.smu.som.domain.user.dto.Oauth2UserDTO getOAuth2User(@org.jetbrains.annotations.NotNull
    java.lang.String oAuth2AccessToken);
}