package com.FilterStream.BufferStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferStream {

	public static void main(String[] args) {
		// Buffer = Temporary Storage / Increase Performance 
		
		try {
			// BufferOutputStream
			FileOutputStream fout = new FileOutputStream("D:\\FileStream\\coreJava\\Buffer.txt");
//			BufferedOutputStream bOut = new BufferedOutputStream(fout); // default Full size 32 bytes
			BufferedOutputStream bOut = new BufferedOutputStream(fout,5); // default Full size 32 bytes
			
			String msg = "I Love Java Program";
			byte[] b = msg.getBytes();
			
			bOut.write(b);
			bOut.close();
			fout.close();
			
			//BufferInputstream
			FileInputStream fIn = new FileInputStream("D:\\FileStream\\coreJava\\Buffer.txt");
			BufferedInputStream bIn = new BufferedInputStream(fIn);
			int x;
			while((x=bIn.read()) != -1) {
//				bIn.skip(2);
				bIn.mark(6);
				System.out.print((char)x);
			}
			
			bIn.close();
			fIn.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
