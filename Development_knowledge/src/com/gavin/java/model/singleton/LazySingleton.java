package com.gavin.model.singleton;

//单例模式
public class LazySingleton {
	
	public int num = 0;
	/**
	 * 
	 * 懒汉单例模式---运行时，编译时
	 * 单列默认：（懒汉模式 ，饿汉模式，登记模式）
	 * 格式：
	 * 1：构造函数私有化
	 * 2:公开的方法，返回当前实例的方法(static)的
	 * 
	 */

	private static LazySingleton singleton = null;

	private LazySingleton() {
		super();
	}

	/**
	 * 运行时单例模式---懒汉式
	 * @Title: getInstance 
	 * @author: Gavin
	 * @time: 2019年6月21日 下午2:17:52
	 * @return 
	 * @return: LazySingleton 
	 * @throws
	 */
	public synchronized static LazySingleton getInstance() {
		if (singleton == null) {
			singleton =  new LazySingleton();
		}
		return singleton;
	}

}
