package com.gavin.thread.demo;

public class TestMoney {

	
	public static void main(String[] args) {
		//��һ�� �� ��1000Ԫ
		Account account = new Account("�й�����",1000);
		
		//ȡǮ--Ǯ��-�³������������---����
		Thread keke = new DrawThread("�¿�", account, 400);
		keke.start();
		
		Thread xiaochen = new DrawThread("С��", account, 400);
		xiaochen.start();
		
		Thread xiaobin = new DrawThread("С��", account, 400);
		xiaobin.start();
		
		
	}
}
