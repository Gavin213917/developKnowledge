package com.gavin.model.abs.demo;

import java.sql.Connection;

public class DBUtil {

	private static int key = 1;

	//懒汉的单列模式
	private static DBUtil dbUtil = null;
	//私有的构造函数
	private DBUtil(){
	}
	//被外部调用的公开单列对象的方法
	public static DBUtil getInstance(){
		if(dbUtil==null){
			dbUtil = new DBUtil();
		}
		return dbUtil;
	}
	
	
	//被外部调用的公开单列对象的方法
	public static DBUtil getInstance(int key){
		if(dbUtil==null){
			DBUtil.key = key;
			dbUtil = new DBUtil();
		}
		return dbUtil;
	}
	
	/**
	 * 
	 * 方法名：getConnection<br/>
	 * 创建人：xuchengfei <br/>
	 * 时间：2016年4月24日-上午12:58:55 <br/>
	 * 手机:1564545646464<br/>
	 * @return Connection<br/>
	 * @exception <br/>
	 * @since  1.0.0<br/>
	 */
	public Connection getConnection(){
		IConnection connection = ConnectionFactory.createConnection(DBUtil.key);
		return connection.getConnection();
	}
	
	
	public static void main(String[] args) {
		Connection connection = DBUtil.getInstance().getConnection();
		System.out.println(connection);
	}
	
}
