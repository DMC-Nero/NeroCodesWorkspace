package qedge_class;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Bis_Bos {

	public static void main(String[] args) throws IOException {
		String file1 = "";
		
		FileInputStream fis = new FileInputStream(file1);
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		FileOutputStream fos = new FileOutputStream("output.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		int byteRead = 0;
		while((byteRead = bis.read()) != -1) {
			System.out.println((char)byteRead);
			bos.write(byteRead);
		}
		bis.close();
		bos.close();
	}

}
