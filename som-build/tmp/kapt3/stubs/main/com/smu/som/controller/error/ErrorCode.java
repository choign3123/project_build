package com.smu.som.controller.error;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015\u00a8\u0006\u0016"}, d2 = {"Lcom/smu/som/controller/error/ErrorCode;", "", "status", "Lorg/springframework/http/HttpStatus;", "message", "", "(Ljava/lang/String;ILorg/springframework/http/HttpStatus;Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "getStatus", "()Lorg/springframework/http/HttpStatus;", "INTERNAL_SERVER_ERROR", "QUESTION_NOT_FOUND", "USER_NOT_FOUND", "USER_DUPLICATED", "EXPIRED_JWT", "INVALID_JWT", "INVALID_SIGNUP_REQUEST", "OAUTH2_FAIL_EXCEPTION", "EXPIRED_REFRESH_TOKEN", "INVALID_REFRESH_TOKEN", "LOGOUT_TOKEN", "som"})
public enum ErrorCode {
    /*public static final*/ INTERNAL_SERVER_ERROR /* = new INTERNAL_SERVER_ERROR(null, null) */,
    /*public static final*/ QUESTION_NOT_FOUND /* = new QUESTION_NOT_FOUND(null, null) */,
    /*public static final*/ USER_NOT_FOUND /* = new USER_NOT_FOUND(null, null) */,
    /*public static final*/ USER_DUPLICATED /* = new USER_DUPLICATED(null, null) */,
    /*public static final*/ EXPIRED_JWT /* = new EXPIRED_JWT(null, null) */,
    /*public static final*/ INVALID_JWT /* = new INVALID_JWT(null, null) */,
    /*public static final*/ INVALID_SIGNUP_REQUEST /* = new INVALID_SIGNUP_REQUEST(null, null) */,
    /*public static final*/ OAUTH2_FAIL_EXCEPTION /* = new OAUTH2_FAIL_EXCEPTION(null, null) */,
    /*public static final*/ EXPIRED_REFRESH_TOKEN /* = new EXPIRED_REFRESH_TOKEN(null, null) */,
    /*public static final*/ INVALID_REFRESH_TOKEN /* = new INVALID_REFRESH_TOKEN(null, null) */,
    /*public static final*/ LOGOUT_TOKEN /* = new LOGOUT_TOKEN(null, null) */;
    @org.jetbrains.annotations.NotNull
    private final org.springframework.http.HttpStatus status = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String message = null;
    
    ErrorCode(org.springframework.http.HttpStatus status, java.lang.String message) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.springframework.http.HttpStatus getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMessage() {
        return null;
    }
}