package com.gavin.model.abs.complex;

/**
 * Intel��CPU
 * @author 18158
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
