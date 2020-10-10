package com.gavin.util;

import com.gavin.bean.User;

class Hello  
{  
    public String str = "Hello World";  
    public void fun()  
    {  
        System.out.println(str);  
    }  
}  
  
public class ClassLoaderMainUtil  
{  
    public static void main(String[] args)  
    {  
        Hello hello = new Hello();  
        hello.fun();  
          
        System.out.println("----------------------");  
          
        //Hello����������  
        ClassLoader classLoaderOfHello = Hello.class.getClassLoader();  
          
        System.out.println("Hello is Loaded by : "+classLoaderOfHello);  
          
        System.out.println("----------------------");  
          
        //Hello������������Class����  
        Class AppClazz = classLoaderOfHello.getClass();  
          
        //����Hello������������Class�������̳й�ϵ  
        while(AppClazz != null)  
        {  
            System.out.println(AppClazz);  
              
            AppClazz = AppClazz.getSuperclass();  
        }  
          
        System.out.println("----------------------");  
          
        //ȡ����չ���������������Class  
        Class ExtClazz = classLoaderOfHello.getParent().getClass();  
          
        while(ExtClazz != null)  
        {  
            System.out.println(ExtClazz);  
              
            ExtClazz = ExtClazz.getSuperclass();  
        }  
    }  
    
    /*
         * һ����ļ��ع���
     * Hello World
		----------------------
		Hello is Loaded by : sun.misc.Launcher$AppClassLoader@4e0e2f2a
		----------------------
		class sun.misc.Launcher$AppClassLoader
		class java.net.URLClassLoader
		class java.security.SecureClassLoader
		class java.lang.ClassLoader
		class java.lang.Object
		----------------------
		class sun.misc.Launcher$ExtClassLoader
		class java.net.URLClassLoader
		class java.security.SecureClassLoader
		class java.lang.ClassLoader
		class java.lang.Object

     */
    
    
}  