package com.gavin.NIO;

import java.nio.CharBuffer;

public class BufferDemo {

	
	public static void main(String[] args) {
		
		CharBuffer charBuffer = CharBuffer.allocate(8);
		/*
		 * mark
		 * limit:��һ����Ӧ�ñ�д����߶�ȡ�Ļ�������λ��,�������
		 * position() ����buffer����mark��λ�ã���ֻ����0��position��ȥ��־��
		 * clear();
		 * 
		 * */
		System.out.println("������:"+charBuffer.capacity());
		System.out.println("limit��:"+charBuffer.limit());
		System.out.println("position:��ȡ��д���ָ��:"+charBuffer.position());
		
		charBuffer.put('a');
		charBuffer.put('b');
		charBuffer.put('c');
		
		System.out.println("���������Ժ��λ���ǣ�"+charBuffer.position());
		charBuffer.flip();
		System.out.println("flip  position ���������Ժ��λ���ǣ�"+charBuffer.position());
		System.out.println("flip  limit��"+charBuffer.limit());
		
		
		charBuffer.clear();//׼��ӭ����һ�λ�������
		System.out.println("clear position ���������Ժ��λ���ǣ�"+charBuffer.position());
		System.out.println("clear limit��"+charBuffer.limit());
		
	}
}
