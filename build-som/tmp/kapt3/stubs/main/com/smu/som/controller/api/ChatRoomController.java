package com.smu.som.controller.api;

import java.lang.System;

@lombok.RequiredArgsConstructor
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J&\u0010\b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n0\t2\b\b\u0001\u0010\f\u001a\u00020\u000bH\u0017J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0017J\u001a\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0001\u0010\u0013\u001a\u00020\u000bH\u0017J\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\b\b\u0001\u0010\u0013\u001a\u00020\u000bH\u0017J\u0010\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0017R\u001a\u0010\u0002\u001a\u00020\u0003X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\u0016"}, d2 = {"Lcom/smu/som/controller/api/ChatRoomController;", "", "chatService", "Lcom/smu/som/chatwithroom/ChatService;", "(Lcom/smu/som/chatwithroom/ChatService;)V", "getChatService", "()Lcom/smu/som/chatwithroom/ChatService;", "setChatService", "createRoom", "Lorg/springframework/http/ResponseEntity;", "", "", "name", "room", "", "Lcom/smu/som/chatwithroom/ChatRoom;", "roomDetail", "model", "Lorg/springframework/ui/Model;", "roomId", "roomInfo", "rooms", "som"})
@org.springframework.web.bind.annotation.RequestMapping(value = {"/chat"})
@org.springframework.stereotype.Controller
public class ChatRoomController {
    @org.jetbrains.annotations.NotNull
    private com.smu.som.chatwithroom.ChatService chatService;
    
    public ChatRoomController(@org.jetbrains.annotations.NotNull
    com.smu.som.chatwithroom.ChatService chatService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public com.smu.som.chatwithroom.ChatService getChatService() {
        return null;
    }
    
    public void setChatService(@org.jetbrains.annotations.NotNull
    com.smu.som.chatwithroom.ChatService p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.GetMapping(value = {"/room"})
    public java.lang.String rooms(@org.jetbrains.annotations.NotNull
    org.springframework.ui.Model model) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.ResponseBody
    @org.springframework.web.bind.annotation.GetMapping(value = {"/rooms"})
    public java.util.List<com.smu.som.chatwithroom.ChatRoom> room() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.ResponseBody
    @org.springframework.web.bind.annotation.PostMapping(value = {"/room"})
    public org.springframework.http.ResponseEntity<java.util.Map<java.lang.String, java.lang.String>> createRoom(@org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.RequestParam
    java.lang.String name) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.GetMapping(value = {"room/enter/{roomId}"})
    public java.lang.String roomDetail(@org.jetbrains.annotations.NotNull
    org.springframework.ui.Model model, @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.PathVariable
    java.lang.String roomId) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @org.springframework.web.bind.annotation.ResponseBody
    @org.springframework.web.bind.annotation.GetMapping(value = {"/room/{roomId}"})
    public com.smu.som.chatwithroom.ChatRoom roomInfo(@org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.PathVariable
    java.lang.String roomId) {
        return null;
    }
}