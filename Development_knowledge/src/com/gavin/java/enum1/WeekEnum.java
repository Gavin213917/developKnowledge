package com.gavin.enum1;

public enum WeekEnum  {
	
	//�������캯��
	Monday("����һ"), // ����һ
	Tuesday("���ڶ�"), // ���ڶ�
	Wednesday("������"), // ������
	Thursday("������"), // ������
	Friday("������"), // ������
	Saturday("������"), // ������
	Sunday("������");// ������
	
	private WeekEnum(String name){
		this.name = name;
	}
	
	//��Ա����
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name= name;
	}


	public void test(){
		System.out.println("ok");
	}
}
