package com.gavin.string;

import java.util.ArrayList;
import java.util.List;

public class StringSort {

	public static void main(String[] args) {
		List<String> classrooms = new ArrayList<>();
		classrooms.add("�첽 Y");//0
		classrooms.add("eden E ");//1
		classrooms.add("Ŭ�� N ");//2
		classrooms.add("���� A ");//3
		classrooms.add("�򵥾����� J ");//4
		classrooms.add("��˧ D ");//5
		classrooms.add("jamie J ");//6
		classrooms.add("�� R ");//7
		classrooms.add("Boolean B ");//8
		classrooms.add("С���� X ");//9
		classrooms.add("���� M ");//10
		

		//replaceAll
//		classrooms.sort(new Comparator<String>() {
//			//�����ַ���������ĸ��������
//			@Override
//			public int compare(String o1, String o2) {
//				int a=TmPinyinUtil.getPinYinHeadChar(StringUtils.getFirstChar(o1)).toLowerCase().charAt(0);
//				int b=TmPinyinUtil.getPinYinHeadChar(StringUtils.getFirstChar(o2)).toLowerCase().charAt(0);
//				if(a>b){
//					return 1;
//				}else if(a<b){
//					return -1;
//				}else{
//					return 0;
//				}
//			}
//		});
		
		classrooms.sort(new StringComparator());
		
		for (String num : classrooms) {
			System.out.println("===="+num);
		}

	}

}
