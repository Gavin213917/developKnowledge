package com.gavin.array;

public class PrintDemo {
	public static void main(String[] args) {
		//printMultiTable();
		//printSquare2();
		printTriangle();
	}

	/**
	 * 
	* @Title:printMultiTable
	* @author:Gavin  
	* @date: 2019��5��6������11:01:59 
	* @Description:�žų˷�������Ч�����Ǹ���ҪҪ���ף����֪ʶ�㱳�����ص�֪ʶ--���Ƕ�� for �������ڴ�ѭ���Ĵ�����
	* @param     
	* @return void    
	* @throws
	 */
	public static void printMultiTable() {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + "*" + j + "=" + (i * j) + "\t");
			}
			System.out.println();
		}
	}

	/**
	 * 
	* @Title:printSquare
	* @author:Gavin  
	* @date: 2019��5��6������11:07:03 
	* @Description:��ӡ������
	* @param       
	* @return void    
	* @throws
	 */
	//ʵ��
	public static void printSquare() {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
	//����
	public static void printSquare2() {
		for (int i = 0; i < 5; i++) {// ��ȷ����5��5�е�������
			if (i > 0 && i < 4) {// ��ӡ���м�����
				for (int j = 0; j < 5; j++) {
					if (j == 0 || j == 4) {// ��һ�����һ��
						System.out.print("* ");
					} else if (j >= 1 && j <= 4) {// �м�����
						System.out.print("  ");// ���
					}

				}
			} else if (i == 0 || i == 4) {// ��һ�к����һ��
				for (int k = 0; k < 5; k++) {
					System.out.print("* ");
				}
			}
			System.out.println("");
		}
	}
	/**
	 * 
	* @Title:printTriangle
	* @author:Gavin  
	* @date: 2019��5��8������5:56:46 
	* @Description:��ӡ������ 
	* @param       
	* @return void    
	* @throws
	 */
	public static void printTriangle() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}
}
