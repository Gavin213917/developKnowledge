package com.gavin.map;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class List_hashMap {

	
	public static void main(String[] args) {
		
//		java.sql--�������ݿ�
		
		//��������������һ��ͬѧ�������������䣬�Ա𣬵绰���룬���֤�Ǽ�һ�£�Ȼ��ȥyy6359��keke��ʦ����
//		Student dawei=new Student();
//		dawei.setUsername("��Ϊ");
//		dawei.setAge(20);
//		dawei.setTelephon("15895468464");
//		dawei.setIdCard("234234234234");
		HashMap<String,Object> dawei=new HashMap<>();
		dawei.put("username", "��Ϊ");
		dawei.put("age", 20);
		dawei.put("telephone", "15895468464");
		dawei.put("idcard", "32464234678674");
		
		
		
		HashMap<String,Object> mayi=new HashMap<>();
		mayi.put("username", "����");
		mayi.put("age", 17);
		mayi.put("telephone", "1789687897");
		mayi.put("idcard", "35464654546");
		
		List<HashMap<String, Object>> students = new ArrayList<HashMap<String, Object>>();
		students.add(dawei);
		students.add(mayi);
		
		//����
		students.sort(new Comparator<HashMap<String, Object>>() {
			@Override
			public int compare(HashMap<String, Object> o1, HashMap<String, Object> o2) {
				Integer age1=(Integer)o1.get("age"); 
				Integer age2=(Integer)o2.get("age"); 
				if(age1>age2){
					return 1;
				}else if(age1<age2){
					return -1;
				}else{
					return 0;//������ͬ���������0����������
				}
			}
		});
	
		
		for (HashMap<String, Object> student : students) {
			System.out.println(student.get("username")+"==="+student.get("age")+"��yy6359����");
		}
		
		
		
//		List+HashMap
//		HashMap=====javabean
//		bean---map֮���ת��������
		
//		Map---JavaBean--���ݿ��еı���ʲô��ϵ	
		
		
	}
}
