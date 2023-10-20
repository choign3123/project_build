package com.smu.som.domain.question.dto;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B9\u0012\u0018\b\u0001\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u0012\u0018\b\u0001\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u00a2\u0006\u0002\u0010\u0007R*\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR*\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000b\u00a8\u0006\u000e"}, d2 = {"Lcom/smu/som/domain/question/dto/GetUsedQuestionDTO;", "", "used", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "pass", "(Ljava/util/ArrayList;Ljava/util/ArrayList;)V", "getPass", "()Ljava/util/ArrayList;", "setPass", "(Ljava/util/ArrayList;)V", "getUsed", "setUsed", "som"})
public final class GetUsedQuestionDTO {
    @org.jetbrains.annotations.NotNull
    private java.util.ArrayList<java.lang.Long> used;
    @org.jetbrains.annotations.NotNull
    private java.util.ArrayList<java.lang.Long> pass;
    
    public GetUsedQuestionDTO(@org.jetbrains.annotations.NotNull
    @com.fasterxml.jackson.annotation.JsonProperty(value = "used")
    java.util.ArrayList<java.lang.Long> used, @org.jetbrains.annotations.NotNull
    @com.fasterxml.jackson.annotation.JsonProperty(value = "pass")
    java.util.ArrayList<java.lang.Long> pass) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<java.lang.Long> getUsed() {
        return null;
    }
    
    public final void setUsed(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<java.lang.Long> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<java.lang.Long> getPass() {
        return null;
    }
    
    public final void setPass(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<java.lang.Long> p0) {
    }
}