package com.smu.som.domain.question.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u001cH\u0016R\u001e\u0010\b\u001a\u00020\t8\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\n\u001a\u00020\u00078\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u0007X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\u001e\u0010\u0004\u001a\u00020\u00058\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u0006\""}, d2 = {"Lcom/smu/som/domain/question/entity/Question;", "", "id", "", "target", "Lcom/smu/som/domain/question/entity/Target;", "question", "", "category", "Lcom/smu/som/domain/question/entity/Category;", "isAdult", "(JLcom/smu/som/domain/question/entity/Target;Ljava/lang/String;Lcom/smu/som/domain/question/entity/Category;Ljava/lang/String;)V", "getCategory", "()Lcom/smu/som/domain/question/entity/Category;", "setCategory", "(Lcom/smu/som/domain/question/entity/Category;)V", "getId", "()J", "()Ljava/lang/String;", "setAdult", "(Ljava/lang/String;)V", "getQuestion", "setQuestion", "getTarget", "()Lcom/smu/som/domain/question/entity/Target;", "setTarget", "(Lcom/smu/som/domain/question/entity/Target;)V", "toCreateQuestionDTO", "Lcom/smu/som/domain/question/dto/CreateQuestionDTO;", "toReadQuestionDTO", "Lcom/smu/som/domain/question/dto/ReadQuestionDTO;", "update", "", "createQuestionDTO", "som"})
@javax.persistence.Table(name = "question")
@javax.persistence.Entity
public class Question {
    @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @javax.persistence.Id
    private final long id = 0L;
    @org.jetbrains.annotations.NotNull
    @javax.persistence.Enumerated(value = javax.persistence.EnumType.STRING)
    private com.smu.som.domain.question.entity.Target target;
    @org.jetbrains.annotations.NotNull
    private java.lang.String question;
    @org.jetbrains.annotations.NotNull
    @javax.persistence.Enumerated(value = javax.persistence.EnumType.STRING)
    private com.smu.som.domain.question.entity.Category category;
    @org.jetbrains.annotations.NotNull
    @javax.persistence.Column(length = 1)
    private java.lang.String isAdult;
    
    public Question(long id, @org.jetbrains.annotations.NotNull
    com.smu.som.domain.question.entity.Target target, @org.jetbrains.annotations.NotNull
    java.lang.String question, @org.jetbrains.annotations.NotNull
    com.smu.som.domain.question.entity.Category category, @org.jetbrains.annotations.NotNull
    java.lang.String isAdult) {
        super();
    }
    
    public long getId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull
    public com.smu.som.domain.question.entity.Target getTarget() {
        return null;
    }
    
    public void setTarget(@org.jetbrains.annotations.NotNull
    com.smu.som.domain.question.entity.Target p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public java.lang.String getQuestion() {
        return null;
    }
    
    public void setQuestion(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public com.smu.som.domain.question.entity.Category getCategory() {
        return null;
    }
    
    public void setCategory(@org.jetbrains.annotations.NotNull
    com.smu.som.domain.question.entity.Category p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public java.lang.String isAdult() {
        return null;
    }
    
    public void setAdult(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public com.smu.som.domain.question.dto.ReadQuestionDTO toReadQuestionDTO() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public com.smu.som.domain.question.dto.CreateQuestionDTO toCreateQuestionDTO() {
        return null;
    }
    
    public void update(@org.jetbrains.annotations.NotNull
    com.smu.som.domain.question.dto.CreateQuestionDTO createQuestionDTO) {
    }
}