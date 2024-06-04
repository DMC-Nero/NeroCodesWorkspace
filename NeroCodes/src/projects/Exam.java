package projects;

import java.util.ArrayList;
import java.util.List;

public class Exam {
	public static void main(String[] args) {
		List<Integer> list = number(212);
		System.out.println(list);
	}
	
	private static int sumOf(int x) {
		int sum = 0;
		while(x > 0) {
			int rem = x%10;
			sum = sum + rem;
			x = x/10;
		}
		
		return sum;
	}
	
	private static List number(int num) {
		
		List<Integer> list = new ArrayList<>();
		
		for(int i =0 ; i< num ;i++) {
			if( (i + sumOf(i)) == num) {
				list.add(i);
			}
		}
		return list;
	}
}

