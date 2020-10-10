package com.gavin.model.abs.complex;

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

	/**
	 * ��װ����
	 * ��������makeComputer<br/>
	 * �����ˣ�xuchengfei <br/>
	 * ʱ�䣺2016��4��24��-����12:19:32 <br/>
	 * �ֻ�:1564545646464<br/>
	 * @param abstractFactory
	 * @param pins
	 * @param mainboardpins void<br/>
	 * @exception <br/>
	 * @since  1.0.0<br/>
	 */
	public void makeComputer(AbstractFactory abstractFactory,int pins,int mainboardpins){
		//cpu
		ICpu cpu =  abstractFactory.createCpu(pins);
		IMainBoard mainBoard = abstractFactory.createMainBoard(mainboardpins);
		//����
		cpu.calculate();
		mainBoard.installCpu();
	}
}
