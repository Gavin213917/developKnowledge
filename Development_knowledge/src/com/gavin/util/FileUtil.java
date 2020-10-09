package com.gavin.util;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.List;

import com.gavin.string.StringUtils;


public class FileUtil {

	
	private static List<File> files = new ArrayList<>();
	/**
	  * �ݹ��ȡĿ¼�����е��ļ���Ϣ
	 * @Title: listFiles 
	 * @author: Gavin
	 * @time: 2019��7��2�� ����5:42:51
	 * @param directory
	 * @return 
	 * @return: List<File> 
	 * @throws
	 */
	public static List<File> listFiles(File directory){
		File[] files2 = directory.listFiles();
		for (File file : files2) {
			if(file.isFile()){
				files.add(file);
			}
			if(file.isDirectory()){//�����Ŀ¼�����������Լ�
//				files.add(file);
				listFiles(file);
			}
		}
		
		return files;
	}
	
	
	/**
	  * �ݹ��ȡĿ¼�����д���׺���ļ���Ϣ
	 * @Title: listFiles 
	 * @author: Gavin
	 * @time: 2019��7��2�� ����5:43:09
	 * @param directory
	 * @param filterDirectory
	 * @param suffix
	 * @return 
	 * @return: List<File> 
	 * @throws
	 */
	public static List<File> listFiles(File directory,String filterDirectory,String suffix){
		File[] files2 = directory.listFiles(new FilenameFilter() {//����filterDirectoryĿ¼����ô���׺suffix���ļ�����Ϣ
			@Override
			public boolean accept(File dir, String name) {
				if(StringUtils.isNotEmpty(filterDirectory)){
					return !name.equals(filterDirectory);
				}else{
					return true;
				}
			}
		});
		for (File file : files2) {
			if(file.isFile()){
				if(suffix!=null && file.getName().endsWith(suffix)){
					files.add(file);
				}
				
				if(suffix==null){
					files.add(file);
				}
			}
			if(file.isDirectory()){//�����Ŀ¼�����������Լ�
//				files.add(file);
				listFiles(file,filterDirectory,suffix);
			}
		}
		
		return files;
	}
	/**
	 * �ݹ��ȡĿ¼�����е��ļ���Ϣ
	 * @Title: listFiles 
	 * @author: Gavin
	 * @time: 2019��7��2�� ����5:43:30
	 * @param files
	 * @param directory
	 * @return 
	 * @return: List<File> 
	 * @throws
	 */
	public static List<File> listFiles(List<File> files,File directory){
		File[] files2 = directory.listFiles();
		for (File file : files2) {
			if(file.isFile()){
				files.add(file);
			}
			if(file.isDirectory()){//�����Ŀ¼��
				listFiles(files,file);
			}
		}
		
		return files;
	}
	
	/**
	 * 
	 * @Title: listFiles 
	 * @author: Gavin
	 * @time: 2019��7��2�� ����5:43:46
	 * @param directory
	 * @return 
	 * @return: List<File> 
	 * @throws
	 */
	public static List<File> listFiles(String directory){
		return listFiles(new File(directory));
	}

	/**
	 * @Author gaoming
	 * @Description  TODO ͼƬתbyte����
	 * @Date 16:58 2020/10/9
	 * @Param [path]
	 * @return byte[]
	 **/
	public byte[] image2byte(String path){
		byte[] data = null;
		FileImageInputStream input = null;
		try {
			input = new FileImageInputStream(new File(path));
			ByteArrayOutputStream output = new ByteArrayOutputStream();
			byte[] buf = new byte[1024];
			int numBytesRead = 0;
			while ((numBytesRead = input.read(buf)) != -1) {
				output.write(buf, 0, numBytesRead);
			}
			data = output.toByteArray();
			output.close();
			input.close();
		}
		catch (FileNotFoundException ex1) {
			ex1.printStackTrace();
		}
		catch (IOException ex1) {
			ex1.printStackTrace();
		}
		return data;
	}
	/**
	 * @Author gaoming
	 * @Description //TODO byte���鵽ͼƬ
	 * @Date 16:59 2020/10/9
	 * @Param [data, path]
	 * @return void
	 **/
	public void byte2image(byte[] data,String path){
		if(data.length<3||path.equals("")) return;
		try{
			FileImageOutputStream imageOutput = new FileImageOutputStream(new File(path));
			imageOutput.write(data, 0, data.length);
			imageOutput.close();
			System.out.println("Make Picture success,Please find image in " + path);
		} catch(Exception ex) {
			System.out.println("Exception: " + ex);
			ex.printStackTrace();
		}
	}

	/**
	 * @Author gaoming
	 * @Description //TODO byte���鵽16�����ַ���
	 * @Date 16:59 2020/10/9
	 * @Param [data]
	 * @return String
	 **/
	public String byte2string(byte[] data){
		if(data==null||data.length<=1) return "0x";
		if(data.length>200000) return "0x";
		StringBuffer sb = new StringBuffer();
		int buf[] = new int[data.length];
		//byte����ת����ʮ����
		for(int k=0;k<data.length;k++){
			buf[k] = data[k]<0?(data[k]+256):(data[k]);
		}
		//ʮ����ת����ʮ������
		for(int k=0;k<buf.length;k++){
			if(buf[k]<16) sb.append("0"+Integer.toHexString(buf[k]));
			else sb.append(Integer.toHexString(buf[k]));
		}
		return "0x"+sb.toString().toUpperCase();
	}

	/**
	 * �ж�ָ�����ļ����ļ���ɾ���Ƿ�ɹ�
	 * @param FileName �ļ����ļ��е�·��
	 * @return true or false �ɹ�����true��ʧ�ܷ���false
	 */
	public static boolean deleteAnyone(String FileName){

		File file = new File(FileName);//����ָ�����ļ�������File����

		if ( !file.exists() ){  //Ҫɾ�����ļ�������
			System.out.println("�ļ�"+FileName+"�����ڣ�ɾ��ʧ�ܣ�" );
			return false;
		}else{ //Ҫɾ�����ļ�����

			if ( file.isFile() ){ //���Ŀ���ļ����ļ�

				return deleteFile(FileName);

			}else{  //���Ŀ���ļ���Ŀ¼
				return deleteDir(FileName);
			}
		}
	}

	/**
	 * �ж�ָ�����ļ�ɾ���Ƿ�ɹ�
	 * @param FileName �ļ�·��
	 * @return true or false �ɹ�����true��ʧ�ܷ���false
	 */
	public static boolean deleteFile(String fileName){


		File file = new File(fileName);//����ָ�����ļ�������File����

		if (  file.exists() && file.isFile() ){ //Ҫɾ�����ļ����������ļ�

			if ( file.delete()){
				System.out.println("�ļ�"+fileName+"ɾ���ɹ���");
				return true;
			}else{
				System.out.println("�ļ�"+fileName+"ɾ��ʧ�ܣ�");
				return false;
			}
		}else{

			System.out.println("�ļ�"+fileName+"�����ڣ�ɾ��ʧ�ܣ�" );
			return false;
		}


	}





	/**
	 * ɾ��ָ����Ŀ¼�Լ�Ŀ¼�µ��������ļ�
	 * @param dirName is Ŀ¼·��
	 * @return true or false �ɹ�����true��ʧ�ܷ���false
	 */
	public static boolean deleteDir(String dirName){

		if ( dirName.endsWith(File.separator) )//dirName���Էָ�����β���Զ���ӷָ���
			dirName = dirName + File.separator;

		File file = new File(dirName);//����ָ�����ļ�������File����

		if ( !file.exists() || ( !file.isDirectory() ) ){ //Ŀ¼�����ڻ���
			System.out.println("Ŀ¼ɾ��ʧ��"+dirName+"Ŀ¼�����ڣ�" );
			return false;
		}

		File[] fileArrays = file.listFiles();//�г�Դ�ļ��������ļ���������Ŀ¼


		for ( int i = 0 ; i < fileArrays.length ; i++ ){//��Դ�ļ��µ������ļ����ɾ��

			Test.deleteAnyone(fileArrays[i].getAbsolutePath());

		}

		if ( file.delete() )//ɾ����ǰĿ¼
			System.out.println("Ŀ¼"+dirName+"ɾ���ɹ���" );

		return true;

	}

	/**
	 * @Author gaoming
	 * @Description //TODO ��ȡ����ͨ�÷���
	 * @Date 17:02 2020/10/9
	 * @Param [inStream]
	 * @return byte[]
	 **/
	public static byte[] readInputStream(InputStream inStream) throws Exception{
		ByteArrayOutputStream outStream = new ByteArrayOutputStream();
		//����һ��Buffer�ַ���
		byte[] buffer = new byte[1024];
		//ÿ�ζ�ȡ���ַ������ȣ����Ϊ-1������ȫ����ȡ���
		int len = 0;
		//ʹ��һ����������buffer������ݶ�ȡ����
		while( (len=inStream.read(buffer)) != -1 ){
			//���������buffer��д�����ݣ��м����������ĸ�λ�ÿ�ʼ����len�����ȡ�ĳ���
			outStream.write(buffer, 0, len);
		}
		//�ر�������
		inStream.close();
		//��outStream�������д���ڴ�
		return outStream.toByteArray();
	}

	


	/**
	  * ����
	 * @Title: main 
	 * @author: Gavin
	 * @time: 2019��7��2�� ����5:44:08
	 * @param args 
	 * @return: void 
	 * @throws
	 */
	public static void main(String[] args) {
		List<File> files = FileUtil.listFiles("G:/Java��������Ƶ/Java���������Ͷ���/JavaOp");//ɨ��
		for (File file : files) {
			System.out.println(file.getAbsolutePath());
		}
//		FileUtil.listFiles(new File("D:/jdk"));
	}
	
}
