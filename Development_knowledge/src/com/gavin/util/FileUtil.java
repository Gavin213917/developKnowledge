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
