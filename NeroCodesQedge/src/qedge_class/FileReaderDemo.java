package qedge_class;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		String textFile = "/Users/natrajvemula/Desktop/one.rtf";
		
		FileInputStream fis = new FileInputStream(textFile);
		int byteRead = 0;
		int counter = 0;
		while((byteRead = fis.read()) != -1) {
			counter++;
			System.out.print((char)byteRead);
		}
		System.out.println("  counter value is " + counter);
		fis.close();
		
		FileReader fr = new FileReader(textFile, Charset.forName("UTF-16") );
		int charRead = 0;
		counter = 0;
		while((charRead = fr.read()) != -1) {
			counter++;
			System.out.print((char)charRead);
		}
		System.out.println("  counter value is "+ counter);
		fr.close();
	}

}
