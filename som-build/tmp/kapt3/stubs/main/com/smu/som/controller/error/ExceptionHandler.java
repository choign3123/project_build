package com.smu.som.controller.error;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0017J\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\u0010\u0006\u001a\u00060\tj\u0002`\nH\u0017\u00a8\u0006\u000b"}, d2 = {"Lcom/smu/som/controller/error/ExceptionHandler;", "", "()V", "handleBaseException", "Lorg/springframework/http/ResponseEntity;", "Lcom/smu/som/controller/error/ErrorResponse;", "e", "Lcom/smu/som/controller/error/BusinessException;", "handleUnexpectedException", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "som"})
@org.springframework.web.bind.annotation.RestControllerAdvice
public class ExceptionHandler {
    
    public ExceptionHandler() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.ExceptionHandler(value = {com.smu.som.controller.error.BusinessException.class})
    public org.springframework.http.ResponseEntity<com.smu.som.controller.error.ErrorResponse> handleBaseException(@org.jetbrains.annotations.NotNull
    com.smu.som.controller.error.BusinessException e) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.ExceptionHandler(value = {java.lang.RuntimeException.class})
    public org.springframework.http.ResponseEntity<com.smu.som.controller.error.ErrorResponse> handleUnexpectedException(@org.jetbrains.annotations.NotNull
    java.lang.RuntimeException e) {
        return null;
    }
}