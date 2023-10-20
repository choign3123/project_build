package com.smu.som.domain.question.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0017J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0017J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0017J\u001e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u000e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0016J\u001e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00180\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0016J$\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00020\u001a2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00150\u0017H\u0012J\u001e\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0018\u0010&\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u001aH\u0017J&\u0010\'\u001a\b\u0012\u0004\u0012\u00020(0\u00172\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020!2\u0006\u0010)\u001a\u00020\nH\u0016J\u001e\u0010\'\u001a\b\u0012\u0004\u0012\u00020(0\u00172\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020\nH\u0016J\u0018\u0010*\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0010H\u0017R\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006+"}, d2 = {"Lcom/smu/som/domain/question/service/QuestionService;", "", "questionRepository", "Lcom/smu/som/domain/question/repository/QuestionRepository;", "usedQuestionRepository", "Lcom/smu/som/domain/question/repository/UsedQuestionRepository;", "playCountRepository", "Lcom/smu/som/domain/question/repository/PlayCountRepository;", "(Lcom/smu/som/domain/question/repository/QuestionRepository;Lcom/smu/som/domain/question/repository/UsedQuestionRepository;Lcom/smu/som/domain/question/repository/PlayCountRepository;)V", "addQuestionInMyPage", "", "kakaoId", "", "getUsedQuestionDTO", "Lcom/smu/som/domain/question/dto/GetUsedQuestionDTO;", "createQuestion", "Lcom/smu/som/domain/question/dto/CreateQuestionDTO;", "createQuestionDTO", "deleteQuestion", "", "questionId", "", "getPassQuestion", "", "Lcom/smu/som/domain/question/dto/ReadQuestionDTO;", "target", "Lcom/smu/som/domain/question/entity/Target;", "getPlayCount", "Lcom/smu/som/domain/question/dto/PlayCountDTO;", "getQuestion", "getQuestions", "Lcom/smu/som/common/dto/PageResult;", "category", "Lcom/smu/som/domain/question/entity/Category;", "pageable", "Lorg/springframework/data/domain/Pageable;", "ids", "getUsedQuestion", "increasePlayCount", "randomQuestion", "Lcom/smu/som/domain/question/dto/RandomQuestionDTO;", "isAdult", "updateQuestion", "som"})
@org.springframework.transaction.annotation.Transactional(readOnly = true)
@org.springframework.stereotype.Service
public class QuestionService {
    private final com.smu.som.domain.question.repository.QuestionRepository questionRepository = null;
    private final com.smu.som.domain.question.repository.UsedQuestionRepository usedQuestionRepository = null;
    private final com.smu.som.domain.question.repository.PlayCountRepository playCountRepository = null;
    
    public QuestionService(@org.jetbrains.annotations.NotNull
    com.smu.som.domain.question.repository.QuestionRepository questionRepository, @org.jetbrains.annotations.NotNull
    com.smu.som.domain.question.repository.UsedQuestionRepository usedQuestionRepository, @org.jetbrains.annotations.NotNull
    com.smu.som.domain.question.repository.PlayCountRepository playCountRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public java.util.List<com.smu.som.domain.question.dto.ReadQuestionDTO> getQuestions() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public com.smu.som.common.dto.PageResult<com.smu.som.domain.question.dto.ReadQuestionDTO> getQuestions(@org.jetbrains.annotations.NotNull
    com.smu.som.domain.question.entity.Category category, @org.jetbrains.annotations.NotNull
    org.springframework.data.domain.Pageable pageable) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public com.smu.som.domain.question.dto.ReadQuestionDTO getQuestion(long questionId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.transaction.annotation.Transactional
    public com.smu.som.domain.question.dto.ReadQuestionDTO updateQuestion(long questionId, @org.jetbrains.annotations.NotNull
    com.smu.som.domain.question.dto.CreateQuestionDTO createQuestionDTO) {
        return null;
    }
    
    @org.springframework.transaction.annotation.Transactional
    public void deleteQuestion(long questionId) {
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.transaction.annotation.Transactional
    public com.smu.som.domain.question.dto.CreateQuestionDTO createQuestion(@org.jetbrains.annotations.NotNull
    com.smu.som.domain.question.dto.CreateQuestionDTO createQuestionDTO) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public java.util.List<com.smu.som.domain.question.dto.RandomQuestionDTO> randomQuestion(@org.jetbrains.annotations.NotNull
    com.smu.som.domain.question.entity.Target target, boolean isAdult) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public java.util.List<com.smu.som.domain.question.dto.RandomQuestionDTO> randomQuestion(@org.jetbrains.annotations.NotNull
    com.smu.som.domain.question.entity.Target target, @org.jetbrains.annotations.NotNull
    com.smu.som.domain.question.entity.Category category, boolean isAdult) {
        return null;
    }
    
    @org.springframework.transaction.annotation.Transactional
    public boolean addQuestionInMyPage(@org.jetbrains.annotations.NotNull
    java.lang.String kakaoId, @org.jetbrains.annotations.NotNull
    com.smu.som.domain.question.dto.GetUsedQuestionDTO getUsedQuestionDTO) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public java.util.List<com.smu.som.domain.question.dto.ReadQuestionDTO> getUsedQuestion(@org.jetbrains.annotations.NotNull
    java.lang.String kakaoId, @org.jetbrains.annotations.NotNull
    com.smu.som.domain.question.entity.Target target) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public java.util.List<com.smu.som.domain.question.dto.ReadQuestionDTO> getPassQuestion(@org.jetbrains.annotations.NotNull
    java.lang.String kakaoId, @org.jetbrains.annotations.NotNull
    com.smu.som.domain.question.entity.Target target) {
        return null;
    }
    
    private java.util.List<com.smu.som.domain.question.dto.ReadQuestionDTO> getQuestions(com.smu.som.domain.question.entity.Target target, java.util.List<java.lang.Long> ids) {
        return null;
    }
    
    @org.springframework.transaction.annotation.Transactional
    public boolean increasePlayCount(@org.jetbrains.annotations.NotNull
    java.lang.String kakaoId, @org.jetbrains.annotations.NotNull
    com.smu.som.domain.question.entity.Target target) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public com.smu.som.domain.question.dto.PlayCountDTO getPlayCount(@org.jetbrains.annotations.NotNull
    java.lang.String kakaoId) {
        return null;
    }
}