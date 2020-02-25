package com.gavin.thread.money;

public class DrawThread extends Thread{

	//ģ���˻�
	private Account account;
	//ģ��ȡ���Ľ��
	private double drawMoney;
	
	public DrawThread(String name,Account account,double money){
		super(name);
		this.account = account;
		this.drawMoney = money;
	}
	
	//������߳�ͬʱ����һ�������ǣ�����Ƶ����ݰ�ȫ������
	public void run(){
		synchronized (account) {
			//���������ȡǮ��Ŀ
			if(account.getBalance() >=drawMoney){
				//�³��ɹ�
				System.out.println(getName()+"��ȡǮ�ɹ�����Ʊ�ǣ�"+drawMoney);
				try {
					Thread.sleep(10);
				} catch (Exception e) {
					e.printStackTrace();
				}
				account.setBalance(account.getBalance()-drawMoney);
				System.out.println("��ʣ�µ�����ǣ�"+account.getBalance());
			}else{
				System.out.println(getName()+",ȡǮʧ�ܣ�����!");
			}
		}
	}
	
}
