package com.gavin.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Retention(value=RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface RequestMapping {

	//���ֻ����������� �� string ���� ��ö��
	String[] value() default "";
	String name() default "";
	String type() default "all";
	RequestMethod method() default RequestMethod.ALL;
}
