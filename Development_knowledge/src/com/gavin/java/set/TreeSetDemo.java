package com.gavin.set;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.TreeSet;

public class TreeSetDemo {

	static int age;
	static boolean mark;
	static float money;
	static char cc;
	public static void main(String[] args) throws ParseException {
		System.out.println(age);
		System.out.println(mark);
		System.out.println(money);
		System.out.println(cc);
		
		//TreeSet---������㷨--��ά��Ԫ�ص�˳��---������һ��������
		
		//TreeSet����ü����е�һ��������conpareTo(Object o)�ķ����Ƚ�Ԫ�صĴ�С��ϵ�����ַ�ʽ�������Ȼ����(����),
		//���������ͨ���ı�����Ĺ�����ô������Զ�һ����ʵ��Comparator�ӿڣ�����compare�����Ľ��бȽϡ�
		//jdkΪComparator�ӿ��ṩ��һ��Ĭ��������ƣ�
		//1:���ַ�װ�������ͺ�BigDecimal��BigInteger�ȶ��Ǹ�����ֵ�Ĵ�С���бȽ�����
		//2:Character,String���Զ������ַ������ַ�����unicodeֵ���бȽ�
		//3:Date��Time���Ǹ������ڱȽ�����������
		
		//����ӿڵĹ��캯��
//		TreeSet<String> set =new TreeSet<>();
//		set.add("A");
//		set.add("B");
//		set.add("C");
//		set.add("H");
//		set.add("E");
//		set.add("F");
//		set.add("G");
		TreeSet<String> set =new TreeSet<>(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if(o2.length()<o1.length()){
					return -1;
				}else{
					return 1;
				}
				
//				System.out.println(o2+"=="+o2.hashCode()+"<======>"+o1+"=="+o1.hashCode());
//				
//				if(o2.hashCode()>o1.hashCode()){
//					return -1;
//				}else{
//					return 1;
//				}
				
				//��ҵ�������ַ���������ĸ��Ӧ��asciiֵ��������
			}
		});
		
		set.add("java");
		set.add("w�Ұ���");
		set.add("w����keke��ʦ");
		set.add("n�����23");
		set.add("wΪΪ");
		set.add("a��");
		set.add("oŶ");
		
		
		
		
		for (String c: set) {
			System.out.println(c);
		}
		
		
		
		/*
		 * jdk--��ֵ�ͺ� ������
		 * ���ֻ�����������
		 * byte short int long 0
		 * float double  0.0
		 * char \u0000
		 * 0-48  A-65   a-97
		 * 
		 * �����Ķ���null��ΪĬ��ֵ(��װ��������)
		 * 
		 * 
		 * boolean
		 * 
		 * 
		 * */
		
		
		
		TreeSet<Date> dates = new TreeSet<>(new DateComparator(false));
//		TreeSet<Date> dates = new TreeSet<>(new DateComparator());
		dates.add(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2017-12-12 12:12:11"));
		dates.add(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2015-08-12 01:12:08"));
		dates.add(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2014-03-12 11:12:12"));
		dates.add(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2012-02-12 01:12:10"));
		dates.add(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2012-10-12 01:12:10"));
		dates.add(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2016-12-12 02:11:22"));
		dates.add(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2015-11-12 11:12:24"));
		
		
		
		
		
//		for (Date date : dates) {
//			System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date));
//		}
		
		
		
		
		
		
		
		
		
	}
}