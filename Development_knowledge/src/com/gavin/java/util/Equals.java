package com.gavin.util;


public class Equals {

	public static void main(String[] args) {
		//  == �ж������ڴ��ַ�Ƿ���ͬ 
		// == ��������������ͱȽ϶�����ȵĻ�����true. byte short int long float double char true/f
		
		//ֵ�Ƚ�
//		int aa=1;
//		int bb = 129;
//		int cc=1;
//		float ff = 1;
//		Integer dd=1;
//		Integer ee =129; 
//		System.out.println(aa==cc);//true
//		System.out.println(aa==dd);//true
//		System.out.println(aa==ff);//true
//		System.out.println(dd==ff);//true
//		System.out.println(bb==ee);//true
//		
		//��װ��������-��---�������ñȽ�,Ҫ��equals
//		Float float1=36f;
//		Float float2=36f;
//		System.out.println(float1==float2);//false
//		System.out.println(float1.equals(float2));//true
		
		//Byte Short Integer Long ����һ����Χ��-128--127 �͵���ģʽ�����棬�����������false
//		Integer a=127;
//		Integer b=127;
//		System.out.println(a==b);//true
//		System.out.println(null==null);//true
//		
//		System.out.println(Byte.MAX_VALUE);//127
//		System.out.println(Byte.MIN_VALUE);//-128
		
		
		
		
		
//  	equals �ж�����ֵ���(����)(ͬһ��������) ��equals ����һ�����������ɶ���ȥ���õ�
//		Integer a =1;
//		Integer b = 1;
//		Float c = 1f; 
//		System.out.println(a.equals(b));//true
//		System.out.println(c.equals(b));//false ����ͬһ����������
//		System.out.println(null==null);//true ,���ǿ��ԱȽϵ�
		
//		System.out.println(null.equals(null));//����ͨ����
//		null.eqauls(null);//����ģ�����ͨ����
//		System.out.println(a.eqauls(null));//
//		null.equals(a);//����ģ�����ͨ����
//		
		
		//Integer a ;
		//if(!a.eqauls("") && a!=null){//�����
	
		//}
		
		//if("".equals(a) && null!=a){//�����
		
		//}
		
//		if(a!=null && a.equals("")){//��ȷ��
		
//		}
		
		float ac=5.0f;
		System.out.println(1>2?ac:6);//6.0
		System.out.println(1>2?5.0:6);//6.0
		
		
		
	}
}
