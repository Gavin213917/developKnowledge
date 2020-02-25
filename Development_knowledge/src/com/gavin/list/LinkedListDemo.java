package com.gavin.list;

import java.util.LinkedList;
import java.util.PriorityQueue;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<Integer> integers = new LinkedList<>();
		integers.add(1);
		integers.add(2);
		integers.add(3);
		integers.add(4);
		integers.add(5);
		
		//˫������---ջ,���еĻ���
//		System.out.println(integers.get(1));
//		System.out.println(integers.get(1));
//		integers.peek();
//		integers.poll()
		
		
		//LinkedList��Queue+List���ں�
		//˫��Ķ���---
		//Queue �Ƚ��ȳ�-
		//ջ���Ƚ�����ĸ���
//		Queue<Integer> queue =new ArrayDeque<>();
		// PriorityQueue ������� ,���ȶ���
		PriorityQueue<Integer> queue =new PriorityQueue(100);//��ӹ̶����ȵ�ʱ��offerҪ��add����Ҫ��
		
		queue.offer(-3);
		queue.offer(1);
		queue.offer(88);
		queue.offer(77);
		queue.offer(2);
		queue.offer(-8);
		
		//heap�㷨--���㷨--������---ͼ-Map
		

		
		//������Ʊ---�����--
		//�㶨���ȫ�ֶ��ж���---ҳ����������Ʊ�İ�ť-
		
		//����
		
		//���Ԫ�صļ��ַ�ʽ��add() offer
		
		
		for (Integer integer : queue) {
			System.out.print(integer+"\t");
		}
		
		System.out.println("");
		System.out.println(queue.peek());//��ȡ�Ƕ���ͷԪ��,��ɾ�����е�Ԫ��
		System.out.println(queue.poll());//��ȡ�Ƕ���ͷԪ��,ɾ�������е�Ԫ��
		System.out.println(queue.remove(88));//ɾ��������ָ����Ԫ��
		//queue.element();//�ȼ���peek()����
		//queue.remove();�ȼ���poll();
		//offer()�ȼ���add();
		
		for (Integer integer : queue) {
			System.out.print(integer+"\t");
		}
	}

}
