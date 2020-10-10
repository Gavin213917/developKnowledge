package com.gavin.model.abs.demo2;

import java.sql.Connection;

public class DBUtil {


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
		try {
			ConnectionFactory factory = (ConnectionFactory) Class.forName(ParseProperties.getKey("db.impl")).newInstance();
			IConnection connection = factory.createConnection();
			return connection.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
	public static void main(String[] args) {
		Connection connection = DBUtil.getInstance().getConnection();
		System.out.println(connection);
	}
	
}
