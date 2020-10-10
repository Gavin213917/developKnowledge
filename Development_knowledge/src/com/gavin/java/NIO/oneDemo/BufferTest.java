package com.gavin.NIO.oneDemo;

import java.nio.CharBuffer;

public class BufferTest {
	
	
	/*
	 * 
	 * Buffer�ĳ�ʼ����allocate(int capacity)
	 * 
	 * ������capacity�� ���� (limit)��λ��(position)
	 * ������capacity��ʾ��Buffer�������������,�������Դ洢�������ݡ�������������������Ϊ�������������ܸı�
	 * ���ޣ���һ����Ӧ�ñ������������軺����λ��������Ҳ����˵��λ��limit�����ݼ����ɱ���Ҳ�����Ա�д��
	 * λ�ã�position:����ָ����һ�����Ա���������д�뻺����λ����������Buffer��Channel�ж�ȡ����ʱ��position
	 * ��ֵǡ�õ����Ѿ������������ݡ����ոս�����һ��Buffer����ʱ��positionΪ0,�����Channel�ж�ȡ��2�����ݵ�Buffer��
	 * ��ôposition��Ϊ2.����֮�⣬���ṩ��һ����ѡ���mark���Խ�position��λ��mark����
	 * 
	 */
	public static void main(String[] args) {
		
		CharBuffer buffer = CharBuffer.allocate(8);
		System.out.println(buffer.capacity());
		System.out.println(buffer.limit());
		System.out.println(buffer.position());
		
		//����Ԫ��
		buffer.put('a');
		buffer.put('b');
		buffer.put('c');
		
		System.out.println("��������Ԫ�غ�,position="+buffer.position());
		
		//����flip
		buffer.flip();
		System.out.println("����flip��,limit="+buffer.limit());
		System.out.println("position="+buffer.position());
		
		//ȥ����һ��Ԫ��
		System.out.println("��һ��Ԫ��position=0:"+buffer.get());
		System.out.println("ȡ��һ��Ԫ�غ�position="+buffer.position());
		
		
		//����clear����
		buffer.clear();
		System.out.println("ִ��clear()������limit="+buffer.limit());
		System.out.println("ִ��clear()������position="+buffer.position());
		
		
		System.out.println("��ȡclear()��ȡ������Ԫ��:"+buffer.get(2));
		System.out.println("��ǰposition��λ����:"+buffer.position());
		
		
		
		
	
	}
}
