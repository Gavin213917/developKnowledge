package com.gavin.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAcessFileUtil {
	
	
	/*
	 * java.io.RandomAccessFile:
	 * ��javaio����Ϊ�ḻ��һ���������������빦�������빦�ܸ���ͬʱ�����Խ����ļ��ָ�ͺϲ�
	 * �Լ�ָ��λ�ÿ�ʼ����д��
	 * getFilePointer(),��ȡ��ȡ�ļ����ݵ�seek�趨��λ��
	 * seek(long post):�趨��ȡָ���λ��
	 * RandomAccessFile(file,)
	 * r:ֻ�����ļ�
	 * rw:�Զ�д�ķ�ʽ���ļ�
	 * rws
	 * rwd
	 * 
	 * */
	
	/**
	 * ��ȡ�ļ�
	 * @param file
	 * @param pos
	 * @return
	 */
	public static String readFile(String file,int pos){
		try (
			//����һ���������������ֻ���ķ�ʽ����
			RandomAccessFile randomAccessFile = new RandomAccessFile(file,"r");
		){
			//�����趨��ȡ���λ��
			randomAccessFile.seek(pos);
			//���ֽ����ķ�ʽ���ж���
			byte[] b = new byte[1024];
			int len = 0;
			StringBuilder builder = new StringBuilder();
			//��ʼ��
			while((len = randomAccessFile.read(b))!=-1){
				builder.append(new String(b, 0, len));
			}
			//����
			return builder.toString();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
	/**
	 * д���ļ�
	 * @param file
	 * @param pos
	 * @return
	 */
	public static boolean writerFile(String content,String file){
		try (
			//����һ���������������ֻ���ķ�ʽ����
			RandomAccessFile randomAccessFile = new RandomAccessFile(file,"rw");
		){
			//�����趨��ȡ���λ��
//			randomAccessFile.seek(randomAccessFile.length());
			randomAccessFile.seek(2);
			randomAccessFile.write(content.getBytes());
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	
	/**
	 * �����ݲ��뵽�ļ���ָ��λ��
	 * @param content ���������
	 * @param fileName ������ļ�
	 * @param pos λ��
	 */
	public static void insertContent(String content,String fileName,long pos){
		//����һ����ʱ�ļ�
		File tmpFile = null;
		try {
			tmpFile = File.createTempFile("tmp", null);
			tmpFile.deleteOnExit();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try (
			//����һ���������������ֻ���ķ�ʽ����
			RandomAccessFile randomAccessFile = new RandomAccessFile(fileName,"rw");
			
			//�����
			FileOutputStream out = new FileOutputStream(tmpFile);
			//������
			FileInputStream in = new FileInputStream(tmpFile);
			
		){
			//a.txt===01 23456789
			//temp.tmp== 23456789
			randomAccessFile.seek(pos);
			/*�����������ʼ��ȡ����,���뵽��ʱ�ļ�*/
			byte[] b = new byte[1024];
			int len = 0;
			while((len=randomAccessFile.read(b))!=-1){
				out.write(b, 0, len);
			}
			//�趨д������λ��
			randomAccessFile.seek(pos);
			randomAccessFile.write(content.getBytes());
			//01ccc5789
			//�õ���ʱ�ļ�������,ƴ�ӻ�ȥ
			while((len=in.read(b))!=-1){
				randomAccessFile.write(b,0,len);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		String file = "c://test/a.txt";
//		String result = readFile(file, 4);
//		System.out.println(result);
		
		
		insertContent("ccc",file,2);
		
//		writerFile("abcdefg",file);
	}
}
