package com.gavin.Lambda.s4;

public class LambdaInner {

	
	private int age=12;
	private static String name="����keke��ʦ";
	public void test(){
		String book = "Java very good";
		Displayable displayable = ()->{
//			book = "sdf"; //�޸ı�����Ϊ���ʱ��book��һ��effectively final�ľֲ�����
			System.out.println("�ֲ�������:"+book);
			System.out.println("�ⲿ���ageʵ������Ϊ��"+age);
			System.out.println("�ⲿ���nameʵ������Ϊ��"+name);
			//���ﲻ�������Ĭ�Ϸ���������ͨ����
			//add(10,10)//complie error
		};
		displayable.display();
		displayable.add(10, 10);
	}
	
	public static void main(String[] args) {
		//�����ڲ���
//		Displayable displayable = new Displayable() {
//			
//			@Override
//			public void display() {
//				this.add(10, 20);
//			}
//		};
		
		LambdaInner inner = new LambdaInner();
		inner.test();
	}
}
