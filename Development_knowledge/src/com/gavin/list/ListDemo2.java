package com.gavin.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ListDemo2 {

	public static void main(String[] args) {
		// ArrayList��Vector--��̬����,������ظ��ļ���---������ά��ά����λ��

		// Set--HashSet---���򲻿��ظ�ֵ�ļ���,������ͨ��_hashchode ��_eqauls_�б���������ͬԪ�ء�iterator/foreach

		// List<Integer> nums = new ArrayList<>();// 10����������
		// nums.add(1);
		// nums.add(2);
		// nums.add(3);
		// nums.add(4);
		// nums.add(5);
		// nums.add(6);
		// nums.add(7);
		// nums.add(8);
		// nums.add(9);
		// nums.add(10);// ��չ����ĳ��ȣ����ҽ�������Ŀ���

		// add(int index,Object element) ��ָ��������λ�ò���Ԫ��
//		nums.add(2, 5);// ���
		// addAll(Collection c) ���һ�����ϣ���ԭ�����ϵ�β��

		// addAll(int index,Collection c) ��ָ��������λ�ò��뼯��

		// nums.add(1,11);

		// List<Integer> nums2 = new ArrayList<>();
		// nums2.add(11);
		// nums2.add(12);
		// nums2.add(13);
		// nums.addAll(2, nums2);// ���뼯��Ԫ�ص�λ������Ϊ2Ҳ���ǵ�����Ԫ�ؿ�ʼ����

		// for (Integer integer : nums) {
		// System.out.println(integer);
		// }

		// get(int index)
		// System.out.println(nums.get(0));
		// System.out.println(nums.get(nums.size() - 1));
		// System.out.println(nums.get(1));

		// indexOf()��������λ���ж�Ԫ���Ƿ���ڼ�����

		// lastIndexOf
		// set
		// subList

		// jdk1.8�����ļ���List�ķ�ʽ
		// sort
		// replaceAll

		List<String> classrooms = new ArrayList<>();
		classrooms.add("�첽");// 0

		classrooms.add("eden");// 1
		classrooms.add("Ŭ��");// 2
		classrooms.add("����");// 3
		classrooms.add("�򵥾�����");// 4

		classrooms.add("����");// 5
		classrooms.add("��˧");// 6
		classrooms.add("jamie");// 7
		classrooms.add("��");// 8
		classrooms.add("Boolean");// 9
		classrooms.add("С����");// 10
		classrooms.add("����");// 11
		classrooms.add("����");// 12

		for (String string : classrooms) {
			System.out.println(string + "ͬѧ==����yy6359Ƶ����keke��ʦ����");
		}

		// volatile
		// transient

		// indexOf ����Ԫ�����ڵ�����λ��--�������Ҳ�ѯ,�ҵ���һ��ֱ�ӷ���
		// �ж�һ��Ԫ���Ƿ���ڼ�����,���ڷ�������λ�ã���������ڷ���-1
		// int index = classrooms.indexOf("����");
		// int cindex = classrooms.lastIndexOf("����");
		// System.out.println("��ʦ���ڽ��ҡ�"+index+"����λ��");
		// System.out.println("��ʦ���ڽ��ҡ�"+cindex+"����λ��");
		// System.out.println("sublist======================");
		//
		List<String> names2 = classrooms.subList(1, 5);// �൱���ַ����е�substring, javascript=---substring�൱�������slice
		for (String string : names2) {
			System.out.println("====" + string);
		}

		System.out.println("size=====" + classrooms.size());

		String string = "12345678";
		String str = string.substring(0, 3);
		System.out.println(str);

		System.out.println("==================sort=========================");

		// replaceAll
		classrooms.sort(new Comparator<String>() {

			// �����ַ���������ĸ��������
			@Override
			public int compare(String o1, String o2) {
				if (o1.hashCode() > o2.hashCode()) {
					return -1;
				} else if (o1.hashCode() < o2.hashCode()) {
					return 1;
				} else {
					return 0;
				}
			}
		});

		for (String num : classrooms) {
			System.out.println("====" + num);
		}
	}

}
