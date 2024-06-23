package qedge_class;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class serialization_deserial {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File file = new File("student.ser");
		// Serialization
		
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		StudentSer st1 = new StudentSer(111,"jack" , 25);
		oos.writeObject(st1);
		
		// Deserialization 
		System.out.println("==========Deserializing=============");
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		StudentSer st2 = (StudentSer) ois.readObject();	// deserialization mechanism don't use constructor
		System.out.println(st2);
		
		
	}

}

class StudentSer implements Serializable {
	int sid;
	String sname;
	transient int age;

	public String toString() {
		return "StudentSer [sid=" + sid + ", sname=" + sname + ", age=" + age + "]";
	}

	public StudentSer(int sid, String sname, int age) {
		System.out.println("Student() argumented constructor");
		this.sid = sid;
		this.sname = sname;
		this.age = age;
	}
	
	public StudentSer() {
		System.out.println("Student() no-arg constructor");
	}
	
}
