package qedge_class;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipedInputStream_pipedOutputStream {

	public static void main(String[] args) throws IOException {
		
		String fileName = "\\Users\\natrajvemula\\git\\NeroCodesWorkspace\\NeroCodesQedge\\src\\qedge_class\\PipedInputStream_pipedOutputStream.java";
		File file = new File(fileName);
		FileInputStream fin = new FileInputStream(file);
		
		PipedInputStream pin = new PipedInputStream();
		PipedOutputStream pout = new PipedOutputStream(pin);
		
		Thread t1 = new Thread( new Runnable() {
			public void run() {
				int byteRead = 0;
				try {
					while ((byteRead = fin.read()) != -1) {
						pout.write(byteRead);
						System.out.println("supplied " + byteRead);
					}
				} catch (IOException e) {
					
				}
			}
		});
		
		Thread t2 = new Thread( new Runnable() {
			public void run() {
				int byteRead = 0;
				try {
					while ((byteRead = pin.read()) != -1) {
						Thread.sleep(1);
						System.out.println("Processed byte " + byteRead);
					}
				}catch (Exception e) {
					
				}
			}
		});
		
		t1.start();
		t2.start();
	}

}
