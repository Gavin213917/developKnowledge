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
	  * 递归获取目录下所有的文件信息
	 * @Title: listFiles 
	 * @author: Gavin
	 * @time: 2019年7月2日 下午5:42:51
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
			if(file.isDirectory()){//如果是目录，继续调用自己
//				files.add(file);
				listFiles(file);
			}
		}
		
		return files;
	}
	
	
	/**
	  * 递归获取目录下所有带后缀的文件信息
	 * @Title: listFiles 
	 * @author: Gavin
	 * @time: 2019年7月2日 下午5:43:09
	 * @param directory
	 * @param filterDirectory
	 * @param suffix
	 * @return 
	 * @return: List<File> 
	 * @throws
	 */
	public static List<File> listFiles(File directory,String filterDirectory,String suffix){
		File[] files2 = directory.listFiles(new FilenameFilter() {//过滤filterDirectory目录，获得带后缀suffix的文件的信息
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
			if(file.isDirectory()){//如果是目录，继续调用自己
//				files.add(file);
				listFiles(file,filterDirectory,suffix);
			}
		}
		
		return files;
	}
	/**
	 * 递归获取目录下所有的文件信息
	 * @Title: listFiles 
	 * @author: Gavin
	 * @time: 2019年7月2日 下午5:43:30
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
			if(file.isDirectory()){//如果是目录，
				listFiles(files,file);
			}
		}
		
		return files;
	}
	
	/**
	 * 
	 * @Title: listFiles 
	 * @author: Gavin
	 * @time: 2019年7月2日 下午5:43:46
	 * @param directory
	 * @return 
	 * @return: List<File> 
	 * @throws
	 */
	public static List<File> listFiles(String directory){
		return listFiles(new File(directory));
	}
	
	
	/**
	  * 测试
	 * @Title: main 
	 * @author: Gavin
	 * @time: 2019年7月2日 下午5:44:08
	 * @param args 
	 * @return: void 
	 * @throws
	 */
	public static void main(String[] args) {
		List<File> files = FileUtil.listFiles("G:/Java基础班视频/Java面向对象类和对象/JavaOp");//扫包
		for (File file : files) {
			System.out.println(file.getAbsolutePath());
		}
//		FileUtil.listFiles(new File("D:/jdk"));
	}
	
}
