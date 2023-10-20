package com.smu.som.domain.admin.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/smu/som/domain/admin/service/AdminService;", "", "adminRepository", "Lcom/smu/som/domain/admin/repository/AdminRepository;", "passwordEncoder", "Lorg/springframework/security/crypto/password/PasswordEncoder;", "(Lcom/smu/som/domain/admin/repository/AdminRepository;Lorg/springframework/security/crypto/password/PasswordEncoder;)V", "isValid", "", "admin", "Lcom/smu/som/domain/admin/entity/Admin;", "password", "", "login", "loginRequestDTO", "Lcom/smu/som/domain/admin/dto/LoginRequestDTO;", "som"})
@org.springframework.transaction.annotation.Transactional(readOnly = true)
@org.springframework.stereotype.Service
public class AdminService {
    private final com.smu.som.domain.admin.repository.AdminRepository adminRepository = null;
    private final org.springframework.security.crypto.password.PasswordEncoder passwordEncoder = null;
    
    public AdminService(@org.jetbrains.annotations.NotNull
    com.smu.som.domain.admin.repository.AdminRepository adminRepository, @org.jetbrains.annotations.NotNull
    org.springframework.security.crypto.password.PasswordEncoder passwordEncoder) {
        super();
    }
    
    public boolean login(@org.jetbrains.annotations.NotNull
    com.smu.som.domain.admin.dto.LoginRequestDTO loginRequestDTO) {
        return false;
    }
    
    public boolean isValid(@org.jetbrains.annotations.NotNull
    com.smu.som.domain.admin.entity.Admin admin, @org.jetbrains.annotations.NotNull
    java.lang.String password) {
        return false;
    }
}