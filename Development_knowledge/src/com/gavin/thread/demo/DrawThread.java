package com.gavin.thread.demo;

public class DrawThread extends Thread{

	//ȡǮ�˻�
	private Account account;
	//ȡ����Ǯ
	private double money;
	
	public DrawThread(String name,Account account,double money){
		super(name);//getName()��ȡ �����Runnable��û��getName������Thread.currentThread.getName();
		this.account = account;
		this.money = money;
	}
	
	public void run(){
		account.draw(getName(), money);
	}
}
