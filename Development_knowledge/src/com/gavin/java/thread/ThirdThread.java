package com.gavin.thread;

public class ThirdThread implements Runnable{

	private int i;
	
	@Override
	public void run() {
		for (; i < 100; i++) {
			System.out.println(Thread.currentThread().getName()+" ====> "+i);
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		for (int i = 0; i < 100; i++) {
			if(i==20){
				//������һ���߳�
				ThirdThread thread = new ThirdThread();
				Thread t1 = new Thread(thread);
				t1.start();
				//main�̵߳���t1�̵߳�join������main�̣߳������t1ִ�н����Ż�����ִ�С�
				t1.join();
			}
			System.out.println(Thread.currentThread().getName()+"====>"+i);
		}
	}
}
