package com.gavin.set;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class RandomSet {

	/**
	 * �������ظ��ĵ������
	 * @Title:getRandomNum
	 * @author:Gavin  
	 * @date: 2019��5��21������9:18:13 
	 * @Description:TODO    
	 * @version 1.0
	 */
	public static Integer[] getRandomNum(int size, int rangeNum) {
		if (rangeNum < size)
			rangeNum += (size - rangeNum);
		//HashSet<Integer> nums2 = new HashSet<>();//����ģ�ȥ�ع���
		TreeSet<Integer> nums = new TreeSet<>();//����ģ�ȥ�ع���
		Random random = new Random();
		int i = 0;
		while (i < size) {
			boolean flag = nums.add(random.nextInt(rangeNum) + 1);// ����false�ʹ���Ԫ���Ѿ����ڣ����ھͲ����
			if (flag) {
				i++;
			}
		}

		Integer[] nums2 = new Integer[size];
		nums.toArray(nums2);//ת������
		return nums2;
	}

	public static void main(String[] args) {

		/*
		 * ���������ɲ��ظ��������
		 * 
		 */

		// HashSet<Integer> nums=new HashSet<>();

		Integer[] nums = getRandomNum(10, 100);
		for (Integer integer : nums) {
			System.out.println(integer);
		}

	}

}
