package com.gavin.array;

public class ForDemo {

	public static void main(String[] args) {
		//����ѭ��---һ�����ڶ�ά����Ͷ�λ����
		/*
		 * 	for(int i=0;i<length;i++){
		 *    for(int j=0;j<length;j++){
		 *    	//ѭ����
		 *    }
		 *  }
		 * 
		 * */
		
		//���ѭ��ֻ�ǿ����ڲ�ѭ���Ĵ�����
		for (int i = 1; i <=10; i++) {//���ѭ��
			
			for (int j = 1; j <=10; j++) {//�ڲ�ѭ��
				//�ڲ�ѭ����
				System.out.println(i+"====>"+j);
			}
			//���ѭ����
			System.out.println("============");
		}
		
	}
	public static void printMultiTable() {
		/*
		 * 1 * 1 = 1 	 1 
		 * 1 * 2 = 2  2 * 2 =4  2
		 * 1 * 3 = 3  2 * 3 = 6 3 * 3 = 9  3
		 * 
		 * �žų˷�������Ч��
		 * ���Ǹ���ҪҪ���ף����֪ʶ�㱳�����ص�֪ʶ--���Ƕ�� for
		 * �������ڴ�ѭ���Ĵ�����
		 * */
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + "*" + j + "=" + (i * j)+"\t");
			}
			System.out.println();
		}
	}
}

