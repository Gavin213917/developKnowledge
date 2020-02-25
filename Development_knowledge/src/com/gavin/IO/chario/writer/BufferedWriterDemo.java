package com.gavin.IO.chario.writer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.CharArrayWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.FilterWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PipedWriter;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.io.StringWriter;
import java.io.Writer;

public class BufferedWriterDemo {

	
	public static void main(String[] args) {
		
		//�ַ���(������)
		/*
		 * Writer:--
		 * @see   BufferedWriter
		 * @see   OutputStreamWriter
		 * @see   FileWriter
		 * @see   StringWriter
		 * @see   PrintWriter--jsp���������� reponse.getWriter()
		 * 
		 * 
		 * 
		 * @see   CharArrayWriter
		 * @see   FilterWriter
		 * @see   PipedWriter
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
		
		//�����--���Ϊ
		File file2 = new File("e://luoo2.html");
		
		try (
			//������
			//�ֽ���--�ı��ļ�
			FileInputStream	in = new FileInputStream(file);
			//����������--ת���� -�ֽ���---ת����--�ַ���
			InputStreamReader isr = new InputStreamReader(in,"UTF-8");
			//������--�������ݻ�������ã���Ч����--����һ�ж�ȡ
			BufferedReader reader = new BufferedReader(isr);
				
			
			//����� ��׷��
//			FileOutputStream out = new FileOutputStream(file2);
//			OutputStreamWriter outwriter = new OutputStreamWriter(out, "UTF-8");
				
//			KeKeFileWriter fileWriter = new KeKeFileWriter(file2, "UTF-8");				
				
				
//			׷�ӵ�����	
//			FileOutputStream out = new FileOutputStream(file2,true);//׷������
//			OutputStreamWriter outwriter = new OutputStreamWriter(out, "UTF-8");
				
//			KeKeFileWriter fileWriter = new KeKeFileWriter(file2, "UTF-8",true);//׷������
//			
			//������	
//			BufferedWriter writer = new BufferedWriter(fileWriter);
				
			PrintWriter writer = new PrintWriter(file2);
		){
			String line = null;
			while((line=reader.readLine())!=null){//����ļ���ȡ����Ժ�ͷ���null,���ػ�����û�ж�ȡ���
				if(!line.trim().equals("")){
					writer.write(line+"\n");
				}
			}
			//ǿˢ�ֽڵ�������
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}