package com.gavin.IO;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ProcessDemo {

	/**
	 * RandomAccessFile:�������
	 * ����RandomAccessFile�������ɵķ����ļ�������λ�ã��������ֻ��Ҫ�����ļ��Ĳ������ݣ�
	 * �����ǰ��ļ���ͷ����β��ʹ��RandomAccessFile���Ǹ��õ�ѡ��
	 * 
	 * 
	 */
	public static void main(String[] args) {
		try {
			Process process = Runtime.getRuntime().exec("java");
			BufferedReader br = new BufferedReader(new InputStreamReader(process.getErrorStream(),"gbk"));
			String string = null;
			while ((string=br.readLine())!=null) {
				System.out.println(string);
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
