package com.gavin.object;

import java.util.Iterator;

public class Person {

	// ��̬���� object...params ��ʵ����һ������
	//ʹ�ö�̬�����Ľ��飺�����ǲ����б���������Ͷ�����ͬ���������͵�ʱ�򣬲�������>=3ʱ�����Կ���ʹ�ö�̬�������򻯲����б�
	//ע��㣺1��һ����������ֻ�ܴ���һ����̬���� 2����̬����������ڲ����б�������
	public  int sum2(Object... params) {//�ɴ���������
		for (Object object : params) {
			System.out.println(object);
		}
		return 0;
	}
	
	public  int sum(int... params) {
		int result = 0;
		for (int i = 0; i < params.length; i++) {
			result+=params[i];
		}
		return result;
	}
	
	public  int sum2(String name,int...params) {//��̬����������ڲ����б�������
		return 0;
	}
	
	
	public  int sum(int a,int b, int c) {
		return a+b+c;
	}
	
//	public  int sum(int... params) {
//		return params[0]+params[1]+params[3];
//	}

	public static void main(String[] args) {
		//java �в���������
		// ��ֵ�� byte short int long float double char �� ������ boolean
		// Byte Short Integer Long Float Double character Boolean --��
		// ����
		// �Զ�������--��List�����ϣ�
		
		Person person =new Person();
//		int res = person.sum(1,2,3,4,5);
//		System.out.println(res);
		
		//person.sum(1,"gavin",3,4,"@#");
		
		int [] num = {1,2,3,9}; //ԭ�����һ������
		System.out.println(person.sum(num));
		

	}

}
