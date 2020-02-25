package com.gavin.socket.chat.net;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;

import sun.management.counter.Variability;

public class URLDemo2 {

	
	
	
	/**
	 * ģ��ʵ�������Get������
	 * ��������sendGet<br/>
	 * �����ˣ�xuchengfei <br/>
	 * ʱ�䣺2016��5��21��-����10:37:42 <br/>
	 * �ֻ�:1564545646464<br/>
	 * @return String<br/>
	 * @exception <br/>
	 * @since  1.0.0<br/>
	 */
	public static String sendGet(String url,String params){
		String urlName = url+"?"+params;
		System.out.println(urlName);
		StringBuilder stringBuilder = new StringBuilder();
		try {
			//����һ��URL
			URL neturl = new URL(urlName);
			//��URL֮�������
			URLConnection connection = neturl.openConnection();
			//����ͨ�õ���ͷ��Ϣ--ģ��һ������ͷ--ȥ��������Դ
			connection.setRequestProperty("accept", "*/*");
			connection.setRequestProperty("connection", "Keep-Alive");
			connection.setRequestProperty("user-agent", "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/50.0.2661.102 Safari/537.36");
			connection.setConnectTimeout(2000);//���ӵȴ���ʱ��
			connection.setReadTimeout(2000);//
			
//			setConnectTimeout����������������ʱ����λ�����룩
//			setReadTimeout�����ô�������ȡ���ݳ�ʱ����λ�����룩
			//��������
			connection.connect();
			
			//��ȡ��Ӧͷ����Ϣ
//			Map<String, List<String>> map = connection.getHeaderFields();
//			for(Map.Entry<String, List<String>> enter:map.entrySet()){
//				System.out.println(enter.getKey()+"==="+enter.getValue());
//			}
			
			
			System.out.println("getContent===="+connection.getContent());
			System.out.println("getContentEncoding===="+connection.getContentEncoding());
			System.out.println("getContentLength===="+connection.getContentLength());//�����ļ����ܴ�С
			System.out.println("getExpiration===="+connection.getExpiration());
			System.out.println("getLastModified===="+connection.getLastModified());
			
			try (
					BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream(),"utf-8"));
			){
				String content = null;
				while((content=reader.readLine())!=null){
					stringBuilder.append(content+"\r\n");
				}
			} catch (Exception e) {
			}
			return stringBuilder.toString();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
	
	
	
	/**
	 * ģ��ʵ�������Post������
	 * ��������sendGet<br/>
	 * �����ˣ�xuchengfei <br/>
	 * ʱ�䣺2016��5��21��-����10:37:42 <br/>
	 * �ֻ�:1564545646464<br/>
	 * @return String<br/>
	 * @exception <br/>
	 * @since  1.0.0<br/>
	 */
	public static String sendPost(String url,String params){
		StringBuilder stringBuilder = new StringBuilder();
		try {
			//����һ��URL
			URL neturl = new URL(url);
			//��URL֮�������
			URLConnection connection = neturl.openConnection();
			//����ͨ�õ���ͷ��Ϣ--ģ��һ������ͷ--ȥ��������Դ
			connection.setRequestProperty("accept", "*/*");
			connection.setRequestProperty("connection", "Keep-Alive");
			connection.setRequestProperty("user-agent", "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/50.0.2661.102 Safari/537.36");
			//����post����Ĵ���
			connection.setDoOutput(true);
			connection.setDoInput(true);
			
		
			try ( 
				PrintWriter out = new PrintWriter(new OutputStreamWriter(connection.getOutputStream(),"UTF-8"));
			){
				out.print(params);
				out.flush();
			} catch (Exception e) {
			}
			
			//��ȡ��Ӧͷ����Ϣ
//			Map<String, List<String>> map = connection.getHeaderFields();
//			for(Map.Entry<String, List<String>> enter:map.entrySet()){
//				System.out.println(enter.getKey()+"==="+enter.getValue());
//			}
			
			System.out.println("getContent===="+connection.getContent());
			System.out.println("getContentEncoding===="+connection.getContentEncoding());
			System.out.println("getContentLength===="+connection.getContentLength());//�����ļ����ܴ�С
			System.out.println("getExpiration===="+connection.getExpiration());
			System.out.println("getLastModified===="+connection.getLastModified());
			
			try (
				BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream(),"utf-8"));
			){
				String content = null;
				while((content=reader.readLine())!=null){
					stringBuilder.append(content+"\r\n");
				}
			} catch (Exception e) {
			}
			return stringBuilder.toString();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
	
	
	
	public static void main(String[] args) throws UnsupportedEncodingException {
		
		String link = "http://localhost/Login/login";
		String vString = URLEncoder.encode(URLEncoder.encode("Ϊˮ���","utf-8"),"utf-8");
		String params = "username=keke&password=123456&message="+vString;
		String source = sendGet(link, params);
//		String source = sendPost(link, "username=keke&password=123456&message=Ϊˮ���");
		System.out.println(source);
		
		
		System.out.println(URLDecoder.decode("%E4%B8%BA%E6%B0%B4%E7%94%B5%E8%B4%B9", "utf-8"));
		System.out.println(URLDecoder.decode("�Ұ���", "utf-8"));
			
	}
}
