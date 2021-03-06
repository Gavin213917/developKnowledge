package com.gavin.IO.demo;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.gavin.util.FileUtil;
import com.sun.xml.internal.ws.model.AbstractWrapperBeanGenerator.BeanMemberFactory;

public class FileDemo5 {

	public static void main(String[] args) throws IOException {

		String path = System.getProperty("user.dir");
		System.out.println(path);
		List<File> files = FileUtil.listFiles(new File(path), "bin", "java");
		for (File file : files) {
			System.out.println(file.getAbsolutePath());
		}
	}

	private static void print(String message) {
		System.out.println(message);
	}

}
