package com.gavin.model.abs.complex;

public class IntelMainBoard implements IMainBoard{

	/*CPU��۵Ŀ���*/
	private int cpuHoles;
	
	
	public IntelMainBoard(int cpuHoles){
		this.cpuHoles = cpuHoles;
	}
	
	
	@Override
	public void installCpu() {
		System.out.println("IntelMainBoard �������CPU�Ĳ�۵Ŀ�����:"+this.cpuHoles);
	}

}
