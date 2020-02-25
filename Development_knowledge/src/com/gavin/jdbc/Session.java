package com.gavin.jdbc;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.gavin.string.StringUtils;







public class Session {

	
	private static final String url = "jdbc:mysql://localhost:3306/jdbctest?useUnicode=true&characterEncoding=utf8";
	private static final  String username = "root";
	private static final  String password = "xiaoer";
	
	private static Session session = null;
	private Session(){
		
	}
	
	public static Session getInstance(){
		if(session==null)session=new Session();
		return session;
	}
	
	/**
	 * �@ȡ�B�ӌ���
	 * ��������getConnection
	 * �����ˣ�xuchengfei 
	 * ʱ�䣺2016��5��28��-����10:45:15 
	 * �ֻ�:1564545646464
	 * @return Connection
	 * @exception 
	 * @since  1.0.0
	 */
	public static Connection getConnection(){
		try {
			Class.forName("com.mysql.jdbc.Driver");//��̬�����ʵ����һ��Driver����
			Connection connection = DriverManager.getConnection(url, username, password);
			return connection;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
	/**
	 * 
	 * ��������closeConnection
	 * �����ˣ�xuchengfei 
	 * ʱ�䣺2016��5��28��-����10:52:05 
	 * �ֻ�:1564545646464
	 * @param connection
	 * @param statement
	 * @param rs void
	 * @exception 
	 * @since  1.0.0
	 */
	public static void closeConnection(Connection connection,PreparedStatement statement,ResultSet rs){
		try {
			if(rs!=null)rs.close();
			if(statement!=null)statement.close();
			if(connection!=null)connection.close();
		} catch (Exception e) {
			e.fillInStackTrace();
		}
	}

	
	public static void closeConnection(Connection connection,PreparedStatement statement){
		try {
			if(statement!=null)statement.close();
			if(connection!=null)connection.close();
		} catch (Exception e) {
			e.fillInStackTrace();
		}
	}
	
	
//	public <T>T queryBean(String sql,ResultSetExtractor extractor){
//		Connection connection  = null;
//		PreparedStatement statement  = null;
//		ResultSet rs = null;
//		try {
//			//��ȡ���Ӷ���
//			connection = getInstance().getConnection();
//			//ִ��Ԥ�������
//			statement = connection.prepareStatement(sql);
//			//�����
//			rs = statement.executeQuery();
//			rs.next();//���д����������?
//			return (T)extractor.extractData(rs);
//		} catch (Exception e) {
//			e.printStackTrace();
//			return null;
//		} finally {
//			getInstance().closeConnection(connection, statement, rs);
//		}
//	}
//	
	
	/**
	 * ���в����ķ�װ
	 * ��������query<br/>
	 * �����ˣ�xuchengfei <br/>
	 * ʱ�䣺2016��6��2��-����10:48:21 <br/>
	 * �ֻ�:1564545646464<br/>
	 * @param sql
	 * @param extractor
	 * @param params
	 * @return T<br/>
	 * @exception <br/>
	 * @since  1.0.0<br/>
	 */
	public <T>T queryBean(String sql,ResultSetExtractor extractor,Object...params){
		Connection connection  = null;
		PreparedStatement statement  = null;
		ResultSet rs = null;
		try {
			//��ȡ���Ӷ���
			connection = getInstance().getConnection();
			//ִ��Ԥ�������
			statement = connection.prepareStatement(sql);
			//���ò���
			if(params!=null && params.length>0){
				for (int i = 0; i < params.length; i++) {
					statement.setObject(i+1, params[i]);
				}
			}
			//�����
			rs = statement.executeQuery();
			rs.next();//���д����������?
			return (T)extractor.extractData(rs);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			getInstance().closeConnection(connection, statement, rs);
		}
	}
	
	
	/**
	 * ��ѯ��������
	 * ��������queryList<br/>
	 * �����ˣ�xuchengfei <br/>
	 * ʱ�䣺2016��6��2��-����10:51:50 <br/>
	 * �ֻ�:1564545646464<br/>
	 * @param sql
	 * @param extractor
	 * @param params
	 * @return List<T><br/>
	 * @exception <br/>
	 * @since  1.0.0<br/>
	 */
	public <T>List<T> queryList(String sql,ResultSetExtractor extractor,Object...params){
		Connection connection  = null;
		PreparedStatement statement  = null;
		ResultSet rs = null;
		List<T> lists = null;
		try {
			//��ȡ���Ӷ���
			connection = getInstance().getConnection();
			//ִ��Ԥ�������
			statement = connection.prepareStatement(sql);
			//���ò���
			if(params!=null && params.length>0){
				for (int i = 0; i < params.length; i++) {
					statement.setObject(i+1, params[i]);
				}
			}
			//�����
			rs = statement.executeQuery();
			lists = new ArrayList<>();
			while(rs.next()){
				lists.add((T)extractor.extractData(rs));
			}
			return lists;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			getInstance().closeConnection(connection, statement, rs);
		}
	}
	
	
	

	/**
	 * ��ѯ��������
	 * ��������queryList<br/>
	 * �����ˣ�xuchengfei <br/>
	 * ʱ�䣺2016��6��2��-����10:51:50 <br/>
	 * �ֻ�:1564545646464<br/>
	 * @param sql
	 * @param extractor
	 * @param params
	 * @return List<T><br/>
	 * @exception <br/>
	 * @since  1.0.0<br/>
	 */
	public <T>List<T> queryList(String sql,Class clz,Object...params){
		Connection connection  = null;
		PreparedStatement statement  = null;
		ResultSet rs = null;
		List<T> lists = null;
		try {
			//��ȡ���Ӷ���
			connection = getInstance().getConnection();
			//ִ��Ԥ�������
			statement = connection.prepareStatement(sql);
			//���ò���
			if(params!=null && params.length>0){
				for (int i = 0; i < params.length; i++) {
					statement.setObject(i+1, params[i]);
				}
			}
			//�����
			rs = statement.executeQuery();
			//��ȡһ��������ķ�����
			ResultSetMetaData metaData = rs.getMetaData();
			//�õ���ȡsql��� select ***from ��ε�����
			int count = metaData.getColumnCount();
			//��������ϴ洢��Щ����
			LinkedList<String> colunmNams = new LinkedList<>();
			for (int i = 0; i < count; i++) {
				colunmNams.add(metaData.getColumnName(i+1));//�����洢
			}
			//����������װ������
			lists = new ArrayList<>();
			while(rs.next()){
				//ʵ��������
				T obj = (T)clz.newInstance();
				for (String string : colunmNams) {
					//�����ݿ��Ӧ������ת����javabean�ж�Ӧ����������toUpperCaseFirst()����ĸת��С,��ΪsetUsername
					//columnToProperty()�����ݿ�����ת�����շ���������create_time ---createTime
					//create_time --columnToProperty--createTime--toUpperCaseFirst---CreateTime
					String cname = StringUtils.toUpperCaseFirst(ColumnToPropertyUtil.columnToProperty(string));
					//���÷��䣬�����Ը�ֵ
					ReflectUtil.setValue(cname, rs.getObject(string), obj);
				}
				//�����ݼ�����
				lists.add(obj);
			}
			//����
			return lists;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			getInstance().closeConnection(connection, statement, rs);
		}
	}
	
	public static void main(String[] args) {
		//1������mysql��������
		//����������
		Session session = Session.getInstance();
//		Session session2 = Session.getInstance();
//		System.out.println(session.getConnection());
		
//		User user = session.queryBean("SELECT username,age,address FROM keke_user WHERE id = ?", new ResultSetExtractor() {
//			@Override
//			public  User extractData(ResultSet rs) throws SQLException {
//				User user = new User();
//				user.setUsername(rs.getString("username"));
//				user.setAge(rs.getInt("age"));
//				user.setAddress(rs.getString("address"));
//				return user;
//			}
//		},2);
		
//		String sql = "SELECT username,age,address FROM keke_user where age >= ? and username like ?";
//		List<User> users = session.queryList(sql, new ResultSetExtractor() {
//			@Override
//			public  User extractData(ResultSet rs) throws SQLException {
//				User user = new User();
//				user.setUsername(rs.getString("username"));
//				user.setAge(rs.getInt("age"));
//				user.setAddress(rs.getString("address"));
//				return user;
//			}
//		},30,"%��%");
		
		
//		List<User> users2 =session.queryList(sql, rs->{
//			User u = new User();
//			u.setUsername(rs.getString("username"));
//			u.setAge(rs.getInt("age"));
//			u.setAddress(rs.getString("address"));
//			return u;
//		},30,"%��%") ;
//		
//		
//		for (User user : users2) {
//			System.out.println(user.getUsername()+"==="+user.getAddress());
//		}
		
		
		String sql = "SELECT id,username,age,address,create_time FROM keke_user where age >= ? and username like ?";
		List<User> users2 =session.queryList(sql,User.class,30,"%1%") ;
		for (User user : users2) {
			System.out.println(user.getUsername()+"==="+user.getAddress()+"==="+user.getCreateTime());
		}
		
	}
}
