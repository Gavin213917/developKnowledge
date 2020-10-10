package com.gavin.thread.demo;

public class Account {

	private String account;// �˻�
	private double balance;// ���

	public Account() {
		super();
	}

	public Account(String account, double balance) {
		super();
		this.account = account;
		this.balance = balance;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public static void main(String[] args) {
		new Account();
	}
	
	public synchronized void draw(String name,double money){
		//�˻�����������ȡǮ��Ŀ¼��
		// A:�³�  B:���Ҫ����
		if(this.getBalance() >= money){
			System.out.println(name+"ȡǮ�ɹ����³���:"+money);
			try {
				Thread.sleep(10);//10����
			} catch (Exception e) {
				e.printStackTrace();
			}
			this.setBalance(this.getBalance()-money);
			System.out.println("���Ϊ��"+this.getBalance());
		}else{
			//����������
			System.out.println("���,"+name+"!ȡǮʧ�ܣ�����....");
		}
	}

}
