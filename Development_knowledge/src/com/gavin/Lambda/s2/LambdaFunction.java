package com.gavin.Lambda.s2;

public class LambdaFunction {

	public static void main(String[] args) {
		//Lambda�ĺ���ʽ�ӿڣ�����ʽ�ӿڴ���ֻ�ܰ���һ�����󷽷��Ľӿڡ�������������ڲ����﷨�����������ӿڵ�ʵ����ֻ��Ҫʵ��һ�����󷽷�
		//��������¿��Բ���Lambda���ʽ���������󣬸ñ��ʽ���������Ķ����Ŀ�����;�һ������ʽ�ӿڣ����磺Runnable,ActionListener�Ƚӿڶ��Ǻ���ʽ�ӿ�
		//jdk1.8ר���ṩ�ˣ�@FunctionalInterfaceע�⣬��ע��ͨ�����ڽӿڶ����ǰ�棬��ע��Գ�����û���κ����ã������ڸ��߱�����ִ�и��ϸ���--���ýӿڱ���
		//�Ǻ���ʽ�ӿڣ�����������ͻᱨ��
		
		//1:Lambda���ʽ��Ŀ�����ͱ�������ȷ�ĺ���ʽ�ӿ�
		//2:Lambda���ʽֻ��Ϊ����ʽ�ӿڴ�������Lambda���ʽֻ��ʵ��һ�������������ֻ��Ϊֻ��һ�����󷽷��Ľӿڴ�������
		
//		Runnable runnable = ()->{
//			for (int i = 0; i < 100; i++) {
//				System.out.println(i);
//			}
//		};
//		
//		Thread thread = new Thread(runnable);
//		thread.start();
//		
		
		UserFK fk = ()->{
			System.out.println("�����û���Ϣ");
		};
		fk.save();
	}
}
