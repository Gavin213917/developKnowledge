package com.gavin.other.date;

import java.util.Calendar;
import java.util.Date;


public class CalendarDemo {

	public static void main(String[] args) {
		
		//�����࣬�ӿڡ�˵�����ܴ�������---�������࣬��������
		//java.util.Calendar ������ λ���ֲ�Date����ƣ��ṩ�����࣬���õĴ������ں�ʱ��
		Calendar calendar = Calendar.getInstance();
		//��̬��������
		calendar.set(2016, 4, 1, 12, 12,12);
		//�������
		calendar.add(Calendar.YEAR, 1);//��һ��
//		calendar.add(Calendar.YEAR, -1);//��ȥһ��
		calendar.add(Calendar.MONTH, 1);//��һ����
		Calendar calendar2 = Calendar.getInstance();
		
		//return (thisTime > t) ? 1 : (thisTime == t) ? 0 : -1;
		System.out.println("=====>"+calendar.compareTo(calendar2));//1�������  ���0  С�� -1
		
		System.out.println(calendar.getCalendarType());
		System.out.println(calendar.getTimeInMillis());//��ȡ������
		
		//Calendarת��������
		Date date= calendar.getTime();
		System.out.println(date);
		System.out.println(calendar.get(Calendar.YEAR));
		System.out.println(calendar.get(Calendar.MONTH)+1);
		System.out.println(calendar.get(Calendar.DATE));
		System.out.println(calendar.get(Calendar.WEDNESDAY));
		System.out.println(calendar.get(Calendar.HOUR));
		System.out.println(calendar.get(Calendar.MINUTE));
		System.out.println(calendar.get(Calendar.SECOND));
		
		
		//������ת��Calendar
//		Date date2 = new Date();
//		calendar.setTime(date2);
		
//		System.out.println(calendar.getFirstDayOfWeek());
		
		
		//joda-time.jar datetime.jar
		//�һ�ȡ������һ���е�һ����
		//��ȡ����Ŀ�ʼʱ��ͽ���ʱ��
		//��Ҫ
		
	}
}
