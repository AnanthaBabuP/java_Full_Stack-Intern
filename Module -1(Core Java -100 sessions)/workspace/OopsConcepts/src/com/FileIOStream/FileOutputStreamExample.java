package com.FileIOStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {
	
	public static String src = "D:\\coreJava\\FileStream\\inmakes.txt";

	public static void main(String[] args) {
		try {
			FileOutputStream f = new FileOutputStream(src);// Checked Exception
			// public void write(int i)
			// public void write(byte b) // String convert and write a file
			// public void write(byte b,int offSet,int length)
			// public void close();
			
			int x = 65;
			String str = "I am a Java Developer";
			
			// int parameter
//			f.write(x); // ASCII Code of 65 is A
			// Sring convert to byte and write on file
			byte[] b = str.getBytes();
			f.write(b);
			
			// offset with length
			
			// Byte, Offset Start point, start point to length
			
			// String "I am a Java Developer  
			// stating index 7 // start with "J"
			// length 4 select index from 7,8,9,10 index letter write on File
//			f.write(b, 7, 4);
			f.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
