package qedge_class;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Vector;

public class SequenceInputStreamDemo {


	public static void main(String[] args) throws FileNotFoundException {
		String file1 = "";
		
		String file2 = "";
		
		FileInputStream finOne = new FileInputStream(file1);
		FileInputStream finTwo = new FileInputStream(file2);
		
		// SequenceInputStream in = new SequenceInputStream(finOne , fineTwo);
		Vector<InputStream> streams = new Vector<>();
		streams.add(finOne);
		streams.add(finTwo);
		SequenceInputStream in = new SequenceInputStream(streams.elements());
		
		// reading byte by byte
		int byteRead = 0;
		try {
			while((byteRead = in.read()) != -1) {
				System.out.println((char)byteRead);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}



}
