package com.gavin.model.singleton;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionUtil {

	//��������ģʽ
	public static ConnectionUtil connectionUtil = new ConnectionUtil();
	//����˽�л�
	private ConnectionUtil(){
		
	}
	
	//����������
	public static ConnectionUtil getInstance(){
		return connectionUtil;
	}
	
	/**
	 * 
	 * @Title: getConnection 
	 * @author: Gavin
	 * @time: 2019��6��20�� ����2:58:48
	 * @return 
	 * @return: Connection 
	 * @throws
	 */
	public Connection getConnection(){
		try {
			//��ȡ��������
			ParseProperties parseProperties = ParseProperties.getInstance("db");
			//�����ļ�
			parseProperties.parserProperties();
			Class.forName(parseProperties.getDriver());//���͵Ĺ���ģʽ
			Connection connection = DriverManager.getConnection(parseProperties.getUrl(),parseProperties.getUsername(),parseProperties.getPassword());
			return connection;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
	public static void main(String[] args) {
		Connection connection =  ConnectionUtil.getInstance().getConnection();
		Connection connection2 =  ConnectionUtil.getInstance().getConnection();
		System.out.println(connection);
		System.out.println(connection2);
		
//		Connection connection3 = new DBUtil().getConnection();
		
		
		
	}
}
