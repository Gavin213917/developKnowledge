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
public class Outter3 {

	public int age;
	public static String username;
	
	//�Ǿ�̬�����У����ɵ��ó�Ա�����;�̬����
	public void say(){
		System.out.println(this.age+"==="+Outter3.username);
	}
	
	//��̬������ֻ�ܵ��þ�̬��Ա
	public static void message(){
		System.out.println("==="+Outter3.username);
		
	}
	
	
	
	public static class Inner{//��Ա����
		
		public String name;
		public String username;
		
		public static void test(){
			System.out.println(Outter3.username);
		}
	}
}
