package com.gavin.socket.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class MyClient {

	public static void main(String[] args) throws UnknownHostException, IOException {
		//�����ͻ�������
		Socket socket = new Socket("127.0.0.1", 3000);
		
		//�����ͻ��˵�ClinetThread�̲߳��ϵĻ�ȡ��������͹���������
		new Thread(new ClientThread(socket)).start();
		
		//��ȡsocket�������
		PrintStream printStream = new PrintStream(socket.getOutputStream());
		String line = null;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		while((line=reader.readLine())!=null){
			printStream.println(line);
		}
	}
}
