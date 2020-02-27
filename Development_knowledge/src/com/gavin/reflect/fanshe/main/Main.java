package com.gavin.reflect.fanshe.main;

import java.lang.reflect.Method;

/**
 * ��ȡStudent���main��������Ҫ�뵱ǰ��main���������
 */
public class Main {

    public static void main(String[] args) {
        try {
            //1����ȡStudent������ֽ���
            Class clazz = Class.forName("com.gavin.reflect.fanshe.main.Student");

            //2����ȡmain����
             Method methodMain = clazz.getMethod("main", String[].class);//��һ���������������ƣ��ڶ��������������βε����ͣ�
            //3������main����
            // methodMain.invoke(null, new String[]{"a","b","c"});
             //��һ���������������ͣ���Ϊ������static��̬�ģ�����Ϊnull���ԣ��ڶ���������String���飬����Ҫע����jdk1.4ʱ�����飬jdk1.5֮���ǿɱ����
             //������ʱ��  new String[]{"a","b","c"} ���3�����󡣡���������Ҫ����ǿת��
             methodMain.invoke(null, (Object)new String[]{"a","b","c"});//��ʽһ
            // methodMain.invoke(null, new Object[]{new String[]{"a","b","c"}});//��ʽ��

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}