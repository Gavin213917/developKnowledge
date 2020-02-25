package com.gavin.IO.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.util.List;

import com.sun.xml.internal.ws.model.AbstractWrapperBeanGenerator.BeanMemberFactory;

import sun.security.util.Length;

public class FileDemo7 {

	
	public static void main(String[] args) throws IOException {
		
		/*
		 * 
		 * IO:������(InputStream)�������(OutStream)---����File����Ĺ���
		 * 
		 * IO:
		 * 
		 * �ֽ���  : ����(����)��InputStream
		 * ----��Χ���ļ����������ƣ�ճ���������ļ�
		 * ----Ӧ���ڣ��������ļ��Ĵ���(ͼƬ����Ƶ����Ƶ��)
		 * ---���͵����ࣺFileInputStream
		 * ---������
		 * ---int read()===������������ȡ�����ֽڣ���������ȡ�����ݡ�
		 * ---int read(byte[] b)=== ��������������ȡb.length���ֽ����ݣ�������洢���ֽ�������b�У������ֽ���
		 * ---int read(byte[] b,int off,int len)===��������������ȡlen���ֽڵ�����,
		 * ---available()����ʣ�¶���û�ж�ȡ��ϡ���ȡ��Ϸ���0
		 * 
		 * 
		 * �ַ���:���������ļ����ݵ�,---�ı��ļ�
		 * һ���Ƕ�Ӧ�ı��ļ����ݵ���ӣ��޸ģ�׷�ӣ���ɾ����
		 * 
		 * �ֽ��� �� �ַ���һ����û�����һ��һ���ģ����������ֽ������ַ��������ĵ�Ԫ��ͬ--�ֽ����������ݵ�Ԫ8λ��
		 * ���ַ������Բ���16λ��
		 * 
		 * 1byte = 8 bit 
		 * �� 2byte = 16bit;
		 * 
		 * char[]--�ַ���
		 * byte[]---�ֽ���
		 * 
		 * 
		 * 
		 * 
		 * 
		 * ������:���Ƕ��ֽ������ַ������Ի�������
		 * 
		 * 
		 * �������ļ�:ͼƬ����Ƶ����Ƶ��
		 * �ı��ļ�:html,java,txt,
		 * 
		 * office�ļ�:.doc,docx,pdf,--io��ȡ---poi/jxlȥ��ȡ--io
		 * */
		
		
		//�ļ��ĸ���
		File file = new File("e://luoo.html");//С��   C:\Users\Administrator\Desktop
		File file2 = new File("d://luoo.html");
		if(file2.exists()){
			//�ֽ���-
			//������
			FileInputStream inputStream = null;
			//�����
			FileOutputStream outputStream = null;
			try {
				inputStream = new FileInputStream(file2);
				outputStream = new FileOutputStream(file); 
				//��ȡ�����������룩
				int len = 0;
				byte[] bs = new byte[1024];
				while ((len=inputStream.read(bs))!=-1) {
					outputStream.write(bs,0,len);
				}
				outputStream.flush();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					if(outputStream!=null)outputStream.close();
					if(inputStream!=null)inputStream.close();
				} catch (IOException e2) {
					e2.printStackTrace();
				}
			}
		}
	}
}

