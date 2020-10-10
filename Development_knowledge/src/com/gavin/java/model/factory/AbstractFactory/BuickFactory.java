package com.gavin.model.factory.AbstractFactory;

public class BuickFactory implements CarFactory{

	@Override
	public ICar createCar() {
		return new Buick();
	}

}
