package com.smu.som.common.annotation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000\u00a8\u0006\u0002"}, d2 = {"Lcom/smu/som/common/annotation/CurrentUser;", "", "som"})
@java.lang.annotation.Target(value = {java.lang.annotation.ElementType.PARAMETER})
@java.lang.annotation.Retention(value = java.lang.annotation.RetentionPolicy.RUNTIME)
@org.springframework.security.core.annotation.AuthenticationPrincipal(expression = "#this == \'anonymousUser\' ? null : user")
@kotlin.annotation.Retention(value = kotlin.annotation.AnnotationRetention.RUNTIME)
@kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.VALUE_PARAMETER})
public abstract @interface CurrentUser {
}