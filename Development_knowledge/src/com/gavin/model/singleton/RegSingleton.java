package com.gavin.model.singleton;

import java.util.HashMap;
import java.util.Map;

//登记模式
public class RegSingleton {
	
	//注册表
	private static Map<String,RegSingleton> reg = new HashMap<>();
	
	//再类加载的过程中，使用静态初始化
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
	 * 测试
	 * @Title: main 
	 * @author: Gavin
	 * @time: 2019年6月20日 下午1:53:20
	 * @param args 
	 * @return: void 
	 * @throws
	 */
	public static void main(String[] args) {
		RegSingleton singleton = new RegSingleton();
//		System.out.println(singleton.getClass().getName());//com.gavin.model.RegSingleton
		
		
		//相当于applicationContext中的 Content.getBean("UserDao") 方法，通过bean id 去取
		//<bean id = "userDao" class = "com.gavin.User.UserDaoImpl">
		System.out.println(singleton.getInstance("RegSingleton"));
		
		//map里面有两个，登记模式可以产生多个实例，然后根据key 从里面取就可以了
		//{com.gavin.model.RegSingleton=com.gavin.model.RegSingleton@15db9742, RegSingleton=com.gavin.model.RegSingleton@2a139a55}
		System.out.println(reg);
		
	}
	
}
