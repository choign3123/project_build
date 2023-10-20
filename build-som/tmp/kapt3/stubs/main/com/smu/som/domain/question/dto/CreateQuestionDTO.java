package com.smu.som.domain.question.dto;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B-\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0006\u0010\u0017\u001a\u00020\u0018R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006\u0019"}, d2 = {"Lcom/smu/som/domain/question/dto/CreateQuestionDTO;", "", "target", "Lcom/smu/som/domain/question/entity/Target;", "question", "", "isAdult", "category", "Lcom/smu/som/domain/question/entity/Category;", "(Lcom/smu/som/domain/question/entity/Target;Ljava/lang/String;Ljava/lang/String;Lcom/smu/som/domain/question/entity/Category;)V", "getCategory", "()Lcom/smu/som/domain/question/entity/Category;", "setCategory", "(Lcom/smu/som/domain/question/entity/Category;)V", "()Ljava/lang/String;", "setAdult", "(Ljava/lang/String;)V", "getQuestion", "setQuestion", "getTarget", "()Lcom/smu/som/domain/question/entity/Target;", "setTarget", "(Lcom/smu/som/domain/question/entity/Target;)V", "toEntity", "Lcom/smu/som/domain/question/entity/Question;", "som"})
public final class CreateQuestionDTO {
    @org.jetbrains.annotations.NotNull
    private com.smu.som.domain.question.entity.Target target;
    @org.jetbrains.annotations.NotNull
    private java.lang.String question;
    @org.jetbrains.annotations.NotNull
    private java.lang.String isAdult;
    @org.jetbrains.annotations.NotNull
    private com.smu.som.domain.question.entity.Category category;
    
    public CreateQuestionDTO(@org.jetbrains.annotations.NotNull
    @com.fasterxml.jackson.annotation.JsonProperty(value = "target")
    com.smu.som.domain.question.entity.Target target, @org.jetbrains.annotations.NotNull
    @com.fasterxml.jackson.annotation.JsonProperty(value = "question")
    java.lang.String question, @org.jetbrains.annotations.NotNull
    @com.fasterxml.jackson.annotation.JsonProperty(value = "isAdult")
    java.lang.String isAdult, @org.jetbrains.annotations.NotNull
    @com.fasterxml.jackson.annotation.JsonProperty(value = "category")
    com.smu.som.domain.question.entity.Category category) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.smu.som.domain.question.entity.Target getTarget() {
        return null;
    }
    
    public final void setTarget(@org.jetbrains.annotations.NotNull
    com.smu.som.domain.question.entity.Target p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getQuestion() {
        return null;
    }
    
    public final void setQuestion(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String isAdult() {
        return null;
    }
    
    public final void setAdult(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.smu.som.domain.question.entity.Category getCategory() {
        return null;
    }
    
    public final void setCategory(@org.jetbrains.annotations.NotNull
    com.smu.som.domain.question.entity.Category p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.smu.som.domain.question.entity.Question toEntity() {
        return null;
    }
}