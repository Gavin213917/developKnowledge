package com.gavin.extend;

public class Father {
	public String name="parent";
	protected int age=10;
	
	public Father() {
		super();
		System.out.println("B");
	}
	
	public void println(){
		System.out.println("����Ĵ�ӡŶ!!!");
	}
	
	public String println(String name){
		return "success";
	}
}
