package com.gavin.model.singleton;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ParseProperties {

	private static String fileName = "jdbc";
	private String url;
	private String driver;
	private String username;
	private String password;
	
	/*
	 * �������ӳټ���ЧӦ��������
	 * */
	
	private ParseProperties(){
	}
	
	public static class ParsePropertiesHolder{
		private static  ParseProperties properties = new ParseProperties();
	}
	
	public static ParseProperties getInstance(){
		return ParsePropertiesHolder.properties;
	}
	
	public static ParseProperties getInstance(String fileName){
		ParseProperties.fileName = fileName;
		return ParsePropertiesHolder.properties;
	}

	/**
	 * �������������ļ��ķ���
	 * @Title: parserProperties 
	 * @author: Gavin
	 * @time: 2019��6��20�� ����2:49:50 
	 * @return: void 
	 * @throws
	 */
	public void parserProperties() {
		try {
			Properties properties = new Properties();
			// �ڲ�ͬ�ļ�����
			// "D:/eclipse-workspace/Development_knowledge/src/com/gavin/model/db.properties";
			String path = System.getProperty("user.dir");
			File file = new File(path+File.separator+"src", ParseProperties.fileName+".properties");
			properties.load(new FileInputStream(file));
			driver = properties.getProperty("db.driver");
			url = properties.getProperty("db.url");
			username = properties.getProperty("db.username");
			password = properties.getProperty("db.password");
		} catch (Exception e) {
		}
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	/**
	 * ���Ժ���
	 * @Title: main 
	 * @author: Gavin
	 * @time: 2019��6��20�� ����2:47:11
	 * @param args 
	 * @return: void 
	 * @throws
	 */
	public static void main(String[] args) {
		
		ParseProperties parseProperties = new ParseProperties();
		parseProperties.parserProperties();
		System.out.println(parseProperties.getDriver());
		System.out.println(parseProperties.getUrl());
		System.out.println(parseProperties.getUsername());
		System.out.println(parseProperties.getPassword());
		// java.util.Properpties--ר����������ͽ���properties���ļ�
//
//		try {
//
//			Properties properties = new Properties();
//			// �ڲ�ͬ�ļ�����
//			// String filename =
//			// "D:/eclipse-workspace/Development_knowledge/src/com/gavin/model/db.properties";
//			// properties.load(new FileInputStream(filename));
//
//			// ��ͬһĿ¼�²����ļ��ķ�ʽ
//			InputStream inputStream = Test.class.getResourceAsStream("jdbc.properties");
//			properties.load(inputStream);
//
//			System.out.println(properties.getProperty("db.driver"));
//			System.out.println(properties.getProperty("db.url"));
//			System.out.println(properties.getProperty("db.username"));
//			System.out.println(properties.getProperty("db.password"));
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
	}
}
