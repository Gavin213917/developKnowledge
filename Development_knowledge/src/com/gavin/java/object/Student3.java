package com.gavin.object;

public class Student3 {
	
	/**
	 * ��---��һ���������ͣ��Զ����������ͣ�-----Integer  String
	 * 
	 * ���캯���� 
	 * 1�������ڴ�ռ�ĵ�ַ����������ģ������һ������û�ж��幹�죬���Զ�����Ĭ�ϵĹ��캯�� 
	 * 2������˽�У����Ը�ֵ 
	 * 3�����캯����������
	 * 
	 * a:���캯�����Ǻ�����Ҳ�ᱻִ�У�ֻ�������ڵ���֮ǰִ�еķ�����
	 * b:�ڴ��������ʱ�򣬻��Զ�����Java�ṩ��Ĭ�ϵĹ��캯����
	 * c:���������˺��������أ���ô�ͻḲ��Ĭ�ϵĹ��캯��������������ʹ���޲εĹ��캯������ô�ͱ�����ʾ�����޲εĹ��캯����
	 * 
	 * ���㺬�壺��ֵ������ռ�
	 * 
	 * 
	 * 
	 */
	private  String name;
	private int age;
	private Float money;

	public Student3() {//spring ioc ���캯��ע��
		System.out.println("���ǹ��캯��Ŷ���һ���ִ�С���������");

	}
	//����������
	public Student3(int age) {//spring ioc ���캯��ע��
		System.out.println("���ǹ��캯��Ŷ���һ���ִ�С���������");
		this.age =age;

	}
	
	public Student3(String name ,int age) {//spring ioc ���캯��ע��
		System.out.println("���ǹ��캯��Ŷ���һ���ִ�С���������");
		this.name = name; 
		this.age =age;

	}
	
	public Student3(String name ,int age,Float money) {//spring ioc ���캯��ע��
//		this.name = name; 
//		this.age =age;
		this(name,age);//������ڵ�һλ��ִ�з���
		this.money = money;
 		System.out.println("���ǹ��캯��Ŷ���һ���ִ�С���������");

	}
	
	public static void main(String[] args) {
		Student3 student = new Student3();
		student.name = "gavin";
		System.out.println(student.name);
		
		Student3 student2 = new Student3();
		System.out.println(student2.age);
		
	}

}