package com.gavin.model.singleton;

public class EagerSingleton {
	

	/**
	 * 
	 * ����Ĭ�ϣ�������ģʽ ������ģʽ���Ǽ�ģʽ��
	 * ��ʽ��
	 * 1�����캯��˽�л�
	 * 2:�����ķ��������ص�ǰʵ���ķ���(static)��
	 * 
	 * ��������ģʽ:
     * �������ʱ������˳�ʼ������������ؽ���������ȡ������ٶȿ�
	 */

	private static EagerSingleton singleton = new EagerSingleton();
	
	
	//new ����ռ䣬 ����
	private EagerSingleton(){
		super();
	}
	
	

	public static EagerSingleton getInstance(){
		return singleton;
	}

}
