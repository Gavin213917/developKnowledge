package com.gavin.thread.demo;

public class MyRunnable implements Runnable{

	private String url;
	private int i;
	public void run(){
		//Ҫִ�е�����--��һ������--ץȡ��ҳ���������ݿ�
		for (; i < 100; i++) {
			System.out.println(Thread.currentThread().getName()+"=="+i);
		}
	}
}
