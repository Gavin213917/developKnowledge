package com.gavin.thread.money;

public class Test {

	public static void main(String[] args) {
		//����һ���˻�
		Account account = new Account("keke",1000);
		DrawThread thread1 = new DrawThread("С��", account, 800);
		thread1.start();
		DrawThread thread2 = new DrawThread("С��", account, 800);
		thread2.start();
		
	}
}
