package com.gavin.enum1;

public enum Gender3 implements GrenderDesc {
	
	MALE("��"){
		public void message() {
			System.out.println("����һ������Ŷ");
		}
	},FEMALE("Ů"){
		public void message() {
			System.out.println("����һ��Ů��Ŷ");
		}
	},OTHER("����"){
		public void message() {
			System.out.println("����һ������Ŷ");
		}
	};
	
	private Gender3(String name){
		this.name = name;
	}
	
	private String name;
	public String getName() {
		return name;
	}
	

	
}
