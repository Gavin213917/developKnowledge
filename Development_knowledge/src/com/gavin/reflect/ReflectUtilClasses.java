package com.gavin.reflect;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;

import org.omg.CORBA.PUBLIC_MEMBER;

public class ReflectUtilClasses {

	public static void main(String[] args) {
		/*
		 * ���У�
			 * ��Ա����
			 * ���캯��
			 * ��Ա����
			 * �ڲ���
			 * �����
		 * */
		
		/*
		 * �������---�ڲ������ö���
		 * ��һ�����õ���ǰ���class����
		 * �ڶ�������Ҫʵ��������
		 * ����������ʼ��̬����class�ļ��еĹ��캯������Ա��������Ա�������ڲ��� (ע��Ͳ���)
		 * */
		
//		Class clz = User.class;
		
//		User user = new User();
//		Class clz = user.getClass();
		
		try {
			//��һ�����õ���ǰ���class����
			Class clz = Class.forName("com.gavin.reflect.User");
			//ʵ��������  
			Object obj = clz.newInstance();
			
			Class[] classes = clz.getDeclaredClasses();
			for (Class class1 : classes) {
				System.out.println(class1.getName());
			}
			
		} catch (Exception e) {
			
			
		}
		
		
		//test(1,2,3,4,5,6,7,8,9);
//		int[] ages = {1,2,3,4,5,6,7,8,9};
//		test(ages);
	}
	
	
//	public static void test(int...ages){
//		for (int i : ages) {
//			System.out.println(i);
//		}
//	}
	
	
	
	
	
}
