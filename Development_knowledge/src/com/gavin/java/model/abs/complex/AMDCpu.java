package com.gavin.model.abs.complex;

/**
 * AMDCpu��CPU
 * @author 18158
 *
 */
public class AMDCpu implements ICpu {

	/**
	 * cpu�������
	 */
	private int pins=0;
	
	public AMDCpu(int pins){
		this.pins = pins;
	}
	
	@Override
	public void calculate() {
		System.out.println("AMDCpu  ���������:"+this.pins);
	}
}
