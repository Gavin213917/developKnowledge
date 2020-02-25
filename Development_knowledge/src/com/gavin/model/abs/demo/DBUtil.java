package com.gavin.model.abs.demo;

import java.sql.Connection;

public class DBUtil {

	private static int key = 1;

	//�����ĵ���ģʽ
	private static DBUtil dbUtil = null;
	//˽�еĹ��캯��
	private DBUtil(){
	}
	//���ⲿ���õĹ������ж���ķ���
	public static DBUtil getInstance(){
		if(dbUtil==null){
			dbUtil = new DBUtil();
		}
		return dbUtil;
	}
	
	
	//���ⲿ���õĹ������ж���ķ���
	public static DBUtil getInstance(int key){
		if(dbUtil==null){
			DBUtil.key = key;
			dbUtil = new DBUtil();
		}
		return dbUtil;
	}
	
	/**
	 * 
	 * ��������getConnection<br/>
	 * �����ˣ�xuchengfei <br/>
	 * ʱ�䣺2016��4��24��-����12:58:55 <br/>
	 * �ֻ�:1564545646464<br/>
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
