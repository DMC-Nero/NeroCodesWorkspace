package qedge_class;

import java.util.Scanner;

public class ThrowKeyword {

	public static void main(String[] args) {
		System.out.println("main start");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt();

		if (age >= 18) {
			System.out.println("you are eligible for voting");
		} else {
			// throw new IllegalArgumentException("Invalid age");

			throw new InvalidAgeException("invalid age" + age);
		}
		System.out.println("main end");
	}

}
// unchecked exception
// most of the time custom class don't maintain any state, instate we need delegate these state into the Super most class in the hierarchy.

class InvalidAgeException extends RuntimeException {
	public InvalidAgeException() {

	}

	public InvalidAgeException(String message) {
		super(message);
	}

	public InvalidAgeException(Throwable rootCause) {
		super(rootCause);
	}

	public InvalidAgeException(String message, Throwable rootCause) {

	}

}
