package com.gavin.reflect.fanshe.application;


import java.lang.reflect.Method;
import java.util.ArrayList;

/*
 * ͨ������Խ�����ͼ��
 * 
 * ���䷽��������ʹ��֮��ͨ������Խ�����ͼ��
 * 
 * �������ڱ����ڣ���������Ͳ�������ʧ�����������ǿ���ͨ������Խ�����ͼ���
 * 
 * ���磺��һ��String���͵ļ��ϣ���������������������һ��Integer���͵�ֵ��
 */
public class Demo2 {
    public static void main(String[] args) throws Exception{
        ArrayList<String> strList = new ArrayList<>();
        strList.add("aaa");
        strList.add("bbb");

    //  strList.add(100);
        //��ȡArrayList��Class���󣬷���ĵ���add()�������������
        Class listClass = strList.getClass(); //�õ� strList ������ֽ��� ����
        //��ȡadd()����
        Method m = listClass.getMethod("add", Object.class);
        //����add()����
        m.invoke(strList, 100);

        //��������
        for(Object obj : strList){
            System.out.println(obj);
        }
    }
}
