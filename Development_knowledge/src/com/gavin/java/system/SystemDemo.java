package com.gavin.other2;

import java.util.Enumeration;
import java.util.Map;
import java.util.Properties;

public class SystemDemo {

	public static void main(String[] args) {
		//System��,����������룬���������������ṩ��һЩ�������ڷ��ʻ���������ϵͳ���Եķ��������ṩ�����ļ��Ͷ�̬���ӿ�ķ�����
		
		
		//��ȡϵͳ���еĻ�������
		Map<String,String> envs = System.getenv();
		for (Map.Entry<String, String> entry: envs.entrySet()) {
			System.out.println(entry.getKey()+"==="+entry.getValue());
		}
		
		System.out.println("==========================================");
		
		//��ȡJava�İ汾������ϵͳ��Ϣ;
		Properties properties = System.getProperties();
		Enumeration<?> enumeration = properties.propertyNames();
		while(enumeration.hasMoreElements()){
			System.out.println(enumeration.nextElement()+"===="+System.getProperty(String.valueOf(enumeration.nextElement())));
		}
		
//		System.out.println(System.getProperty("user.dir"));
		
	}
	
	
}
