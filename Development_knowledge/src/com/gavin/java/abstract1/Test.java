package com.gavin.abstract1;

public class Test {

	public static void main(String[] args) {
		//ֻ���õ���д�����ǣ��������һ���֣�buyCigarette();����
		Father father = new SonA();//��̬��Father father--����ʱ���ͣ�new SonA()--����ʱ���ͣ�������ʱ���ͺ�����ʱ���Ͳ�һ�¾ͻ�������̬��
		father.buyCigarette();
		//father.password //�ò���sonA�Լ������Ժͷ���
		
		SonA sonA = new SonA();
		sonA.buyCigarette();
		sonA.password = "123";//����Ҫ��ֵ
		
		
	}

}
