package com.gavin.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;

public class Main {
	public static void main(String[] args) {
		// ����10�β���--10�����ڷ���
		for (int i = 0; i < 10; i++) {
			test();
		}
	}

	public static void test() {
		// �������Ե�List
//		List<Object> list = Collections.synchronizedList(new ArrayList<Object>());
//		List<Object> list = new ArrayList<Object>();//�̲߳���ȫ
		List<Object> list = new Vector<Object>();//�̰߳�ȫ
		

		// �߳�����(1000)
		int threadCount = 1000;

		// ���������̵߳ȴ�threadCount�����߳�ִ�����
		CountDownLatch countDownLatch = new CountDownLatch(threadCount);

		// ����threadCount�����߳�
		for (int i = 0; i < threadCount; i++) {
			Thread thread = new Thread(new MyThread(list, countDownLatch));
			thread.start();
		}

		try {
			// ���̵߳ȴ��������߳�ִ����ɣ�������ִ��
			countDownLatch.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// List��size
		System.out.println(list.size());
	}
}

class MyThread implements Runnable {
	private List<Object> list;

	private CountDownLatch countDownLatch;

	public MyThread(List<Object> list, CountDownLatch countDownLatch) {
		this.list = list;
		this.countDownLatch = countDownLatch;
	}

	public void run() {
		// ÿ���߳���List�����100��Ԫ��
		for (int i = 0; i < 100; i++) {
			list.add(new Object());
		}
		// ���һ�����߳�
		countDownLatch.countDown();
	}
}