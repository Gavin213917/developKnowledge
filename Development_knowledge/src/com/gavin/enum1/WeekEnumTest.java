package com.gavin.enum1;

public class WeekEnumTest {
	
	
	public static void getPlan(WeekEnum week){
		switch (week) {
		case Monday:
			System.out.println("����������һ,��Ҫ˯��");
			break;
		case Thursday:
			System.out.println("���������ڶ�,��Ҫȥ��ɽ");
			break;
		case Wednesday:
			System.out.println("������������,��Ҫ��Ӿ");
			break;
		case Tuesday:
			System.out.println("������������,....");
			break;
		case Friday:
			System.out.println("������������");
			break;
		case Sunday:
			System.out.println("������������");
			break;
		case Saturday:
			System.out.println("������������");
			break;

		default:
			break;
		}
	}
	
	public static void main(String[] args) {
//		System.out.println(WeekEnum.Monday);
//		System.out.println(WeekEnum.Thursday);
//		System.out.println(WeekEnum.Wednesday.ordinal());//������õ���ǰԪ����ĳö�����ж����λ��
//		System.out.println(WeekEnum.Tuesday);
//		System.out.println(WeekEnum.Friday);
//		System.out.println(WeekEnum.Sunday);
//		System.out.println(WeekEnum.Saturday);
		
//		getPlan(WeekEnum.Monday);
//		getPlan(WeekEnum.Thursday);
		
		
		
		//ѭ����ȡ values
		for (WeekEnum weekEnums  : WeekEnum.values()) {
			System.out.println(weekEnums.name());
		}
		
		
//		byte short int  char ö�� string 
		//key�����������������Щ�� byte short int   char ---ö�� ��ö��
		
		//����һ��ö�ٶ����
//		WeekEnum weekEnum = WeekEnum.valueOf("Monday");
//		switch (weekEnum) {
//		case Monday:
//			System.out.println("����������һ");
//			break;
//		case Thursday:
//			System.out.println("���������ڶ�");
//			break;
//		case Wednesday:
//			System.out.println("������������");
//			break;
//		case Tuesday:
//			System.out.println("������������");
//			break;
//		case Friday:
//			System.out.println("������������");
//			break;
//		case Sunday:
//			System.out.println("������������");
//			break;
//		case Saturday:
//			System.out.println("������������");
//			break;
//
//		default:
//			break;
//		}
		
		
//		WeekEnum weekEnum = WeekEnum.valueOf("Monday");
		int mark = TzConstanst.WEEK_Sunday;//7
		switch (mark) {
		case 1:
			System.out.println("����������һ");
			break;
		case 2:
			System.out.println("���������ڶ�");
			break;
		case 3:
			System.out.println("������������");
			break;
		case 4:
			System.out.println("������������");
			break;
		case 5:
			System.out.println("������������");
			break;
		case 6:
			System.out.println("������������");
			break;
		case 7:
			System.out.println("������������");
			break;
		default:
			break;
		}
	}
	
	
}
