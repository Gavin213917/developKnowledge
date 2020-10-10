package com.gavin.reflect;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;

import org.omg.CORBA.PUBLIC_MEMBER;

public class ReflectUtilConstructor {

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
			//ʵ��������  1
			Object obj = clz.newInstance();
			//�������캯��   Declared ������Է������η�, ������ӵ�ֻ�ܷ���public���εĳ�Ա����(�����ͷ���)
//			Constructor[] constructors = clz.getConstructors();//ֻ�ܷ���public���εĹ��캯��
			Constructor[] constructors = clz.getDeclaredConstructors();//���Է������η��Ĺ��캯��
//			System.out.println("���캯���ĸ�����:===="+constructors.length);
			for (Constructor constructor : constructors) {
				System.out.println("���캯��������"+constructor.getName());
				System.out.println("�������η�:"+constructor.getModifiers());
				System.out.println("���캯���в����ĸ���:"+constructor.getParameterCount());
				
				Class[] types = constructor.getParameterTypes();
				for (Class class1 : types) {
					System.out.print(class1.getName()+"\t");
				}
				System.out.println("======================");
			}
			
			
			//��ȡ��������� ---spring���캯��ע��
			//ʵ��������  2
			Constructor constructor = clz.getDeclaredConstructor();
			Object object  = constructor.newInstance();
			System.out.println("1========="+object);
			
			
			Constructor constructor2 = clz.getDeclaredConstructor(Integer.class,String.class,Float.class,String[].class,Long.class);
			String[] names = {"keke","xiaobai"};
			Object object2  = constructor2.newInstance(1,"keke",21.5f,names,1l);
			System.out.println("2==========>"+object2);
			
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
