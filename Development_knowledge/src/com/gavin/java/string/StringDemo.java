package com.gavin.string;

public class StringDemo {
	public static void main(String[] args) {

		// String==�ַ�������,��������һ�������ַ�����ʽ���ַ������������ڱ����ʱ���ȷ����
		// ���Ǳ���׶λ���һ�Σ��Ƿ���ڡ�---��Ϊ�ַ��������ڴ��ı����ͣ�
		// �洢�ڣ��ַ���������

		// String str = "����keke";
		// String str1 = "����keke";
		// str1 = "�Ұ���";
		// System.out.println(str==str1);

		// String string = "����keke";
		// String string2 = string;
		// System.out.println(string==string2);
		// System.out.println(string);
		// System.out.println(string2);

		// ������������---�ַ�������������Ĳ��ܻ��գ�����������ͨ�����潲���StringBuffer��StringBuilderȥ�����
//		String str1 = "����keke";
//		String str2 = "����" + "ke" + "ke";
//		System.out.println(str1 == str2);// true

		// final String str3 = "����";//�����
		// final String str4 = "keke";
		// final String str5 = str3+str4;

		// System.out.println(str1==str5);//false

		// JDK���淢��--StringBuffer���̰߳�ȫ����StringBuilderר��ΪString��ȱ������һ���ֲ�
		// ������һ��append����ȥ��̬׷���ַ���

		// StringBuffer buffer = new StringBuffer();//���ٿռ�---��װsql��ʱ��������
//		StringBuilder builder = new StringBuilder();
//		builder.append("select * from ").append(" tablename ");
//		builder.append(" where 1=1 ");
//		builder.append(" and username='keke' ");
//		builder.append(" and password='123456' ");
		// ����toStringת���ַ��������ַ��������ַ����������У��洢��ʹ��
		//String string = builder.toString();
		// ʹ�����֮����ĳһ���׶λ�jvm gc���л���
		//System.out.println(string);

		// StringBuilder ���Ƿ��̰߳�ȫ�ģ�==�Ƽ����� StringBuffer���̰߳�ȫ�ġ�

		// ����һ����ҵ���˽��ַ�����api����---API����jdk�ṩ�˺ܶ��װ�õ��ֳ�һЩҵ��������ṩ���򿪷���ʹ�á�
		//String string2 = "       	 �Ұ���520     "; // ��ʵ��һ��������char[]����
		// char[] args = ['��','��','��','5','2','0'] args.length
		//System.out.println(string2.length());
		// ���õ�api����
		// subString ��ȡ
		// replace ���滻
		// replaceAll:ȫ�滻
		// split:�ָ�
		// indexOf ���� (�������Ҳ���) ���û�ҵ� ����-1
		// lastIndexOf ���� (�����������) ���û�ҵ� ����-1

		// ȥ�����ҿո� :trim()
		//System.out.println(string2.trim());
		//System.out.println("====================");

		// char֮��ת��--
		// charAt(index)---���ص���char
		// toCharArray() ת��char[] 

		// ƥ��ģ�
		// startWidth
		// contains
		// endWidth

		// ת��Сд

		// �����κεģ������������ȣ����ң�����,�����һ���������й�ϵ
		// ����Ԫ�ص������ڳ������涼�Ǵ�0��ʼ��ֻ��һ���ط���1,δ���ڽ�
//		String str = "����keke��ʦ,����30�꣬30�Ժ��Ҿ͹�����...";
//
//		System.out.println("����:" + str.length());
//		System.out.println("��һ���ַ�:" + str.charAt(0));
//		System.out.println("�ڶ����ַ�:" + str.charAt(1));
//		System.out.println("���һ���ַ�:" + str.charAt(str.length() - 1));
		// char[] cs = str.toCharArray();---��ǰ���ͳ���ַ�������ĸ�ж��٣��������ٸ�
		// System.out.println(cs);

		// javascript �� javaд������һ��һ����ֻ����java��javascript�ṩ���ӷḻ����
		// �����java�ַ����Ĵ�������ֱ���õ�javascriptȥʹ��
//		System.out.println("תСд:" + str.toLowerCase());// תСд
//		System.out.println("ת��д��" + str.toUpperCase());// ת��д
//
//		System.out.println("====================�滻�Ͳ���=======================");
//		String str4 = str.replace("30", "20");// ����һ������
//		System.out.println(str4);

		// ����--�ҵ�Ԫ�ص�����---�ж�һ��Ԫ���ǲ����ڵ�ǰ�ַ�����,
		// keke��������༶����û�У�����ڣ�������ı�ţ���Ҫȥ���ݵ����Ų�ѯ�ɼ����������
		
		// indexOf ���ж�һ���ؼ����Ƿ��ڵ�ǰ�ַ����У�������ڷ���������λ�ã���������ڷ���-1 ===�������ұ߲���
		// indexOf(String) ������ҵ����ص�һ��Ԫ�ص�����λ�ã����û���ҵ�����-1 0��ʼ��.
		
		// indexOf(String,startIndex),startIndex����Ԫ�ش��ĸ�λ�ÿ�ʼ�ҡ�
		// int index = str.indexOf("30",12);
		// System.out.println("�ҵ�ǰ��λ������:"+index);
		// if(index!=-1){
		// System.out.println("�����Ұ༶������ˣ���ĳɼ���:96��");
		// }else{
		// System.out.println("û���ҵ���ѧ��!!!");
		// }

		// lastIndexOf ���ж�һ���ؼ����Ƿ��ڵ�ǰ�ַ����У�������ڷ���������λ�ã���������ڷ���-1 === ��������߲���
		// lastIndexOf(String) �������ұ߲��ң�����ҵ����ص�һ��Ԫ�ص�����λ�ã����û���ҵ�����-1 0��ʼ��.
		// lastIndexOf(String,startIndex),startIndex����Ԫ�ش��ĸ�λ�ÿ�ʼ��ǰ��ѯ�����Ǿ���������
		
//		String str8 = "����keke��ʦ,����30�꣬30�Ժ��Ҿ͹�����30...o";
//		int index = str8.lastIndexOf("30");
//		System.out.println("==�ҵ�ǰ��λ������:" + index);
//		if (index != -1) {
//			System.out.println("�����Ұ༶������ˣ���ĳɼ���:96��");
//		} else {
//			System.out.println("û���ҵ���ѧ��!!!");
//		}
//
//		System.out.println("=====================�滻 replace replaceAll=======================");

		// String str9="����keke��ʦ,����300�꣬30�Ժ��Ҿ͹�����30...o";
		// String str10 = str9.replace("30", "20");
		// System.out.println(str10);
		//
		// String str11 = str9.replaceAll("(\\d){3}", "20");
		// System.out.println(str11);

//		String url = "http://www.baidu.com";
//		System.out.println(url.startsWith("http://"));
//		System.out.println(url.endsWith("com"));
//		System.out.println(url.contains("bais"));
//
		String bank = " ";
		System.out.println(bank.isEmpty());
		System.out.println(bank.trim().isEmpty());

		// String name = null ;
		// System.out.println(name.charAt(0));//Exception in thread "main"
		// java.lang.NullPointerException

		// �ָ�
//		String str12 = "keke��xiaobai��shubiao";
//		String[] names = str12.split("��");
//		for (String string3 : names) {
//			System.out.println(string3);
//		}

		// substring

		// ���Դ�Сд�ĶԱ� eqauls
//		String str14 = "abc";
//		String str15 = "ABC";
		// System.out.println(str14.toLowerCase().equals(str15.toLowerCase()));
		//System.out.println(str14.equalsIgnoreCase(str15));

		// substring--static
//		char[] cs = { '��', '��', '��' };
//		String string4 = String.copyValueOf(cs);
//		System.out.println(string4);

		// subString es7
//		String teString = String.format("�Ұ���%s%s", "keke", "zhangsan");
//		System.out.println("teString----"+teString);

		// subString
		//String string3 = "0123456789";
		// string3.substring(beginIndex) ��ȡ�����---substring(begin,length-1);
		// string3.substring(beginIndex, endIndex)//��ͷ����β

//		System.out.println(string3.substring(2));
//		System.out.println(string3.substring(2, 4));

	}

}
