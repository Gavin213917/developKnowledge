package com.gavin.model.abs.simple;

/**
 * 
 * Intel��CPU
 * IntelCpu<br/>
 * ������:xuchengfei<br/>
 * ʱ�䣺2016��4��23��-����11:51:21 <br/>
 * @version 1.0.0<br/>
 *
 */
public class IntelCpu implements ICpu {

	/**
	 * cpu�������
	 */
	private int pins=0;
	
	public IntelCpu(int pins){
		this.pins = pins;
	}
	
	@Override
	public void calculate() {
		System.out.println("Intel Cpu ���������:"+this.pins);
	}
}
