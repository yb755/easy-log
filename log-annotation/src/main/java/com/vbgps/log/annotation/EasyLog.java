package com.vbgps.log.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 描述主体：　谁在什么时间,什么地方做了什么事情
 * @author Administrator
 *
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface EasyLog {

	String who();

	long datetime() default -1;

	String where();

	String thing();
}
