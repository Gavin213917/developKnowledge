package com.gavin.set;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.TreeSet;

public class TreeSetDemo2 {

	public static void main(String[] args) throws ParseException {
		// ����ӿڵĹ��캯��  �Զ����� 
//		TreeSet<Integer> set = new TreeSet<>();// var set = []; set.sort()����
//		set.add(1);// set.push(1)
//		set.add(-3);// set.push(-3)
//		set.add(11);// set.push(11)
//		set.add(321);// set.push(321)
//		set.add(15);// set.push(15)
//		set.add(10);// set.push(10)
//		set.add(-41);// set.push(-41)
//
//		for (Integer integer : set) {
//			System.out.print(integer + "\t");
//		}
//
//		System.out.println(set.first());// js==set[0]  -41
//		System.out.println(set.last());// js==set[set.length-1];  321
//		System.out.println(set.lower(15));// ���ؼ�����С��ָ��Ԫ��֮ǰ�����Ԫ�� // set[set.indexOf(15)-1]
//		System.out.println(set.higher(15));// ���ؼ����д���ָ��Ԫ��֮ǰ�����Ԫ�� // set[set.indexOf(15)+1]
//		System.out.println(set.subSet(-3, 11));// var arr = set.slice(set.indexOf(-3),set.indexOf(11));
//		System.out.println(set.headSet(1));// ����һ��С��-3�ļ���var arr = set.slice(0,set.indexOf(1));
//		System.out.println(set.tailSet(1));// ����һ�����ڵ���-3�ļ��� var ar = set.slice(set.indexOf(1),set.lenght);

		// TreeSet<Integer> seTreeSet= (TreeSet<Integer>) set.headSet(1);
		// SortedSet<Integer> seTreeSet2= set.headSet(1);
		// for (Integer integer : seTreeSet2) {
		// System.out.println(integer);
		// }

		 String string = "�Ұ���123";//Ϊʲô����β�ͣ���β������Խ�磨�������ƣ�
		 //char[] c =[��0][��1][��2][1 3][2 4][3 5];
		 System.out.println(string.substring(0,3));

		/**
		 * HashSet��TreeSet��Set���������͵�ʵ�֣��������ѡ������������?
		 * HashSet���������Ǳ�TreeSet�ã��ر�����ӣ���ѯԪ�صȲ�������ΪTreeSet��Ҫ����ĺ�����㷨��ά�����ϵ�˳��
		 * ֻ�е���Ҫһ�����������Setʱ�����ǲŻ��õ�TreeSet����������¶���ʹ��HashSet��
		 * HashSet����һ�����࣬LinkedHashSet,������ͨ�Ĳ��룬ɾ��������LinkedHashSet��HashSet����Ҫ��һЩ��ֻ������ά�������������Ķ��⿪����ɵġ�
		 * ������������������LinkedHashSet����졣
		 * EnumSet������Set������������õģ�����ֻ�ܱ���ͬһ��ö�����ö��ֵ��Ϊ����Ԫ�ء�
		 * ����ָ�����ǣ����������������̰߳�ȫ�ģ�����ж���߳�ͬʱ��λһ��set���ϣ������г���һ���߳��޸��˸ü��ϣ������ͨ���ֶ��ķ�ʽ��֤Set���ϵ�ͬ����
		 * ����ͨ��Collections�Ĺ������SynchronizedSortedSet��������װ��Set���ϣ��˲�������ڴ���ʱ���У��Է�ֹ��Set���ϵ������ͬ�����ʡ����磺
		 * SortedSet s = Collections.synchronizedSortedSet(new HashSet());
		 */

		// EnumSet kSet = EnumSet.allOf(KeKeEnum.class);
		// kSet.add(KeKeEnum.SUMMARY);
		// kSet.add(KeKeEnum.WINNER);

		// Set<Integer> nums=Collections.synchronizedSet(new HashSet<Integer>());

	}
}