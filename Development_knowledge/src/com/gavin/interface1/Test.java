package com.gavin.interface1;

public class Test {
	
	public static void main(String[] args) {
		IUserDao iUserDao = new IUserDaoImpl();
		iUserDao.hello();//����ķ���
		IUserDao.testcc();//��̬������ȥ����
	}

}
