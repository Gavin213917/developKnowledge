package com.gavin.model.factory.AbstractFactory;

public class AudioFactory implements CarFactory{

	@Override
	public ICar createCar() {
		return new Audio();
	}

}
