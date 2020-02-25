package com.gavin.IO.demo;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileDemo4 {
	private static List<File> files = new ArrayList<>();


	public static void main(String[] args) throws IOException {
		File directory = new File("D:/����");// 255��
//		String[] files = directory.list();//�ȿ����õ��ļ�Ҳ�����õ��ļ���

//		List<File> list = listFiles(directory);
		List<File> list = listFiles(new ArrayList<File>(), directory);
		for (File file : list) {
			System.out.println(file);
		}

		String[] files = directory.list();
//		for (String string : files) {
//			System.out.println(string);
//		}

		System.out.println("�õ��ļ��б�ĸ���:" + files.length);

	}

	
	/**
	 * ����ȫ�ֱ����ķ�ʽ
	 * @Title: listFiles 
	 * @author: Gavin
	 * @time: 2019��7��1�� ����6:53:27
	 * @param directory
	 * @return 
	 * @return: List<File> 
	 * @throws
	 */
	public static List<File> listFiles(File directory) {
		File[] files2 = directory.listFiles();
		for (File file : files2) {
			if (file.isFile()) {
				files.add(file);
			}
			if (file.isDirectory()) {// �����Ŀ¼�����������Լ�
//				files.add(file);//��Ŀ¼
				listFiles(file);
			}
		}

		return files;
	}

	/**
	  *  ���εķ�ʽ
	 * @Title: listFiles 
	 * @author: Gavin
	 * @time: 2019��7��1�� ����6:53:35
	 * @param files
	 * @param directory
	 * @return 
	 * @return: List<File> 
	 * @throws
	 */
	public static List<File> listFiles(List<File> files, File directory) {
		File[] files2 = directory.listFiles();
		for (File file : files2) {
			if (file.isFile()) {
				files.add(file);
			}
			if (file.isDirectory()) {// �����Ŀ¼��
//				files.add(file);
				listFiles(files, file);
			}
		}

		return files;
	}

	private static void print(String message) {
		System.out.println(message);
	}

}
