package com.gavin.other2;

import java.time.Clock;
import java.time.Instant;
import java.util.Date;

public class ClockDemo {

	public static void main(String[] args) {
		
		long s = System.currentTimeMillis();
		//��ȡ��ǰ��Clock����
		Clock clock = Clock.systemUTC();
		System.out.println("��ȡ��ǰ��ʱ�̣�"+clock.instant());
		System.out.println(clock.millis());
		System.out.println(System.currentTimeMillis());
		System.out.println(new Date().getTime());
		long e = System.currentTimeMillis();
		System.out.println(e-s);
		
		
//		Instant instant = clock.instant();
		Instant instant = Instant.now();//���ڵļӼ�
		Instant instant2 = Instant.parse("2016-05-27T14:39:10.386Z");
	}
}
