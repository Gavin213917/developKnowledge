package com.gavin.model.abs.complex;

public class AmdMainBoard implements IMainBoard{

	/*CPU��۵Ŀ���*/
	private int cpuHoles;
	
	
	public AmdMainBoard(int cpuHoles){
		this.cpuHoles = cpuHoles;
	}
	
	
	@Override
	public void installCpu() {
		System.out.println("AmdMainBoard �������CPU�Ĳ�۵Ŀ�����:"+this.cpuHoles);
	}

}
