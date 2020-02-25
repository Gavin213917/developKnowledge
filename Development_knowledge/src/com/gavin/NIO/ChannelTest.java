package com.gavin.NIO;

import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;

public class ChannelTest {

	
	public static void main(String[] args) {
		
		//���С�ļ���--�������ļ��Ĵ���
//		File file = new File("d://ccccc.jpg");
//		try (
//			//����ͨ��
//			FileChannel inChannel = new FileInputStream(file).getChannel(); 
//			//���ͨ��
//			FileChannel outChannel = new FileOutputStream("f://111.jpg").getChannel();	
//		){
//			//map()	
//			MappedByteBuffer buffer = inChannel.map(MapMode.READ_ONLY,0,  file.length());
//			outChannel.write(buffer);
//			buffer.clear();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		
		//�ַ����Ĵ���
//		File file = new File("d://luoo.html");
//		try (
//			//����ͨ��
//			FileChannel inChannel = new FileInputStream(file).getChannel(); 
//			//���ͨ��
//			FileChannel outChannel = new FileOutputStream("f://luoo.html").getChannel();	
//		){
//			//map()	
//			MappedByteBuffer buffer = inChannel.map(MapMode.READ_ONLY,0,  file.length());
//			outChannel.write(buffer);
//			buffer.clear();
//			
//			//�ַ���������
//			Charset charset = Charset.forName("UTF-8");
//			//�ļ����ݽ�����
//			CharsetDecoder decoder = charset.newDecoder();
//			CharBuffer charBuffer = decoder.decode(buffer);
//			System.out.println(charBuffer.toString());
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		
		//д�빦��
//		try (
//			//���ͨ��
//			FileChannel outChannel = new FileOutputStream("f://a.txt").getChannel();	
//		){
////			CharBuffer buffer  = CharBuffer.wrap("�Ұ���24234234");
////			Charset charset = Charset.defaultCharset();
////			ByteBuffer byteBuffer = charset.encode(buffer);
//			ByteBuffer byteBuffer = Charset.defaultCharset().encode("�Ұ���");
//			//map()	
//			outChannel.write(byteBuffer);
//			byteBuffer.clear();
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		
		
		
		
		/*
		 * �ֶζ�ȡ����
		 * */
		try (
				
			FileInputStream inputStream =  new FileInputStream("d://luoo.html");
			//����һ��ͨ��
			FileChannel fileChannel = inputStream.getChannel();
		){
			//����һ��ByteBuffer����
//			byte[] c = new byte[1024];
			ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
			
//			�˽�Charset
			
//			int len = 0;
//			while((len=inputStream.read(c))!=-1){
//				System.out.println(new String(c,0,len));
//			}
			
			while(fileChannel.read(byteBuffer)!=-1){
				byteBuffer.flip();
				//�����ַ�������
				Charset charset = Charset.forName("UTF-8");
				//�����ֽ���
				CharBuffer charBuffer = charset.decode(byteBuffer);
				//��ӡ
				System.out.println(charBuffer.toString());
				//���³�ʼ����Ϊ��һ�ζ�ȡ������׼��
				byteBuffer.clear();
			}
			
		} catch (Exception e) {
		}
		
		
		
		
		
	}
}
