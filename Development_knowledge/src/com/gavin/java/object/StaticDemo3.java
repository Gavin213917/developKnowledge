package com.gavin.object;

public class StaticDemo3 {
	
	
	//��̬��Ա�ڱ����ʱ����Ѿ�ȷ���ڴ�ռ�Ĵ�С���͵�ǰ�౾��������һ�𣬴���뾲̬���С�---ջ��
	//�Ǿ�̬��Ա����new������ռ��ַ��ʱ�� ������=---����
	
	
	public static int num;
	public  int num2;
	
	//�ܽ᣺
	//1:��̬������ֻ�ܵ��þ�̬��Ա
	//2:�Ǿ�̬�������Ե��þ�̬��ԱҲ���Ե��÷Ǿ�̬��Ա
	//3:��̬��Ա��һ��ͨ����ȥ���ã�
	//4:��Ȼ��̬���������࣬��ô�����Ͳ�����this�ؼ���
	
	public static void test(){
		//---�������η�--�̳�-final
	}
	
	
	public  void test3(){
		System.out.println(this.num2+"==="+StaticDemo3.num);
	}
	
	
	
	public static void main(String[] args) {
		
		StaticDemo3.test();
		
		StaticDemo3 demo=new StaticDemo3();
		demo.num2++;
		StaticDemo3.num++;//��̬��Ա:ͨ������ȥ����
		
		StaticDemo3 demo2=new StaticDemo3();
		demo2.num2++;
		StaticDemo3.num++;
		
		System.out.println("demo==="+demo.num2);//1
		System.out.println("demo2===="+demo2.num2);//1
		
		
		System.out.println("��̬��Ա:demo==="+StaticDemo3.num);//2
		System.out.println("��̬��Ա:demo2===="+StaticDemo3.num);//2
		
	}
	
	
	
	
	
	
	
	
}
