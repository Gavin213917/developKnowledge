package com.gavin.object;

import java.sql.Date;

public class Student2 {

	//����--ȫ�ֱ���
	
	/*
	 * 
	 * ȫ�ֱ���---�����ڷ������⣬�����ڵı�������ȫ�ֱ���
	 * ȫ�ֿ��Բ��ø�ֵ��---
	 *   ����ǻ����������ͣ�
	 *   byte short int long 0
	 *   float double  0.0
	 *   boolean false
	 *   char \u0000  �ո� ���������ǵ�Ĭ��ֵ
	 *   �����װ�������ͺ��ࣺ��null
	 * */
	private String name;
	private Float money;
	private String address;
	private Date birthday;
	
	private Integer age;
	private boolean mark;
	private int num;
	
	
	/*
	 * �ֲ�����:
	 * �����ڷ������ߴ�������ڵı����;ֲ�������
	 * 	1�����ʹ���˾�һ����ֵ��
	 *  2���ֲ����������ŷ�����ִ����ϣ��������ڽ���
	 *  ������������{}Ϊ���ڣ����{}������ô���Ѿ�����
	 * */
	
	//��Ϊ
	public void buyBook(String message){
		//�����ڿ��������У���Ҫ��ȫ�ֱ���������ͬ�����֣�
		int age=10;
		System.out.println(this.age);
	}
	
	
	public static void main(String[] args) {
		
		
		//ֻ�ж�����ܸ����Ը�ֵ���͵��÷���
		Student2 student2 = new Student2();
		System.out.println(student2.name);
		
		System.out.println(student2.age);
		System.out.println(student2.mark);
		System.out.println(student2.num);
		
	}
	
}