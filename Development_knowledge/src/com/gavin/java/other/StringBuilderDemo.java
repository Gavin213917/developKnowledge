package com.gavin.other;

public class StringBuilderDemo {
	
	public static void main(String[] args) {
		
		
//		Byte Short Integer Long -128-127 
		
//		Integer a = 12; 
//		Integer b = 12;
//		System.out.println(a==b);
//		
//		Integer aa = 128; 
//		Integer bb = 128;
//		System.out.println(aa==bb);
//		System.out.println(aa.equals(bb));
		
		
		//����ǻ����������ͣ�����ֵ�ȽϺ����������޹�
//		int ac=10;
//		double bc=10f;
//		System.out.println(ac==bc);
//		System.out.println(null.eqauls(null));//A��ȷ B����ȷ   B  nullpointException 
//		System.out.println(null==null);////A��ȷB����ȷ  A
				
//		//����(��Ա�䣬���㣬��̬)������(ִ�з���)
		String a1 = "123456789";//Char
		final String a2 = "12345";
		final String a3 = "6789";
		
		String a4 = a2+a3;//����׶ξ�ȷ��
		String a5 = "12345"+a3;
		String a6 = "123456789";
		
		System.out.println(a1==a6);//���н׶�
		System.out.println(a1==a4);//���н׶�
		System.out.println(a1==a5);//���н׶�
		
		System.out.println(a4);//���н׶�
		
		
		//��java����������ֻ�������������ͣ����ֺͲ���
		//byte short int long float double char=--��ֵ��
		//boolean---������
		
		StringBuffer buffer= new StringBuffer();
		buffer.append("123456").append("aaa");
		buffer.append("789");
		System.out.println(buffer.toString());
		
	}
}
