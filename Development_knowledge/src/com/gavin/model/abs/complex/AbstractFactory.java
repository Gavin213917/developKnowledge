package com.gavin.model.abs.complex;

public interface AbstractFactory {

	/**
	 * CPU ��ѡ��
	 * @Title: createCpu 
	 * @author: Gavin
	 * @time: 2019��6��24�� ����9:13:40
	 * @param pins
	 * @return 
	 * @return: ICpu 
	 * @throws
	 */
	public ICpu createCpu(int pins);
	
	/**
	 * �����ѡ��
	 * @Title: createMainBoard 
	 * @author: Gavin
	 * @time: 2019��6��24�� ����9:12:46
	 * @param mainpins
	 * @return 
	 * @return: IMainBoard 
	 * @throws
	 */
	public IMainBoard createMainBoard(int mainpins);
}
