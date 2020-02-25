package com.gavin.string;

import java.util.Comparator;
import com.gavin.util.TmPinyinUtil;

/**
 * �ַ������� StringComparator 
* @ClassName: StringComparator  
* @Description: TODO(������һ�仰��������������)  
* @author Gavin  
* @date 2019��5��22��  
*
 */
public class StringComparator implements Comparator<String> {
	private boolean mark;

	public StringComparator() {
	}

	public StringComparator(boolean mark) {
		this.mark = mark;
	}

	// �����ַ���������ĸ��������
	@Override
	public int compare(String o1, String o2) {
		int a = TmPinyinUtil.getPinYinHeadChar(StringUtils.getFirstChar(o1)).toLowerCase().charAt(0);
		int b = TmPinyinUtil.getPinYinHeadChar(StringUtils.getFirstChar(o2)).toLowerCase().charAt(0);
		if (a > b) {
			return mark ? 1 : -1;
		} else if (a < b) {
			return mark ? -1 : 1;
		} else {
			return 0;// ��ͬʱ������
		}
	}

}
