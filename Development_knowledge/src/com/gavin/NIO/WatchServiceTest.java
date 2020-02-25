package com.gavin.NIO;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;

import org.apache.commons.io.FileUtils;


//javaNio.2
public class WatchServiceTest {

	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		//�۲����
		WatchService watchService = FileSystems.getDefault().newWatchService();
		String root = "d:/";
		Paths.get(root).register(watchService, StandardWatchEventKinds.ENTRY_CREATE,
				StandardWatchEventKinds.ENTRY_MODIFY,
				StandardWatchEventKinds.ENTRY_DELETE
			);
		
		
		while (true) {
			
			//��ȡ��һ���ļ��仯ʱ��
			WatchKey key = watchService.take();
			for (WatchEvent<?> event : key.pollEvents()) {
				System.out.println(event.context()+"�ļ�������"+event.kind()+"�¼�!");
				System.out.println(FileUtils.readFileToString(new File(root+event.context()),"utf-8"));
			}
			
			//����watchkey
			boolean v = key.reset();
			if(!v){
				break;
			}
			
		}
	}
}
