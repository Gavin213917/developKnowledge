package com.gavin.base;

/**
 * 
 * @author 18158
 * 参数如果是基本数据类型，形式参数的改变不影响实际参数
 *
 */

public class DeBug {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;

		System.out.println("a=" + a + " , b=" + b);
		change(a, b);
		System.out.println("a=" + a + " , b=" + b);
	}

	private static void change(int a, int b) {
		System.out.println("a=" + a + " , b=" + b);
		a = b;
		b = a + b;
		System.out.println("a=" + a + " , b=" + b);

	}

}
