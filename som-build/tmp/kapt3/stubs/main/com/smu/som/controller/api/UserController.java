package com.smu.som.controller.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0017\u00a8\u0006\u0007"}, d2 = {"Lcom/smu/som/controller/api/UserController;", "", "()V", "adultValidation", "Lorg/springframework/http/ResponseEntity;", "user", "Lcom/smu/som/domain/user/entity/User;", "som"})
@org.springframework.web.bind.annotation.RequestMapping(value = {"/api/user"})
@org.springframework.web.bind.annotation.RestController
public class UserController {
    
    public UserController() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.GetMapping(value = {"/validation/adult"})
    public org.springframework.http.ResponseEntity<java.lang.Object> adultValidation(@org.jetbrains.annotations.NotNull
    @com.smu.som.common.annotation.CurrentUser
    com.smu.som.domain.user.entity.User user) {
        return null;
    }
}