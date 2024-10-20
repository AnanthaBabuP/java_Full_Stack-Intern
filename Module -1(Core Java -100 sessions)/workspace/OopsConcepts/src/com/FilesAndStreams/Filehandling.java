package com.FilesAndStreams;

import java.io.File;
import java.io.IOException;

public class Filehandling {

	public static void main(String[] args) {
		
		File f = new File("D:\\CoreJava\\workspace\\OopsConcepts\\src\\com\\FilesAndStreams\\Inmakes.txt");
		
		try {
			if(f.createNewFile()) {
				System.out.println("File Created");
				System.out.println("File Name : "+f.getName());
				
			} else if (f.exists()) {
				System.out.println("File Already Created");
				System.out.println("File Absulute Path : "+f.getAbsolutePath());
				System.out.println("File Length : "+f.length());
				System.out.println("This file read :"+f.canRead());
				System.out.println("This file Write :"+f.canWrite());
				
				// Additional notes
				System.out.println("File Hidden : "+f.isHidden());
				System.out.println("Is File? : "+f.isFile());
				
				System.out.println("This File Deleted : "+f.delete());
				
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
