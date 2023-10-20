package com.smu.som.controller.api;

import java.lang.System;

@lombok.RequiredArgsConstructor
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0017J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\rH\u0017J\u0014\u0010\u000e\u001a\u0004\u0018\u00010\t2\b\b\u0001\u0010\u000f\u001a\u00020\u000bH\u0017R\u001a\u0010\u0002\u001a\u00020\u0003X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\u0010"}, d2 = {"Lcom/smu/som/controller/api/ChatRoomController;", "", "chatService", "Lcom/smu/som/chatwithroom/ChatService;", "(Lcom/smu/som/chatwithroom/ChatService;)V", "getChatService", "()Lcom/smu/som/chatwithroom/ChatService;", "setChatService", "createRoom", "Lcom/smu/som/chatwithroom/ChatRoom;", "name", "", "room", "", "roomInfo", "roomId", "som"})
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
    @org.springframework.web.bind.annotation.ResponseBody
    @org.springframework.web.bind.annotation.GetMapping(value = {"/rooms"})
    public java.util.List<com.smu.som.chatwithroom.ChatRoom> room() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.ResponseBody
    @org.springframework.web.bind.annotation.PostMapping(value = {"/room"})
    public com.smu.som.chatwithroom.ChatRoom createRoom(@org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.RequestParam
    java.lang.String name) {
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