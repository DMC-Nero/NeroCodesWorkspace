package org.java.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class C010_SortArrayList {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(30);
		list.add(10);
		list.add(50);
		list.add(20);
		list.add(40);
		
					// method 1	-->	sorting by using sort() method from Collections interface
/*		
		Collections.sort(list);		// ascending order
		System.out.println(list);
		
		Collections.reverse(list);	// descending order
		System.out.println(list);
*/			
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(111,"Nero", 22, 500000));
		employees.add(new Employee(333, "Hero", 24, 450000));
		employees.add(new Employee(444, "Zero", 30, 550000));
		employees.add(new Employee(222, "Aero", 28, 400000));

		
		
					// method 2	-->	sorting by using MySort class implementing comparator interface
/*		
		Collections.sort(employees, new MySort()); 		
		System.out.println(employees);
*/		
		
		
		
					// method 3	-->	sorting by creating anonymous class
/*
		Collections.sort(employees , new Comparator<Employee>() {
		
			public int compare(Employee o1 , Employee o2) {
				return (int) (o1.getSalary() - o2.getSalary());		// ascending order
			//	return (int) (o2.getSalary() - o1.getSalary());		// descending order
			}
		
		});
		System.out.println(employees);
*/
		
		
					// method 4 --> sorting by using lambda expression
		Collections.sort(employees,(o1,o2) -> (int) (o1.getSalary() - o2.getSalary()));		// ascending order
		System.out.println(employees);
		Collections.sort(employees,(o1,o2) -> (int) (o2.getSalary() - o1.getSalary()));		// descending order
		System.out.println(employees);
	}

}


//////////////////////////////////////////////////////////////////

class MySort implements Comparator<Employee>{
	public int compare(Employee o1, Employee o2) {
		return (int) (o1.getSalary() - o2.getSalary());		// ascending order
	//	return (int) (o2.getSalary() - o1.getSalary());		// descending order
	}
}

//////////////////////////////////////////////////////////////////

class Employee {
	private int id;
	private String name;
	private int age;
	private long salary;
	
	// constructor to initialize non-static/instance variables	
	public Employee(int id, String name, int age, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	// generating getter & setter	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	// overriding toString
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	
	
	
}
