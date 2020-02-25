package com.gavin.model.factory.base;

public class CarFactory {
	
	/**
	  * �쳵����
	 * @Title: makeCar 
	 * @author: Gavin
	 * @time: 2019��6��21�� ����5:03:52
	 * @param mark
	 * @return 
	 * @return: ICar 
	 * @throws
	 */
	public static ICar createCar(String mark) {
		if(mark.equalsIgnoreCase("audio")) {
			return new Audio();
		}else if(mark.equalsIgnoreCase("bmw")) {
			return new Bmw();
		}else if(mark.equalsIgnoreCase("buick")) {
			return new Buick();
		}
		return null;
	}

}
