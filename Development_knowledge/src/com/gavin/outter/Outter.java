package com.gavin.outter;

/**
 * ��Ա�ڲ��ࣨ�Ǿ�̬�ڲ��ࣩ---�൱��һ��һ�ֳ�Ա����
 * ��̬�ڲ���----�൱һ���еľ�̬����
 * @author 18158
 *
 */
public class Outter {

	public int age;
	public static String username;
	
	//�Ǿ�̬�����У����ɵ��ó�Ա�����;�̬����
	public void say(){
		System.out.println(this.age+"==="+Outter.username);
	}
	
	//��̬������ֻ�ܵ��þ�̬��Ա
	public static void message(){
		System.out.println("==="+Outter.username);
		
	}
	
	
	
}
