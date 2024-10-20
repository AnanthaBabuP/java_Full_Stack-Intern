package com.FilesAndStreams;

import java.io.File;

public class WorkingWithDirectorys {

	public static void main(String[] args) {
		String directory = "test";
		File f = new File("D:\\CoreJava\\workspace\\OopsConcepts\\src\\com\\FilesAndStreams\\"+directory);

		// mkdr = make Directory
		if(f.mkdir()) {
			System.out.println("Directory Created...");
		} else if(f.exists()) {
			System.out.println("Directory already Created...");
			// List()
			String[] list = f.list();
			for(int i=0;i<list.length;i++){
				System.out.println(list[i]);
			}
		}
	}
}
