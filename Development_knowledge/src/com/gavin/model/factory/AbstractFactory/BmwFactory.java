package com.gavin.model.factory.AbstractFactory;

public class BmwFactory implements CarFactory{

	@Override
	public ICar createCar() {
		return new Bmw();
	}

}
