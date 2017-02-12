package com.lw.dagger.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * Created by lw on 2017/2/12.
 */
@Qualifier
@Retention(RetentionPolicy.RUNTIME) // 运行时注解
public @interface TeacherForContext {
}
