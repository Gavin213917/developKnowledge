package com.gavin.array;

public class ArrayDemo {

	public static void main(String[] args) {
		// ѭ��--����----char[] ����---

		// ����---װ�ܶ�Ķ���--����
		// ����---����---�����һ���������͵���������.
		// ���� �Ķ��������ַ�ʽ---��̬����Ͷ�̬����
		// 1.��̬��ʼ��
		// String[] names = {"С��","stone","С����","��ʵ","С��","the end"};
		// String names01[] = new String[]{"С��","stone","С����","��ʵ","С��","the end"};

		// ��ȡԪ��
		// System.out.println(names[0]);
		// System.out.println(names[2]);
		// System.out.println(names[names.length-1]);

		// 2.��̬��ʼ��---�����ҵ�����档�ܹ�Ԥ���������Ĵ�С

		// String[] name02 = new String[6];
		// name02[0]="С��";
		// name02[1]="stone";
		// name02[2]="С����";
		// name02[3]="��ʵ";
		// name02[4]="С��";
		// name02[5]="the end";
		// name02[5]=null;
		// name02[6]="23";//java.lang.ArrayIndexOutOfBoundsException: 6

		// ʣ�µ�54ֻ�Ǹ�����ǰ����������͵�Ĭ��ֵ�������:null


		

		// 2.��װ������������ Byte Short Integer Long Float Double Boolean Character
		// ,����ռ��㹻������Ĭ�϶���null

		// 3.�������� Person[] User[] String[] ����ռ��㹻������Ĭ�϶���null

		int a1 = 20;
		int a2 = 21;
		int a3 = 22;
		int a4 = 23;
		// int[] ages ={a1,a2,a3,a4};
		Integer[] ages2 = { a1, a2, a3, a4 };
		int[] ages = new int[60];
		ages[0] = a1;
		ages[1] = a1;
		ages[2] = a1;
		ages[3] = a1;

		// String[] students ={"keke","����","����"};

		// 1:���飺��һ��������������
		// 2:���鳤�ȣ�.length�����ԣ�
		// 3:�������һ�������壬���ȹ̶����Ͳ��ܶ�̬���Ԫ�أ�ɾ��Ԫ�أ�ֻ���޸���������λ�ö�Ӧ��Ԫ��.

		// ��̬��ʼ��
		String[] names = { "С��", "stone", "С����", "��ʵ", "С��", "the end" };
		// System.out.println(names[0]+"==ͬѧ��yy6359��keke��ʦ����javase�γ�");
		// System.out.println(names[1]+"==ͬѧ��yy6359��keke��ʦ����javase�γ�");
		// System.out.println(names[2]+"==ͬѧ��yy6359��keke��ʦ����javase�γ�");
		// System.out.println(names[3]+"==ͬѧ��yy6359��keke��ʦ����javase�γ�");
		// System.out.println(names[4]+"==ͬѧ��yy6359��keke��ʦ����javase�γ�");
		// System.out.println(names[5]+"==ͬѧ��yy6359��keke��ʦ����javase�γ�");

		// ѭ��====��ĳ�̶ֳ�����˵���Ƿ�������ģ�û������ѭ����ʵ��û����ġ�
		// for (int i = 0; i < names.length; i++) {
		// System.out.println(names[i]+"==ͬѧ��yy6359��keke��ʦ����javase�γ�");
		// }

		// ���ѭ�� for
		/*
		 * ��ʽ: for(��ʼֵ1;�߼��ж�2;��������3){ //ѭ���� 4 }
		 * 
		 * ��1��ѭ������Ժ�===1--->2---4---3 
		 * ��2��ѭ����2 --- 4 ---3 
		 * ��3��ѭ����2 --- 4 ---3 
		 * ��4��ѭ����2 ---4 ---3 
		 * ѭ������ȡ���� 2��true����false �����false�ͽ�����
		 * 
		 */
//		for (int i = 0; i < 11; i++) {// 1...10���ӡ�� no 1--9
//			System.out.println(i);
//		}
		
		//1,2,3,4,5,6,7,8,9,10
//		int i = 1;
//		for (; i < 11; i++) {// ��ӡ���٣����пӡ�������
//			System.out.println(i);
//		}
		
		//11
		int i = 1;
		for (; i < 11; i++); {// ��ӡ���٣����пӡ�������
			System.out.println(i);
		}

	}

}
