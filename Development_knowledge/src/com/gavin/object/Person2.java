package com.gavin.object;


public class Person2 {
	// ��---�Զ�����������---��Ա������ȫ�ֱ�����
	private int age;
	private static String name;

	// ��̬�����--ֻ�ܳ�ʼ����̬��Ա����
	static {
		name = "gavin";
		System.out.println("1----���Ǿ�̬�����Ŷ�������һ��һ��ִ�У��ڱ��������ڴ�ռ�֮ǰ");
	}

	// ��ͨ�����--�ȿ��Գ�ʼ����̬��Ա������Ҳ���Գ�ʼ���Ǿ�̬��Ա����
	{
		age = 20;//���ᱻ����
		name = "zhangsan";
		System.out.println("2----������ͨ�����Ŷ�������һ����ִ�У��ڱ��������ڴ�ռ�֮ǰ");
	}
	
	//����Ĵ����Ὣǰ��Ĵ���鸲��
	{
		name= "baby";
	}

	/*  ���н����
	 *  1----���Ǿ�̬�����Ŷ�������һ��һ��ִ�У��ڱ��������ڴ�ռ�֮ǰ
		2----������ͨ�����Ŷ�������һ����ִ�У��ڱ��������ڴ�ռ�֮ǰ
		3---���ǹ��캯�����һ�����ִ��,�������ڴ�ռ䣬����֮��ִ��
		30====baby
	 */
	
	
	// ���캯��
	public Person2() {

	}

	public Person2(int age) {
		this.age = age;
		System.out.println("3---���ǹ��캯�����һ�����ִ��,�������ڴ�ռ䣬����֮��ִ��");
	}
	
	public static void main(String[] args) {
		Person2 p = new Person2(30);//p Ϊ����
		System.out.println(p.age +"===="+ Person2.name);//�Ǿ�̬���ԣ�ͨ������ȥ���ã���̬���ԣ�ͨ����������
	}

}
