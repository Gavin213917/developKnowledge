package com.gavin.model.singleton;

public class Test {

	public static void main(String[] args) {
		
		LazySingleton singleton = LazySingleton.getInstance();
		singleton.num++;
		LazySingleton singleton2 = LazySingleton.getInstance();
		singleton2.num++;
		//singleton\singleton2 指的是同一个内存空间，num加了两次，所以最后从内存空间拿到的都是2
		System.out.println(singleton.num);
		System.out.println(singleton2.num);
		
		
	}

}
