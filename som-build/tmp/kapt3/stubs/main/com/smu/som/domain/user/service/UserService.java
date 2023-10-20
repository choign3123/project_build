package com.smu.som.domain.user.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/smu/som/domain/user/service/UserService;", "", "userRepository", "Lcom/smu/som/domain/user/repository/UserRepository;", "(Lcom/smu/som/domain/user/repository/UserRepository;)V", "existsByOauth2Id", "", "oauth2Id", "", "findByOauth2Id", "Lcom/smu/som/domain/user/entity/User;", "saveUser", "user", "som"})
@org.springframework.transaction.annotation.Transactional(readOnly = true)
@org.springframework.stereotype.Service
public class UserService {
    private final com.smu.som.domain.user.repository.UserRepository userRepository = null;
    
    public UserService(@org.jetbrains.annotations.NotNull
    com.smu.som.domain.user.repository.UserRepository userRepository) {
        super();
    }
    
    public boolean existsByOauth2Id(@org.jetbrains.annotations.NotNull
    java.lang.String oauth2Id) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable
    public com.smu.som.domain.user.entity.User findByOauth2Id(@org.jetbrains.annotations.NotNull
    java.lang.String oauth2Id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.transaction.annotation.Transactional
    public com.smu.som.domain.user.entity.User saveUser(@org.jetbrains.annotations.NotNull
    com.smu.som.domain.user.entity.User user) {
        return null;
    }
}