package com.nero.App;

import java.util.LinkedList;

import com.nero.Repository.StudentRepository;
import com.nero.model.Student;

public class App {

	public static void main(String[] args) {
		StudentRepository sr = new StudentRepository();
		
		
		/*=================  Bulk operation [ bulk insert ]  ====================*/
	
//		Student[] sarr = {
//				new Student(11, "jack11" , "11@gmail.com"),
//				new Student(12, "jack12" , "12@gmail.com"),
//				new Student(13, "jack13" , "13@gmail.com"),
//				new Student(14, "jack14" , "14@gmail.com"),
//				new Student(15, "jack15" , "15@gmail.com"),
//		};
//		
//		 sr.saveAll(sarr);
		
		/*================  single row insertion operation  ======================*/

//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter the details");
//		System.out.println("sid");
//		int sid = sc.nextInt();
//		sc.nextLine();
//		System.out.println("sname");
//		String sname = sc.nextLine();
//		System.out.println("email");
//		String email = sc.nextLine();
//		sc.close();
//		Student st = new Student(sid,sname,email);
//		sr.saveStudent(st);
		
		/*========================  updating student  ============================*/
//		Student st = new Student(4,"Zero","Zero@gmail.com");
//		sr.updateStudent(st,15 );
		
		/*=====================  deleting student by ID  ========================*/
//		sr.deleteById(11);

		/*=====================  deleting All Records  ========================*/
//		sr.deleteAll();
	
		/*=====================  reading All student Records  ========================*/
//		LinkedList<Student> res = sr.getAllStudents();
//		for(Student lol : res) {
//			System.out.println(lol);
//		}
		
		
		System.out.println("done");
	}

}
