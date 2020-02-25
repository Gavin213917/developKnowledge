package com.gavin.IO;

import java.io.File;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo {

	/**
	 * RandomAccessFile:�������
	 * ����RandomAccessFile�������ɵķ����ļ�������λ�ã��������ֻ��Ҫ�����ļ��Ĳ������ݣ�
	 * �����ǰ��ļ���ͷ����β��ʹ��RandomAccessFile���Ǹ��õ�ѡ��
	 * 
	 * r:��ֻ���ķ�ʽ��ָ���ļ�������ļ������ڣ��������ļ�
	 * rw:�Զ���д�ķ�ʽ��ָ���ļ���
	 * 
	 */
	public static void main(String[] args) {
		/*��*/
//		try (
//			RandomAccessFile randomAccessFile = new RandomAccessFile(new File("d://a.txt"), "r");	
//		){
//			System.out.println("��ʼָ�룺"+randomAccessFile.getFilePointer());
//			//λ��ָ���λ��
//			randomAccessFile.seek(2);
//			byte[] b = new byte[1024];
//			int len = 0;
//			while((len = randomAccessFile.read(b))!=-1){
//				System.out.println(new String(b,0,len));
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		/*д��*/
		try (
				RandomAccessFile randomAccessFile = new RandomAccessFile(new File("d://a.txt"), "rw");	
			){
				System.out.println("��ʼָ�룺"+randomAccessFile.getFilePointer());
				//λ��ָ���λ��
				randomAccessFile.seek(randomAccessFile.length());
//				randomAccessFile.writeUTF("keke\r\n");
				randomAccessFile.write("keke\r\n".getBytes());
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
}
