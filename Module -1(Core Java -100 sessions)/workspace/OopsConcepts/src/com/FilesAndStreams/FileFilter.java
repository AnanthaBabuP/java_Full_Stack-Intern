package com.FilesAndStreams;

import java.io.File;
import java.io.FilenameFilter;

public class FileFilter  implements FilenameFilter{

	String extendstion;
	

	public FileFilter(String extendstion) {
		this.extendstion = extendstion;
	}

	public static void main(String[] args) {
		String location = "C:\\AnanthaBabu\\Document\\JavaPrograms\\ControlStatements";
		File f = new File(location);
		
		FilenameFilter filter = new FileFilter(".java ");
		
		String[] list = f.list(filter);
		
		for(int i=0;i < list.length;i++)
			System.out.println(list[i]);
		System.out.println("Total length of file : "+list.length);
	}

	@Override
	public boolean accept(File f, String s) {
		return s.endsWith(extendstion );
	}

}
