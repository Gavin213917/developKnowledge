package com.gavin.IO.obj;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectCreateDemo {

	
	public static void main(String[] args) throws IOException {
		
		/**
		 * java��������ķ�ʽ�����֣�
		 * 1:new 
		 * 2:����
		 * 3:io�� ʵ�� java.io.Serializable(���л�)--�����̵�ʱ��--java.io.Externalizable
		 * ���Խ��������ı��ļ��Ĵ��ڴ����з�ʽ���ж���д
		 * 4:clone() ʵ��CloneAble�Ľӿ�
		 * 
		 * 5:Object��չ
		 * 
		 */
		
		
		
//		User user = new User();
//		User user = (User) Class.forName("com.tz.op33.User").newInstance();
//		User user2 = user.clone(); //ǳ���� ���
		
		
		//rmi����--ip 
		File file = File.createTempFile("temp", null);//������ʱ�ļ�
		file.deleteOnExit();//JVM�˳���ʱ�������ʱ�ļ��Զ�ɾ��
		
		
		try (//jdk1.7--rmi���ڱ��ط�����õĿ����Ļ���
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
		){
			User user = new User();
			user.setId(1);
			user.setUsername("keke�ǵ�ˮ���");
			user.setBank(49434684);
			oos.writeObject(user);//������д�뵽object.txt�ļ���
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		try (//jdk1.7--rmi���ڱ��ط�����õĿ����Ļ���
				FileInputStream fis = new FileInputStream(file);
				ObjectInputStream ois = new ObjectInputStream(fis);
			){
				User user = (User) ois.readObject();
				System.out.println(user.getId());
				System.out.println(user.getUsername());
				System.out.println(user.getBank());
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		
	}
}
