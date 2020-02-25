package com.gavin.array;

public class YangHuiTriangle {
	/**
	 * 
	 * 
	 * ������Ŀ---�������
	 * 
	 * 1  [1]	 
	 * 1 1	[2]		
	 * 1 2 1 [3]
	 * 1 3 3 1 [4]
	 * 1 4 6 4 1 [5]
	 * 1j=0 5j=1 10j=2 10 j=3 5 1 [6]  i=5
	 * 1j=0 6j=1 15j=2 20 15 6 1 [7] ��һ�� i=6
	 * 
	 * ������� : ������1 �м����������Ԫ�ص����Ϸ�����ֵ�����Ϸ�����ֵ���
	 *  
	 */
	public static int[][] printYangHuiTriangle(int len) {
		int[][] nums = new int[len][];
		for (int i = 0; i < nums.length; i++) {// �����ж����У���������
			nums[i] = new int[i + 1];// ���ٿռ��ַ--���鲻���,ѭ����ÿ�����鸳ֵ,���鳤�ȶ����̶��ģ�
			for (int j = 0; j < nums[i].length; j++) {
				if (i == 0 || j == 0 || j == nums[i].length - 1) {
					nums[i][j] = 1;
				} else {
					nums[i][j] = nums[i - 1][j] + nums[i - 1][j - 1];
				}
				System.out.print(nums[i][j] + "\t");
			}
			System.out.println("");
		}
		return nums;
	}
	
	/**
	 * 
	* @Title:main
	* @author:Gavin  
	* @date: 2019��5��9������4:20:23 
	* @Description:���Ժ���    
	* @version 1.0
	 */
	public static void main(String[] args) {
		printYangHuiTriangle(5);
	}
}
