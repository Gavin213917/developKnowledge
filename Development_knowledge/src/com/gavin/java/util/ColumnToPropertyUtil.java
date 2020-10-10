package com.gavin.util;
 
public class ColumnToPropertyUtil {
    static char[] a_z = "abcdefghijklmnopqrstwvuxyz".toCharArray();
    static char[] A_Z = "abcdefghijklmnopqrstwvuxyz".toUpperCase().toCharArray();
 
    public static void main(String[] args) {
    	
    	
    	
    	System.out.println(columnToProperty2("user_name"));
    	System.out.println(propertyToColumn("userName"));
    	
//        System.out.println(columnToProperty("a_bb_cc"));
//        System.out.println(columnToProperty2("a_bb_cc"));
//        System.out.println(propertyToColumn("aBbCc"));
    }
    /**
     *@author ���ڴ˿̲���ңԶ
     */
    public static String columnToProperty(String column) {
        if (column == null || column.equals("")) {
            return "";
        }
        StringBuilder sb = new StringBuilder(column.length());
        // ��ǰ���±�
        int i = 0;
        int length = column.length();
        for (int j = 0; j < length; j++) {
            if (column.charAt(j) == '_') {
                // �жϺ����Ƿ���_
                while (column.charAt(++j) == '_') {
                }
                i = j;// i����Ӧ���ַ���Ҫת��Ϊ��д�ַ�
                char c = column.charAt(i);
                if (sb.length() == 0) {
 
                } else {
 
                    for (int k = 0; k < a_z.length; k++) {
 
                        if (a_z[k] == c) {
                            c = A_Z[k];
                            break;
                        }
                    }
                }
 
                sb.append(c);
            } else {
                sb.append(column.charAt(j));
            }
        }
 
        return sb.toString();
    }
    /**
     * @author  wxiaobin
     */
    public static String columnToProperty2(String column) {
        StringBuilder result = new StringBuilder();
        // ���ټ��
        if (column == null || column.isEmpty()) {
            // û��Ҫת��
            return "";
        } else if (!column.contains("_")) {
            // �����»��ߣ���������ĸСд
            return column.substring(0, 1).toLowerCase() + column.substring(1);
        } else {
            // ���»��߽�ԭʼ�ַ����ָ�
            String[] columns = column.split("_");
            for (String columnSplit : columns) {
                // ����ԭʼ�ַ����п�ͷ����β���»��߻�˫���»���
                if (columnSplit.isEmpty()) {
                    continue;
                }
                // �����������շ�Ƭ��
                if (result.length() == 0) {
                    // ��һ���շ�Ƭ�Σ�ȫ����ĸ��Сд
                    result.append(columnSplit.toLowerCase());
                } else {
                    // �������շ�Ƭ�Σ�����ĸ��д
                    result.append(columnSplit.substring(0, 1).toUpperCase()).append(columnSplit.substring(1).toLowerCase());
                }
            }
            return result.toString();
        }
 
    }
     
     
    /**
     * @author ������ӵ�
     * �շ�ת���»��� 
     * ���磺he4lloWorld->he4llo_word 
     */
    public static String propertyToColumn(String property){ 
        if (property == null || property.isEmpty()){
            return ""; 
        } 
        StringBuilder column = new StringBuilder(); 
        column.append(property.substring(0,1).toLowerCase()); 
        for (int i = 1; i < property.length(); i++) { 
            String s = property.substring(i, i + 1); 
            // ��Сд��ĸǰ����»��� 
            if(!Character.isDigit(s.charAt(0)) && s.equals(s.toUpperCase())){ 
                column.append("_"); 
            } 
            // �����ַ�ֱ��ת��Сд 
            column.append(s.toLowerCase()); 
        } 
          
        return column.toString(); 
    } 
 
}