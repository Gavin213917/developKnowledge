package com.gavin.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.gavin.IO.User;



public class ThrowsDemo {

	public static void main(String[] args) {
		/*
		 * �쳣����try/catch���У�
		 * һ�֣��쳣�׳���throws / throw
		 * 
		 * throws:�����ڷ����ṹ���쳣�׳��������߲�Ҫ�����쳣�Ĵ������������ǵ�����ȥ���в���
		 * 1��һ��Ӧ�ýӿڵ��ú��Զ����쳣�С�
		 * 2�����Դ�����
		 * 
		 * �������η�  ����ֵ  ������ throws e1,e2,e3....{
		 *	  //������
		 * }
		 * 
		 * throw������쳣����ģ��Ƕ����ڷ������е��쳣�׳����������throw�׳��Ļ���һ��Ҫ��throws�����׳�.
		 * 1��һ���������Ҫthrows�׳�����ô���׳����쳣��RuntimeException�Ͳ���Ҫ.�����
		 * 2��Checked exception��ô�ñ���һ��Ҫ��throws���м����׳��������ǵ����߽��д���.
		 * 
		 * �ܽ᣺
		 * 
		 * 
		 * */
		
		//�����ߣ����÷���
//		readFile();// A��1�ɹ� 0ʧ�� B:success ����ɹ�  failʧ�� C:true :false D
		
//		try {
//			readFile2();
//			System.out.println("success");
//		} catch (IOException e) {
//			System.out.println("fail");
//			e.printStackTrace();
//		}
		
//		saveStudent();
	
		try {
			writerFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	/**
	 * ����һ���ļ���ȡ�ķ���
	 * ��������readFile<br/>
	 * �����ˣ�xuchengfei <br/>
	 * ʱ�䣺2016��5��19��-����9:23:18 <br/>
	 * �ֻ�:1564545646464<br/> void<br/>
	 * @exception <br/>
	 * @since  1.0.0<br/>
	 */
	public static int readFile(){
		FileInputStream inputStream;
		try {
			inputStream = new FileInputStream("");
			inputStream.read(null);
			return 1;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return 0;
		} catch (IOException e) {
			e.printStackTrace();
			return 0;
		}
	}
	
	public static void writerFile() throws IOException{
			//д���߼�
		String reesult = readFile2();
	}
	
	public static String readFile2() throws IOException{
		FileInputStream inputStream = new FileInputStream("");
		inputStream.read(null);
		return "keke";
	}
	
	public static void saveStudent(){
		User user = new User();
		System.out.println(user.getUsername());
	}
}
