package qedge_class_examples;

public class Swapping_intergers_using_temp {
	public static void main(String[] args) {
		int x=10;
		int y=20;
		System.out.println("x value befor swaping " + x);
		System.out.println("y value befor swaping " + y);
		int temp=x;
		x=y;
		y=temp;
		System.out.println("the vlaue of  x after swaping " + x);
		System.out.println("the value of y after swaping " + y);
	}

}
