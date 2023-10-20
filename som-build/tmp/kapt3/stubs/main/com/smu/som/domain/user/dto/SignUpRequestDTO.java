package com.smu.som.domain.user.dto;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\rJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bH\u00c6\u0003J:\u0010\u0016\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\bH\u00c6\u0001\u00a2\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010\u00a8\u0006\u001d"}, d2 = {"Lcom/smu/som/domain/user/dto/SignUpRequestDTO;", "", "oauth2Provider", "", "oauth2AccessToken", "maritalStatus", "", "anniversary", "Ljava/util/Date;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Date;)V", "getAnniversary", "()Ljava/util/Date;", "getMaritalStatus", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getOauth2AccessToken", "()Ljava/lang/String;", "getOauth2Provider", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Date;)Lcom/smu/som/domain/user/dto/SignUpRequestDTO;", "equals", "other", "hashCode", "", "toString", "som"})
public final class SignUpRequestDTO {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String oauth2Provider = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String oauth2AccessToken = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Boolean maritalStatus = null;
    @org.jetbrains.annotations.Nullable
    private final java.util.Date anniversary = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.smu.som.domain.user.dto.SignUpRequestDTO copy(@org.jetbrains.annotations.NotNull
    @com.fasterxml.jackson.annotation.JsonProperty(value = "oauth2Provider")
    java.lang.String oauth2Provider, @org.jetbrains.annotations.NotNull
    @com.fasterxml.jackson.annotation.JsonProperty(value = "oauth2AccessToken")
    java.lang.String oauth2AccessToken, @org.jetbrains.annotations.Nullable
    @com.fasterxml.jackson.annotation.JsonProperty(value = "maritalStatus")
    java.lang.Boolean maritalStatus, @org.jetbrains.annotations.Nullable
    @com.fasterxml.jackson.annotation.JsonProperty(value = "anniversary")
    java.util.Date anniversary) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public SignUpRequestDTO(@org.jetbrains.annotations.NotNull
    @com.fasterxml.jackson.annotation.JsonProperty(value = "oauth2Provider")
    java.lang.String oauth2Provider, @org.jetbrains.annotations.NotNull
    @com.fasterxml.jackson.annotation.JsonProperty(value = "oauth2AccessToken")
    java.lang.String oauth2AccessToken, @org.jetbrains.annotations.Nullable
    @com.fasterxml.jackson.annotation.JsonProperty(value = "maritalStatus")
    java.lang.Boolean maritalStatus, @org.jetbrains.annotations.Nullable
    @com.fasterxml.jackson.annotation.JsonProperty(value = "anniversary")
    java.util.Date anniversary) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getOauth2Provider() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getOauth2AccessToken() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getMaritalStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.Date component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.Date getAnniversary() {
        return null;
    }
}