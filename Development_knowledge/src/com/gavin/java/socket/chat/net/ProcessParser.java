package com.gavin.socket.chat.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProcessParser {

	
	public static void main(String[] args) {
		try {
//			Process process = Runtime.getRuntime().exec("ipconfig -all");
			//����һ����ҵ���ٶ�������javaʵ��mysql�ı��ݺͻ�ԭ,��һ���飺��װmysql���ݿ�
			Process process = Runtime.getRuntime().exec("netstat -ano");
			try(
				InputStreamReader isr = new InputStreamReader(process.getInputStream());
				BufferedReader reader = new BufferedReader(isr); 
			){
				String content = null;
				while((content=reader.readLine())!=null){
					System.out.println(content);//������ʽ
				}
				
			}catch (Exception e) {
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
	}
}
