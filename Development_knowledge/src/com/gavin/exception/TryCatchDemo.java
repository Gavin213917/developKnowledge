package com.gavin.exception;

public class TryCatchDemo {

	public static void main(String[] args) {
		/*Exception --try/catch���в�����ʾ����,��δ�����򿪷��У�����checked exception��Ҫǿ��try/catch��������(runtimeException)���Բ���try/catch
		 * ���������ĳ�����뷢��ִ�в���������Ҫ�Ľ������û�б��������£���סһ����try/catch��������������������û�д���
		 * 
		 * */
		
		/*
		 * �쳣�Ķ��巽ʽ:	
		 * 1:tc
		 * 2:tc....
		 * 3:tc..f/tf
		 * 
		 * 1������ڳ�����룬��������쳣��Ϣ�Ժ�jvmֱ���˳����������ȫ�����ԣ�����ִ����ֹ��Ҳ���᷵��ֱֵ˵�ˡ�(Ҳ�Ͳ���return)��
		 * 2:�쳣������С�쳣������쳣  (ƽ���쳣˳���޹�)
		 * */
		
		/*
		try {
			int a = 10;
			int b = a/5;
			String[] names = {"keke","xiaozhang"};
			names[2]="xiaoke";
			System.out.println("�����ִ����");
		}
		
		catch(IndexOutOfBoundsException e){
			System.out.println("IndexOutOfBoundsException ����Խ����....");
		}
		
		catch(ArithmeticException e){
			System.out.println("ArithmeticException ���������У�0���ܱ�����!!");
		}
		
		catch (RuntimeException e) {
			System.out.println("RuntimeException ������...");
		}
		catch (Exception e) {
			System.out.println("Exception ������...");
		}
		*/
		
//		try {
//			int a = 10;
//			int b = a/0;
//			String[] names = {"keke","xiaozhang"};
//			names[2]="xiaoke";
//			System.out.println("�����ִ����");
//		} catch (Exception e) {
//			
//			
//		}
		
		
		
		
		

	
		
//		try {
//			
//		} catch (Exception e) {
//		}
//		
//		try {
//			
//		} finally {
//			// TODO: handle finally clause
//		}
//		
//		
//		try {
//			
//		}catch (RuntimeException e) {
//			// TODO: handle exception
//		}catch (Exception e) {
//			// TODO: handle exception
//		}
//		
//		
//		try {
//			
//		}catch (RuntimeException e) {
//			// TODO: handle exception
//		}catch (Exception e) {
//			// TODO: handle exception
//		} finally {
//			
//		}
		
		
		
//		try {
//			Class.forName("").newInstance();
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		} catch (InstantiationException e) {
//			e.printStackTrace();
//		} catch (IllegalAccessException e) {
//			e.printStackTrace();
//		}
		
		
//		try {
//			FileInputStream inputStream = new FileInputStream("d://a.txt");
//			inputStream.read(null);
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		
//		try {
//			Statement statement = null;
//			ResultSet rSet = statement.executeQuery("");
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
		
		
		
		
	}
}
