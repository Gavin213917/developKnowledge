package com.gavin.string;


import java.io.File;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;
import java.util.List;
import java.util.Properties;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import sun.misc.BASE64Encoder;

public class StringUtils {
	public static final long ONE_KB = 1024;
	public static final long ONE_MB = ONE_KB * ONE_KB;
	public static final long ONE_GB = ONE_KB * ONE_MB;


	public static String countFileSize(File file) {
		return  countFileSize(file.getAbsolutePath());
	}
	/* [ExmayFileCountSize.java] */
	/**
	 * ͳ���ļ���С
	 *
	 * @param pathname
	 * @return
	 */
	public static String countFileSize(String pathname) {
		String fileSizeString = "";
		try {
			File file = new File(pathname);
			DecimalFormat df = new DecimalFormat("#.00");
			long fileS = file.length();
			if (fileS < 1024) {
				fileSizeString = "0byte";
			} else if (fileS < 1048576) {
				fileSizeString = df.format((double) fileS / 1024) + "KB";
			} else if (fileS < 1073741824) {
				fileSizeString = df
						.format(((double) fileS / 1024 / 1024) - 0.01)
						+ "MB";
			} else {
				fileSizeString = df.format((double) fileS / 1024 / 1024 / 1024)
						+ "G";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return fileSizeString;
	}


	/**
	 * ����File�ļ��ĳ���ͳ���ļ��Ĵ�С
	 *
	 * @param size
	 *            File�ĳ��� file.lenght()
	 * @return �����ļ���С
	 */
	public static String countFileSize(long fileSize) {
		String fileSizeString = "";
		try {
			DecimalFormat df = new DecimalFormat("#.00");
			long fileS = fileSize;
			if (fileS == 0) {
				fileSizeString = "0KB";
			} else if (fileS < 1024) {
				fileSizeString = df.format((double) fileS) + "B";
			} else if (fileS < 1048576) {
				fileSizeString = df.format((double) fileS / 1024) + "KB";
			} else if (fileS < 1073741824) {
				fileSizeString = df
						.format(((double) fileS / 1024 / 1024) - 0.01)
						+ "MB";
			} else {
				fileSizeString = df.format((double) fileS / 1024 / 1024 / 1024)
						+ "G";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return fileSizeString;
	}

	/**
	 * ����File�ļ��ĳ���ͳ���ļ��Ĵ�С
	 *
	 * @param size
	 *            File�ĳ��� file.lenght()
	 * @return �����ļ���С
	 */
	public static String byteCountToDisplaySize(long size) {
		String displaySize;
		if (size / ONE_GB > 0) {
			displaySize = String.valueOf(size / ONE_GB) + " G";
		} else if (size / ONE_MB > 0) {
			displaySize = String.valueOf(size / ONE_MB) + " MB";
		} else if (size / ONE_KB > 0) {
			displaySize = String.valueOf(size / ONE_KB) + " KB";
		} else {
			displaySize = String.valueOf(size) + " bytes";
		}
		return displaySize;
	}

	/**
	 *
	* @Title:isLeapYear
	* @author:Gavin
	* @date: 2019��5��9������3:17:15
	* @Description:�ж��Ƿ�������
	* @param int years
	* @param @return
	* @return boolean
	* @throws
	 */
	public static boolean isLeapYear(int years) {
		return (years % 4 == 0 && years % 100 != 0) || (years % 400 == 0);
	}

	/**
	 * switch ����еı������Ϳ����ǣ� byte��short��int ���� char��
	 * �� Java SE 7 ��ʼ��switch ֧���ַ��� String �����ˣ�ͬʱ case ��ǩ����Ϊ�ַ�����������������
	* @Title:getDays
	* @author:Gavin
	* @date: 2019��5��9������3:23:28
	* @Description: �ж�һ����ĳ�����ж�����
	* @param @param years
	* @param @param month
	* @param @return
	* @return dint
	* @throws
	 */
	public static int getMonthDays(int years,int month) {
		int result = 0;
		switch (month) {
		case 4:
		case 6:
		case 9:
		case 11:
			result = 30;
			break;
		case 2:
			result = isLeapYear(years) ? 29 : 28;
			break;
		default:
			result = 31;
			break;
		}
		return result;
	}


   /**
    * �ж�һ��Ԫ���Ƿ�Ϊ�գ����Ϊ��true ����false
	* @Title:isEmpty
	* @author:Gavin
	* @date: 2019��5��9������5:00:33
	* @Description:
	* @version 1.0
	*
	* String s = "";����ַ�������ֵ�ģ�����ָ��ģ����Ե��÷�����
	* String s = null; ��������Ϊ�ն�������û��ָ��ģ������ܹ����÷��������������ᱨ��ָ���쳣��
	* ���Բ���д��content.equals("")
	*/
	public static boolean isEmpty(String str) {
		return null == str  || str.equals("")
				|| str.matches("\\s*");
	}

	/**
	 * �ַ����ǿ��ж�
	 * @Title:isNotEmpty
	 * @author:Gavin
	 * @date: 2019��5��9������5:02:58
	 * @Description:
	 * @version 1.0
	 */
	public static boolean isNotEmpty(String content){
		return !isEmpty(content);
	}

	/**
	 * �趨Ĭ��ֵ
	 * @Title: defaultValue
	 * @author: Gavin
	 * @time: 2019��7��15�� ����6:50:23
	 * @param content
	 * @param defaultValue
	 * @return
	 * @return: String
	 * @throws
	 */
	public static String defaultValue(String content,String defaultValue){
		if(isEmpty(content)){
			return defaultValue;
		}
		return content;
	}

	/**
	 * �ַ���ת����
	 * @Title:stringToDate
	 * @author:Gavin
	 * @date: 2019��5��9������5:04:36
	 * @Description:
	 * @version 1.0
	 * @throws ParseException
	 */
	public static Date stringToDate(String dateString,String pattern) throws ParseException{
		return new SimpleDateFormat(pattern).parse(dateString);
	}

	/**
	 * ����ת���ַ���
	 * @Title:dateToString
	 * @author:Gavin
	 * @date: 2019��5��9������5:30:24
	 * @Description:
	 * @version 1.0
	 */
	public static String dateToString(Date date,String pattern) throws ParseException{
		return new SimpleDateFormat(pattern).format(date);
	}

	/**
	 * ��һ�����ָ���ʽ����Ϊ�����Ҫ�Ľ����ֻ��������롿<br/>
	 * eg:doubleToString(12.5698,"#.##")===12.57<br/>
	 * eg:doubleToString(12.5698,"0.00")===12.57<br/>
	 * eg:doubleToString(12,"0.00")===12.00<br/>
	 * eg:doubleToString(12,"#.##")===12<br/>
	 * @Title:doubleToString
	 * @author:Gavin
	 * @date: 2019��5��9������5:38:25
	 * @Description:��һ�����ָ���ʽ����Ϊ�����Ҫ�Ľ��
	 * @version 1.0
	 */
	public static String doubleToString(Double num,String pattern) throws ParseException{
		return new DecimalFormat(pattern).format(num);
	}

	/**
	 * �滻�ַ��������еĿո�
	 * @Title:replaceAllTrim
	 * @author:Gavin
	 * @date: 2019��5��9������5:43:57
	 * @Description:
	 * @version 1.0
	 */
	public static String replaceAllTrim(String content){
		return content.replaceAll("\\s*", "");
	}

	/**
	 * �ж�һ���ַ��ǲ�������  ��һ�����İ���2���ֽڣ�
	 * @Title:isChineseChar
	 * @author:Gavin
	 * @date: 2019��5��9������5:56:14
	 * @Description:
	 * @version 1.0
	 */
	public static boolean isChineseChar(char c) {
		try {
			return String.valueOf(c).getBytes("GBK").length>1;
		} catch (Exception e) {
			return false;
		}
	}


	/**
	 * ��ȡ==��z�й� subString("��z�й�",3)===��z<br/>
	 * @Title:subString
	 * @author:Gavin
	 * @date: 2019��5��9������5:57:44
	 * @Description:
	 * @version 1.0
	 */
	public static String subString(String string,int start,int count){
		if(isEmpty(string))return "";
//		int start=0;
		StringBuilder builder = new StringBuilder();
		for (int i = start; i < count; i++) {
			char c=string.charAt(i);
			builder.append(c);
			if(isChineseChar(c)){//�ж�һ���ַ��ǲ��Ǻ���
				--count;
			}
		}
		return builder.toString();
	}

	/**
	 * �Ѵ������ת��Ϊ���Ľ���д��ʽ
	 * @Title:numFormat
	 * @author:Gavin
	 * @date: 2019��5��9������6:32:16
	 * @Description:
	 * @param flag int ��־λ��1 ��ʾת���������֣�2��ʾת��С������
	 * @param s String Ҫת�����ַ���
	 * @return ת���õĴ���λ�����Ľ���д��ʽ
	 * @version 1.0
	 */
	public static String numFormat(String s,int flag) {
		int sLength = s.length();
		// ���Ҵ�д��ʽ
		String bigLetter[] = {"��", "Ҽ", "��", "��", "��", "��", "½", "��", "��", "��"};
		// ���ҵ�λ
		String unit[] = {"Ԫ", "ʰ", "��", "Ǫ", "��",
				// ʰ��λ��Ǫ��λ
				"ʰ", "��", "Ǫ",
				// ��λ������λ
				"��", "ʰ", "��", "Ǫ", "��"};
		String small[] = {"��", "��"};
		// �������ת��������ַ���
		String newS = "";
		// ��λ�滻Ϊ���Ĵ�д��ʽ
		for(int i = 0; i < sLength; i ++) {
			if(flag == 1) {
				// ת����������Ϊ���Ĵ�д��ʽ������λ��
				newS = newS + bigLetter[s.charAt(i) - 48] + unit[sLength - i - 1];
			} else if(flag == 2) {
				// ת��С�����֣�����λ��
				newS = newS + bigLetter[s.charAt(i) - 48] + small[sLength - i - 1];
			}
		}
		return newS;
	}

	/**
	 * ��ȡ�ļ��ĺ�׺
	 * @Title:getExt
	 * @author:Gavin
	 * @date: 2019��5��13������5:50:48
	 * @Description:
	 * @version 1.0
	 */
	public static String getExt(String path){
		if(isEmpty(path))return path;
		//String ext = path.substring(path.lastIndexOf(".")+1,path.length());
		String ext = path.substring(path.lastIndexOf(".")+1);
		return ext;
	}

	/**
	 * ��ȡ���е�ĺ�׺
	 * @Title:getExtPonit
	 * @author:Gavin
	 * @date: 2019��5��13������5:58:19
	 * @Description:
	 * @version 1.0
	 */
	public static String getExtPonit(String path){
		if(isEmpty(path))return path;
		String ext = path.substring(path.lastIndexOf("."));
		return ext;
	}
	/**
	 *
	 * @Title:getFileName
	 * @author:Gavin
	 * @date: 2019��5��13������5:56:26
	 * @Description:��ȡ�ļ���
	 * @version 1.0
	 */
	public static String getFileName(String path){
		if(isEmpty(path))return path;
		String filename = path.substring(path.lastIndexOf("/")+1, path.lastIndexOf("."));
		return filename;
	}

	/**
	 * ��֤�룬�ļ������
	 * @Title:getRandomString
	 * @author:Gavin
	 * @date: 2019��5��13������6:27:40
	 * @Description:TODO
	 * @version 1.0
	 */
	public static String getRandomString(int length) {
		StringBuffer bu = new StringBuffer();
		String[] arr = { "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c",
				"d", "e", "f", "g", "h", "i", "j", "k", "m", "n", "p", "q",
				"r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C",
				"D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "P",
				"Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" };
		Random random = new Random();
		while (bu.length() < length) {
			String temp = arr[random.nextInt(57)];
			if (bu.indexOf(temp) == -1) {
				bu.append(temp);
			}
		}
		return bu.toString();
	}

	/**
	 * ��ȡ����ļ���
	 * @Title:getNewFileName
	 * @author:Gavin
	 * @date: 2019��5��14������9:04:45
	 * @Description:TODO
	 * @version 1.0
	 */
	public static String getNewFileName(String filename){
		return new SimpleDateFormat("yyyyMMddHHmmss").format(new Date())+"_"+getRandomString(5)+getExtPonit(filename);
	}

	/**
	 * �����û�ID��ȡ�ļ������
	 * @Title:getNewFileName
	 * @author:Gavin
	 * @date: 2019��5��14������9:14:28
	 * @Description:TODO
	 * @version 1.0
	 */
	public static String getNewFileName(String filename,Integer userId){
		return new SimpleDateFormat("yyyyMMddHHmmss").format(new Date())+"_"+getRandomString(4)+"_"+userId+getExtPonit(filename);
	}

	/**
	 * MD5����
	 * @Title:md5Base64
	 * @author:Gavin
	 * @date: 2019��5��14������9:22:27
	 * @Description:TODO
	 * @version 1.0
	 */
	public static String md5Base64(String str) {
		try {
			MessageDigest md5 = MessageDigest.getInstance("MD5");
			return base64Encode(md5.digest(str.getBytes()));
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static String base64Encode(byte[] b) {
		if (b == null) {
			return null;
		}
		return new BASE64Encoder().encode(b);
	}

	/**
	 * �����������
	 * @Title:encryption
	 * @author:Gavin
	 * @date: 2019��5��14������9:49:58
	 * @Description:TODO
	 * @version 1.0
	 */
	public static String encryption(String str,int k){
		String string = "";
		for (int i = 0; i < str.length(); i++) {
			char c= str.charAt(i);
			if(c>='a' && c<='z'){
				c += k%26;
				if(c<'a'){
					c+=26;
				}
				if(c>'z'){
					c-=26;
				}
			}else if(c>='A' && c<='Z'){
				c+=k%26;
				if(c<'A'){
					c+=26;
				}
				if(c>'Z'){
					c-=26;
				}
			}
			string+=c;
		}
		return string;
	}

	/**
	 * �����������
	 * @Title:dencryption
	 * @author:Gavin
	 * @date: 2019��5��14������9:50:30
	 * @Description:TODO
	 * @version 1.0
	 */
	public static String dencryption(String str,int n){
		String string = "";
		int k = Integer.parseInt("-"+n);
		for (int i = 0; i < str.length(); i++) {
			char c= str.charAt(i);
			if(c>='a' && c<='z'){
				c += k%26;
				if(c<'a'){
					c+=26;
				}
				if(c>'z'){
					c-=26;
				}
			}else if(c>='A' && c<='Z'){
				c+=k%26;
				if(c<'A'){
					c+=26;
				}
				if(c>'Z'){
					c-=26;
				}
			}
			string+=c;
		}
		return string;
	}

	/**
	 * ���ݺ�׺�ж��ǲ���ͼƬ
	 * @Title:isImage
	 * @author:Gavin
	 * @date: 2019��5��14������10:03:58
	 * @Description:TODO
	 * @version 1.0
	 */
	public static boolean isImage(String ext) {
		return ext.toLowerCase().matches("jpg|gif|bmp|png|jpeg");
	}

	/**
	 * ���ݺ�׺�ж��ǲ���offce�ĵ�
	 * @Title:isDoc
	 * @author:Gavin
	 * @date: 2019��5��14������10:04:34
	 * @Description:TODO
	 * @version 1.0
	 */
	public static boolean isDoc(String ext) {
		return ext.toLowerCase().matches("doc|docx|xls|xlsx|pdf|txt|ppt|pptx");
	}

	/**
	 * ���ݺ�׺�ж��ǲ�����Ƶ
	 * @Title:isVideo
	 * @author:Gavin
	 * @date: 2019��5��14������10:05:06
	 * @Description:TODO
	 * @version 1.0
	 */
	public static boolean isVideo(String ext) {
		return ext.toLowerCase().matches("mp4|flv|mp3");
	}

	/**
	 * �滻��ǩ����λת�����
	 * @Title:htmlEncode
	 * @author:Gavin
	 * @date: 2019��5��14������10:05:56
	 * @Description:TODO
	 * @version 1.0
	 */
	public static String htmlEncode(String txt) {
		if (null != txt) {
			txt = txt.replace("&", "&amp;").replace("&amp;amp;", "&amp;")
					.replace("&amp;quot;", "&quot;").replace("\"", "&quot;")
					.replace("&amp;lt;", "&lt;").replace("<", "&lt;")
					.replace("&amp;gt;", "&gt;").replace(">", "&gt;")
					.replace("&amp;nbsp;", "&nbsp;");
		}
		return txt;
	}

	/**
	 * ������ת����0����
	 * @Title:formatNO
	 * @author:Gavin
	 * @date: 2019��5��14������10:07:00
	 * @Description:str ת��������  length ת���ĳ��ȣ�������0
	 * @version 1.0
	 */
	public static String formatNO(int str, int length) {
		float ver = Float.parseFloat(System
				.getProperty("java.specification.version"));
		String laststr = "";
		if (ver < 1.5) {
			try {
				NumberFormat formater = NumberFormat.getNumberInstance();
				formater.setMinimumIntegerDigits(length);
				laststr = formater.format(str).toString().replace(",", "");
			} catch (Exception e) {
				System.out.println("��ʽ���ַ���ʱ�Ĵ�����Ϣ��" + e.getMessage());
			}
		} else {
			Integer[] arr = new Integer[1];
			arr[0] = new Integer(str);
			laststr = String.format("%0" + length + "d", arr);
		}
		return laststr;
	}

	/**
	 * �ַ�������ת�����ַ���
	 * @Title:arrToString
	 * @author:Gavin
	 * @date: 2019��5��14������10:08:55
	 * @Description:TODO
	 * @version 1.0
	 */
	public static String arrToString(String[] strings, String separtor) {
		StringBuffer buffer = new StringBuffer();
		if (strings != null) {
			for (String string : strings) {
				buffer.append(string + separtor);
			}
			String result = buffer.toString();
			return result.substring(0, result.length() - 1);
		} else {
			return "";
		}
	}

	/**
	 * ����ĸת��Ϊ��д
	 * @Title:toUpperCaseFirst
	 * @author:Gavin
	 * @date: 2019��5��14������10:10:13
	 * @Description:TODO
	 * @version 1.0
	 */
	public static String toUpperCaseFirst(String text) {
		return text.substring(0, 1).toUpperCase() + text.substring(1);
	}

	/**
	 * ����ĸת��ΪСд
	 * @Title:toUpperCaseFirst
	 * @author:Gavin
	 * @date: 2019��5��14������10:10:13
	 * @Description:TODO
	 * @version 1.0
	 */
	public static String toLowerCaseFirst(String text) {
		return text.substring(0, 1).toLowerCase() + text.substring(1);
	}

	/**
	 * �õ����ַ�
	 * @Title:toUpperCaseFirst
	 * @author:Gavin
	 * @date: 2019��5��14������10:10:13
	 * @Description:TODO
	 * @version 1.0
	 */
	public static String getFirstChar(String text) {
		return text.substring(0, 1);
	}

	/**
	 * �ж��Ƿ�Ϊ����
	 * @Title:toUpperCaseFirst
	 * @author:Gavin
	 * @date: 2019��5��14������10:10:13
	 * @Description:TODO
	 * @version 1.0
	 */
	public static boolean isNumeric(String str) {
		Matcher isNum = Pattern.compile("(-|\\+)?[0-9]+(.[0-9]+\\+)?").matcher(
				str);
		return isNum.matches();
	}


	/**
	 * �ж��ַ����Ƿ����������
	 * @Title:toUpperCaseFirst
	 * @author:Gavin
	 * @date: 2019��5��14������10:10:13
	 * @Description:TODO
	 * @version 1.0
	 */
	public static boolean isNumber(String numString) {
		return StringUtils.isNumeric(numString);
	}

	/**
	 * ��֤����
	 * @Title:isEmail
	 * @author:Gavin
	 * @date: 2019��5��14������10:13:13
	 * @Description:TODO
	 * @version 1.0
	 */
	public static boolean isEmail(String email) {
		boolean flag = false;
		try {
			String check = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
			Pattern regex = Pattern.compile(check);
			Matcher matcher = regex.matcher(email);
			flag = matcher.matches();
		} catch (Exception e) {
			flag = false;
		}
		return flag;
	}

	/**
	 * ��֤�ֻ�����
	 * @Title:isMobile
	 * @author:Gavin
	 * @date: 2019��5��14������10:13:38
	 * @Description:TODO
	 * @version 1.0
	 */
	public static boolean isMobile(String mobiles) {
		boolean flag = false;
		try {
			Pattern p = Pattern.compile("^((13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$");
			Matcher m = p.matcher(mobiles);
			flag = m.matches();
		} catch (Exception e) {
			flag = false;
		}
		return flag;
	}

	/**
	 * �����ַ��֤
	 * @Title:isHomepage
	 * @author:Gavin
	 * @date: 2019��5��14������10:15:13
	 * @Description:TODO
	 * @version 1.0
	 */
	public static boolean isHomepage(String str) {
		String regex = "http://(([a-zA-z0-9]|-){1,}\\.){1,}[a-zA-z0-9]{1,}-*";
		return match(regex, str);
	}

	private static boolean match(String regex, String str) {
		Pattern pattern = Pattern.compile(regex);// ��������������ʽ���뵽���и�����־��ģʽ��
		Matcher matcher = pattern.matcher(str);// ģʽ����ƥ���ַ���
		return matcher.matches();
	}

	/**
	 * listToString ����ת���ַ���
	 * @Title:listToString
	 * @author:Gavin
	 * @date: 2019��5��14������10:16:14
	 * @Description:TODO
	 * @version 1.0
	 */
	public static String listToString(List<String> params, String sepator) {
		if (params.size() > 0) {
			StringBuffer buffer = new StringBuffer();
			for (String string : params) {
				buffer.append(string + sepator);
			}
			String result = buffer.toString();
			return result.substring(0, result.length() - 1);
		} else {
			return "";
		}
	}

	/**
	 * ��ȡchar �ַ���Ӧ������
	 * @Title: getCharNumber
	 * @author: Gavin
	 * @time: 2019��7��4�� ����1:41:18
	 * @param string
	 * @return: void
	 * @throws
	 */
	public static void getCharNumber(String string) {
		//String a = "�й��˸�������";
		// ��String�����е�ÿһ���±�λ�Ķ��󱣴���������
		char[] b = string.toCharArray();
		// ת������Ӧ��ASCLL
		for (char c : b) {
			System.out.println(c+"===="+Integer.valueOf(c));
		}
	}

	/**
	 * ���»��ߴ�д��ʽ�������ַ���ת��Ϊ�շ�ʽ�����ת��ǰ���»��ߴ�д��ʽ�������ַ���Ϊ�գ��򷵻ؿ��ַ����� ���磺HELLO_WORLD->HelloWorld
	 *
	 * @param name ת��ǰ���»��ߴ�д��ʽ�������ַ���
	 * @return ת������շ�ʽ�������ַ���
	 */
	public static String convertToCamelCase(String name)
	{
		StringBuilder result = new StringBuilder();
		// ���ټ��
		if (name == null || name.isEmpty())
		{
			// û��Ҫת��
			return "";
		}
		else if (!name.contains("_"))
		{
			// �����»��ߣ���������ĸ��д
			return name.substring(0, 1).toUpperCase() + name.substring(1);
		}
		// ���»��߽�ԭʼ�ַ����ָ�
		String[] camels = name.split("_");
		for (String camel : camels)
		{
			// ����ԭʼ�ַ����п�ͷ����β���»��߻�˫���»���
			if (camel.isEmpty())
			{
				continue;
			}
			// ����ĸ��д
			result.append(camel.substring(0, 1).toUpperCase());
			result.append(camel.substring(1).toLowerCase());
		}
		return result.toString();
	}


	/**
	 * �Ƿ�����ַ���
	 *
	 * @param str ��֤�ַ���
	 * @param strs �ַ�����
	 * @return ��������true
	 */
	public static boolean inStringIgnoreCase(String str, String... strs)
	{
		if (str != null && strs != null)
		{
			for (String s : strs)
			{
				if (str.equalsIgnoreCase(trim(s)))
				{
					return true;
				}
			}
		}
		return false;
	}


	/**
	 * �»���ת�շ�����
	 */
	public static String toUnderScoreCase(String str)
	{
		if (str == null)
		{
			return null;
		}
		StringBuilder sb = new StringBuilder();
		// ǰ���ַ��Ƿ��д
		boolean preCharIsUpperCase = true;
		// ��ǰ�ַ��Ƿ��д
		boolean curreCharIsUpperCase = true;
		// ��һ�ַ��Ƿ��д
		boolean nexteCharIsUpperCase = true;
		for (int i = 0; i < str.length(); i++)
		{
			char c = str.charAt(i);
			if (i > 0)
			{
				preCharIsUpperCase = Character.isUpperCase(str.charAt(i - 1));
			}
			else
			{
				preCharIsUpperCase = false;
			}

			curreCharIsUpperCase = Character.isUpperCase(c);

			if (i < (str.length() - 1))
			{
				nexteCharIsUpperCase = Character.isUpperCase(str.charAt(i + 1));
			}

			if (preCharIsUpperCase && curreCharIsUpperCase && !nexteCharIsUpperCase)
			{
				sb.append(SEPARATOR);
			}
			else if ((i != 0 && !preCharIsUpperCase) && curreCharIsUpperCase)
			{
				sb.append(SEPARATOR);
			}
			sb.append(Character.toLowerCase(c));
		}

		return sb.toString();
	}


	/**
	 * ȥ�ո�
	 */
	public static String trim(String str)
	{
		return (str == null ? "" : str.trim());
	}

	/**
	 * @Author gaoming
	 * @Description //TODO ��ȡuuid
	 * @Date 17:09 2020/10/9
	 * @Param
	 * @return
	 **/
	public static String getUUId() {
		return UUID.randomUUID().toString().replaceAll("-", "").toUpperCase();
	}

	/**
	 * ��ݼ���Ctrl + o �鿴��ǰ�������е����Ժͷ���
	 *        Ctrl + l ��λ��
	 *        Ctrl + f ��ǰ������
	 *        Ctrl + shift + r ȫ������
	 *        ctrl+shift+o--�����
	 * @Title:main
	 * @author:Gavin
	 * @date: 2019��5��9������5:06:05
	 * @Description:���Ժ���
	 * @version 1.0
	 * @throws ParseException
	 */
	public static void main(String[] args) throws ParseException {
		//stringToDate
//		Date date = stringToDate("2018/09/13", "yyyy/MM/dd");
//		System.out.println(date);

		//dateToString
//		String str = dateToString(new Date(), "yyyy/MM/dd HH:mm:ss");
//		System.out.println(str);

		///doubleToString
//		String string = doubleToString(132.4456, "0.000");//132.45
//		System.out.println(string);

		//replaceAllTrim
//		String str = replaceAllTrim("i love you");
//		System.out.println(str);

//		System.out.println(isChineseChar('��'));

//		String str = "�Ґ�ni�Ї�";
//		System.out.println(subString(str,0, 5));//�Ґ�n

		//numFormat ��С������Ҫƴ��
//		String string = numFormat("111", 1);
//		String string2 = numFormat("88", 2);
//		System.out.println(string+string2);

//		String string = getExt("StringUtils.java");
//		System.out.println(string);

//		String string = getNewFileName("gavin.java",3);
//		System.out.println(string);

//		System.out.println(md5Base64("123456"));//�ٶ���MD5���ܼ��ɽ⿪
//		System.out.println(md5Base64("gavin_123456"));//�ٶȽⲻ�����踶�ѣ����μ���
//		System.out.println(md5Base64(md5Base64("123456")));//�ٶȽⲻ�����踶��

//		System.out.println(encryption("abcd", 2));
//		System.out.println(dencryption("cdef", 2));

		//System.out.println(isNumeric("12"));


		//������uuid  ������+ʱ��+ip��ַ+ UUID
//		System.out.println(UUID.randomUUID().toString());
//		System.out.println(UUID.randomUUID().toString());
//		System.out.println(UUID.randomUUID().toString());

		//System---��ȡ����ϵͳ�����һЩ������Ϣ
//		System.out.println(System.getProperty("os.name"));
//		System.out.println(System.getProperty("java.home"));
//		System.out.println(System.getProperty("user.dir"));
//		
//		//ctrl+shift+o--�����
		//Properties properties=System.getProperties();
//		Enumeration<Object> enumeration=properties.elements();
//		while (enumeration.hasMoreElements()) {
//			Object object = (Object) enumeration.nextElement();
//			System.out.println(object);
//		}

//		Properties properties=System.getProperties();
//		Enumeration<?> enumeration= properties.propertyNames();
//		while (enumeration.hasMoreElements()) {
//			Object object = (Object) enumeration.nextElement();
//			System.out.println(object+"====="+System.getProperty(String.valueOf(object)));
//		}
//		

		//RunTime
//		Runtime runtime = Runtime.getRuntime();
//		long max=runtime.maxMemory()/1024/1024;
//		long total=runtime.totalMemory()/1024/1024;
//		long free=runtime.freeMemory()/1024/1024;
//		System.out.println("����ʱ�Ķ���:"+runtime.availableProcessors());
//		System.out.println("����ڴ���"+max);//
//		System.out.println("���е��ڴ���"+free);
//		System.out.println("���ڴ���"+total);
//		System.out.println("ʣ���ڴ��С��"+(max-total+free));


		//Math����---��ѧ--���Ǻ����������ԣ�ƽ��������С���㣬�������� �˷�
//   	Math.toDegrees(hudu)//����ת�ɽǶ�
//		System.out.println(Math.toDegrees(3.14));//�Ƕ�ת�ɻ���
//		System.out.println(Math.toRadians(90));
//		Բ���ܳ�==2��r
//		180 = ��
//		90 =90��/180--ֱ��������
	//����---�Ա�/б��
//	System.out.println(Math.sin(Math.toRadians(30)));
//	System.out.println(Math.sin(Math.toRadians(60)));
//	//����---�ڱ�/б��
//	System.out.println(Math.cos(Math.toRadians(30)));
//	System.out.println(Math.cos(Math.toRadians(60)));
//	
//	//������
//	System.out.println(Math.acos(Math.toRadians(30)));
////	System.out.println(Math.acos(Math.toRadians(60)));
//	//������
//	System.out.println(Math.asin(Math.toRadians(30)));
////	System.out.println(Math.asin(Math.toRadians(60)));
//	
//	//����
//	System.out.println(Math.tan(Math.toRadians(30)));

	//ͨ��--�ַ��� Math
//	double s = 10.7;
//	System.out.println(Math.floor(s));//10.0
//	System.out.println(Math.ceil(s));//11.0
//	
//	
//	//��������--�޷�����С��
//	double c =3.569;
//	System.out.println(Math.round(c));
//	String cstr= new DecimalFormat("#.##").format(c);
//	System.out.println(cstr);
//	
//	//ƽ����
//	System.out.println(Math.sqrt(3));
//	//������
//	System.out.println(Math.cbrt(27));
	//����
//	System.out.println(Math.exp(3));

//	//a��b�η�
//	System.out.println(Math.pow(3, 2));//3*3
//	System.out.println(Math.pow(3, 3));//3*3*3

//	3*3+2*2+1*1 --�׳����
//	3*2*1+2*+1*1	
//	
//	System.out.println(Math.PI);//��--Բ����
//	System.out.println(Math.E);//��Ȼָ��

	//���ֵ ��Сֵ
//	Math.min(12, 1);//1
//	Math.max(12, 1);//12


//	//����ֵ
//	System.out.println(Math.abs(-2));
//	System.out.println(Math.abs(2));


	//java������������--��������
	//byte short int long float double char ��������
	//boolean ����


	//BigDecimal �ڽ�һ��
//	BigDecimal b1= new BigDecimal(1);
//	BigDecimal b2= new BigDecimal(3);
//	BigDecimal b3=b1.add(b2);//���
//	BigDecimal b3=b1.subtract(b2);//���
//	BigDecimal b3=b1.multiply(b2);//���
//	BigDecimal b3=b1.divide(b2,18,BigDecimal.ROUND_HALF_UP);//���
//	System.out.println(b3);

//	System.out.println(1/3d);

	}
}
