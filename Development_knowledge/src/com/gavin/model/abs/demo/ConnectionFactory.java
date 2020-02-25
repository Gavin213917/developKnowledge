package com.gavin.model.abs.demo;

public class ConnectionFactory {

	
	/**
	 * ��ȡ���̵����Ӷ���ķ���
	 * ��������createConnection<br/>
	 * �����ˣ�xuchengfei <br/>
	 * ʱ�䣺2016��4��24��-����12:57:34 <br/>
	 * �ֻ�:1564545646464<br/>
	 * @param mark
	 * @return IConnection<br/>
	 * @exception <br/>
	 * @since  1.0.0<br/>
	 */
	public static IConnection createConnection(int mark){
		IConnection connection = null;
		if(mark==1){
			connection= new MysqlConnection();
		}else if(mark==2){
			connection=new OracleConnection();
		}
		return connection;
	}
	
}
