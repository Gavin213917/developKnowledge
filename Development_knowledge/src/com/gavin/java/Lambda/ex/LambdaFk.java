package com.gavin.Lambda.ex;

@FunctionalInterface
public interface LambdaFk {

	//���󷽷�
	public void display();
	
	
	//Ĭ�Ϸ���.���Զ�����
	default int sum(int a,int b){
		return a+b;
	}
	
	//��̬����,���Զ�����
	static void sayHello(){
		System.out.println("���!!!");
	}
}
