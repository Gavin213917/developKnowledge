package com.gavin.socket.chat.socket01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 
 * �����
 * Server<br/>
 * ������:xuchengfei<br/>
 * ʱ�䣺2016��5��24��-����10:16:34 <br/>
 * @version 1.0.0<br/>
 *
 */
public class Server {
	
	//������ServerSocket ����˿ڣ���ip
	//�ͻ��� Socket ��ѭ �˿ں�ip
	
	private static int port = 3698;
	public static void main(String[] args) {
		try {
			//����������˵�socket����
			ServerSocket serverSocket = new ServerSocket(port);
			//��ͣ�ļ�����ͬ�Ŀͻ��˷��͹���������
			while(true){
				//ÿ�����յ��ͻ���socket�����ʱ�������Ҳ�����һ��socket
				Socket socket = serverSocket.accept();
				System.out.println("�������Ѿ������˿���:"+port);
				
				
				
				BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				System.out.println("���Կͻ��˵�����===>"+reader.readLine());
				
				
				
				reader.close();
				socket.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
}
