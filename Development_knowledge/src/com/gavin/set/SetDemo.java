package com.gavin.set;

import java.util.HashSet;

import com.gavin.bean.Student;

public class SetDemo {
	public static void main(String[] args) {
		/**
		 * Collection�����ӿ��У�
		 * Collection�ӿ���List��Set��Queue�ӿڵĸ��ӿڣ��ýӿڼ����Բ���Set����Ҳ�������ڲ���List��Queue���ϣ�����ͨ�õķ������£�
			boolean add(Object o) ��Ϊ�������Ԫ�أ��������ӵ������иı伯�ϵĳ��ȣ���ӳɹ�����true;
			boolean addAll(Collection c) �÷����Ѽ���c�����е�Ԫ����ӵ�ָ���ļ����
			void clear():��ռ��ϣ����ȱ�0.
			boolean contains(Object c):�ж�Ԫ���Ƿ��ڼ����С�
			boolean containsAll(Collection c):�ж�ĳ�����Ƿ��������һ���������е�Ԫ�أ�����Ƿ���:true
			boolean isEmpty();�жϼ����Ƿ�Ϊ�գ����size=0;����true����false.
			Iterator iterator()����һ�������������ڱ����������Ԫ�ء�
			boolean remove(Object c);����ĳ��Ԫ�شӼ�����ɾ�����ı䳤��
			boolean removeAll(Collection c);ɾ��һ��������������һ�������е�����Ԫ�ء����ɾ����һ�����߶������true;����false;
			boolean retainAll(Collection c);�Ӽ�����ɾ������c�ﲻ������Ԫ�أ�--ȡ �������ϵĽ����������ͬ��ɾ��
			int  size();��ȡ���ϵĳ���
			object[] toArray() �÷�����һ�����Ͽ��ٵ�ת�������顣
		 * 
		 * Set��Ԫ����һ�������������������ͬ��Ԫ�أ�������й��ˣ�ÿ��ִ����������д洢. �����hashcode--
		 * 
		 * Set����������������װ�����������Ҫ����һ��List ��ΪList������������װ��
		 * 
		 */
		Integer keke_age = 30;
		HashSet<Student> ages = new HashSet<>();

		Student keke = new Student("keke", 30);// hashcode=111
		Student xiaohuang = new Student("xiaohuang", 21);// hashcode=1

		Student mayi = new Student("keke", 30);// hashcode=1
		Student stone = new Student("stone", 20);// hashcode=1
		
		//ÿ����Ӷ������hashcode��eqauls�������������hashcode��ֵ����ͬ����ô��ֱ�Ӳ�����׷�ӽ�ȥ�ġ�����false
		boolean c1 = ages.add(keke);// 61
		boolean c2 = ages.add(xiaohuang);// 52
		boolean c3 = ages.add(mayi);// 51
		boolean c4 = ages.add(stone);// 51

		System.out.println(c1);// hashcode
		System.out.println(c2);
		System.out.println(c3);// false
		System.out.println(c4);

		for (Student student : ages) {
			System.out.println(student.getUsername() + "===" + student.getAge());
		}

		System.out.println("keke".hashCode());

		// �ܽ���δ�����������У�ֻҪǣ��Ԫ�صĹ��˺�ȥ��---���뵽set---HashSet

	}

}
