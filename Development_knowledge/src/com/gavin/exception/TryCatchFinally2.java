package com.gavin.exception;

import java.io.PrintStream;

public class TryCatchFinally2 {

	public static void main(String[] args) {
		
		PrintStream writer = null;
		try {
			writer = new PrintStream("d://aa.txt");
			int a = 0;
			int b = 1/0;
		} catch (Exception e) {
//			System.out.println(e.getMessage());
			e.printStackTrace();//jvm�׸�����Ĵ�����Ϣ
			e.printStackTrace(writer);
		}
		
		//throw throws �Զ��쳣 ��������
	}
	
	
}
