package com.gavin.exception;

import java.io.FileOutputStream;

import com.gavin.IO.User;



public class ExceptionDemo {
	
	/**�쳣�����ҵ���߼�--������
	 * 
	 * Checked Exception--�ڱ���׶�jvm���Ѿ�ȷ��һ��������쳣--IOException,SQLException
	 * ����Ԥ����֢
	 * 
	 * 
	 * unchecked Exception(RuntimeException) --NullPointerException
	 * ���ܻ��У�����Ҳû��(���Բ���)---�������������jvm���Զ��쳣�������
	 * 
	 * �쳣:�ó��򿪷��ߣ����ӷ������������ֵĲ�֢���ó�������ø��ӽ�׳���Լ�
	 * �ó������������׿����Ҵ������Ϣ�����ݵ����� 
	 * 
	 * Error:һ����ָjvm��صĴ��󣬱���ϵͳ���������������ջ�������̬����ʧ�ܵ����ִ����ǳ���ɿأ����ִ���Ҳ�޷��ָ��Ͳ�����ȥ����Ĵ�����˳�����벻��ͨ��
	 * try/catch���в���
	 * */
	
	public static String test(){
		try {
			User  user = new User();
			user.setUsername("keke");
			System.out.println(user.getUsername());
			return "success";
		} catch (NullPointerException e) {
			e.printStackTrace();
			return "null";
		}
	}
	
	public static void main(String[] args) {
		
		String result = test();
		if(result=="null"){
			System.out.println("�㵱ǰ������û���Ϊnull");
		}
		
		
//		User user = null;
//		PrintStream printStream=null;
//		try {
//			printStream = new PrintStream("d://a.txt");
//			System.out.println(user.getUsername());
//		}catch(NullPointerException e){
//			System.out.println("ok");
//			e.printStackTrace(printStream);
//		}catch (Exception e) {
//			System.out.println("ok ok");
//		}
		
//		int r = getNum();
//		System.out.println(r);
//		
//		bid("2");
	}
	
	public static int getNum(){
		int a = 10;
		try {
			int b = 1/0;
			a++;
		} catch (Exception e) {
			a++;
			System.exit(1);
		} finally {
			System.out.println("��ִ����?");
			a++;
		}
		return a;
	}
	
	
	public static void bid(String price)  {
		double d = 0.0;
		try {
			d = Double.parseDouble(price);
		} catch (Exception e) {
			e.printStackTrace();
//			throw new AuthenticationException("����������");
			throw e;
		}
	}
	
	public static void bid2(String price) throws Exception  {
		double d = 0.0;
		try {
			new FileOutputStream("a.txt");
		} catch (Exception e) {
			e.printStackTrace();
//			throw new AuthenticationException("����������");
			throw e;
		}
	}
}
