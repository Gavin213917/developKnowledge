package com.gavin.Lambda.ex;

import java.util.Arrays;
import java.util.Comparator;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class Test {

	
	public static void main(String[] args) {
//		Addable addable = new Addable() {
//			
//			@Override
//			public int add(int a, int b) {
//				return a+b;
//			}
//		};
//		
//		
//		addable.add(10, 10);
		
//		Lambda���ʽ����Ҫ���þ�����������ڲ���ķ����﷨��������������ɣ�
//		1���β��б�,�β��б�����ʡ���β����ͣ�����β��б�ֻ��һ���������������β��б������Ҳ����ʡ�ԡ�
//		2:��ͷ(->) 
//		3:����飺//����Ҫִ�еĺ�����ͷ���һ�������ʵ������
		
		
		
		
		
//		Addable addable = (a,b)->a+b;
//		System.out.println(addable);
//		int count = addable.add(10, 10);
//		System.out.println(count);
		
		
		Eatable eatable = ()->{
			System.out.println("����Զ���");
		};
//		eatable.taste();
		//����ӿ��ж���ĺ�����û���βεģ���ĺ������{}����ʡ��,����returnҲ����ʡ��
//		Eatable eatable = ()->System.out.println("����Զ���");
//		eatable.taste();
		
//		Flyable flyable = (weather)->{
//			System.out.println("�����������:"+weather);
//			System.out.println("�Ҿ��ڼ���˯���ɣ������....");
//		};
//		flyable.fly("����");
//		
//		Flyable flyable2 = weather->{
//			System.out.println("�����������:"+weather);
//			System.out.println("�Ҿ��ڼ���˯���ɣ������....");
//		};
//		
//		flyable2.fly("��̫��");
		
//		Addable addable = (a,b)-> a+b;
//		System.out.println(addable);
//		int result = addable.add(5,8);
//		System.out.println(result);
//		
//		Addable addable2 = (a,b)-> a*b;
//		System.out.println(addable2);
		
		
		
//		ConvertFK convert =(str)->{
//			return Integer.parseInt(str);
//		};
		
//		ConvertFK convert =str->Integer.parseInt(str);
//		ConvertFK convert =Integer::parseInt;//ֻ��һ�������������
		
		
//		Integer num = convert.convert("99");
//		System.out.println(num);
		
		
//		String string = "i love you ";
//		System.out.println(string.substring(0, 9));
		
//		SubStrFk strFk = (a,b,c)->{
//			return a.substring(b,c);
//		};
		
//		SubStrFk strFk = String::substring;
//		SubStrFk strFk = String::toUpperCase;
//		String result = strFk.toUpper("i love you ");
//		System.out.println(result);
		
		
		//�����ڲ����lambda���ʽ������
		
		
		Integer[] nums = {1,2,4,7,8,9,44,5,8742,12,18,1,0,54,};
//		Arrays.sort(nums,new Comparator<Integer>() {
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				return o2-o1;
//			}
//		});
		
//		Arrays.sort(nums,(a,b)->{
//			return b-a;
//		});
//		
//		for (int i : nums) {
//			System.out.println(i);
//		}
		
		
		Runnable runnable = ()->{
			for (int i = 0; i < 100; i++) {
				System.out.println(i);
			}
		};
		
		Thread thread = new Thread(runnable);
		thread.start();
		
	}
}
