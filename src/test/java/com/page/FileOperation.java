package com.page;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class FileOperation {
	public static void main(String[] args) throws IOException {
		
		//create the folder
		File f = new File("D:\\FileOperation");
		boolean mkdir = f.mkdir();
		System.out.println("done");
		
		//create the file
		File f1 = new File("D:\\FileOperation\\demo.txt");
		boolean b = f1.createNewFile();
		System.out.println(b);
		
		//Directory
		
		File f2 = new File("D:\\FileOperation\\demo.txt");
		boolean d = f2.isDirectory();
		System.out.println(d);
		
		//carRead,canWrite,isHidden
		
		//write file
		File f3 = new File("D:\\FileOperation\\demo.txt");
		FileUtils.write(f3,"hii");
		
		//read file
		File f4 = new File("D:\\FileOperation\\demo.txt");
		List<String> r = FileUtils.readLines(f4);
		for (String s : r) {
			System.out.println(s);
		}
		
		//read file
				File f5 = new File("D:\\FileOperation\\demo.txt");
				File f6 = new File("D:\\FileOperation\\sample.txt");
				FileUtils.copyFile(f5, f6);
				List<String> r1 = FileUtils.readLines(f6);
				for (String s : r1) {
					System.out.println(s);
				}
				
		//replace
				File f7 = new File("D:\\FileOperation\\demo.txt");		
				FileUtils.write(f7,"besant", false);
				
	   //adding
				File f8 = new File("D:\\FileOperation\\demo.txt");		
				FileUtils.write(f8,"hello", true);	
				
		//getting name
				File f9 = new File("D:\\FileOperation\\demo.txt");		
		   String name = f9.getName();
		   System.out.println(name);
	}

}
