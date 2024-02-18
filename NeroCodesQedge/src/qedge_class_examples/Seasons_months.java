package qedge_class_examples;

import java.util.Scanner;

public class Seasons_months {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Month");
		String month = sc.nextLine().toLowerCase();
		String season = "";

		switch (month) {
		case "mar":
		case "apr":
		case "may":
		case "jun":
			season = "Summer";
			break;

		case "jul":
		case "aug":
		case "sep":
		case "oct":
			season = "rainny";
			break;

		case "nov":
		case "dec":
		case "jan":
		case "feb":
			season = "Winter";
			break;

		default:
			System.out.println("no such seasons found");
			break;
		}
		System.out.println(month + " is " + season + " season");

		sc.close();
	}

}
