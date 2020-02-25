package com.gavin.IO.chario.reader;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo {

	
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
			//�ֽ���--�ı��ļ�
			FileInputStream	in = new FileInputStream(file);
			//����������--ת���� -�ֽ���---ת����--�ַ���
			InputStreamReader isr = new InputStreamReader(in,"UTF-8");
			//������--���ݻ�������ã���Ч����--����һ�ж�ȡ
			BufferedReader reader = new BufferedReader(isr);
		){
			
			String line = null;//
			
			while((line=reader.readLine())!=null){//����ļ���ȡ����Ժ�ͷ���null,���ػ�����û�ж�ȡ���
				if(!line.trim().equals("")){
					System.out.println(line);
				}
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	//���л���������  ��������ļ��Ͷ�ȡλ��  �ļ��ָ�ͺϲ�       
}
