package com.smu.som.common.jwt.user;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0007\u001a\f\u0012\u0006\b\u0001\u0012\u00020\t\u0018\u00010\bH\u0016J\n\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0010\u001a\u00020\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u000eH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0012"}, d2 = {"Lcom/smu/som/common/jwt/user/UserDetailsImpl;", "Lorg/springframework/security/core/userdetails/UserDetails;", "user", "Lcom/smu/som/domain/user/entity/User;", "(Lcom/smu/som/domain/user/entity/User;)V", "getUser", "()Lcom/smu/som/domain/user/entity/User;", "getAuthorities", "", "Lorg/springframework/security/core/GrantedAuthority;", "getPassword", "", "getUsername", "isAccountNonExpired", "", "isAccountNonLocked", "isCredentialsNonExpired", "isEnabled", "som"})
public final class UserDetailsImpl implements org.springframework.security.core.userdetails.UserDetails {
    @org.jetbrains.annotations.NotNull
    private final com.smu.som.domain.user.entity.User user = null;
    
    public UserDetailsImpl(@org.jetbrains.annotations.NotNull
    com.smu.som.domain.user.entity.User user) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.smu.som.domain.user.entity.User getUser() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.util.Collection<? extends org.springframework.security.core.GrantedAuthority> getAuthorities() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.String getPassword() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getUsername() {
        return null;
    }
    
    @java.lang.Override
    public boolean isAccountNonExpired() {
        return false;
    }
    
    @java.lang.Override
    public boolean isAccountNonLocked() {
        return false;
    }
    
    @java.lang.Override
    public boolean isCredentialsNonExpired() {
        return false;
    }
    
    @java.lang.Override
    public boolean isEnabled() {
        return false;
    }
}