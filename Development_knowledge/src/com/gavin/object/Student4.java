package com.gavin.object;

import java.io.File;

public class Student4 {
	
	private  String name;
	private int age;
	private Float money;

	/*
	 * ��������Է���--��Ե�ǰ�౾��
	 * ������һ�£������б���������Ͳ�һ�¾������ء���ͬ����ͬ�Σ�
	 * �����η��޹�
	 * �뷵��ֵ�޹�
	 * 
	 * �ô�����ߴ���ĸ�����
	 * 
	 * 
	 * 
	 */
	public static String readFile(File file) {
		return "";
	}
	
	public static String readFile(String pathname) {
		File file = new File(pathname);
		
		return Student4.readFile(file);
	}
	
	
	
	
	
	public static void main(String[] args) {
		Student4 student2 = new Student4();
//		student2.readFile("d://a.txt");
//		student2.readFile(new File("d://a.txt"));
				
		
	}

}