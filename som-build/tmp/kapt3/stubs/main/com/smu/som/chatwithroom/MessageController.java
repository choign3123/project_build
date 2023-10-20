package com.smu.som.chatwithroom;

import java.lang.System;

@lombok.NoArgsConstructor
@lombok.RequiredArgsConstructor
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0017J\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u0017R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\f"}, d2 = {"Lcom/smu/som/chatwithroom/MessageController;", "", "sendingOperations", "Lorg/springframework/messaging/simp/SimpMessageSendingOperations;", "(Lorg/springframework/messaging/simp/SimpMessageSendingOperations;)V", "getSendingOperations", "()Lorg/springframework/messaging/simp/SimpMessageSendingOperations;", "enter", "", "chatMessage", "Lcom/smu/som/chatwithroom/ChatMessage;", "sendMessage", "som"})
@org.springframework.web.bind.annotation.RestController
public class MessageController {
    @org.jetbrains.annotations.NotNull
    private final org.springframework.messaging.simp.SimpMessageSendingOperations sendingOperations = null;
    
    public MessageController(@org.jetbrains.annotations.NotNull
    org.springframework.messaging.simp.SimpMessageSendingOperations sendingOperations) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public org.springframework.messaging.simp.SimpMessageSendingOperations getSendingOperations() {
        return null;
    }
    
    @org.springframework.messaging.handler.annotation.MessageMapping(value = {"/chat/message"})
    public void enter(@org.jetbrains.annotations.NotNull
    com.smu.som.chatwithroom.ChatMessage chatMessage) {
    }
    
    @org.jetbrains.annotations.Nullable
    @org.springframework.messaging.handler.annotation.SendTo(value = {"/topic/public"})
    @org.springframework.messaging.handler.annotation.MessageMapping(value = {"/chat.sendMessage"})
    public com.smu.som.chatwithroom.ChatMessage sendMessage(@org.jetbrains.annotations.Nullable
    @org.springframework.messaging.handler.annotation.Payload
    com.smu.som.chatwithroom.ChatMessage chatMessage) {
        return null;
    }
}