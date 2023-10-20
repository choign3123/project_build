package com.smu.som.domain.user.oauth;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/smu/som/domain/user/oauth/OAuth2ServiceFactory;", "", "restTemplate", "Lorg/springframework/web/client/RestTemplate;", "objectMapper", "Lcom/fasterxml/jackson/databind/ObjectMapper;", "(Lorg/springframework/web/client/RestTemplate;Lcom/fasterxml/jackson/databind/ObjectMapper;)V", "getOAuthService", "Lcom/smu/som/domain/user/oauth/OAuth2Service;", "authorizationServer", "Lcom/smu/som/domain/user/entity/Oauth2Provider;", "som"})
@org.springframework.stereotype.Component
public class OAuth2ServiceFactory {
    private final org.springframework.web.client.RestTemplate restTemplate = null;
    private final com.fasterxml.jackson.databind.ObjectMapper objectMapper = null;
    
    public OAuth2ServiceFactory(@org.jetbrains.annotations.NotNull
    org.springframework.web.client.RestTemplate restTemplate, @org.jetbrains.annotations.NotNull
    com.fasterxml.jackson.databind.ObjectMapper objectMapper) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public com.smu.som.domain.user.oauth.OAuth2Service getOAuthService(@org.jetbrains.annotations.NotNull
    com.smu.som.domain.user.entity.Oauth2Provider authorizationServer) {
        return null;
    }
}