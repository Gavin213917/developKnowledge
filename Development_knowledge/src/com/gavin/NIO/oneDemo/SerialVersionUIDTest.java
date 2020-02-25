package com.gavin.NIO.oneDemo;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * ΪʲôҪ��SerialVersionUID?
 * ΪʲôҪ��SerialVersionUID��Ӧ��˵ΪʲôҪ�ֶ�����һ��ServialVersionUID����ΪֻҪ���������л��ˣ�
 * JAVA�ͻ��Զ��������һ��SerialVersionUID��
 * Javaǿ�ҽ���������ʽ������һ��SerialVersionUID����ΪSerialVersionUIDĬ��ֵ�ļ����Ǹ�����ĸ�����������ģ����ԣ�������)
 * ���飺http://docs.oracle.com/javase/7/docs/api/java/io/Serializable.html��
 * 
 * ΪʲôҪ��ʽ������һ��SerialVersionUID����Ϊ������޸�������ࣨ���Ժͷ���������ô�㵱ǰ���Ĭ��SerialVersionUID��
 * local class serialVersionUID���ͻ�ı䣬������ǰ���л������ص�SerialVersionUID�� stream
 * classdesc serialVersionUID
 * ����ͬ����ô����ʱ�����оͻ�����׳��쳣java.io.InvalidClassException��
 *
 */
class SerialVersionUIDTest {
	public static void main(String[] args) throws Exception {
//		Person person = new Person();
//		person.setUsername("hackingwu");
//		ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream("test"));
//		oo.writeObject(person);
//		oo.close();
		ObjectInputStream oi = new ObjectInputStream(new FileInputStream("test"));
		Person person_back = (Person) oi.readObject();
		System.out.println("HI,My name is " + person_back.getUsername());
		oi.close();
	}
}