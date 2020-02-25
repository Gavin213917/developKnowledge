package com.gavin.IO.demo;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import com.gavin.string.StringUtils;

public class FileDemo3 {

	public static void main(String[] args) throws IOException {
		File directory = new File("D:/�ҵ���ҳ/chapter01/a/b");// 255��
		// �ļ���Ŀ¼������Ϣ
		print("Ŀ¼������޸�ʱ��:" + directory.lastModified());
		try {
			print("Ŀ¼������޸�ʱ��:" + StringUtils.dateToString(new Date(directory.lastModified()), "yyyy/MM/dd HH:mm"));
		} catch (ParseException e) {
			e.printStackTrace();
		}

		// Ŀ¼�Ĵ���
		if (!directory.exists()) {
//			directory.mkdir();//������Ŀ¼
			directory.mkdirs();//������Ŀ¼
		}

	}

	private static void print(String message) {
		System.out.println(message);
	}

}
