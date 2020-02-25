package com.gavin.exception.controller;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;

/**
 * 
 * �ڳ������У��쳣���� struts2
 * TzServiceException<br/>
 * ������:xuchengfei<br/>
 * ʱ�䣺2016��5��19��-����9:37:55 <br/>
 * @version 1.0.0<br/>
 *
 */
public class TzServiceException extends Exception{
	
	//TzServiceException����checked exeption,����һ��Ҫ��

    /**
	 * serialVersionUID:TODO����һ�仰�������������ʾʲô��
	 * @since 1.0.0
	 */
	
	private static final long serialVersionUID = 1L;

	public TzServiceException() {
        super();
    }
	
	
    public TzServiceException(String message) {
        super("TzServiceException==>"+message);
    	try {
    		String ymd = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
			FileUtils.write(new File("d://log-"+ymd+".txt"),message, "utf-8", true);
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
    
    
    
    public  TzServiceException(String message,Class clz,String method){
    	super(message);
    	try {
    		String ymd = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
			FileUtils.write(new File("d://log-"+ymd+".txt"),clz.getName()+"===��"+method+"���쳣��Ϣ�ǣ�"+message+"\r\n", "utf-8", true);
		} catch (IOException e) {
			e.printStackTrace();
		}
    }

    public TzServiceException(String message, Throwable cause) {
        super(message, cause);
    }

    public TzServiceException(Throwable cause) {
        super(cause);
    }
}
