package qedge_class;

import java.util.Scanner;

public class ExceptionHandlingThrowable {

	public static void main(String[] args) {
		System.out.println("main start");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a value");
		int a = sc.nextInt();
		System.out.println("enter b value");
		int b = sc.nextInt();
		
		try {
			int res = div(a,b);
			System.out.println("Division Result is "+res);
			
		} catch (DivisionException ex) {
			System.out.println("in DivisionException cathc block");
			
			//Throwable cause = ex.getCause();
			// System.out.println("Root cause was: "+ cause.getClass().getName());
			
			ex.printStackTrace();
		}
		System.out.println("main end");
		
		
	}
	public static int div(int a, int b) throws DivisionException{
		System.out.println("===========div running========");
		int res = 0;
		try {
			res = a/b;
			
		}catch (ArithmeticException ex) {
			System.out.println("in ArithmeticException catch block");
			
			// exception chaining | execption translation
			// throws new DivisionException(ex);
			
			DivisionException de = new DivisionException();
			de.initCause(ex);		// setting the root cause of this exception
			throw de;
		}
		System.out.println("======div ending=======");
		
		return res;
	}

}

class DivisionException extends RuntimeException {
	public DivisionException() {
		
	}
	public DivisionException(Throwable t) {
		super(t);
	}
}
