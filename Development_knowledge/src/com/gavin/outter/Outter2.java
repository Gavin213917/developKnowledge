package com.gavin.outter;

/**
 * 
 * ��Ա�ڲ��ࣨ�Ǿ�̬�ڲ��ࣩ---�൱��һ��һ�ֳ�Ա����
 * ��̬�ڲ���----�൱һ���еľ�̬����
 * Outter<br/>
 * ������:xuchengfei<br/>
 * ʱ�䣺2016��4��26��-����10:38:26 <br/>
 * @version 1.0.0<br/>
 *
 */
public class Outter2 {

	public int age;
	public static String username;
	
	//�Ǿ�̬�����У����ɵ��ó�Ա�����;�̬����
	public void say(){
		System.out.println(this.age+"==="+Outter2.username);
	}
	
	//��̬������ֻ�ܵ��þ�̬��Ա
	public static void message(){
		System.out.println("==="+Outter2.username);
		
	}
	
	
	public class Inner extends ParentInner{//��Ա����
		
		
		public Inner(){
			super();//��extends��������---Object
		}
		
		public void test(){
			System.out.println(age+"==="+username);
		}
	}
}
