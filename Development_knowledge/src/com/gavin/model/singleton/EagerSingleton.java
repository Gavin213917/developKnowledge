package com.gavin.model.singleton;

public class EagerSingleton {
	

	/**
	 * 
	 * 单列默认：（懒汉模式 ，饿汉模式，登记模式）
	 * 格式：
	 * 1：构造函数私有化
	 * 2:公开的方法，返回当前实例的方法(static)的
	 * 
	 * 饿汉单利模式:
     * 在类加载时就完成了初始化，所以类加载较慢，但获取对象的速度快
	 */

	private static EagerSingleton singleton = new EagerSingleton();
	
	
	//new 申请空间， 方法
	private EagerSingleton(){
		super();
	}
	
	

	public static EagerSingleton getInstance(){
		return singleton;
	}

}
