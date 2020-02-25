package com.gavin.jdbc2.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.gavin.jdbc2.bean.TzParams;
import com.gavin.jdbc2.bean.User;




/**
 * 
 * �������ݵ����Ӷ���
 * ConnectionUtil
 * ������:xuchengfei 
 * ʱ�䣺2016��5��28��-����10:08:42 
 * @version 1.0.0
 *
 */
public class ConnectionUtil2 {
	
	private static final String url = "jdbc:mysql://localhost:3306/jdbctest?useUnicode=true&characterEncoding=utf8";
	private static final  String username = "root";
	private static final  String password = "xiaoer";
	
	
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

	/**
	 * ��ԃ�Ñ���Ϣ
	 * ��������findUsers
	 * �����ˣ�xuchengfei 
	 * ʱ�䣺2016��5��28��-����10:51:44 
	 * �ֻ�:1564545646464
	 * @return List<User>
	 * @exception 
	 * @since  1.0.0
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
	
	public static User getUser2(Integer id){
		Connection connection = null;
		PreparedStatement statement= null;
		ResultSet rs = null;
		try {
			connection = getConnection();
//		  3: ׼��sqlָ��(select ,update ,insert delete)
			String sql = "SELECT username,id,age,address,telephone,birthday,intro FROM keke_user where id = ?";
//		  4: ִ��sql��Ԥ�������
			statement = connection.prepareStatement(sql);	
			//�����ʺõĶ�Ӧ�Ĳ���ֵ��
			statement.setInt(1, id);
//		  5: ִ��sql���ؽ����
			rs = statement.executeQuery();//����ָ�ִ��sql,���ؽ�� 
			User user = null;
			if(rs.next()){
				user = new User();//ֻ��ʼ��һ��
				user.setId(rs.getInt("id"));
				user.setAge(rs.getInt("age"));
				user.setUsername(rs.getString("username"));
				user.setAddress(rs.getString("address"));
				user.setTelephone(rs.getString("telephone"));
				user.setBirthday(rs.getDate("birthday"));
				user.setIntro(rs.getString("intro"));
			}
			return user;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally{
			closeConnection(connection, statement, rs);
		}
	}
	
	
	/**
	 * ��ȡ�û�����
	 * ��������findUsers2
	 * �����ˣ�xuchengfei 
	 * ʱ�䣺2016��6��1��-����9:32:54 
	 * �ֻ�:1564545646464
	 * @return List<HashMap<String,Object>>
	 * @exception 
	 * @since  1.0.0
	 */
	public static List<HashMap<String, Object>> findUsers2(){
		Connection connection = null;
		PreparedStatement statement= null;
		ResultSet rs = null;
		List<HashMap<String, Object>> users = null;
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
			HashMap<String, Object> map= null;
			while(rs.next()){
				map = new HashMap<>();
				map.put("id",rs.getInt("id"));
				map.put("age",rs.getInt("age"));
				map.put("username",rs.getString("username"));
				map.put("address",rs.getString("address"));
				map.put("telephone",rs.getString("telephone"));
				map.put("birthday",rs.getString("birthday"));
				map.put("intro",rs.getString("intro"));
				users.add(map);
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
	//�������ݲ�ѯ--����������ѯ
	public static HashMap<String, Object> getUser(Integer userId){
		Connection connection = null;
		PreparedStatement statement= null;
		ResultSet rs = null;
		try {
			connection = getConnection();
//		  3: ׼��sqlָ��(select ,update ,insert delete)
			String sql = "SELECT username,id,age,address,telephone,birthday,intro FROM keke_user where id = ?";
//		  4: ִ��sql��Ԥ�������
			statement = connection.prepareStatement(sql);
			//���ò���
			statement.setInt(1, userId);
//		  5: ִ��sql���ؽ����
			rs = statement.executeQuery();//����ָ�ִ��sql,���ؽ�� 
			HashMap<String, Object> map= null;
			if(rs.next()){
				map = new HashMap<>();
				map.put("id",rs.getInt("id"));
				map.put("age",rs.getInt("age"));
				map.put("username",rs.getString("username"));
				map.put("address",rs.getString("address"));
				map.put("telephone",rs.getString("telephone"));
				map.put("birthday",rs.getString("birthday"));
				map.put("intro",rs.getString("intro"));
			}
			return map;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally{
			closeConnection(connection, statement, rs);
		}
	}
	
	
	
	/*��������ѯ*/

	/**
	 * ��ԃ�Ñ���Ϣ
	 * ��������findUsers
	 * �����ˣ�xuchengfei 
	 * ʱ�䣺2016��5��28��-����10:51:44 
	 * �ֻ�:1564545646464
	 * @return List<User>
	 * @exception 
	 * @since  1.0.0
	 */
	public static List<User> searchUsers(TzParams params){
		Connection connection = null;
		PreparedStatement statement= null;
		ResultSet rs = null;
		List<User> users = null;
		try {
			connection = getConnection();
//		  3: ׼��sqlָ��(select ,update ,insert delete)
			String sql = "SELECT username,id,age,address,telephone,birthday,intro FROM keke_user WHERE age > ? AND username LIKE ? ORDER BY birthday desc LIMIT ?,?";
//		  4: ִ��sql��Ԥ�������
			statement = connection.prepareStatement(sql);	
			statement.setInt(1, params.getAge());
			statement.setString(2, "%"+params.getUsername()+"%");
			statement.setInt(3, params.getPageNo());
			statement.setInt(4, params.getPageSize());
			
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
	
	
	/**
	 * ������
	 * ��������findUsers
	 * �����ˣ�xuchengfei 
	 * ʱ�䣺2016��5��28��-����10:51:44 
	 * �ֻ�:1564545646464
	 * @return List<User>
	 * @exception 
	 * @since  1.0.0
	 */
	public static int countUsers(TzParams params){
		Connection connection = null;
		PreparedStatement statement= null;
		ResultSet rs = null;
		try {
			connection = getConnection();
//		  3: ׼��sqlָ��(select ,update ,insert delete)
			String sql = "SELECT count(1) FROM keke_user WHERE age > ? AND username LIKE ?";
//		  4: ִ��sql��Ԥ�������
			statement = connection.prepareStatement(sql);	
			statement.setInt(1, params.getAge());
			statement.setString(2, "%"+params.getUsername()+"%");
//		  5: ִ��sql���ؽ����
			rs = statement.executeQuery();//����ָ�ִ��sql,���ؽ��
			int count = 0;
			if(rs.next()){
				count = rs.getInt(1);
			}
			return count;//0 
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		} finally{
			closeConnection(connection, statement, rs);
		}
	}
	
	
	
	//�� insert��ɾdelete����update
	/**
	 * �����û�
	 * ��������saveUser
	 * �����ˣ�xuchengfei 
	 * ʱ�䣺2016��6��1��-����10:49:54 
	 * �ֻ�:1564545646464
	 * @param user
	 * @return boolean
	 * @exception 
	 * @since  1.0.0
	 */
	public static boolean saveUser(User user){
		Connection connection = null;
		PreparedStatement statement= null;
		try {
			connection = getConnection();
//		  3: ׼��sqlָ��(select ,update ,insert delete)
			String sql = "INSERT INTO keke_user (username,age,address,telephone,birthday,intro)VALUES(?,?,?,?,?,?)";
			statement = connection.prepareStatement(sql);
			statement.setString(1, user.getUsername());
			statement.setInt(2, user.getAge());
			statement.setString(3, user.getAddress());
			statement.setString(4, user.getTelephone());
			statement.setDate(5, user.getBirthday()==null?null:new Date(user.getBirthday().getTime()));
			statement.setString(6, user.getIntro());
			//ִ�з���
			int count  = statement.executeUpdate();
			return count >0 ?true:false;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally{
			closeConnection(connection, statement);
		}
	}
	
	
	/**
	 * �����û�
	 * ��������saveUser
	 * �����ˣ�xuchengfei 
	 * ʱ�䣺2016��6��1��-����10:49:54 
	 * �ֻ�:1564545646464
	 * @param user
	 * @return boolean
	 * @exception 
	 * @since  1.0.0
	 */
	public static boolean deleteUser(Integer userId,String username){
		Connection connection = null;
		PreparedStatement statement= null;
		try {
			connection = getConnection();
//		  3: ׼��sqlָ��(select ,update ,insert delete)
			String sql = "delete from keke_user where id=? ";
//			if(userId!=null){
//				sql+=" and id = "+userId;
//			}
//			if(username!=null){
//				sql+=" and username = "+username;
//			}
			statement = connection.prepareStatement(sql);
			statement.setInt(1, userId);
			//ִ�з���
			int count  = statement.executeUpdate();
			return count >0 ?true:false;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally{
			closeConnection(connection, statement);
		}
	}
	
	
	/**
	 * �����û�
	 * ��������saveUser
	 * �����ˣ�xuchengfei 
	 * ʱ�䣺2016��6��1��-����10:49:54 
	 * �ֻ�:1564545646464
	 * @param user
	 * @return boolean
	 * @exception 
	 * @since  1.0.0
	 */
	public static boolean updateUser(User user){
		Connection connection = null;
		PreparedStatement statement= null;
		try {
			connection = getConnection();
//		  3: ׼��sqlָ��(select ,update ,insert delete)
			String sql = "update keke_user SET username=?,age=?,address=?,telephone=?,intro=?,birthday=? where id = ?";
			statement = connection.prepareStatement(sql);
			statement.setString(1, user.getUsername());
			statement.setInt(2, user.getAge());
			statement.setString(3, user.getAddress());
			statement.setString(4, user.getTelephone());
			statement.setString(5, user.getIntro());
			statement.setDate(6, user.getBirthday()==null?null:new Date(user.getBirthday().getTime()));
			statement.setInt(7, user.getId());
			//ִ�з���
			int count  = statement.executeUpdate();
			return count >0 ?true:false;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally{
			closeConnection(connection, statement);
		}
	}
	
	
	
	public static void main(String[] args) throws ClassNotFoundException {
//		List<User> users = findUsers();
//		for (User user : users) {
//			System.out.println(user.getId()+"==="+user.getIntro());
//		}
//		List<HashMap<String, Object>> users = findUsers2();
//		System.out.println(users);
		
//		HashMap<String, Object> map = getUser(2);
//		User user = getUser2(1);
//		System.out.println(user.getUsername());
		
		
		//��������
//		TzParams params = new TzParams();
//		params.setAge(30);
//		params.setUsername("��1");
////		params.setPageNo(0);
////		params.setPageSize(2);
//		List<User> users = searchUsers(params);
//		int count = countUsers(params);
//		for (User user : users) {
//			System.out.println(user.getAge()+"==="+user.getUsername());
//		}
//		System.out.println(count);//34
		
		
		
		
		//�����û�
//		User user = new User();
//		user.setUsername("haven");
//		user.setAge(16);
//		user.setAddress("�Ϻ�");
//		user.setTelephone("1467898789");
//		user.setBirthday(new java.util.Date());
//		user.setIntro("����һ������������!!!!");
//		
//		boolean flag = saveUser(user);
//		if(flag){
//			System.out.println("����ɹ�");
//		}else{
//			System.out.println("����ʧ��");
//		}
		
		
		//�h���Ñ�
//		boolean flag = deleteUser(9);
//		System.out.println(flag);
		
		
	}
	
	
	
	
	
	
}
