package com.smu.som.common.dto;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u0000 \u0016*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0016B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u00a2\u0006\u0002\u0010\u0005R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\r\u00a8\u0006\u0017"}, d2 = {"Lcom/smu/som/common/dto/PageResult;", "T", "", "data", "Lorg/springframework/data/domain/Page;", "(Lorg/springframework/data/domain/Page;)V", "content", "", "getContent", "()Ljava/util/List;", "currentPage", "", "getCurrentPage", "()I", "pageSize", "getPageSize", "totalElements", "", "getTotalElements", "()J", "totalPage", "getTotalPage", "Companion", "som"})
public final class PageResult<T extends java.lang.Object> {
    private final int currentPage = 0;
    private final int totalPage = 0;
    private final int pageSize = 0;
    private final long totalElements = 0L;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<T> content = null;
    @org.jetbrains.annotations.NotNull
    public static final com.smu.som.common.dto.PageResult.Companion Companion = null;
    
    public PageResult(@org.jetbrains.annotations.NotNull
    org.springframework.data.domain.Page<T> data) {
        super();
    }
    
    public final int getCurrentPage() {
        return 0;
    }
    
    public final int getTotalPage() {
        return 0;
    }
    
    public final int getPageSize() {
        return 0;
    }
    
    public final long getTotalElements() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<T> getContent() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0007\u00a8\u0006\b"}, d2 = {"Lcom/smu/som/common/dto/PageResult$Companion;", "", "()V", "ok", "Lcom/smu/som/common/dto/PageResult;", "T", "data", "Lorg/springframework/data/domain/Page;", "som"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final <T extends java.lang.Object>com.smu.som.common.dto.PageResult<T> ok(@org.jetbrains.annotations.NotNull
        org.springframework.data.domain.Page<T> data) {
            return null;
        }
    }
}