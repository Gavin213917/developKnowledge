package com.gavin.socket.chat.socket01;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;import com.sun.swing.internal.plaf.metal.resources.metal_zh_TW;

/**
 * 
 *  ��������
 * ScoketServer<br/>
 * ������:xuchengfei<br/>
 * ʱ�䣺2016��5��24��-����10:56:10 <br/>
 * @version 1.0.0<br/>
 *
 */
public class SocketServerDemo {

	private int port;
	
	public SocketServerDemo(int port){
		this.port = port;
	}
	
	
	/*
	 * nodejs
	 * 
	 * http.js
	 * 
	 * var http = require("http");
	 * http.createServer(()=>(req,res){
	 * 	res.write("i love you")l		
	 * }).listen(6666);
	 * 
	 * node http
	 * 
	 *  http://localhost:6666
	 * 
	 * 
	 * */
	
	//�Զ������������
	public void start(){
		try {
			ServerSocket serverSocket = new ServerSocket(port);
			System.out.println("�������Ѿ������������Ķ˿ں���:"+this.port);
			System.out.println("����ȴ��ͻ��˵�����.......");
			
			
			Socket socket = serverSocket.accept();//����--�пͻ�������
			
			
			//����socket���������true�����Զ�ˢ�£�Ҳ��˵�����ڵ���witer.flush()����
			PrintWriter out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), "UTF-8"),true);
			out.println("���������ӳɹ�......");
			out.println("����exit�Ͽ��������������...");
			boolean done = false;
			
			
			//��ȡ�ͻ��˵���������
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream(),"utf-8"));
			while(!done){
				String line = reader.readLine();
				if(line==null){
					done = true;
				}else{
					System.out.println("�ͻ��˴��ݹ�����������:"+line);
					
					//�˳�
					if(line.equals("i love you")){
						out.println("�����Է��������͵���Ϣ��: really!!!,yes baby��");
					}else{
						out.println("�����Է��������͵���Ϣ��: get out!!!��");
					}
					
					if(line.trim().equalsIgnoreCase("exit")){
						done = true;//��ֹѭ��
					}
				}
			}
			
			socket.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		try {
			//����
			SocketServerDemo server = new SocketServerDemo(6666);
			server.start();
		} catch (Exception e) {
			System.out.println("�����������˿�:��6666�������쳣");
		}
	}
}
