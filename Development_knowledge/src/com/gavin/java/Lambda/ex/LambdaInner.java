package com.gavin.Lambda.ex;

public class LambdaInner {

	private int age = 30;
	private static String name = "�ɿ�";
	
	public void test(){
		
		String address = "���ϳ�ɳ";
//		LambdaFk lambdaFk = new LambdaFk() {
//			@Override
//			public void display() {
//				System.out.println("��ǰ��������:"+age);
//				System.out.println("��ǰ��������:"+name);
//				System.out.println("�ҵĵ�ַ��:"+address);
//				LambdaFk.sayHello();
//				this.sum(10, 10);
//			}
//		};
		
		LambdaFk lambdaFk = ()->{
			System.out.println("Lambda��ǰ��������:"+age);
			System.out.println("Lambda��ǰ��������:"+name);
			System.out.println("Lambda�ҵĵ�ַ��:"+address);
		};
		
		lambdaFk.display();
		lambdaFk.sum(10, 20);
	}
	
	public static void main(String[] args) {
		LambdaInner inner = new LambdaInner();
		inner.test();
	}
}
