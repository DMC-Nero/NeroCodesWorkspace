package qedge_class;

public class Variable_Assignment {
	public static void main(String[] args) {
		// Literal assignment 
		int x=10;		// variable Initialization 
						// store value 10 into variable x
		x=20;			//store value 20 into variable x
		System.out.println("x value is "+ x);	//20
		
		//variable assignment 
		int y=x;		//copy by value
						//copy the value of x into the variable y
		x=50;
		System.out.println("x value is "+ x); 		//50
		System.out.println("y value is "+ y);  		//20
		
		y=60;
		System.out.println("x value is "+ x);
		System.out.println("y value is "+ y);
		
		y=x;	//copy the value of x [50] into variable y
		System.out.println("y value is "+ y);
		
		
	}

}
