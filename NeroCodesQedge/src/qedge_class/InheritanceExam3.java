package qedge_class;

import java.util.Scanner;

public class InheritanceExam3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a value");
		
		int value = sc.nextInt();
		
		InhStudent st = null;
		
		if(value>1 && value<100) {
			st = new InhStudent();
		}else if(value > 100 && value < 500){
			st = new InhBtechStudent();
		}else if(value >500) {
			st = new InhMtechStudent();
		}
		st.read();
		st.hashCode();
		st.write();
		
		sc.close();
	}

}
