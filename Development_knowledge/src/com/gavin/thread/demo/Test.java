package com.gavin.thread.demo;

public class Test {

	public static void main(String[] args) {
		
		//һ���߳���̳�Thread����һ���������߳�
		
//		Thread thread1 = new MyThread();//keke ��100--
//		thread1.start();
//		
//		
//		
//		
//		Thread thread2 = new MyThread();//xiaonian ��100
//		thread2.start();
		
		//Thread ��׼��100�֣���Ҫִ��һ�ٴ�
		
		//Runnable ��׼��100�֣���Ҫִ��һ�ٴ�
		
		
		//�߳���--���� 100 0 1 2 3 4 5 6 7 8 9  
		MyRunnable runnable = new MyRunnable();
		
		Thread thread1 = new Thread(runnable);
		Thread thread2 = new Thread(runnable);
		
		thread1.start();
		thread2.start();
		
		
		
	
	}
}
