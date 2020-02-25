package com.gavin.exception;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;

public class TryCatchFinally {

	public static void main(String[] args) {
		
		
		/*
		 * try finally
		 * try catch/catch... finally
		 * 
		 * finally:���ùرպʹ���io��,���Ӷ���ģ��������������ζ���ִ��
		 * */
		
		int num = test();
		System.out.println(num);
		
	}
	
	
//	public static void copyFile(){
//		FileInputStream inputStream = null;
//		FileOutputStream outputStream = null;
//		try{
//			inputStream= new FileInputStream("d");
//			inputStream.read(null);
//			
//			outputStream = new FileOutputStream("d");
//		}catch(IOException io){
//			io.printStackTrace();
//		} finally {
//			try {
//				if(outputStream!=null)outputStream.close();//nullpointerException
//				if(inputStream!=null)inputStream.close();
//			} catch (Exception e) {
//			}
//		}
//	}
	
	public static void copyFile(){
		try(
				
			FileInputStream inputStream = new FileInputStream("d");
			FileOutputStream outputStream =  new FileOutputStream("d");
		){
			inputStream.read(null);
		}catch(IOException io){
			io.printStackTrace();
		} 
	}
	
	
	
	
	
	public static int test(){
		int a =0;
		try {
			a++;//1
			int b = 1/1;//exception
			a++;
			return a;
		} catch (ArithmeticException e) {
			a++;
			e.printStackTrace();
			return a;//return�Ƿ����Ľ���
		} finally {// ����ǰ����û��return ������ִ�У�Ҳ���������ﶨ�巵��return
			a++;//3
			System.out.println("------");
			return a;
		}
	}
}
