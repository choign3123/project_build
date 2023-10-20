package com.smu.som.chatwithroom;

import java.lang.System;

@lombok.NoArgsConstructor
@lombok.RequiredArgsConstructor
@lombok.extern.slf4j.Slf4j
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B+\u0012$\b\u0002\u0010\u0002\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005`\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0004H\u0016J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000eH\u0016J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0010\u001a\u00020\u0004H\u0016R6\u0010\u0002\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005`\u0006X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lcom/smu/som/chatwithroom/ChatService;", "", "chatRooms", "Ljava/util/HashMap;", "", "Lcom/smu/som/chatwithroom/ChatRoom;", "Lkotlin/collections/HashMap;", "(Ljava/util/HashMap;)V", "getChatRooms", "()Ljava/util/HashMap;", "setChatRooms", "createRoom", "name", "findAllRoom", "", "findById", "roomId", "som"})
@org.springframework.stereotype.Service
public class ChatService {
    @org.jetbrains.annotations.NotNull
    private java.util.HashMap<java.lang.String, com.smu.som.chatwithroom.ChatRoom> chatRooms;
    
    public ChatService() {
        super();
    }
    
    public ChatService(@org.jetbrains.annotations.NotNull
    java.util.HashMap<java.lang.String, com.smu.som.chatwithroom.ChatRoom> chatRooms) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public java.util.HashMap<java.lang.String, com.smu.som.chatwithroom.ChatRoom> getChatRooms() {
        return null;
    }
    
    public void setChatRooms(@org.jetbrains.annotations.NotNull
    java.util.HashMap<java.lang.String, com.smu.som.chatwithroom.ChatRoom> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public java.util.List<com.smu.som.chatwithroom.ChatRoom> findAllRoom() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public com.smu.som.chatwithroom.ChatRoom findById(@org.jetbrains.annotations.NotNull
    java.lang.String roomId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public com.smu.som.chatwithroom.ChatRoom createRoom(@org.jetbrains.annotations.NotNull
    java.lang.String name) {
        return null;
    }
}