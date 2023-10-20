package com.smu.som.domain.user.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0017\u0018\u0000 ,2\u00020\u0001:\u0001,BW\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0002\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013R \u0010\u0007\u001a\u0004\u0018\u00010\b8\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0097\u000e\u00a2\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0096\u000e\u00a2\u0006\u0010\n\u0002\u0010\'\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010\t\u001a\u00020\u0005X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0011\"\u0004\b)\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u0005X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0011\"\u0004\b+\u0010\u0013\u00a8\u0006-"}, d2 = {"Lcom/smu/som/domain/user/entity/User;", "", "id", "", "oauth2Id", "", "ageRange", "gender", "Lcom/smu/som/domain/user/entity/Gender;", "nickname", "email", "maritalStatus", "", "anniversary", "Ljava/util/Date;", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lcom/smu/som/domain/user/entity/Gender;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Date;)V", "getAgeRange", "()Ljava/lang/String;", "setAgeRange", "(Ljava/lang/String;)V", "getAnniversary", "()Ljava/util/Date;", "setAnniversary", "(Ljava/util/Date;)V", "getEmail", "setEmail", "getGender", "()Lcom/smu/som/domain/user/entity/Gender;", "setGender", "(Lcom/smu/som/domain/user/entity/Gender;)V", "getId", "()Ljava/lang/Long;", "setId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getMaritalStatus", "()Ljava/lang/Boolean;", "setMaritalStatus", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getNickname", "setNickname", "getOauth2Id", "setOauth2Id", "Companion", "som"})
@javax.persistence.Table(name = "user")
@javax.persistence.Entity
public class User {
    @org.jetbrains.annotations.Nullable
    @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @javax.persistence.Id
    private java.lang.Long id;
    @org.jetbrains.annotations.NotNull
    private java.lang.String oauth2Id;
    @org.jetbrains.annotations.Nullable
    private java.lang.String ageRange;
    @org.jetbrains.annotations.Nullable
    @javax.persistence.Enumerated(value = javax.persistence.EnumType.STRING)
    private com.smu.som.domain.user.entity.Gender gender;
    @org.jetbrains.annotations.NotNull
    private java.lang.String nickname;
    @org.jetbrains.annotations.Nullable
    private java.lang.String email;
    @org.jetbrains.annotations.Nullable
    private java.lang.Boolean maritalStatus;
    @org.jetbrains.annotations.Nullable
    private java.util.Date anniversary;
    @org.jetbrains.annotations.NotNull
    public static final com.smu.som.domain.user.entity.User.Companion Companion = null;
    
    public User(@org.jetbrains.annotations.Nullable
    java.lang.Long id, @org.jetbrains.annotations.NotNull
    java.lang.String oauth2Id, @org.jetbrains.annotations.Nullable
    java.lang.String ageRange, @org.jetbrains.annotations.Nullable
    com.smu.som.domain.user.entity.Gender gender, @org.jetbrains.annotations.NotNull
    java.lang.String nickname, @org.jetbrains.annotations.Nullable
    java.lang.String email, @org.jetbrains.annotations.Nullable
    java.lang.Boolean maritalStatus, @org.jetbrains.annotations.Nullable
    java.util.Date anniversary) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public java.lang.Long getId() {
        return null;
    }
    
    public void setId(@org.jetbrains.annotations.Nullable
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public java.lang.String getOauth2Id() {
        return null;
    }
    
    public void setOauth2Id(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public java.lang.String getAgeRange() {
        return null;
    }
    
    public void setAgeRange(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public com.smu.som.domain.user.entity.Gender getGender() {
        return null;
    }
    
    public void setGender(@org.jetbrains.annotations.Nullable
    com.smu.som.domain.user.entity.Gender p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public java.lang.String getNickname() {
        return null;
    }
    
    public void setNickname(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public java.lang.String getEmail() {
        return null;
    }
    
    public void setEmail(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public java.lang.Boolean getMaritalStatus() {
        return null;
    }
    
    public void setMaritalStatus(@org.jetbrains.annotations.Nullable
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public java.util.Date getAnniversary() {
        return null;
    }
    
    public void setAnniversary(@org.jetbrains.annotations.Nullable
    java.util.Date p0) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\'\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/smu/som/domain/user/entity/User$Companion;", "", "()V", "of", "Lcom/smu/som/domain/user/entity/User;", "oAuth2User", "Lcom/smu/som/domain/user/dto/Oauth2UserDTO;", "maritalStatus", "", "anniversary", "Ljava/util/Date;", "(Lcom/smu/som/domain/user/dto/Oauth2UserDTO;Ljava/lang/Boolean;Ljava/util/Date;)Lcom/smu/som/domain/user/entity/User;", "som"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.smu.som.domain.user.entity.User of(@org.jetbrains.annotations.NotNull
        com.smu.som.domain.user.dto.Oauth2UserDTO oAuth2User, @org.jetbrains.annotations.Nullable
        java.lang.Boolean maritalStatus, @org.jetbrains.annotations.Nullable
        java.util.Date anniversary) {
            return null;
        }
    }
}