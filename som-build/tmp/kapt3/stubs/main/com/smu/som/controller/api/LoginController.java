package com.smu.som.controller.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/smu/som/controller/api/LoginController;", "", "adminService", "Lcom/smu/som/domain/admin/service/AdminService;", "(Lcom/smu/som/domain/admin/service/AdminService;)V", "login", "", "loginRequestDTO", "Lcom/smu/som/domain/admin/dto/LoginRequestDTO;", "som"})
@org.springframework.web.bind.annotation.RequestMapping(value = {"/admin"})
@org.springframework.web.bind.annotation.RestController
public class LoginController {
    private final com.smu.som.domain.admin.service.AdminService adminService = null;
    
    public LoginController(@org.jetbrains.annotations.NotNull
    com.smu.som.domain.admin.service.AdminService adminService) {
        super();
    }
    
    @org.springframework.web.bind.annotation.PostMapping(value = {"/login"})
    public boolean login(@org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.RequestBody
    com.smu.som.domain.admin.dto.LoginRequestDTO loginRequestDTO) {
        return false;
    }
}