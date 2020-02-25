package com.gavin.IO.demo;

import java.io.File;
import java.text.ParseException;
import java.util.Date;

import com.gavin.string.StringUtils;

public class FileDemo {

	/**
	 * io��java.io��
	 * 
	 * java.lang java.util(���ڴ���+����) 
	 * java.text 
	 * java.io 
	 * java.nio
	 * java.sql 
	 * java.awt 
	 * java.net 
	 * java.rmi 
	 * java.secrity
	 * 
	 * 
	 * 
	 * File�� ��Ҫ��ͨ������ȥ��ȡһ���ļ������ݵ������С�
	 *  1:�õ��ļ�/�ļ���(Ŀ¼)
	 * 2:�����ļ�(�����ȡ(InputStream)�ͳ���д��(OutPutStream))
	 * 
	 * @throws ParseException
	 */

	public static void main(String[] args) throws ParseException {
		// ��ȡ��d�̵��ļ�
		File file = new File("D:/luoo.html");
//		File file = new File("gavin");
		// ��ȡ�ļ���(Ŀ¼)
		File directory = new File("D:/����");

		// ��������
		print("�ļ���������:" + file.getName());
		print("�ļ���·����:" + file.getPath());
		print("�ļ��ľ���·��(ȫ·��)��:" + file.getAbsolutePath());
		print("�ļ������ڵ�Ŀ¼(�ļ���):" + file.getParent());

		// �ļ���Ŀ¼�����صķ���
		print("��ǰ�ļ��Ƿ����:" + (file.exists() ? "����" : "������"));// true���ڣ�������false
		print("��ǰ��һ���ļ���" + (file.isFile() ? "��" : "����"));
		print("��ǰ��һ��Ŀ¼��" + (directory.isDirectory() ? "��" : "����"));
		print("�ж��ǲ���һ������·��:" + file.isAbsolute());
		print("�ļ��Ƿ�ɶ��ģ�" + file.canRead());
		print("�ļ��Ƿ��д�ģ�" + file.canWrite());
		print("�ļ��Ƿ����صģ�" + file.isHidden());

		// �ļ���Ŀ¼������Ϣ
		print("�ļ��Ĵ�С��" + file.length());
		print("�ļ��Ĵ�С��" + StringUtils.countFileSize(file.length()));
		print("�ļ��Ĵ�С��" + StringUtils.countFileSize("d:/luoo.html"));
		print("�ļ��Ĵ�С��" + StringUtils.countFileSize(file));
		print("�ļ��Ĵ�С��" + StringUtils.byteCountToDisplaySize(file.length()));
		print("�ļ�������޸�ʱ��:" + file.lastModified());
		print("�ļ�������޸�ʱ��:" + StringUtils.dateToString(new Date(file.lastModified()), "yyyy/MM/dd HH:mm"));

		// �ļ���Ŀ¼��ص�һЩ����
//		boolean createNewFile();
//		boolean delete();
//		boolean deleteOnExit();

		// Ŀ¼��ز���

	}

	private static void print(String message) {
		System.out.println(message);
	}

}
