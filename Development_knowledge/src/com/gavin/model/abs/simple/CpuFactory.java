package com.gavin.model.abs.simple;

/**
 * 
 * ���ü򵥹�������װ
 * CpuFactory<br/>
 * ������:xuchengfei<br/>
 * ʱ�䣺2016��4��23��-����11:59:41 <br/>
 * @version 1.0.0<br/>
 *
 */
public class CpuFactory {

	public static ICpu createCpu(int type){
		ICpu cpu = null;
		if(type==1){
			cpu = new IntelCpu(755);
		}else if(type==2){
			cpu = new AMDCpu(938);
		}
		return cpu;
	}
	
}
