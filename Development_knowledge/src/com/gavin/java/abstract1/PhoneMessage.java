package com.gavin.abstract1;

public abstract class PhoneMessage {
	public PhoneMessage(){
		super();
	}
	
	public PhoneMessage(String username){
		super();
	}
	
	//���󷽷�---���þ���������һ��Ҫ��д�Ĳ���,����Ҫ����ʵ�ֵĲ���
	/**
	 *  �������в�һ�����ڳ��󷽷���
	 *  ���ǳ��󷽷�һ��ֻ���ڳ������ж���
	 *  
	 *  
	 *  �����ࣺ
	 *  ����ʵ�ֻ����󣬵��ǿ��Զ��幹�캯��.
	 *  ʵ�ֳ����࣬��ʽ������---һ��:ͨ�������ڲ��࣬һ���ǣ���������
	 *  1:���������ʹ��abstract���Σ����󷽷�������abstract���Σ����󷽷��в����о����ʵ�֡�
	 *  2:�����಻�ܱ�ʵ��������ģ����ǿ��Զ��幹�캯����Ŀ���Ǹ���ǰ�������˽�г�Ա���Ը�ֵĿ�ġ���ע��һ��:ͨ�������ڲ��࣬һ���ǣ��������ࣩ
	 *  3:���󷽷������붨���ڳ������л��߽ӿ��С�����г��󷽷���Ҫ��Ȼ�ǳ�������߽ӿڡ�
	 *  4:final���ܹ�abstract����
	 *  5:����˽��private ������public protected
	 *  6:û�г������Եĸ���
	 */
	public abstract String sendMessage(String message);
	public abstract void callPhone(String telephone);

}
