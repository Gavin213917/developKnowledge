package com.gavin.Lambda.s4;

@FunctionalInterface
public interface Displayable {
	int a=10;
	public void display();
	
	//Ĭ�Ϸ���
	default int add(int a,int b){
		return a+b;
	}
	
	default int munis(int a,int b){
		return a-b;
	}
}
