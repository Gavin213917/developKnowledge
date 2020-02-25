package com.gavin.IO.chario.reader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	
	public static void main(String[] args) {
		
		//�ַ���(������)
		/*
		 * Reader:--
		 * @see FileReader
		 * @see InputStreamReader  ����ָ������
		 * @see StringReader
		 * 
		 * 
		 * @see BufferedReader--���Ƕ��ַ�����һ������
		 * 
		 * @see LineNumberReader
		 * @see CharArrayReader
		 * @see FilterReader
		 * @see PushbackReader
		 * @see PipedReader
		 * 
		 * �ֽ���
		 * int read()
		 * int read(byte[] b)
		 * int read(byte[] b,int off,int len)
		 * �ַ���
		 * int read()
		 * int read(char[] b)
		 * int read(char[] b,int off,int len)
		 * 
		 */

		File file = new File("d://luoo.html");
		if(!file.exists()){
			System.out.println("�ļ�������...");
			return;
		}
		
		try (
//			FileReader reader = new FileReader(file);
			KeKeFileReader reader = new KeKeFileReader(file, "utf-8");
		){
			char[] c = new char[128];
			int len = 0;
			while((len=reader.read(c))!=-1){
				System.out.println(new String(c,0,len));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
