package com.gavin.model.abs.simple;

/**
 * 
 * AMDCpu��CPU
 * AMDCpu<br/>
 * ������:xuchengfei<br/>
 * ʱ�䣺2016��4��23��-����11:51:21 <br/>
 * @version 1.0.0<br/>
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
