package com.gavin.reflect;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented/*���ͨ��javadoc����*/
@Retention(value=RetentionPolicy.RUNTIME)
@Target({
	ElementType.FIELD,
	ElementType.METHOD,
	ElementType.CONSTRUCTOR,
	ElementType.PARAMETER,
	ElementType.TYPE/*�࣬�ӿڣ�ö���࣬������*/
})
public @interface KeKeMapping {
	/*�࣬���������캯��������*/
	String value() default "";
	String desc() default "";
	String def() default "";
}
