package com.gavin.other2;

import java.io.IOException;

public class RuntimeDemo {

	public static void main(String[] args) throws IOException {
		//Runtime
		Runtime runtime = Runtime.getRuntime();
//		System.out.println("������������:"+runtime.availableProcessors());
//		System.out.println("�����ڴ�����"+runtime.freeMemory());
//		System.out.println("���ڴ��С:"+runtime.totalMemory());
//		System.out.println("��������ڴ�����"+runtime.maxMemory());
		
		//ͨ��������ı��ļ�
		runtime.exec("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		
	}
	
	
}
