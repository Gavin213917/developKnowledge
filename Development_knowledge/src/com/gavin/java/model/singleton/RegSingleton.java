package com.gavin.model.singleton;

import java.util.HashMap;
import java.util.Map;

//�Ǽ�ģʽ
public class RegSingleton {
	
	//ע���
	private static Map<String,RegSingleton> reg = new HashMap<>();
	
	//������صĹ����У�ʹ�þ�̬��ʼ��
	static {
		RegSingleton singleton = new RegSingleton();
		reg.put(singleton.getClass().getName(), singleton);
	}
	
	private RegSingleton() {
		
	}
	
	
	public static RegSingleton getInstance(String key) {
		if(key==null)return null;
		try {
			if(reg.get(key)==null) {
				reg.put(key, RegSingleton.class.newInstance());
			}
			return reg.get(key);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static Object getInstance(String key,Class clz) {
		if (key == null)return null;
		try {
			if (reg.get(key) == null) {
				reg.put(key, (RegSingleton) clz.newInstance());
			}
			return reg.get(key);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * ����
	 * @Title: main 
	 * @author: Gavin
	 * @time: 2019��6��20�� ����1:53:20
	 * @param args 
	 * @return: void 
	 * @throws
	 */
	public static void main(String[] args) {
		RegSingleton singleton = new RegSingleton();
//		System.out.println(singleton.getClass().getName());//com.gavin.model.RegSingleton
		
		
		//�൱��applicationContext�е� Content.getBean("UserDao") ������ͨ��bean id ȥȡ
		//<bean id = "userDao" class = "com.gavin.User.UserDaoImpl">
		System.out.println(singleton.getInstance("RegSingleton"));
		
		//map�������������Ǽ�ģʽ���Բ������ʵ����Ȼ�����key ������ȡ�Ϳ�����
		//{com.gavin.model.RegSingleton=com.gavin.model.RegSingleton@15db9742, RegSingleton=com.gavin.model.RegSingleton@2a139a55}
		System.out.println(reg);
		
	}
	
}
