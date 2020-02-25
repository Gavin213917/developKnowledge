package com.gavin.model.abs.complex;

/**
 * 
 * 
 * AMDFactory<br/>
 * ������:xuchengfei<br/>
 * ʱ�䣺2016��4��24��-����12:15:44 <br/>
 * @version 1.0.0<br/>
 *
 */
public class IntelFactory implements AbstractFactory {

	@Override
	public ICpu createCpu(int pins) {
		return new IntelCpu(pins);
	}

	@Override
	public IMainBoard createMainBoard(int mainpins) {
		return new IntelMainBoard(mainpins);
	}
}
