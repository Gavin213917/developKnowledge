package com.gavin.object;

import java.sql.Date;

public class Student {

	//����
	private String name;
	private Float money;
	private String address;
	private Date birthday;
	private Integer age;
	
	//��Ϊ
	public void buyBook(String message){
		int age2=10;//�ֲ�����
		System.out.println(this.name+"==="+this.money+"������һ����"+age);
		//������---��̬���ٵ�
		print(message);
	}
	
	public void print(String message){
		System.out.println(message);
	}
	
	//�������͹�������ĳ"һ��"������������ԣ����Ժ���Ϊ��(ĳһ��������ļ��Ϻͳ���),������������ľ�����ڡ�
	//��Ҳģ��
	
	
	//strong ͬѧ��һ�ٿ�Ǯ----����
	//keke ͬѧ��20��Ǯ----����
	
	
	
	//��-һ����˵�����캯�������ԣ���������Ϊ���ʹ���顣
	//�������Ǻ�����
	
	
	/*
	 * 
	 * ��Ա�����Ժͷ�����
	 * ��Ľṹ��
	 * �������η�  ���� {
	 *    
	 *    
	 *    
	 *      //���캯��
	 *      1�������ڴ�ռ�ĵ�ַ����������ģ������һ������û�ж��幹�죬���Զ�����Ĭ�ϵĹ��캯��
	 *      2������˽�У����Ը�ֵ
	 *      3�����캯����������
	 *      
	 *      �������η�  ����(){}//���캯��
	 *      �������η�  ����(�����б�){}//���캯��
	 *      .
	 *      .
	 *      .
	 *      
	 *     //���Զ���
	 *     [�������η�]   [���δ�(static final)] ��������  ������  = ֵ;
	 *     [�������η�]   [���δ�(static final)] ��������  ������;
	 *     .
	 *     .
	 *     .
	 *   
	 *      
	 *      
	 *     //����----
	 *     [�������η� ] [���δ�(static final)]  ����ֵ   ������{
	 *         //������
	 *         
	 *         
	 *      }
	 *      
	 *      
	 *      //����� ---��ֵʹ�õģ���ʼ����Ա�����ģ�����׶ξ�д�뵽Java�ѣ��������ڴ�ռ�֮ǰ�����캯����
	 *      1����̬�����--ֻ�ܳ�ʼ����̬��Ա����
	 *      static {
	 *      
	 *      }
	 *      
	 *      //��ͨ�����--�ȿ��Գ�ʼ����̬��Ա������Ҳ���Գ�ʼ���Ǿ�̬��Ա����
	 *      {
	 *      
	 *      }
	 *      
	 * 		ִ��˳�򣺾�̬�����>��ͨ�����>���캯��
	 * }
	 *   
	 * 
	 * 
	 * */
	
	
	/*
	 * 
	 * 	������������
	 * byte short int long 
	 * float double 
	 * boolean 
	 * char
	 * 
	 * ��ֵ�ͺͲ�����
	 * 
	 * ���ǰ��൱��һ���������������.��ģ��--���Ը�ֵ��---
	 * 
	 * 
	 * */
	
	
	public int sum(){
		int a=1;
		int b=1;
		int c=a+b;
		return c;
	}
	
	
	public static void main(String[] args) {
		//������ô��---�϶����й�ϵ

		//������ͨ����Ĺ��캯��(��������)ȥ����ȥ�������һ���ڴ�ռ��ַ,�������---��ʵ���ǷǾ�̬��Ա�����Ĺ���.
		
		Student keke = new Student();
		
		keke.name="keke";
		keke.address="���ϳ�ɳ";
		keke.age = 30;
		keke.money = 12.5f;
		
		
		
		int num = keke.sum();
		System.out.println(num);
		
//		keke.buyBook("��̫˧��....");//��ʵ����֪ͨcpuִ�з�����Ĺ��̣��γɶ������ڴ�ռ䣬�����������������ŷ���ִ����ϣ�������
		//�������ԣ��ֲ���������������
		
		
//		Student dawei = new Student();
//		dawei.name="��Ϊ";
//		dawei.address="�Ϻ�";
//		dawei.age = 16;
//		dawei.money = 12.5f;
//		
		
		
	}
	
	
	
	
}