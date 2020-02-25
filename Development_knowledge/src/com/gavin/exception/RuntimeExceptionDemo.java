package com.gavin.exception;

import com.gavin.IO.User;

public class RuntimeExceptionDemo {

	
	public static void main(String[] args) {
		int count = saveUser();
		System.out.println(count==1?"success":"fail");
		
		try {
			Class.forName("com.tz.user.testse");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("�Ҳ�����...."+e.getMessage());
		}
		
	}
	

	public static int saveUser(){
		//runtime�쳣���������try/catchȥ����Ļ���������ģ�jvm���ǵ���Ĭ�ϵĴ����쳣���ƣ������쳣�Ĵ���
		try {
//			User user1 = null;//��ʼ������һ�в��ᱨ��
//			System.out.println(user1.getUsername());//��һ�лᱨ����ָ���쳣
			
			User user = new User();//��ʼ��
			user.setUsername("keke");
			System.out.println(user.getUsername());
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("�п�ָ��....");
			return 0;
		}
		
	}
}
