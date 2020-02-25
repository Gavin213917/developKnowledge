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
public class TzDaoException extends Exception{

    public TzDaoException() {
        super();
    }

    public TzDaoException(String message) {
        super("TzServiceException==>"+message);
    }
    
    
    public void writerFile(String message){
    	try {
    		String ymd = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
			FileUtils.write(new File("d://log-"+ymd+".txt"),message, "utf-8", true);
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
    
    public void writerFile(String message,Class clz,String method){
    	try {
    		String ymd = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
			FileUtils.write(new File("d://log-"+ymd+".txt"),clz.getName()+"===��"+method+"���쳣��Ϣ�ǣ�"+message, "utf-8", true);
		} catch (IOException e) {
			e.printStackTrace();
		}
    }

    public TzDaoException(String message, Throwable cause) {
        super(message, cause);
    }

    public TzDaoException(Throwable cause) {
        super(cause);
    }
}
