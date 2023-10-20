package com.smu.som.chatwithroom;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\bH\u0016\u00a8\u0006\t"}, d2 = {"Lcom/smu/som/chatwithroom/ChatConfig;", "Lorg/springframework/web/socket/config/annotation/WebSocketMessageBrokerConfigurer;", "()V", "configureMessageBroker", "", "registry", "Lorg/springframework/messaging/simp/config/MessageBrokerRegistry;", "registerStompEndpoints", "Lorg/springframework/web/socket/config/annotation/StompEndpointRegistry;", "som"})
@org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker
@org.springframework.context.annotation.Configuration
public class ChatConfig implements org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer {
    
    public ChatConfig() {
        super();
    }
    
    @java.lang.Override
    public void registerStompEndpoints(@org.jetbrains.annotations.NotNull
    org.springframework.web.socket.config.annotation.StompEndpointRegistry registry) {
    }
    
    @java.lang.Override
    public void configureMessageBroker(@org.jetbrains.annotations.NotNull
    org.springframework.messaging.simp.config.MessageBrokerRegistry registry) {
    }
}