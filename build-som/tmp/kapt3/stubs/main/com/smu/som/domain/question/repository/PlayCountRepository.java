package com.smu.som.domain.question.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\f"}, d2 = {"Lcom/smu/som/domain/question/repository/PlayCountRepository;", "Lorg/springframework/data/jpa/repository/JpaRepository;", "Lcom/smu/som/domain/question/entity/PlayCount;", "", "deleteByUserId", "", "userId", "", "existsByUserId", "", "findByUserId", "Lcom/smu/som/domain/question/dto/PlayCountDTO;", "som"})
public abstract interface PlayCountRepository extends org.springframework.data.jpa.repository.JpaRepository<com.smu.som.domain.question.entity.PlayCount, java.lang.Long> {
    
    public abstract boolean existsByUserId(@org.jetbrains.annotations.NotNull
    java.lang.String userId);
    
    @org.jetbrains.annotations.NotNull
    public abstract com.smu.som.domain.question.dto.PlayCountDTO findByUserId(@org.jetbrains.annotations.NotNull
    java.lang.String userId);
    
    public abstract void deleteByUserId(@org.jetbrains.annotations.NotNull
    java.lang.String userId);
}