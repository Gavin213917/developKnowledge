package com.gavin.jdbc2.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.gavin.jdbc2.bean.User;




/**
 * 
 * �������ݵ����Ӷ���
 * ConnectionUtil
 * @version 1.0.0
 *
 */
public class ConnectionUtil {
	
	private static final String url = "jdbc:mysql://localhost:3306/jdbctest";
	private static final  String username = "root";
	private static final  String password = "xiaoer";
	
	
	/**
	 * ��ȡ���Ӷ���
	 * @Title: getConnection 
	 * @author: Gavin
	 * @time: 2019��7��24�� ����10:56:02
	 * @return 
	 * @return: Connection 
	 * @throws
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
	 * @Title: closeConnection 
	 * @author: Gavin
	 * @time: 2019��7��24�� ����10:56:37
	 * @param connection
	 * @param statement
	 * @param rs 
	 * @return: void 
	 * @throws
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
	
	/**
	 * ��ԃ�Ñ���Ϣ
	 * @Title: findUsers 
	 * @author: Gavin
	 * @time: 2019��7��24�� ����10:56:52
	 * @return 
	 * @return: List<User> 
	 * @throws
	 */
	public static List<User> findUsers(){
		Connection connection = null;
		PreparedStatement statement= null;
		ResultSet rs = null;
		List<User> users = null;
		try {
			connection = getConnection();
//		  3: ׼��sqlָ��(select ,update ,insert delete)
			String sql = "SELECT username,id,age,address,telephone,birthday,intro FROM keke_user";
//		  4: ִ��sql��Ԥ�������
			statement = connection.prepareStatement(sql);	
//		  5: ִ��sql���ؽ����
			rs = statement.executeQuery();//����ָ�ִ��sql,���ؽ��
//		  6: ������Ľ���������map����bean��
			users = new ArrayList<>();
			User user = null;
			while(rs.next()){
				user = new User();//ֻ��ʼ��һ��
				user.setId(rs.getInt("id"));
				user.setAge(rs.getInt("age"));
				user.setUsername(rs.getString("username"));
				user.setAddress(rs.getString("address"));
				user.setTelephone(rs.getString("telephone"));
				user.setBirthday(rs.getDate("birthday"));
				user.setIntro(rs.getString("intro"));
				users.add(user);
			}
			return users;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally{
			closeConnection(connection, statement, rs);
		}
	}
	
	
	
	//��ǰ�A�� insert update delete  �����l�� ===jdbc���b
	
	
	
	
	public static void main(String[] args) throws ClassNotFoundException {
		List<User> users = findUsers();
		for (User user : users) {
			System.out.println(user.getId()+"==="+user.getIntro());
		}
	}
	
	
	
	
	
	
}
