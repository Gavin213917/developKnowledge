package com.gavin.socket;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.gavin.string.StringUtils;



public class TZDownloadUtil {
	
	/**
	 * ץȡ��ҳԴ����
	 * ��������getHtmlSource<br/>
	 * �����ˣ�xuchengfei <br/>
	 * ʱ�䣺2016��5��19��-����11:34:33 <br/>
	 * �ֻ�:1564545646464<br/>
	 * @param link
	 * @return String<br/>
	 * @exception <br/>
	 * @since  1.0.0<br/>
	 */
	public static String getHtmlSource(String link){
		try {
			//��һ������ʼ����URL����
			URL url =new URL(link);
			//�ڶ�������ȡ��URL��java����֮������
			HttpURLConnection connection = (HttpURLConnection)url.openConnection();
			//connection.setConnectTimeout(6000);//6��֮�����û����Ӧ���˴��������,������趨��һ�µȴ�
			//αװ������ķ�ʽȥץȡ������Ϣ
			connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/50.0.2661.102 Safari/537.36");
			//��ȡ��ҳ�ı���
			String encoding = StringUtils.defaultValue(connection.getContentEncoding(),"utf-8");
			System.out.println(encoding);
			//������:ͨ��IO��������InputStream
			StringBuilder builder = new StringBuilder();
			try (
				//�ֽ���
				InputStream inputStream = connection.getInputStream();
				//�ַ���
				InputStreamReader isr = new InputStreamReader(inputStream,encoding);
				//������
				BufferedReader reader = new BufferedReader(isr);
			){
				String line = "";
				while((line=reader.readLine())!=null){
					builder.append(line+"\r\n");
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			return builder.toString();
			//���Ĳ�����ʼ��ȡ
		} catch (Exception e) {
			e.printStackTrace();
			return "";
		}
	}
	
	/**
	 * ����������Դ�ļ�
	 * ��������downloadFile<br/>
	 * �����ˣ�xuchengfei <br/>
	 * ʱ�䣺2016��5��19��-����11:34:14 <br/>
	 * �ֻ�:1564545646464<br/>
	 * @param linkFile
	 * @param path void<br/>
	 * @exception <br/>
	 * @since  1.0.0<br/>
	 */
	public static void downloadFile(String linkFile,String path){
		try {
			//��һ������ʼ����URL����
			URL url =new URL(linkFile);
			//�ڶ�������ȡ��URL��java����֮������
			HttpURLConnection connection = (HttpURLConnection)url.openConnection();
			//connection.setConnectTimeout(6000);//6��֮�����û����Ӧ���˴��������,������趨��һ�µȴ�
			//αװ������ķ�ʽȥץȡ������Ϣ
			connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/50.0.2661.102 Safari/537.36");
			//��ȡ��ҳ�ı���
			String encoding = StringUtils.defaultValue(connection.getContentEncoding(),"utf-8");
			System.out.println(encoding);
			//������:ͨ��IO��������InputStream
//			System.out.println(connection.getContentLengthLong());
//			System.out.println(connection.getContentType());
//			System.out.println(connection.getResponseMessage());
//			System.out.println(connection.getDate());
//			System.out.println(connection.getFileNameMap());
//			System.out.println(connection.getRequestMethod());
//			System.out.println(connection.getContentLength());
			
			String name = linkFile.substring(linkFile.lastIndexOf("/")+1);
			//��������Ŀ¼
			File file = new File(path);
			//����ļ��в����ڣ��ʹ���
			if(!file.exists())file.mkdirs();
			//���뵽Ŀ���ļ�
			File filename = new File(file,name);	
			try (
				//�ֽ���
				InputStream inputStream = connection.getInputStream();
				FileOutputStream outputStream = new FileOutputStream(filename)
			){
				byte[] b = new byte[2048];
				int len = 0;
				while((len=inputStream.read(b))!=-1){
					outputStream.write(b, 0, len);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			//���Ĳ�����ʼ��ȡ
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
		
		
//		TCP UDP���� Socket��SocketAddress. RMIService --java.io.searialize
		
		//===>������Դ����/��ҳ���Ϊ/ģ���ļ��ϴ�/��̬��/spider(����֩��)
		
		
//		String link = "http://www.luoo.net/";
//		String htmlsource = getHtmlSource(link);
//		try {
//			FileUtils.writeStringToFile(new File("d://luooindex.html"), htmlsource, "utf-8");
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		//���� jsoup htmlparser����ȡ��ҳԴ���е�ͼƬ��ַ---������������
//		String url = "http://7xkszy.com2.z0.glb.qiniucdn.com/pics/vol/573b56cd3e387.jpg";
		
		
		for(int j=818;j<=821;j++){
			for(int i=1;i<=12;i++){
				try {
					String name = i+"";
					if(i<10)name = "0"+i;
					String url = "http://luoo-mp3.kssws.ks-cdn.com/low/luoo/radio"+j+"/"+name+".mp3";
					downloadFile(url,"d://download/radio"+j);
				} catch (Exception e) {
					continue;
				}
			}
		}
	}
}
