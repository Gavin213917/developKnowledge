package com.gavin.model.singleton;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionUtil {

	//饿汉单利模式
	public static ConnectionUtil connectionUtil = new ConnectionUtil();
	//属性私有化
	private ConnectionUtil(){
		
	}
	
	//方法公开化
	public static ConnectionUtil getInstance(){
		return connectionUtil;
	}
	
	/**
	 * 
	 * @Title: getConnection 
	 * @author: Gavin
	 * @time: 2019年6月20日 下午2:58:48
	 * @return 
	 * @return: Connection 
	 * @throws
	 */
	public Connection getConnection(){
		try {
			//获取解析对象
			ParseProperties parseProperties = ParseProperties.getInstance("db");
			//解析文件
			parseProperties.parserProperties();
			Class.forName(parseProperties.getDriver());//典型的工厂模式
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
