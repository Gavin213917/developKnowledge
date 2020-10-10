package com.gavin.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class ReaderFileUtil {

	
	//���ֽڵķ�ʽ��ȡ�ļ���
	public static String readFileBytes(String fileName){
		//��ȡ��ǰ���ļ�
		File file  = new File(fileName);
		//��ȡ��ǰ�ļ������ڵ�Ŀ¼�����Ŀ¼�����ڣ��Ͳ����Զ�����Ŀ¼�ķ�ʽ 
		File rootPath = file.getParentFile();
		if(!rootPath.exists())rootPath.mkdirs();
		try (
			//���������
			FileInputStream in = new FileInputStream(fileName);
		){
			byte[] b = new byte[1024];
			int len = 0;
			StringBuilder builder  = new StringBuilder();
			while((len=in.read(b))!=-1){
				builder.append(new String(b, 0, len));
			}
			return builder.toString();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	//���ַ��ķ�ʽ���� ��ȡ
	public static String readFileChars(String fileName){
		//��ȡ��ǰ���ļ�
		File file  = new File(fileName);
		//��ȡ��ǰ�ļ������ڵ�Ŀ¼�����Ŀ¼�����ڣ��Ͳ����Զ�����Ŀ¼�ķ�ʽ 
		File rootPath = file.getParentFile();
		if(!rootPath.exists())rootPath.mkdirs();
		try (
			FileReader reader = new FileReader(fileName);	
		){
			char[] b = new char[64];
			int len = 0;
			StringBuilder builder  = new StringBuilder();
			while((len=reader.read(b))!=-1){
				builder.append(new String(b, 0, len));
			}
			return builder.toString();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	//���ж�ȡ
	public static String readFileLine(String fileName){
		//��ȡ��ǰ���ļ�
		File file  = new File(fileName);
		//��ȡ��ǰ�ļ������ڵ�Ŀ¼�����Ŀ¼�����ڣ��Ͳ����Զ�����Ŀ¼�ķ�ʽ 
		File rootPath = file.getParentFile();
		if(!rootPath.exists())rootPath.mkdirs();
		try (
			//���������
			FileReader fileReader = new FileReader(fileName);	
			BufferedReader reader = new BufferedReader(fileReader);
		){
			String line = null;
			StringBuilder builder  = new StringBuilder();
			while((line = reader.readLine())!=null){
				builder.append(line+"\r\n");
			}
			return builder.toString();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
	
	
	public static void main(String[] args) {
		String file = "c://test/a.txt";
//		String result1 = readFileBytes(file);
//		System.out.println("*********************************");
//		System.out.println(result1);
//		String result2 = readFileChars(file);
//		System.out.println("*********************************");
//		System.out.println(result2);
		String result3 = readFileLine(file);
		System.out.println("*********************************");
		System.out.println(result3);
	}
}
