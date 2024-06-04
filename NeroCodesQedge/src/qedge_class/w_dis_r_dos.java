package qedge_class;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class w_dis_r_dos {

	public static void main(String[] args) throws IOException {
		File f = new File("datafile.txt");
		FileOutputStream fos = new FileOutputStream(f);
		DataOutputStream dos = new DataOutputStream(fos);
		
		String[] items = { "coffee", "tea", "sugar"};
		double[] price = { 20,10,5};
		
		for( int i =0 ; i<items.length;i++) {
			// sno. items price
			dos.writeInt(i+1);
			dos.writeUTF(items[i]);
			dos.writeDouble(price[i]);
		}
		dos.close();
		
		// calculate total
		FileInputStream fis = new FileInputStream(f);
		DataInputStream dis = new DataInputStream(fis);
		
		int sno;
		String item;
		double cost;
		double total = 0.0;
		
		try {
			while(true) {
				sno = dis.readInt();
				item = dis.readUTF();
				cost = dis.readDouble();
				total = total + cost;
				System.out.format("%d \t  %s \t $%.2f%n", sno, item, cost);
			}
			
		}catch(EOFException ex) {
			
		}
		System.out.format("total \t $%.2f%n", total);
	}

}
