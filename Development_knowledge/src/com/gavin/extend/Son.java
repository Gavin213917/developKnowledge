package com.gavin.extend;

public class Son extends Father{
	public String name="keke";
	/**
	 * 
	 * ����һ���µ�ʵ�� KeKe.
	 * super��ÿһ���ഴ�������ʱ���𣬶����д��룬ֻ��������ʿ���ã�
	 * 1�����û��һ����û�м̳У�superָ����� Object
	 * 2:����м̳У�super()ָ������㸸��Ĺ��캯����super�Ǹ����һ�����ö���
	 */
	
	public Son(){
		super();//super����ʽ����
		System.out.println("C");
	}
	
	
	//������д--��Է���
	/**
	 * ��д(����)��һ��publice protected
	 * 1:һ���̳е�ǰ����.
	 * 2:����͸��෽����һ��һ���������ķ��ʣ�����ֵ�����棬�����б�һ��һ��
	 * 3:���η�һ�����ڵ��ڸ���
	 * 4��ʶ���� ������д����ķ�����@Override
	 * 
	 * Ŀ�ģ��Ǹ��Ǹ��෽����ҵ���߼��������Լ�ȥʵ��.��д���Ƕ�̬��һ�����֡�
	 * 
	 * 
	 * ���أ���Ե�ǰ����ѣ�ֻҪ��ķ����Ĳ������͵��б�һ�¼��ɡ�
	 */
	
	@Override
	public void println(){
		System.out.println("����Ĵ�ӡŶ!!!");
	}
	
	@Override
	public String println(String name){
		return "success";
	}
	
	public String test(){
		System.out.println("ress");
		return "success";
	}

}
