package com.gavin.set;

import java.util.HashSet;
import java.util.Iterator;

public class SetDemo3 {

	public static void main(String[] args) {
		HashSet<Integer> ages = new HashSet<>();
		HashSet<Integer> ages2 = new HashSet<>();
		ages.add(10);
		ages.add(20);
		ages.add(30);
		ages.add(40);
//		ages.add(50);
		
//		//׷�ӵ�һ���µ�set��
//		ages2.addAll(ages);
//		//jdk1.8���ṩpredicate(Filter),���ϵ������Ĺ���
//		Iterator<Integer> it = ages.iterator(); 
//		while (it.hasNext()) {
//			Integer age =  it.next();
//			if(age.equals(20)){
//				ages.remove(age);
//			}
//			
//		}
		//���ϴ������ᱨjava.util.ConcurrentModificationException
		//https://www.cnblogs.com/dolphin0520/p/3933551.html ����
		//������������´���һ��set ���϶���Ȼ������µģ�ɾ���ɵ�
		//׷�ӵ�һ���µļ�����
//		ages2.addAll(ages);
//		Iterator<Integer> it = ages2.iterator(); 
//		while (it.hasNext()) {
//			Integer age =  it.next();
//			if(age.equals(20)){
//				ages.remove(age);
//			}
//			
//		}
		
//		ages.removeIf(age->age.equals(20));
//		ages.removeIf(age->age>20);
//		System.out.println("ɾ���Ժ��Ԫ����:");
//		for (Object age : ages) {
//			System.out.println(age);
//		}	
		
		
		
		System.out.println("ɾ���Ժ��Ԫ����:");
		HashSet<String> books = new HashSet<>();
		books.add("�ǵķ��͵����͵�ˮ���");
		books.add("123");
		books.add("123456");
		books.add("�ǵĵط�");
		books.add("ˮ���ˮ���ˮ���");
//		books.removeIf(book->book.length()>5);
//		books.removeIf(book->book.indexOf("123")!=-1);
//		books.removeIf(book->book.startsWith("��"));
//		books.removeIf(book->book.endsWith("ˮ���"));
		books.removeIf(book->(book.contains("��") && book.endsWith("��")));
//		books.removeIf(book->(book.contains("��")));
		//�Ѳ�������
		for (String string : books) {
			System.out.println(string);
		}
	}

}
