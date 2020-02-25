package com.gavin.IO.other;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class WriterFileUtil {

	
	//���ֽڵķ�ʽд���ļ��� boolean append ������׷�ӻ��Ǹ���
	public static void wirterFileBytes(String content,String fileName,boolean append){
		//��ȡ��ǰ���ļ�
		File file  = new File(fileName);
		//��ȡ��ǰ�ļ������ڵ�Ŀ¼�����Ŀ¼�����ڣ��Ͳ����Զ�����Ŀ¼�ķ�ʽ 
		File rootPath = file.getParentFile();
		if(!rootPath.exists())rootPath.mkdirs();
		try (
			//���������
			FileOutputStream out = new FileOutputStream(fileName,append);
		){
			byte[] b = content.getBytes();
			out.write(b);
		} catch (Exception e) {
		}
	}
	
	//���ַ��ķ�ʽ���� д��
	public static void wirterFileChars(String content,String fileName,boolean append){
		//��ȡ��ǰ���ļ�
		File file  = new File(fileName);
		//��ȡ��ǰ�ļ������ڵ�Ŀ¼�����Ŀ¼�����ڣ��Ͳ����Զ�����Ŀ¼�ķ�ʽ 
		File rootPath = file.getParentFile();
		if(!rootPath.exists())rootPath.mkdirs();
		try (
			//���������
//			FileOutputStream out = new FileOutputStream(fileName,append);
//			OutputStreamWriter writer = new OutputStreamWriter(out);
			FileWriter writer = new FileWriter(fileName,append);//�ȼ�����������У���װ��	
		){
			writer.write(content);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//����д��
	public static void wirterFileLine(String content,String fileName,boolean append){
		//��ȡ��ǰ���ļ�
		File file  = new File(fileName);
		//��ȡ��ǰ�ļ������ڵ�Ŀ¼�����Ŀ¼�����ڣ��Ͳ����Զ�����Ŀ¼�ķ�ʽ 
		File rootPath = file.getParentFile();
		if(!rootPath.exists())rootPath.mkdirs();
		try (
			//���������
			FileOutputStream out = new FileOutputStream(fileName,append);
			OutputStreamWriter outwriter = new OutputStreamWriter(out);
			BufferedWriter writer = new BufferedWriter(outwriter);
		){
			writer.write(content);
			writer.newLine();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void wirterFileLines(String content,String fileName,boolean append){
		//��ȡ��ǰ���ļ�
		File file  = new File(fileName);
		//��ȡ��ǰ�ļ������ڵ�Ŀ¼�����Ŀ¼�����ڣ��Ͳ����Զ�����Ŀ¼�ķ�ʽ 
		File rootPath = file.getParentFile();
		if(!rootPath.exists())rootPath.mkdirs();
		try (
			//���������
//			FileOutputStream out = new FileOutputStream(fileName,append);
//			OutputStreamWriter outwriter = new OutputStreamWriter(out);
//			BufferedWriter writer = new BufferedWriter(outwriter);
			//���������  
			PrintWriter writer = new PrintWriter(new FileOutputStream(file, append));//�൱����������У���װ��
		){
			writer.println(content);
			writer.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		String file = "c://test/a.txt";
//		wirterFileBytes("I",file,true);
//		wirterFileChars("\tLove ",file,true);
//		wirterFileLine("\tYou��\r\n����keke��ʦ��\r\n����30��\r\n����һ����ʦ!",file,true);
		
		wirterFileLines("������ɽ����\r\n�ƺ��뺣����\r\n����ǧ��Ŀ��\r\n����һ��¥��",file,false);
	}
}
