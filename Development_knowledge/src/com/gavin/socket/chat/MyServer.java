package com.gavin.socket.chat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class MyServer {
	
	//����һ������socket��arryList,��֤�̰߳�ȫ��
	public static List<Socket> scoketList = Collections.synchronizedList(new ArrayList<Socket>());
	
	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = new ServerSocket(3000);
		while(true){
			//�ȴ��ͻ��˵�����
			Socket socket = serverSocket.accept();
			scoketList.add(socket);
			//���ͻ������Ӻ󣬾ͻ�����һ��serverthread���߳�
			new Thread(new ServerThread(socket)).start();
		}
	}
}
