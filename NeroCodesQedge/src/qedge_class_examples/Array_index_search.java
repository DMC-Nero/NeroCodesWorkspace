package qedge_class_examples;

import java.util.Scanner;

public class Array_index_search {

	public static void main(String[] args) {
		int[] arr =new int[] {11,56,76,89,23,5 };
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to search");
		int searchInput = sc.nextInt();
		
		int dataIndex =-1;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==searchInput) {
				dataIndex=i;
			}
		}
		if(dataIndex== -1) {
			System.out.println("Your search item not found");
			
		}else {
			System.out.println("Your input "+ searchInput+" found at index "+ dataIndex);
		}
		
//		for(int i=1; i<arr.length;i++) {
//			if(arr[i-1]==searchInput) {
//				System.out.println("Your input "+searchInput +" found at index "+ (i-1));
//			}
//		}
		
		
		
		
		sc.close();
	}

}
