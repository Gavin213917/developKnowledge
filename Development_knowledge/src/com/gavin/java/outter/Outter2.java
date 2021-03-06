package com.gavin.outter;

/**
 * 
 * 成员内部类（非静态内部类）---相当于一个一种成员方法
 * 静态内部类----相当一类中的静态方法
 * Outter<br/>
 * 创建人:xuchengfei<br/>
 * 时间：2016年4月26日-下午10:38:26 <br/>
 * @version 1.0.0<br/>
 *
 */
public class Outter2 {

	public int age;
	public static String username;
	
	//非静态方法中，即可调用成员变量和静态变量
	public void say(){
		System.out.println(this.age+"==="+Outter2.username);
	}
	
	//静态方法中只能调用静态成员
	public static void message(){
		System.out.println("==="+Outter2.username);
		
	}
	
	
	public class Inner extends ParentInner{//成员方法
		
		
		public Inner(){
			super();//有extends才有意义---Object
		}
		
		public void test(){
			System.out.println(age+"==="+username);
		}
	}
}
