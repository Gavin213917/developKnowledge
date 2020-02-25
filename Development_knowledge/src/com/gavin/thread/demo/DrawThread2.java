package com.gavin.thread.demo;

public class DrawThread2 extends Thread{

	//ȡǮ�˻�
	private Account account;
	//ȡ����Ǯ
	private double money;
	
	public DrawThread2(String name,Account account,double money){
		super(name);//getName()��ȡ �����Runnable��û��getName������Thread.currentThread.getName();
		this.account = account;
		this.money = money;
	}
	
	public void run(){
		//ͬ��ִ�еĶ���
		synchronized (account) {//����--ִ��--�ͷ���
			//�˻�����������ȡǮ����Ŀ��
			// A:�³�  B:���Ҫ����
			if(account.getBalance() >= money){
				System.out.println(this.getName()+"ȡǮ�ɹ����³���:"+money);
				try {
					Thread.sleep(10);//10����
				} catch (Exception e) {
					e.printStackTrace();
				}
				account.setBalance(account.getBalance()-money);
				System.out.println("���Ϊ��"+account.getBalance());
			}else{
				//����������
				System.out.println("���,"+getName()+"!ȡǮʧ�ܣ�����....");
			}
		}
	}
}
