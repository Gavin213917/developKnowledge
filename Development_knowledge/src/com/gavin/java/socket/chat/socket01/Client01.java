package com.gavin.socket.chat.socket01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;


/**
 * 
 * �ͻ���
 * Client01
 * ������:xuchengfei 
 * ʱ�䣺2016��5��24��-����11:11:39 
 * @version 1.0.0
 *
 */
public class Client01 {
	private  String host;
	private  int port;
	
	public Client01(String host,int port){
		this.host = host;
		this.port = port;
	}
	
	/**
	 * ���ӷ������Ĵ���
	 * ��������connectionServer
	 * �����ˣ�xuchengfei 
	 * ʱ�䣺2016��5��24��-����11:13:25 
	 * �ֻ�:1564545646464 void
	 * @exception 
	 * @since  1.0.0
	 */
	public void connectionServer(){
		try {
			Socket socket = null;
			if(host.equals("localhost") || host.equals("127.0.0.1")){
				socket = new Socket(InetAddress.getLocalHost(), port);
			}else{
				socket = new Socket(InetAddress.getByName(host), port);
			}
			
			//����socket������������ȡ�����������͹��������� reader
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream(),"utf-8"));
			System.out.println("����������Ϣ��:"+reader.readLine());
			System.out.println("����������Ϣ��:"+reader.readLine());
			
			//��ʼ����socket��д�루�������
			System.out.print("������>>>");
			PrintWriter out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(),"utf-8"),true);
			
			//��������̨��������
			BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
			
			
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream(),"utf-8")); 
			
			boolean done = false;
			while(!done){
				String line = bfr.readLine();//���Կ���̨
				out.println(line);//��socketд������
				if(line.equalsIgnoreCase("exit")){
					done = true;
				}else{
					String info = in.readLine();
					System.out.println("����������Ϣ:"+info);
					if(!done){
						System.out.println("������>>>");
					}
				}
			}
			
//			socket.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		try {
			new Client01("127.0.0.1", 6666).connectionServer();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
