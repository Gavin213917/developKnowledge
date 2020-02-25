package com.gavin.string;

import java.math.BigDecimal;

public class NumberUtil {

	
	public static final int DIVRADIX = 10;	
	
	/**
	 * ����������ӵķ���
	 * @Title:plus
	 * @author:Gavin  
	 * @date: 2019��5��14������1:20:14 
	 * @Description:TODO    
	 * @version 1.0
	 */
	public static double plus(double a,double c){
		BigDecimal ba = new BigDecimal(a);
		BigDecimal bc = new BigDecimal(c);
		return ba.add(bc).doubleValue();
	}
	
	/**
	 * ������������ķ���
	 * @Title:minus
	 * @author:Gavin  
	 * @date: 2019��5��14������1:20:43 
	 * @Description:TODO    
	 * @version 1.0
	 */
	public static double minus(double a,double c){
		BigDecimal ba = new BigDecimal(a);
		BigDecimal bc = new BigDecimal(c);
		return ba.subtract(bc).doubleValue();
	}
	
	/**
	 * ����������˵ķ���
	 * @Title:multiply
	 * @author:Gavin  
	 * @date: 2019��5��14������1:21:04 
	 * @Description:TODO    
	 * @version 1.0
	 */
	public static double multiply(double a,double c){
		BigDecimal ba = new BigDecimal(a);
		BigDecimal bc = new BigDecimal(c);
		return ba.multiply(bc).doubleValue();
	}
	
	
	/**
	 * ������������ķ���
	 * @Title:div
	 * @author:Gavin  
	 * @date: 2019��5��14������1:21:38 
	 * @Description: int r ����������λ  
	 * @version 1.0
	 */
	public static double div(double a,double c,int r){
		BigDecimal ba = new BigDecimal(a);
		BigDecimal bc = new BigDecimal(c);
		return ba.divide(bc,r,BigDecimal.ROUND_HALF_EVEN).doubleValue();
	}
	
	/**
	 * ������������ķ���
	 * @Title:div
	 * @author:Gavin  
	 * @date: 2019��5��14������1:21:53 
	 * @Description:   
	 * @version 1.0
	 */
	public static double div(double a,double c){
		BigDecimal ba = new BigDecimal(a);
		BigDecimal bc = new BigDecimal(c);
		return ba.divide(bc,DIVRADIX,BigDecimal.ROUND_HALF_EVEN).doubleValue();
	}
	
	
	/**
	 * ���Է���
	 * @Title:main
	 * @author:Gavin  
	 * @date: 2019��5��14������1:18:54 
	 * @Description:TODO    
	 * @version 1.0
	 */
	public static void main(String[] args) {
		//�ӷ�
		System.out.println(plus(1, 3));
		//����
		System.out.println(minus(1, 3));
		//�˷�
		System.out.println(multiply(1, 3));
		//����
		System.out.println(div(1, 3));
		//����16λ
		System.out.println(div(1, 3,16));
	}

}
