package com.smu.som.controller.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\"\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\bH\u0017J\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0017J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0017J\"\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\bH\u0017J,\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000e\u001a\u00020\u000fH\u0017J,\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0011\u001a\u00020\b2\b\b\u0001\u0010\u0012\u001a\u00020\bH\u0017J\"\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0012\u001a\u00020\bH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/smu/som/controller/api/QuestionController;", "", "questionService", "Lcom/smu/som/domain/question/service/QuestionService;", "(Lcom/smu/som/domain/question/service/QuestionService;)V", "getPassQuestion", "Lorg/springframework/http/ResponseEntity;", "kakaoId", "", "target", "getPlayCount", "getQuestions", "getUsedQuestion", "myQuestion", "getUsedQuestionDTO", "Lcom/smu/som/domain/question/dto/GetUsedQuestionDTO;", "randomQuestion", "category", "adult", "randomTargetQuestion", "som"})
@org.springframework.web.bind.annotation.RequestMapping(value = {"/api"})
@org.springframework.web.bind.annotation.RestController
public class QuestionController {
    private final com.smu.som.domain.question.service.QuestionService questionService = null;
    
    public QuestionController(@org.jetbrains.annotations.NotNull
    com.smu.som.domain.question.service.QuestionService questionService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.GetMapping(value = {"/questions"}, produces = {"application/json"})
    public org.springframework.http.ResponseEntity<java.lang.Object> getQuestions() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.GetMapping(value = {"/question/{target}"})
    public org.springframework.http.ResponseEntity<java.lang.Object> randomTargetQuestion(@org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.PathVariable(name = "target")
    java.lang.String target, @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.RequestParam(value = "isAdult")
    java.lang.String adult) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.GetMapping(value = {"/question/{target}/{category}"})
    public org.springframework.http.ResponseEntity<java.lang.Object> randomQuestion(@org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.PathVariable(name = "target")
    java.lang.String target, @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.PathVariable(name = "category")
    java.lang.String category, @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.RequestParam(value = "isAdult")
    java.lang.String adult) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.PostMapping(value = {"/question/{kakaoid}/{target}"})
    public org.springframework.http.ResponseEntity<java.lang.Object> myQuestion(@org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.PathVariable(name = "kakaoid")
    java.lang.String kakaoId, @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.PathVariable(name = "target")
    java.lang.String target, @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.RequestBody
    com.smu.som.domain.question.dto.GetUsedQuestionDTO getUsedQuestionDTO) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.GetMapping(value = {"/question/{kakaoid}/{target}/used"})
    public org.springframework.http.ResponseEntity<java.lang.Object> getUsedQuestion(@org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.PathVariable(name = "kakaoid")
    java.lang.String kakaoId, @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.PathVariable(name = "target")
    java.lang.String target) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.GetMapping(value = {"/question/{kakaoid}/{target}/pass"})
    public org.springframework.http.ResponseEntity<java.lang.Object> getPassQuestion(@org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.PathVariable(name = "kakaoid")
    java.lang.String kakaoId, @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.PathVariable(name = "target")
    java.lang.String target) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.GetMapping(value = {"/question/playcount/{kakaoid}"})
    public org.springframework.http.ResponseEntity<java.lang.Object> getPlayCount(@org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.PathVariable(name = "kakaoid")
    java.lang.String kakaoId) {
        return null;
    }
}