package projects;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class Exam {
	public static void main(String[] args) throws IOException {
		
		String data = "java world";
		byte[] barr = data.getBytes();
		
		// ByteArrayInputStream
		ByteArrayInputStream bais = new ByteArrayInputStream(barr);
		
		int byteRead = 0;
		while( (byteRead = bais.read()) != -1) {
			System.out.print((char) byteRead);
		}
		//////////////////
		System.out.println();
		
		// ByteArrayOutputStream 
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		baos.write(97);
		baos.write(98);
		baos.write(99);
		baos.write(100);
		
		System.out.println(baos.toString());
	}
}

