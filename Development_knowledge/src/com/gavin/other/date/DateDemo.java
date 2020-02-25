package com.gavin.other.date;

import java.text.ParseException;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateDemo {

	public static void main(String[] args) throws ParseException {
		
		Date date = new Date();
		System.out.println(date);
		/*
		 * Thu    May   26     23:10:43 CST 2016---  ����ʿ����:��ǰʱ�����1970��1��1�� 00:00:00deһ��ʱ���Ժ�����Ϊ��λ
		 * ������      ���·�    26��        ʱ:��:��     ʱ��    ���
		 * ����         �·�      ����      ʱ:��:��     ʱ��    ���
		*/
		
		System.out.println(date.getYear());
		System.out.println(date.getMonth()+1);//
		System.out.println(date.getDate());//26
		System.out.println(date.getDay());//0������1 2 3 4 5 6 
		System.out.println(date.getHours());
		System.out.println(date.getMinutes());
		System.out.println(date.getSeconds());
		long time = date.getTime();//����1970������
		System.out.println(time);
//		System.out.println(date.getTimezoneOffset());
		
//		Date date2 = new Date(time);
//		System.out.println(date2);
		Date date2 = new Date("2015/12/12");
		System.out.println(date2);
		Date date3 = new Date("2015/12/13");
//		System.out.println(date2);
//		System.out.println(date2.after(date3));//date2�����Ƿ���date3֮��
//		System.out.println(date2.before(date3));//date2�����Ƿ���date3֮ǰ
		
		long s1 = date2.getTime();
		long s2 = date3.getTime();
		System.out.println(s1>s2);
		System.out.println(s1<s2);
		
		
//		String dString = "20160526231616";
//		Date d = new SimpleDateFormat("yyyyMMddHHmmss").parse(dString);
//		String dString2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(d);
//		System.out.println(dString2);
		
		
		
	}

}
