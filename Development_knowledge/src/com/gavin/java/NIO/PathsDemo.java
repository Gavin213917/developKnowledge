package com.gavin.NIO;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathsDemo {

	
	public static void main(String[] args) throws IOException {
		
		
//		Path path = Paths.get("d:/a/bbbb.txt");
		Path path = Paths.get("d:","tomcat7","���дʿ�");
		System.out.println("�õ�Ŀ¼����ȣ�"+path.getNameCount());
		System.out.println("��ȡ��Ŀ¼:"+path.getRoot());
		System.out.println("��ȡ����·����"+path.toAbsolutePath());
		System.out.println(path.getFileName());
	}
}
