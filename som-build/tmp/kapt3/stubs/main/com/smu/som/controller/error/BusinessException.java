package com.smu.som.controller.error;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/smu/som/controller/error/BusinessException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "errorCode", "Lcom/smu/som/controller/error/ErrorCode;", "(Lcom/smu/som/controller/error/ErrorCode;)V", "getErrorCode", "()Lcom/smu/som/controller/error/ErrorCode;", "som"})
public class BusinessException extends java.lang.RuntimeException {
    @org.jetbrains.annotations.NotNull
    private final com.smu.som.controller.error.ErrorCode errorCode = null;
    
    public BusinessException(@org.jetbrains.annotations.NotNull
    com.smu.som.controller.error.ErrorCode errorCode) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.smu.som.controller.error.ErrorCode getErrorCode() {
        return null;
    }
}