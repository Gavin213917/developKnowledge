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
public class MainBoardFactory {

	public static IMainBoard createMainBoard(int type){
		IMainBoard mainBoard = null;
		if(type==1){
			mainBoard = new IntelMainBoard(755);
		}else if(type==2){
			mainBoard = new AmdMainBoard(938);
		}
		return mainBoard;
	}
	
}
