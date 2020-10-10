package com.gavin.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

public class InsertRandomAccessFile {

	/**
	 * RandomAccessFile:�������
	 * ����RandomAccessFile�������ɵķ����ļ�������λ�ã��������ֻ��Ҫ�����ļ��Ĳ������ݣ�
	 * �����ǰ��ļ���ͷ����β��ʹ��RandomAccessFile���Ǹ��õ�ѡ��
	 * 
	 * r:��ֻ���ķ�ʽ��ָ���ļ�������ļ������ڣ��������ļ�
	 * rw:�Զ���д�ķ�ʽ��ָ���ļ���
	 * @throws IOException 
	 * 
	 */
	public static void main(String[] args) throws IOException {
		int pos = 4;
		String content = "�Ұ���";
		/*д��*/
		File tmp = File.createTempFile("temp",null);
		tmp.deleteOnExit();
		try (
				RandomAccessFile randomAccessFile = new RandomAccessFile(new File("d://a.txt"), "rw");
				FileOutputStream outputStream = new FileOutputStream(tmp);
				FileInputStream inputStream = new FileInputStream(tmp);
			){
			
			randomAccessFile.seek(pos);
			byte[] b=new byte[64];
			int hasread = 0;
			while ((hasread = randomAccessFile.read(b))!=-1) {
				outputStream.write(b, 0, hasread);
			}
			
			//��������
			randomAccessFile.seek(pos);
			//׷����Ҫ�Ĳ�������
			randomAccessFile.write(content.getBytes());
			while ((hasread = inputStream.read(b))!=-1) {
				randomAccessFile.write(b, 0, hasread);
			}
			
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
}
