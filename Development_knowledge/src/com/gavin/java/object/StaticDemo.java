package com.gavin.object;

import java.util.HashMap;

public class StaticDemo {
	
	
	//�������η���super һ��Ҫ�м̳еĹ�ϵ�²������塣û�м̳�û���κ�
	
	/*
	 * ���Ժͷ���
	 * 
	 * �������η�[private publie protected ȱʡ��]   ���δ�(static ,final ,transient,volatile)   ��������  = ����ֵ
	 * 
	 * �������η�   ���δ�   ��������  = ����ֵ
	 *     
	 * */
	
	
	/*
	 * ��һ�����У�
	 * ���Ժͷ������ַ�Ϊ�������
	 * 
	 * 	��̬��Ա�ͷǾ�̬��Ա
	 * 
	 * 
	 *  ��̬��Ա������---�౾���,�����ڶ���=--�������Ժͷ���
	 *  ��̬��Աһ��Ҫ��̬������ʹ��
	 *  
	 *  �ܽ᣺
	 *  �Ǿ�̬�������ɵ��þ�̬��Ա��Ҳ���Ե��÷Ǿ�̬Ԫ��
	 *  ��̬������ֻ�ܸ�����þ�̬��Ա
	 *  
	 * */
	
	private static int age;//��̬���ԣ���Ա��--������
	private int num;//�Ǿ�̬���ԣ���Ա��--���ڶ���
	
	
	//�Ǿ�̬�������ȿ��Ե��þ�̬��Ա��Ҳ���Ե��÷Ǿ�̬��Ա
	public void buyBook(){
		System.out.println(StaticDemo.age);
		System.out.println(this.num);
	}
	
	
	public static void test(){
		System.out.println(StaticDemo.age);
	}
 	
	
	
	
	public static Float salary(String name){
		//н���б�
		HashMap<String,Float> map=new HashMap<>();
		map.put("keke", 1000f);
		map.put("meta", 20000.58f);
		map.put("shubiao", 10000.88f);
		return map.get(name);
	}
	
	
	public static void main(String[] args) {
		Float float1 = salary("keke");
		System.out.println(float1);
	}
	
	
	
	
	
	
	
}