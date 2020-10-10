package com.gavin.IO.chario.reader;

import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;

public class StringReaderDemo {

	
	public static void main(String[] args) {
		
		//�ַ���(������)
		/*
		 * Reader:--
		 * @see FileReader �� InputStreamReader�����࣬�ع�inputStream�ķ�ʽ���򻯶������
		 * @see InputStreamReader  ����ָ������
		 * @see StringReader �Ǵ����ַ�����ز���
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

		String content = "�Ұ���";
		try (
			StringReader reader = new StringReader(content);
//			StringWriter writer = new StringWriter();
			FileWriter writer = new FileWriter("d://aaa.txt");	
		){
			char[] c = new char[128];
			int len = 0;
			while((len=reader.read(c))!=-1){
				writer.write(c, 0, len);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
