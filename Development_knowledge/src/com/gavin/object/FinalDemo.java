package com.gavin.object;

import java.util.ArrayList;
import java.util.List;

public class FinalDemo {
	/**
	 * ��Java�У�final��������Ҫ��һ����������
	 * ��һ����final���ε��಻�ܱ��̳С�
	 * �ڶ�����final���εķ������ܱ���д��
	 * ��������final���εı������ܱ����¸�ֵ��(����)
	 * 
	 * ���ģ���final���εĳ�Ա����һ��Ҫ����ʼֵ������һ��ʼ����ֵ���ڴ�������渳ֵ������������û�����塣
	 * 
	 * ���壬��final���εľֲ�������һ��Ҫ����ʼֵ������ֻ�ܸ�ֵһ�Ρ�
	 * 
	 * ��������Ի����������ͺ�Ӧ����������
	 * ����������������ͱ�final���εĻ�����һ��Ҫ��ֵ�����Ҳ�����null���������ݵ��������������ڲ���ֵ���ǿ����޸ĵ�
	 * 
	 * 
	  * ������1�������ǹ����� 2��������һ��ȫ����д���������������ǳ���������ͨ����
	 * 
	 * 
	 * 
	 */
	public static final  List<Integer> findUser() {
		final List<Integer> nums = new ArrayList<>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		return nums;
	}
	
	public static void main(String[] args) {
		final List<Integer> nums = findUser();
		nums.set(0, 22);//list���ࣩ ��final ���Σ������ֵ�ǿ����޸ĵ�
		
		for (Integer integer : nums) {
			System.out.println(integer);
		}
		
		//�������������ͣ������ڶ����濪���ڴ�ռ��
		final int [] num = {1,2,3};
		num[0] = 8;//�����޸�
		
	}
	
	
	
	

}
