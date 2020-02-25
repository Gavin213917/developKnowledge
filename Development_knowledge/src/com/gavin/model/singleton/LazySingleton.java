package com.gavin.model.singleton;

//����ģʽ
public class LazySingleton {
	
	public int num = 0;
	/**
	 * 
	 * ��������ģʽ---����ʱ������ʱ
	 * ����Ĭ�ϣ�������ģʽ ������ģʽ���Ǽ�ģʽ��
	 * ��ʽ��
	 * 1�����캯��˽�л�
	 * 2:�����ķ��������ص�ǰʵ���ķ���(static)��
	 * 
	 */

	private static LazySingleton singleton = null;

	private LazySingleton() {
		super();
	}

	/**
	 * ����ʱ����ģʽ---����ʽ
	 * @Title: getInstance 
	 * @author: Gavin
	 * @time: 2019��6��21�� ����2:17:52
	 * @return 
	 * @return: LazySingleton 
	 * @throws
	 */
	public synchronized static LazySingleton getInstance() {
		if (singleton == null) {
			singleton =  new LazySingleton();
		}
		return singleton;
	}

}
