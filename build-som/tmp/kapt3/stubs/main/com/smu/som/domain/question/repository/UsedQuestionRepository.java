package com.smu.som.domain.question.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH&J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\n"}, d2 = {"Lcom/smu/som/domain/question/repository/UsedQuestionRepository;", "Lorg/springframework/data/jpa/repository/JpaRepository;", "Lcom/smu/som/domain/question/entity/UsedQuestion;", "", "findByUserIdAndPassIsNotNull", "", "Lcom/smu/som/domain/question/dto/UsedQuestionDTO;", "userId", "", "findByUserIdAndUsedIsNotNull", "som"})
public abstract interface UsedQuestionRepository extends org.springframework.data.jpa.repository.JpaRepository<com.smu.som.domain.question.entity.UsedQuestion, java.lang.Long> {
    
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<com.smu.som.domain.question.dto.UsedQuestionDTO> findByUserIdAndUsedIsNotNull(@org.jetbrains.annotations.NotNull
    java.lang.String userId);
    
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<com.smu.som.domain.question.dto.UsedQuestionDTO> findByUserIdAndPassIsNotNull(@org.jetbrains.annotations.NotNull
    java.lang.String userId);
}