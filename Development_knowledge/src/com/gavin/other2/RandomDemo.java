package com.gavin.other2;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomDemo {

	public static void main(String[] args) {
		//java.util.Random
		
//		Random random = new Random();
////		System.out.println(random.nextBoolean());//true/false�����
////		System.out.println(random.nextDouble());//0.0~1.0֮���һ��С��
////		System.out.println(random.nextFloat());//0.0~1.0֮���һ��С��
////		//����һ��int�����ķ�Χ����� Integer.MAX_VALUE  Integer.MIN_VALUE
////		System.out.println(random.nextInt());//0.0~1.0֮���һ��С��
////		System.out.println(random.nextInt());//0.0~1.0֮���һ��С��
//		//����һ����Χ��� 0 -100
//		for (int i = 0; i <=1000; i++) {
//			int num = random.nextInt(100);
//			if(num==0){
//				System.out.println("================================================"+num);
//			}else if(num==100){
//				System.out.println("************************************************"+num);
//			}else{
//				System.out.println(num);
//			}
//		}
//		System.out.println(random.nextLong());
		
		//�̰߳�ȫ��
		ThreadLocalRandom random2 = ThreadLocalRandom.current();
		
		int value = random2.nextInt(4, 10);
		double value2 = random2.nextDouble(1.0, 6.0);
		System.out.println(value);
		System.out.println(value2);
		
		
	}
}
