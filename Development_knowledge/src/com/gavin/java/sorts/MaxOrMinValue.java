package com.gavin.sorts;

public class MaxOrMinValue {
	
	public static void main(String[] args) {
		MaxValue();
		int[] nums = {18,39,36,45,17};
		//�����ҵ���ǰ�����У���С����ֵ������Ӧ������
		int num=nums[0];//18
		int index=0;//0
		
		int i=1;
		while(i<nums.length){
//			if(num > nums[i]){ ��Сֵ
			if(num < nums[i]){//���ֵ
				num=nums[i];
				index=i;
			}
			i++;
		}
		
		System.out.println(num+"==="+index);
	}
	
	/**
	 * 
	 * @Title:MaxValue
	 * @author:Gavin  
	 * @date: 2019��5��10������4:22:32 
	 * @Description:��һ�������е����ֵ�Ͷ�Ӧ������  
	 * @version 1.0
	 */
	public static void MaxValue() {
		int[] arr = { 1, 3, 6, 98, 0 };
		int index = 0;
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
				index = i;
			}
		}
		System.out.println("���ֵΪ��"+ max + "  ����Ϊ��"+index);

	}

}
