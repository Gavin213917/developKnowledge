package com.gavin.IO.other;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Test {

	
	/*
	 * 
	 * 1:���ı�����д�뵽�ļ���
	 * 
	 * �������������
	 * 
	 * �ֽ������ַ������ײ�ת�����ֽ�����
	 * 
	 * InputstreamReader
	 * InputStreamWriter
	 * */
	
	
	 public static void main(String[] args) {
		try (
				
			//������--�ֽ���
			FileInputStream in  = new FileInputStream(new File("c:/test/4.jpg"));
			//ת���ַ���char
			InputStreamReader reader = new InputStreamReader(in);
			
			//�����
			FileOutputStream out = new FileOutputStream(new File("c://test/44.jpg"));
			OutputStreamWriter writer = new OutputStreamWriter(out);	
		){
			byte[] c = new byte[1024];
			int len = 0;
			while((len=in.read(c))!=-1){
				out.write(c,0,len);
			}
		} catch (Exception e) {
		}
	 }
}
