package com.gavin.map;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class List_javabean {

	
	public static void main(String[] args) {
		
		
		//��������������һ��ͬѧ�������������䣬�Ա𣬵绰���룬���֤�Ǽ�һ�£�Ȼ��ȥyy6359��keke��ʦ����
		Student dawei=new Student();
		dawei.setUsername("��Ϊ");
		dawei.setAge(20);
		dawei.setTelephon("15895468464");
		dawei.setIdCard("234234234234");
		
		
		Student mayi=new Student();
		mayi.setUsername("���");
		mayi.setAge(10);
		mayi.setTelephon("15489449843");
		mayi.setIdCard("234234234234");
		
		List<Student> students = new ArrayList<Student>();
		students.add(dawei);
		students.add(mayi);
		
		//����
		students.sort(new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				if(o1.getAge()>o2.getAge()){
					return -1;
				}else if(o1.getAge()<o2.getAge()){
					return 1;
				}else{
					return 0;
				}
			}
		});
	
		
		for (Student student : students) {
			System.out.println(student.getUsername()+"==="+student.getAge()+"��yy6359����");
		}
		
		//List+javabean--����������
		
	
		
	}
}

