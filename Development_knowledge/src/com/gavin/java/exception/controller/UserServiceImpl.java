package com.gavin.exception.controller;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class UserServiceImpl implements IUserService {

	
	
	@Override
	public boolean saveUser() throws TzServiceException{
		int a = 1/0;//����ʱ�쳣
		return true;
	}
	
	
	public boolean saveu() throws SQLException, TzServiceException{
		UserServiceImpl userService = new UserServiceImpl();
		//runtime�ǲ����Բ�����쳣��ֻ��Ϊ�˳�����Է������ҵ��������ĳ����λ�ã���ȥ������쳣����˴�������Ժ��ǿ���ɾ����
		//checked exception�Ͳ���
		try {
			boolean flag = userService.saveUser();
			System.out.println(flag);
			Connection connection = null;
			Statement statement = connection.createStatement();
			return flag;
		} catch (SQLException e) {
//			return false;
			throw e;//�����������Ͳ������¼�������Ϣ,�Զ����쳣��Ŀ��    throw �׳����쳣�����runtimeException�Ͳ���throws��ʾ�׳�
			//�����checkedException�ͱ�����ʾthrows�׳����õ����߽����쳣����
			//throw ���Խ������ֵ�����⣬���Ծ����쳣�ǲ����õ�����ȥ���������¼�Ϳ����쳣��Ϣ
			//ֻ����:RuntimeException��Exception�������£���throw e�׳��Ļ�������Ҫthrows����������.
		}
	}

	public static void main(String[] args) {
		//throws �� throw ��Զ������һ������ס��
		try {
			new UserServiceImpl().saveu();
		} catch (SQLException  e) {
			e.printStackTrace();
		} catch (TzServiceException e) {
		}
	}
	
}
