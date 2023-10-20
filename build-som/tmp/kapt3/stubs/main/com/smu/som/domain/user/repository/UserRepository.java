package com.smu.som.domain.user.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\t"}, d2 = {"Lcom/smu/som/domain/user/repository/UserRepository;", "Lorg/springframework/data/jpa/repository/JpaRepository;", "Lcom/smu/som/domain/user/entity/User;", "", "existsByOauth2Id", "", "oauth2Id", "", "findByOauth2Id", "som"})
public abstract interface UserRepository extends org.springframework.data.jpa.repository.JpaRepository<com.smu.som.domain.user.entity.User, java.lang.Long> {
    
    @org.jetbrains.annotations.Nullable
    public abstract com.smu.som.domain.user.entity.User findByOauth2Id(@org.jetbrains.annotations.NotNull
    java.lang.String oauth2Id);
    
    public abstract boolean existsByOauth2Id(@org.jetbrains.annotations.NotNull
    java.lang.String oauth2Id);
}