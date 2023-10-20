package com.smu.som.domain.question.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004J\u001e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0001\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006H&J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00062\u000e\b\u0001\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0006H&J&\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u00062\u000e\b\u0001\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\u0006\u0010\u000e\u001a\u00020\u000fH&J.\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u00062\u000e\b\u0001\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H&J&\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u00062\u000e\b\u0001\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\u0006\u0010\u0011\u001a\u00020\u0012H&\u00a8\u0006\u0014"}, d2 = {"Lcom/smu/som/domain/question/repository/QuestionRepository;", "Lorg/springframework/data/repository/CrudRepository;", "Lcom/smu/som/domain/question/entity/Question;", "", "Lcom/smu/som/domain/question/repository/QuestionRepositorySupport;", "findByIdIn", "", "Lcom/smu/som/domain/question/dto/ReadQuestionDTO;", "ids", "findByTargetIn", "Lcom/smu/som/domain/question/dto/RandomQuestionDTO;", "targets", "Lcom/smu/som/domain/question/entity/Target;", "findByTargetInAndCategory", "category", "Lcom/smu/som/domain/question/entity/Category;", "findByTargetInAndCategoryAndIsAdult", "isAdult", "", "findByTargetInAndIsAdult", "som"})
public abstract interface QuestionRepository extends org.springframework.data.repository.CrudRepository<com.smu.som.domain.question.entity.Question, java.lang.Long>, com.smu.som.domain.question.repository.QuestionRepositorySupport {
    
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<com.smu.som.domain.question.dto.RandomQuestionDTO> findByTargetInAndCategory(@org.jetbrains.annotations.NotNull
    @org.springframework.data.repository.query.Param(value = "targets")
    java.util.List<? extends com.smu.som.domain.question.entity.Target> targets, @org.jetbrains.annotations.NotNull
    com.smu.som.domain.question.entity.Category category);
    
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<com.smu.som.domain.question.dto.RandomQuestionDTO> findByTargetInAndCategoryAndIsAdult(@org.jetbrains.annotations.NotNull
    @org.springframework.data.repository.query.Param(value = "targets")
    java.util.List<? extends com.smu.som.domain.question.entity.Target> targets, @org.jetbrains.annotations.NotNull
    com.smu.som.domain.question.entity.Category category, @org.jetbrains.annotations.NotNull
    java.lang.String isAdult);
    
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<com.smu.som.domain.question.dto.RandomQuestionDTO> findByTargetIn(@org.jetbrains.annotations.NotNull
    @org.springframework.data.repository.query.Param(value = "targets")
    java.util.List<? extends com.smu.som.domain.question.entity.Target> targets);
    
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<com.smu.som.domain.question.dto.RandomQuestionDTO> findByTargetInAndIsAdult(@org.jetbrains.annotations.NotNull
    @org.springframework.data.repository.query.Param(value = "targets")
    java.util.List<? extends com.smu.som.domain.question.entity.Target> targets, @org.jetbrains.annotations.NotNull
    java.lang.String isAdult);
    
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<com.smu.som.domain.question.dto.ReadQuestionDTO> findByIdIn(@org.jetbrains.annotations.NotNull
    @org.springframework.data.repository.query.Param(value = "ids")
    java.util.List<java.lang.Long> ids);
}