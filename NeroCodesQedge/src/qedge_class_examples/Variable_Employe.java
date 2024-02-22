package qedge_class_examples;

public class Variable_Employe {

	public static void main(String[] args) {
		Employeee s0 = new Employeee();

		System.out.println(s0);
		System.out.println("empId is " + s0.empId);
		System.out.println("empName is " + s0.empName);
		System.out.println("empRole is  " + s0.empRole);
		System.out.println("empAge is  " + s0.empAge);
		System.out.println("empSalary " + s0.empSalary);

		System.out.println("===========");
		Employeee s1 = new Employeee();

		System.out.println(s1);
		System.out.println("empId is " + s1.empId);
		System.out.println("empName is " + s1.empName);
		System.out.println("empRole is  " + s1.empRole);
		System.out.println("empAge is  " + s1.empAge);
		System.out.println("empSalary " + s1.empSalary);

		System.out.println("===========");

		System.out.println(s0);
		s0.empId = 123;
		s0.empName = "Nero";
		s0.empRole = "Manager";
		s0.empAge = 23;
		s0.empSalary = 500000000;
		System.out.println("empId is " + s0.empId);
		System.out.println("empName is " + s0.empName);
		System.out.println("empRole is  " + s0.empRole);
		System.out.println("empAge is  " + s0.empAge);
		System.out.println("empSalary " + s0.empSalary);

		System.out.println("===========");

		System.out.println(s1);
		s1.empId = 1234;
		s1.empName = "Kushal";
		s1.empRole = "senior_developer";
		s1.empAge = 21;
		s1.empSalary = 100000000;
		System.out.println("empId is " + s1.empId);
		System.out.println("empName is " + s1.empName);
		System.out.println("empRole is  " + s1.empRole);
		System.out.println("empAge is  " + s1.empAge);
		System.out.println("empSalary " + s1.empSalary);

	}

}

class Employeee {
	int empId;
	String empName;
	String empRole;
	int empAge;
	int empSalary;
}
