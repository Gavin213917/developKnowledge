package com.gavin.model.abs.simple;

/**
 * 
 * ������װ��
 * ComputerEngineer<br/>
 * ������:xuchengfei<br/>
 * ʱ�䣺2016��4��24��-����12:02:20 <br/>
 * @version 1.0.0<br/>
 *
 */
public class ComputerEngineer {

	
	//cpu
	private ICpu cpu=null;
	//����
	private IMainBoard mainBoard = null;
	
	
	public ComputerEngineer(int cpuType,int mainboardType){
		this.preparedHardWares(cpuType, mainboardType);
	}
	
	public void preparedHardWares(int cpuType,int mainboardType){
		//cpu
		this.cpu = CpuFactory.createCpu(cpuType);
		this.mainBoard = MainBoardFactory.createMainBoard(mainboardType);
		
		//����
		this.cpu.calculate();
		this.mainBoard.installCpu();
	}
}
