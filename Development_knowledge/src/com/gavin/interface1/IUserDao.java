package com.gavin.interface1;

public interface IUserDao {
	
	/*
	 * jdk 1.7
	 * ��̬����(final)���ͳ��󷽷���ö��
	 * 
	 * ���η��ķ�Χ��public ��ȱʡ
	 * private��protected ����
	 */
	public static final int AGE =10;
	public final static  String USERNAME="keke";
	
	
	
	
	//���еķ������ǳ��󷽷�
	public  void test();//������
	void sayHello();//ȱʡ��
	abstract void message();//abstract ����ʡ��
	
	//jdk1.8 ��̬������Ĭ�Ϸ���
	static void testcc(){
		System.out.println("ok");
	}
	
	default void hello(){//����ķ���
		System.out.println("�����");
	}

}
