package com.smu.som.controller.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0017J\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00062\b\b\u0001\u0010\u000b\u001a\u00020\fH\u0017J\u0012\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u000b\u001a\u00020\fH\u0017J\"\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00102\b\b\u0001\u0010\u0011\u001a\u00020\u00122\b\b\u0001\u0010\u0013\u001a\u00020\u0014H\u0017J\u001c\u0010\u0015\u001a\u00020\u000e2\b\b\u0001\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/smu/som/controller/api/AdminController;", "", "questionService", "Lcom/smu/som/domain/question/service/QuestionService;", "(Lcom/smu/som/domain/question/service/QuestionService;)V", "createQuestion", "Lorg/springframework/http/ResponseEntity;", "createQuestionDTO", "Lcom/smu/som/domain/question/dto/CreateQuestionDTO;", "deleteQuestion", "", "questionId", "", "getQuestion", "Lcom/smu/som/domain/question/dto/ReadQuestionDTO;", "getQuestions", "Lcom/smu/som/common/dto/PageResult;", "category", "", "pageable", "Lorg/springframework/data/domain/Pageable;", "updateQuestion", "som"})
@org.springframework.web.bind.annotation.RequestMapping(value = {"/admin/questions"})
@org.springframework.web.bind.annotation.RestController
public class AdminController {
    private final com.smu.som.domain.question.service.QuestionService questionService = null;
    
    public AdminController(@org.jetbrains.annotations.NotNull
    com.smu.som.domain.question.service.QuestionService questionService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.PostMapping
    public org.springframework.http.ResponseEntity<java.lang.Object> createQuestion(@org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.RequestBody
    com.smu.som.domain.question.dto.CreateQuestionDTO createQuestionDTO) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.GetMapping
    public com.smu.som.common.dto.PageResult<com.smu.som.domain.question.dto.ReadQuestionDTO> getQuestions(@org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.RequestParam(name = "category")
    java.lang.String category, @org.jetbrains.annotations.NotNull
    @org.springframework.data.web.PageableDefault(size = 10)
    org.springframework.data.domain.Pageable pageable) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.GetMapping(value = {"/{questionId}"})
    public com.smu.som.domain.question.dto.ReadQuestionDTO getQuestion(@org.springframework.web.bind.annotation.PathVariable(name = "questionId")
    long questionId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.PutMapping(value = {"/{questionId}"})
    public com.smu.som.domain.question.dto.ReadQuestionDTO updateQuestion(@org.springframework.web.bind.annotation.PathVariable
    long questionId, @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.RequestBody
    com.smu.som.domain.question.dto.CreateQuestionDTO createQuestionDTO) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.DeleteMapping(value = {"/{questionId}"})
    public org.springframework.http.ResponseEntity deleteQuestion(@org.springframework.web.bind.annotation.PathVariable
    long questionId) {
        return null;
    }
}