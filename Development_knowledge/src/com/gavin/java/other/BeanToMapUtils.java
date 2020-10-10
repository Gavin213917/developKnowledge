package com.gavin.other;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.converters.DateConverter;
import org.apache.struts2.json.JSONException;
import org.apache.struts2.json.JSONUtil;

import net.sf.json.util.JSONUtils;


/**
 * 
 * 
 * BeanToMapUtils<br/>
 * ������:xuchengfei<br/>
 * ʱ�䣺2016��5��26��-����9:27:11 <br/>
 * 
 * @version 1.0.0<br/>
 *
 */
public class BeanToMapUtils {
	
	 /** 
     *  
     *  
     * Mapת����Bean��ʹ�÷�����ȥ������ת�����鷳�� 
     * @param <T> 
     * @param map   
     * @param class1 
     * @return 
     */  
    public static <T> T map2Bean(Map<String, String> map, Class<T> class1) {  
        T bean = null;  
        try {  
            bean = class1.newInstance();  
            BeanUtils.populate(bean, map);  
        } catch (InstantiationException e) {  
            e.printStackTrace();  
        } catch (IllegalAccessException e) {  
            e.printStackTrace();  
        } catch (InvocationTargetException e) {  
            e.printStackTrace();  
        }  
        return bean;  
    }  

	public static void main(String[] args) {
		try {
			Person person = new Person();
			person.setId(1);
			person.setUsername("�ɿ�");
			person.setBirthday(new Date());
			person.setAge(30);
			person.setAddress("�����Lɳ");
			//Bean--->Map
			ConvertUtils.register(new KeKeDateConverter(), java.util.Date.class);  
			ConvertUtils.register(new KeKeDateConverter(), java.lang.String.class);  
			Map<String, String> map = BeanUtils.describe(person);//���и�ʽ��--long /2015-12-12 12:12
			System.out.println(map);
			map.put("username", "С����");
			//Map-Bean
			Person person2 = map2Bean(map, Person.class);
			System.out.println(person2.getUsername());
			System.out.println(person2.getBirthday());
			
			//bean--json
			String jsonString = JSONUtil.serialize(person);
			System.out.println(jsonString);
		} catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
			e.printStackTrace();
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		
		//json---map---bean--xml
		//json-lib.jar
		//G:\Java��������Ƶ\Java����\json\json-lib-2.4-jdk15.jar �ȸ� 
		//G:\Java��������Ƶ\Java����\json\xstream-1.4.8.jar
		//G:\Java��������Ƶ\Java����\json\struts2-json-plugin-2.3.15.1.jar
		//fastjson gjson�ܶ�
	}

}

