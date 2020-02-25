package com.gavin.NIO.oneDemo;

import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;


public class NioCopyFile2 {

	
	public static void main(String[] args) {
		File file = new File("d://keke.sql");
		try (
			FileChannel inChannel = new FileInputStream(file).getChannel();
		){
			//����һ��ByteBuffer���������ظ���ȡ����
			ByteBuffer buffer = ByteBuffer.allocate(256);
			while (inChannel.read(buffer)!=-1) {
				//����buffer�Ŀհ���
				buffer.flip();
				Charset charset = Charset.forName("utf-8");
				//����������
				CharsetDecoder decoder = charset.newDecoder();
				//��buffer���ݽ��н���
				CharBuffer charBuffer = decoder.decode(buffer);
				System.out.println(charBuffer);
				//��buffer��ʼ����Ϊ��һ�ζ�ȡ������׼��
				buffer.clear();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
