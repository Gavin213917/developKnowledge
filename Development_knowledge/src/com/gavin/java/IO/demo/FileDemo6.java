package com.gavin.IO.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.util.List;

import com.sun.xml.internal.ws.model.AbstractWrapperBeanGenerator.BeanMemberFactory;

import sun.security.util.Length;

public class FileDemo6 {

	
	public static void main(String[] args) throws IOException {
		
		/*
		 * 
		 * IO:������(InputStream)�������(OutputStream)---����File����Ĺ���
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
		 * �ֽ��� �� �ַ���һ����÷�����һ��һ���ģ����������ֽ������ַ��������ĵ�Ԫ��ͬ--�ֽ����������ݵ�Ԫ8λ��
		 * ���ַ������Բ���16λ��һ�������ַ�����
		 * 
		 * 1byte = 8 bit 
		 * �� 2byte = 16bit;
		 * 
		 * char[]--�ַ���
		 * byte[]---�ֽ���
		 * 
		 * ����ĳ�ʼ����ʽ��
		 * 1��new 
		 * 2��clone
		 * 3������
		 * 4��io
		 * 5��ObjectInputStream
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
		
		File file = new File("d://luoo.html");//С��
		if(file.exists()){
			//�ֽ���  
			//AudioInputStream, ByteArrayInputStream, FileInputStream, FilterInputStream,, ObjectInputStream, PipedInputStream, SequenceInputStream, StringBufferInputStream

//			FilterInputStream in = new FileInputStream("d://luoo.html")
			FileInputStream in = null;
			try {
				//��ȡ�����������룩
				in = new FileInputStream(file); 
				//���ֽڶ�ȡ
				int count = 0;
//				byte[] b = new byte[1024];
//				int len = 0;
//				while((	len = in.read())!=-1){
//					System.out.println((char)len);
//					count++;
//				}
//				
//				System.out.println("============>"+count);
				
				
				
				//���ֽڶ�ȡ
//				byte[] b = new byte[1024];
//				int len = 0;
//				while((	len = in.read(b))!=-1){
//					System.out.println(new String(b));
//					count++;
//				}
//				System.out.println("============>"+count);
				
				long total = file.length();
				byte[] b = new byte[1024];
				int len = 0;
				while((	len = in.read(b))!=-1){
					System.out.println(new String(b,0,len));
					System.out.println("��ʣ�£�"+in.available()+"byte");
					System.out.println("========="+(1-(in.available() / (float)total))*100);//������
					count++;
				}
				System.out.println("һ����ȡ��============>"+count);
				
			} catch (IOException e) {
				e.printStackTrace();
			} finally {//jdk1.8 ��������رմ�����ˣ������ڴ�������ر�
				try {
					if(in!=null)in.close();
				} catch (IOException e2) {
					e2.printStackTrace();
				}
			}
			
		}
	}
	
	
	
}
