package com.gavin.model.abs.demo2;

import java.sql.Connection;

public class DBUtil {


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
