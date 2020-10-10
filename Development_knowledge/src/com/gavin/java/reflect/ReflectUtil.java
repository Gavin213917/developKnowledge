package com.gavin.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;

import com.gavin.string.StringUtils;



public class ReflectUtil {
	
	
	
	
	public static void main(String[] args) throws CloneNotSupportedException  {
		
		/**
		 * Class--ÿ�������֮��������һ�������Class����ͨ����Class������Է���jvm��������������Ϣ,���캯�������ԣ�������������ע�⡣
		 * ���ȡclass��������ַ�ʽ��
		 * 1:ʹ��Class.forName(����+����)
		 * 2:ĳ�����.class��������ȡClass����
		 * 3:����ĳ�������getClass() ������ȡClass����
		 * 
		 * ������ǿ���ͨ������̬��ȥ�޸�jvm������Ѿ������غõķ�����������������ԣ���Ա��������ֵ�����÷������ݲ���.
		*/
		
		
		/**
		 * 1:ֻ�ж�����ܹ����÷����͸���Ա���Ը�ֵ������
		 * 2:�������һ������Ҫ��������--ֵע�룬�����ת����bean-map��(map-bean)(bean-xml)(xml-bean)(bean-json/map)(json-bean/map)
		 * ��������
		 * 1:new
		 * 2:����--spring ioc /struts2/mybatis�ȶ����÷���ȥ��������
		 * 3:ObjectInputStream ���л��ͷ�����  implements Serializable--Hibernate
		 * 4:clone implements Cloneable
		 * 5:Object��������
		 * 
		 * user/list
		 * 
		 * UserAction
		 * <action name="user/list" method="list" class="com.tz.action.UserAction">
		 * 
		 * Class clz = Class.forName("com.tz.action.UserAction");
		 * Object obj = clz.newInstance();
		 * method.invoke(obj,"list",����);
		 * public String list(){
		 * 
		 * }
		 * 
		 * �������ⷴ�䣬�Ͱѵ���һ�ֶ�����÷�������Ա������ֵ�ķ�ʽ
		 * 
		 */
		
		
		//ͨ��new����ֵ�ķ�ʽ
//		User user = new User();
//		user.id = 1;
//		user.username = "keke";
//		user.money = 12.5f;
//		
//		
//		user.setNum(10L);
//		String[] teachers = {"keke","xiaoer"};
//		user.setTeachers(teachers);
		
		
		//����
		try {
//			Class clz2 = User.class;
//			Class clz3 = user.getClass();
			Class clz = Class.forName("com.gavin.bean.User`");
			//����Ĵ���
			User  user= (User)clz.newInstance();
			
			//��������
			//��������
//			Field field2 = clz.getDeclaredField("id");
//			System.out.println("��������:"+field2.getName());
//			System.out.println("���Ե����η�:"+field2.getModifiers());//���η�
//			System.out.println("���Ե���������:"+field2.getType());//��������
////			System.out.println(field2.getGenericType());
//			System.out.println("���Ե�ֵ:"+field2.get(user));//���Ǹ������л�ȡֵ
			
			
			//0ȱʡ��
			//1:������
			//2:˽�е�
			//4:�ܱ���
			//ϸ���ȿ��Ƶ��е�Ȩ��----����bean---sql+map �Ϳ�����--OA
			
			System.out.println(Modifier.PUBLIC);//1
			System.out.println(Modifier.PRIVATE);//2
			System.out.println(Modifier.PROTECTED);//4
			System.out.println(Modifier.STATIC);//8
			System.out.println(Modifier.FINAL);//16
			System.out.println(Modifier.SYNCHRONIZED);//32
			System.out.println(Modifier.VOLATILE);//64
			System.out.println(Modifier.NATIVE);//256
			
			System.out.println("*****************************************");
			System.out.println("*****************************************");
			Field[] field= clz.getDeclaredFields();
			for (Field field3 : field) {
				field3.setAccessible(true);//����˽�г�Ա
				System.out.println("��������:"+field3.getName());
				System.out.println("���Ե����η�:"+field3.getModifiers());//���η�
				System.out.println("���Ե���������:"+field3.getType());//��������
//				Type type = field3.getGenericType();
//				System.out.println(type.getTypeName());
				System.out.println("���Ե�ֵ:"+field3.get(user));//���Ǹ������л�ȡֵ
				System.out.println("===================");
			}
			System.out.println("*****************************************");
			System.out.println("*****************************************");
			
			
			String fileName = "id";
			Field field3 = clz.getDeclaredField(fileName);
			String methodName = StringUtils.toUpperCaseFirst(fileName);
			
			
			//��������
//			user.setId(100);
			Method setMethod = clz.getDeclaredMethod("set"+methodName,field3.getType());
			setMethod.invoke(user,100);
			
			
//			Integer id = user.getId();
			Method getMethod = clz.getDeclaredMethod("get"+methodName);
			Object obj= getMethod.invoke(user);
			System.out.println(obj);
			
			
//			Method[] methods = clz.getDeclaredMethods();
//			for (Method method : methods) {
//				System.out.println(method.getName());
//				System.out.println(method.getModifiers());
//				System.out.println(method.getDefaultValue());
//				System.out.println(method.getParameterCount());
//			}
			
			
			//��������
			
			
			//����ע��
			
			
			
			//�������캯��
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		
		
	}
	
}
