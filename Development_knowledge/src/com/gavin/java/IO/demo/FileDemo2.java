package com.gavin.IO.demo;

import java.io.File;
import java.io.IOException;

public class FileDemo2 {

	public static void main(String[] args) throws IOException {
		// ��ȡ��d�̵��ļ�
		File file = new File("D:/luoo2.html");
		// ����,����Ѿ����˾͸���
		if (!file.exists()) {
			file.createNewFile();// ��File�����Ӧ���ļ�������ʱ���÷����ͻᴴ��һ���ļ������򷵻�false,������
			System.out.println("�����ļ��ɹ�" + file.getAbsolutePath());
		} else {
			System.out.println("�Ѿ�������....");
		}

		// ɾ���ļ�
		if (file.exists()) {// ������ڣ�ɾ��
			file.delete();// �ļ��򿪣�����ռ�õ�ʱ��ɾ����
			System.out.println("�ļ�ɾ���ɹ�");
//			file.deleteOnExit();//ע��һ��ɾ�����ӣ�ֻ�е�java������˳���ʱ�򣬲Ż�ɾ��
		}

	}

	private static void print(String message) {
		System.out.println(message);
	}

}
