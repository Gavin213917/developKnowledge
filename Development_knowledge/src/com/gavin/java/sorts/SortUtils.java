package com.gavin.sorts;

/**
 * 
* @ClassName: SortUtils  
* @Description:�����㷨�Ļ���  
* @author Gavin  
* @date 2019��5��10��  
*
 */
public class SortUtils {

	/**
	 * 
	 * @Title:main
	 * @author:Gavin  
	 * @date: 2019��5��10������4:25:31 
	 * @Description:���Ժ���    
	 * @version 1.0
	 */
	public static void main(String[] args) {
		int [] arr = RandomArray.randomArr(5, 20);
		//bubbleSort(arr);
		selectSort(arr);
	}
	/**
	 * 
	 * @Title:bubbleSort
	 * @author:Gavin  
	 * @date: 2019��5��10������4:26:46 
	 * @Description:ð������    
	 * �ѵ�һ��Ԫ����ڶ���Ԫ�رȽϣ������һ���ȵڶ������򽻻����ǵ�λ�á�
	 * ���ż����Ƚϵڶ����������Ԫ�أ�����ڶ����ȵ��������򽻻����ǵ�λ�á�.
	 * @version 1.0
	 */
	public static int[] bubbleSort(int [] arr) {
		if(arr == null || arr.length<2) {
			return arr;
		}
		
		for (int i = 0; i < arr.length; i++) {//��������
			for (int j = 0; j < arr.length-i-1; j++) {
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j + 1] = temp;
				}
			}
		}
		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + "\t");
		}
		System.out.println();
		return arr;
		
	}
	
	/**
	 * 
	 * @Title:selectSort
	 * @author:Gavin  
	 * @date: 2019��5��13������3:23:34 
	 * @Description:ѡ������    
	 * @version 1.0
	 */
	public static int[] selectSort(int [] arr) {
		for (int i = 1; i < arr.length; i++) {
			int min = 0;
			for (int j = 1; j <= arr.length-i; j++) {
				if(arr[j] > arr[min]) {
					min = j;
				}
			}
			int temp = arr[arr.length - i];
			arr[arr.length - i] = arr[min];
			arr[min] = temp;
		}
		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + "\t");
		}
		System.out.println();
        return arr;
	}

}
