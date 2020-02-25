package com.gavin.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class ReflectUtil2 {
	
	/**
	 * ���ݶ����ȡ����Ӧ����ֵ
	 * ��������getPropertyValue<br/>
	 * �����ˣ�xuchengfei <br/>
	 * ʱ�䣺2016��4��28��-����11:30:40 <br/>
	 * �ֻ�:1564545646464<br/>
	 * @param obj
	 * @param fieldName
	 * @return Object<br/>
	 * @exception <br/>
	 * @since  1.0.0<br/>
	 */
	public static <T> T getPropertyValue(Object obj,String fieldName){
		try {
			Class clz = obj.getClass();
			Field field = clz.getDeclaredField(fieldName);
			field.setAccessible(true);
			return (T)field.get(obj);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
	/**
	 * ʵ��������---�����޲ι��캯��
	 * ��������getObject<br/>
	 * �����ˣ�xuchengfei <br/>
	 * ʱ�䣺2016��4��30��-����9:26:23 <br/>
	 * �ֻ�:1564545646464<br/>
	 * @param clz
	 * @return Object<br/>
	 * @exception <br/>
	 * @since  1.0.0<br/>
	 */
	public static Object getObject(Class clz){
		try {
			Constructor constructor = clz.getDeclaredConstructor();
			return constructor.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * 
	 * ��������getObject<br/>
	 * �����ˣ�xuchengfei <br/>
	 * ʱ�䣺2016��4��30��-����9:27:43 <br/>
	 * �ֻ�:1564545646464<br/>
	 * @param clz
	 * @param params
	 * @return Object<br/>
	 * @exception <br/>
	 * @since  1.0.0<br/>
	 */
	public static Object getObject(Class clz,Object...params){
		try {
			Class[] types = new Class[params.length];
			for (int i = 0; i < params.length; i++) {
				types[i] = params[i].getClass();
			}
			Constructor constructor = clz.getDeclaredConstructor(types);
			return constructor.newInstance(params);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * ���͹��캯��
	 * ��������getObject2<br/>
	 * �����ˣ�xuchengfei <br/>
	 * ʱ�䣺2016��4��30��-����9:37:17 <br/>
	 * �ֻ�:1564545646464<br/>
	 * @param clz
	 * @param params
	 * @return T<br/>
	 * @exception <br/>
	 * @since  1.0.0<br/>
	 */
	public static <T> T getObject2(Class clz,Object...params){
		try {
			Class[] types = new Class[params.length];
			for (int i = 0; i < params.length; i++) {
				types[i] = params[i].getClass();
			}
			Constructor constructor = clz.getDeclaredConstructor(types);
			return (T)constructor.newInstance(params);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static void main(String[] args) {
		String[] names = {"keke","xiaobai"};
		User user= ReflectUtil2.getObject2(User.class, 1,"keke",12.5f,names,5l);
		System.out.println(user.getId());
		System.out.println(user.getUsername());
		System.out.println(user.getMoney());
	}
}
