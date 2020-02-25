package com.gavin.set;

import java.util.Comparator;

/**
 * Integer��������
 * @author Administrator
 *
 */
public class IntegerComparator implements Comparator<Integer> {

	private boolean mark = true;
	//���캯����set getter
	
	public IntegerComparator(boolean mark) {
		this.mark = mark;
	}
	
	@Override
	public int compare(Integer o1, Integer o2) {
		return mark?o1-o2:o2-o1;
	}


}