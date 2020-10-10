package com.gavin.model.factory.AbstractFactory;

public class Client {

	public static void main(String[] args) {
		//��ͨ����
//		ICar car = CarFactory.createCar("bmw");
//		car.makeCar();
		
		
		//���󹤳�
		CarFactory carFactory = new BmwFactory();
		ICar car = carFactory.createCar();
		car.makeCar();
	}

}
