package com.gavin.model.singleton;

public class Test {

	public static void main(String[] args) {
		
		LazySingleton singleton = LazySingleton.getInstance();
		singleton.num++;
		LazySingleton singleton2 = LazySingleton.getInstance();
		singleton2.num++;
		//singleton\singleton2 ָ����ͬһ���ڴ�ռ䣬num�������Σ����������ڴ�ռ��õ��Ķ���2
		System.out.println(singleton.num);
		System.out.println(singleton2.num);
		
		
	}

}
