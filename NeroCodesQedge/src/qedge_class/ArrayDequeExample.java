package qedge_class;

import java.util.ArrayDeque;

public class ArrayDequeExample {

	public static void main(String[] args) {
		ArrayDeque<Integer> ad = new ArrayDeque<>();
		
		ad.addFirst(10);
		ad.addFirst(20);
		ad.add(40);
		
		ad.addLast(30);
		System.out.println(ad);
	}

}
