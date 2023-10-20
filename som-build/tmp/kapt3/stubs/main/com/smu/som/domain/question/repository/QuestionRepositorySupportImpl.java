package com.smu.som.domain.question.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0012J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u00102\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u0012J\u0017\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\b\u001a\u00020\tH\u0012\u00a2\u0006\u0002\u0010\u0013R\u000e\u0010\u0003\u001a\u00020\u0004X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/smu/som/domain/question/repository/QuestionRepositorySupportImpl;", "Lcom/smu/som/domain/question/repository/QuestionRepositorySupport;", "Lorg/springframework/data/jpa/repository/support/QuerydslRepositorySupport;", "queryFactory", "Lcom/querydsl/jpa/impl/JPAQueryFactory;", "(Lcom/querydsl/jpa/impl/JPAQueryFactory;)V", "categoryEq", "Lcom/querydsl/core/types/dsl/BooleanExpression;", "category", "Lcom/smu/som/domain/question/entity/Category;", "findByCategory", "Lorg/springframework/data/domain/Page;", "Lcom/smu/som/domain/question/entity/Question;", "pageable", "Lorg/springframework/data/domain/Pageable;", "getContent", "", "getCount", "", "(Lcom/smu/som/domain/question/entity/Category;)Ljava/lang/Long;", "som"})
public class QuestionRepositorySupportImpl extends org.springframework.data.jpa.repository.support.QuerydslRepositorySupport implements com.smu.som.domain.question.repository.QuestionRepositorySupport {
    private final com.querydsl.jpa.impl.JPAQueryFactory queryFactory = null;
    
    public QuestionRepositorySupportImpl(@org.jetbrains.annotations.NotNull
    com.querydsl.jpa.impl.JPAQueryFactory queryFactory) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public org.springframework.data.domain.Page<com.smu.som.domain.question.entity.Question> findByCategory(@org.jetbrains.annotations.NotNull
    com.smu.som.domain.question.entity.Category category, @org.jetbrains.annotations.NotNull
    org.springframework.data.domain.Pageable pageable) {
        return null;
    }
    
    private com.querydsl.core.types.dsl.BooleanExpression categoryEq(com.smu.som.domain.question.entity.Category category) {
        return null;
    }
    
    private java.util.List<com.smu.som.domain.question.entity.Question> getContent(com.smu.som.domain.question.entity.Category category, org.springframework.data.domain.Pageable pageable) {
        return null;
    }
    
    private java.lang.Long getCount(com.smu.som.domain.question.entity.Category category) {
        return null;
    }
}