package com.gavin.NIO.oneDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.CharBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

public class NioCopyFile {

	
	public static void main(String[] args) {
		File file = new File("d://ccccc.jpg");
		try (
			FileChannel inChannel = new FileInputStream(file).getChannel();
			FileChannel outChannel = new FileOutputStream("f://a.jpg").getChannel();	
		){
			
			MappedByteBuffer byteBuffer =  inChannel.map(FileChannel.MapMode.READ_ONLY, 0, file.length());
			//ʹ�ý�����
			Charset charset = Charset.forName("UTF-8");
			//ֱ�ӽ�buffer������ȫ�����
			outChannel.write(byteBuffer);
			//�ٴε���buffer��clear��������ԭlimit,position��λ�� 
			byteBuffer.clear();
			//����������
			CharsetDecoder decoder = charset.newDecoder();
			//ʹ�ý�������ByteBufferת���ɹ�CharBuffer
			CharBuffer charBuffer = decoder.decode(byteBuffer);
			System.out.println(charBuffer);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
