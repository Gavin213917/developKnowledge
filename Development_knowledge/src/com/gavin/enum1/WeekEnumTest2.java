package com.gavin.enum1;

public class WeekEnumTest2 {
	
	
	
	public static void main(String[] args) {
		
		
		//��������ĵ�һ��ʽ
		WeekEnum weekEnum = WeekEnum.valueOf("Tuesday");
		//��������ĵڶ���ʽ
		WeekEnum weekEnum2 = Enum.valueOf(WeekEnum.class, "Tuesday");
		
		
//		//��Ա����
//		weekEnum2.name = "keke";
//		weekEnum2.test();
		
		
		
	
	}
	
	
}
