package com.gavin.socket.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class ServerThread implements Runnable {

	
	//���嵱ǰ�߳��������Socket
	Socket s=null;
	//��ȡ������
	BufferedReader br = null;
	
	public ServerThread(Socket socket) throws IOException {
		this.s = socket;
		//��ʼ��������
		br = new BufferedReader(new InputStreamReader(s.getInputStream()));
	}
		
	@Override
	public void run() {
		String content = null;
		try {
			while((content=readFormSocket())!=null){
				//����socketlist�е�ÿһ��socket���͵�������Ϣ
				for (Socket socket : MyServer.scoketList) {
					PrintStream pStream = new PrintStream(socket.getOutputStream());
					pStream.println("�ͻ����������������ǣ�"+content);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private String readFormSocket(){
		try {
			return br.readLine();
		} catch (Exception e) {
			MyServer.scoketList.remove(s);
			return null;
		}
	}

}
