package com.gavin.thread.demo;

public class MyThread extends Thread{

	private int i;
	public void run(){
		//Ҫִ�е�����--��һ������--ץȡ��ҳ���������ݿ�
		for (; i < 100; i++) {
			System.out.println(getName()+"=="+i);
		}
		//ץȡ
		//�̺߳��߳�֮��---ǫǫ���ӡ�����С��
		//������
		
		//�߳�ͬ��--ͬ������
	}
	
	
}
