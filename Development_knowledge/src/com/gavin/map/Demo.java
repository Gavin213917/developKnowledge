package com.gavin.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Demo {
	public static <T> void main(String[] args) {

		// ����---����---װ����������
//		List<String> names = new ArrayList<>();
//		names.add("keke");
//		names.add("С��");
//		names.add("����");
//		names.add("С��");
//		names.add("lee");
//
//		names.add("aa");// hashcode97+97=194
////		names.add("aa");//hashcode 
//		names.add("d^");// 100 +94==194

//		hashMap+hashcode+list�ĺϳ���

		// Set List���Ƕ��洢һ������----һ����������������ʱ���Ե��е���������
		// ���������List+��(javabean)

		// Map ---HashMap--��ȡ���ݿ��٣��洢�������㣬
		// key�������ظ�--setά����ϵ--������ͨ��һ��entry����ά��key--value�Ĺ�ϵ��entry�������ά����ϵ

		/*
		 * 
		 * map.put(key,value);���Ԫ�� 
		 * map.get(key ��ȡԪ��) 
		 * map.containsKey(key) 
		 * map.isEmpty()
		 * map.remove(key) 
		 * map.values() 
		 * map.entrySet() 
		 * map.keySet()
		  * ����entry---keyת��hashcode����һ��entry�У�Ȼ���entry�ü��ϴ洢����
		 * get(key),---keyת��hashcode��name--�ڼ�����ȥ��entry��û���з������õ���getValue����
		 * 
		 * 
		 */

		// List+HashMap(javabean)
		HashMap<String, Object> map=new HashMap<>();//Set+linkedList
//		LinkedHashMap<String, Object> map=new LinkedHashMap<>();//Set+linkedList
//		TreeMap<String, Object> map=new TreeMap<>();//Set+linkedList
		//System.out.println(map.isEmpty());//true
		map.put("name", "keke");
		map.put("age", 30);
		map.put("address", "���ϳ�ɳ");
//		System.out.println(map.isEmpty());//false
//		
////		map.remove("name");//ɾ��key
////		System.out.println(map.containsKey("name"));
//		System.out.println(map.get("name"));//

		// values
//		Collection<Object> objects= map.values();
//		for (Object object : objects) {
//			System.out.println(object);
//		}
//		
//		//keys
//		Set<String> keys= map.keySet();
//		for (Object object : keys) {
//			System.out.println(object);
//		}

		// forѭ��map
		for(Map.Entry<String, Object> entry:map.entrySet()){
			System.out.println(entry.getKey()+"=="+entry.getValue());
		}

//		Set====HashSet LinkedHashSet TreeSet<E> enumset
//		Map====HashMap LinkedHashMap TreeMap<E> enummap

		// remove add set��������ʱ�������������ݵ��ٽ�㣬����Ƶ�����ڴ�����Ŀ����͸��ǲ��������ݿ��ܻᶪʧ
		// ArrayList���̲߳���ȫ�ġ�

//		for (String string : names) {
//			System.out.println(string);
//		}
	}
}
