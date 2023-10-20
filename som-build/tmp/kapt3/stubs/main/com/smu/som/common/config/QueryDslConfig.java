package com.smu.som.common.config;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0017R\u001e\u0010\u0003\u001a\u00020\u00048\u0016@\u0016X\u0097.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u000b"}, d2 = {"Lcom/smu/som/common/config/QueryDslConfig;", "", "()V", "em", "Ljavax/persistence/EntityManager;", "getEm", "()Ljavax/persistence/EntityManager;", "setEm", "(Ljavax/persistence/EntityManager;)V", "jpaQueryFactory", "Lcom/querydsl/jpa/impl/JPAQueryFactory;", "som"})
@org.springframework.context.annotation.Configuration
public class QueryDslConfig {
    @javax.persistence.PersistenceContext
    public javax.persistence.EntityManager em;
    
    public QueryDslConfig() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public javax.persistence.EntityManager getEm() {
        return null;
    }
    
    public void setEm(@org.jetbrains.annotations.NotNull
    javax.persistence.EntityManager p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.context.annotation.Bean
    public com.querydsl.jpa.impl.JPAQueryFactory jpaQueryFactory() {
        return null;
    }
}