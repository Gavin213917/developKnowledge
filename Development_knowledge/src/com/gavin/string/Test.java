package com.gavin.string;

public class Test {
	public static void main(String[] args) {
		
		//��һ��
//		String a = "A" +  "B" + "C";//�ڱ���ʱ���Ѿ�ȷ����a��ֵ����ABC
//		String e = "ABC";
//		
//		String b = "AB";
//		String c = "C";
//		
//		String f = b+ c ;//�ڱ���׶β���ȷ��f��ֵ��
//		
//		System.out.println(a==e);//true
//		System.out.println(a==f);//false
		
		//�ڶ���
		String a = "A" +  "B" + "C";//�ڱ���ʱ���Ѿ�ȷ����a��ֵ����ABC
		String e = "ABC";
		
		final String b = "AB";//����final ����ɺ���� ���ڱ����ʱ��ȷ�� b ����ͨ�������Ǻ����������Ǻ���������ǿ��Լ���ڱ���Ĺ�����ֵ�ͻ�ȷ�����������������Ĳ���
		final String c = "C";
		
		String f = b+ c ;//�ڱ���׶β���ȷ��f��ֵ��
		
		System.out.println(a==e);//true
		System.out.println(a==f);//true
		
		
	}

}
