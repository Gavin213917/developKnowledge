package com.gavin.set;

import java.util.TreeSet;

public class SetDemo5 {
	public static void main(String[] args) {
		// Integer---Object
		// ÿһ������������һ��hashCode��toString()
		//
//		String keke = "�ǵĶ���sdfsdfsˮ���";
//		// System.out.println(keke.hashCode());
//		System.out.println(keke.toString());
//		//
//		Float float1 = 1033.5f;
//		Float float2 = 1033.5f;
//		System.out.println(float1 == float2);// equals---hashcode�Ƚ� true---==���ڴ��ַ�Ƚ�
//		System.out.println(float1.toString());
		//
		// //�Ƚ�--һ������ֵ�ıȽ�---��ֵ����---��Ӧ������--���ܱȽ�

		// Student student=new Student();//
		// student.setUsername("keke");
		// student.setAge(30);
		// student.setScore(10);
		// System.out.println(student.toString());
		// System.out.println(student);

		// Set ���򣬲������ظ�---����hashcodeȥ�Ƚ�����Ԫ���Ƿ���ͬ�������ͬ���Զ�����equals����ȥ�Ƚϣ�����Ƚ���true,��Ȼ���˵���
		// Set������洢nullֵ

		// Set<Integer> nums = new HashSet<>();
		// nums.add(null);
		// nums.add(1);
		// nums.add(2);
		// nums.add(4);
		// for (Integer integer : nums) {
		// System.out.println(integer);
		// } 

		// Collection<Integer> sets1=new LinkedHashSet<>();
		//
		// Set<Integer> sets2=new LinkedHashSet<>();
		//
		// HashSet<Integer> sets3=new LinkedHashSet<>();

		// �������ظ��������
		// Set<Integer> sets4 = new HashSet<>();
		// LinkedHashSet<Integer> sets4=new
		// LinkedHashSet<>();//������ά����������--����Ҫ��hashsetҪ��һЩ--���߳�--����ַ�

		// for (int i = 0; i < 100000; i++) {
		// sets4.add(i);
		// }

		// for (Integer integer : sets4) {
		// System.out.println(integer);
		// }

		// TreeSet---������㷨--��ά��Ԫ�ص�˳��---������һ��������

		// TreeSet����ü����е�һ��������conpareTo(Object o)�ķ����Ƚ�Ԫ�صĴ�С��ϵ�����ַ�ʽ�������Ȼ����(����),
		// ���������ͨ���ı�����Ĺ�����ô������Զ�һ����ʵ��Comparator�ӿڣ�����compare�����Ľ��бȽϡ�
		// jdkΪComparator�ӿ��ṩ��һ��Ĭ��������ƣ�
		// 1:���ַ�װ�������ͺ�BigDecimal��BigInteger�ȶ��Ǹ�����ֵ�Ĵ�С���бȽ�����
		// 2:Character,String���Զ������ַ������ַ�����unicodeֵ���бȽ�
		// 3:Date��Time���Ǹ������ڱȽ�����������

		// ����ӿڵĹ��캯��
		TreeSet<Integer> set = new TreeSet<>(new IntegerComparator(false));
		set.add(1);
		set.add(12);
		set.add(11);
		set.add(10);
		set.add(8);
		set.add(7);
		// ��С����Ĭ������
		System.out.println(set.comparator());// ��ӡ�����������ʲô

		for (Integer integer : set) {
			System.out.println(integer);
		}

	}

}
