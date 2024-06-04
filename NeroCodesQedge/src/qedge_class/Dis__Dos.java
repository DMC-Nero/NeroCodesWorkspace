package qedge_class;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Dis__Dos {

	public static void main(String[] args) throws IOException {
		File f = new File("datafile.txt");
		
		FileOutputStream fos = new FileOutputStream(f);
		DataOutputStream dos = new DataOutputStream(fos);
		
		int x = 1234;
		float f1 = 2.56f;
		String s1 = "java world";
		
		dos.writeInt(x);
		dos.writeFloat(f1);
		dos.writeUTF(s1);
		
		dos.close();
		
		FileInputStream fis = new FileInputStream(f);
		DataInputStream dis = new DataInputStream(fis);
		
		int y = dis.readInt();
		float f2 = dis.readFloat();
		String s2 = dis.readUTF();
		System.out.println(y + " - " + f2 + " - "+ s2);
		
	}

}
// Note - The DataInputStream can only read the data which is written using DataOutputStream