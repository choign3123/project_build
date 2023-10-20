package com.smu.som.domain.user.oauth;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0012J\u0014\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u000e2\u0006\u0010\u000f\u001a\u00020\bH\u0012J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\bH\u0016J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\bH\u0012R\u000e\u0010\u0007\u001a\u00020\bX\u0092D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/smu/som/domain/user/oauth/KakaoOauth2ServiceImpl;", "Lcom/smu/som/domain/user/oauth/OAuth2Service;", "restTemplate", "Lorg/springframework/web/client/RestTemplate;", "objectMapper", "Lcom/fasterxml/jackson/databind/ObjectMapper;", "(Lorg/springframework/web/client/RestTemplate;Lcom/fasterxml/jackson/databind/ObjectMapper;)V", "KAKAO_USER_INFO_URI", "", "buildOAuth2User", "Lcom/smu/som/domain/user/dto/Oauth2UserDTO;", "jsonNode", "Lcom/fasterxml/jackson/databind/JsonNode;", "buildRequest", "Lorg/springframework/http/HttpEntity;", "oAuth2AccessToken", "getOAuth2User", "getProfileInfoFromProvider", "som"})
public class KakaoOauth2ServiceImpl implements com.smu.som.domain.user.oauth.OAuth2Service {
    private final org.springframework.web.client.RestTemplate restTemplate = null;
    private final com.fasterxml.jackson.databind.ObjectMapper objectMapper = null;
    private final java.lang.String KAKAO_USER_INFO_URI = "https://kapi.kakao.com/v2/user/me";
    
    public KakaoOauth2ServiceImpl(@org.jetbrains.annotations.NotNull
    org.springframework.web.client.RestTemplate restTemplate, @org.jetbrains.annotations.NotNull
    com.fasterxml.jackson.databind.ObjectMapper objectMapper) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.smu.som.domain.user.dto.Oauth2UserDTO getOAuth2User(@org.jetbrains.annotations.NotNull
    java.lang.String oAuth2AccessToken) {
        return null;
    }
    
    private com.fasterxml.jackson.databind.JsonNode getProfileInfoFromProvider(java.lang.String oAuth2AccessToken) {
        return null;
    }
    
    private org.springframework.http.HttpEntity<?> buildRequest(java.lang.String oAuth2AccessToken) {
        return null;
    }
    
    private com.smu.som.domain.user.dto.Oauth2UserDTO buildOAuth2User(com.fasterxml.jackson.databind.JsonNode jsonNode) {
        return null;
    }
}