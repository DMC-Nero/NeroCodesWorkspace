package qedge_class;

public class Array_Creation {

	public static void main(String[] args) {

		Sample s1 = new Sample();
		System.out.println(s1);

		// Array creation with default initial value
		int[] arr1 = new int[5];
		System.out.println(arr1);
		System.out.println(arr1.length);
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		System.out.println(arr1[3]);
		System.out.println(arr1[4]);
		// System.out.println(arr[5]); //java.lang.ArrayIndexOutOfBoundException

		System.out.println("=============");
		// Reading array element value using traditional for loop
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);

		}
		System.out.println("=============");
		// Reading array elements value using enhanced for loop
		for (int x : arr1) {
			System.out.println(x);

		}
		// writing data into array element
		arr1[0] = 78;
		arr1[1] = 74;
		arr1[2] = 53;
		arr1[3] = 76;
		arr1[4] = 93;
		
		System.out.println("==========");
		//Reading array elements value using while loop
		
		int i=0;
		while(i<arr1.length) {
			System.out.println(arr1[i]);
			i++;
		}
		//Array creation with given initial value
		int[] arr2=new int[] {11,33,66,22,66};
		System.out.println("===========");
		//Reading data using enhanced for loop
		for (int x: arr2) {
			System.out.println(x);
		}
		int[] arr3= {15,64,73,74,24};
		System.out.println("===========");
		//Reading data using enhanced for loop
		for (int x: arr3) {
			System.out.println(x);
		}
		
		
		byte[] arr = new byte[5];
		arr[0]=65;
		arr[1]=66;
		arr[2]=87;
		arr[3]=74;
		arr[4]=84;
		System.out.println(arr);
		
		//converting byte[] content into string 
		String s2=new String(arr);
		System.out.println(s2);
		
		double[] darr =new double[4];
		System.out.println(darr);
		
		boolean[] barr= new boolean[2];
		barr[0] =true;
		barr[1] =false;
		System.out.println(barr);
		
		char[] carr= {'a','b','c','d'};
		System.out.println(carr);
		//converting char[] content into a string
		String[] sarr=new String[] {"java","python","ruby","go","r"};
		System.out.println(sarr);
		
		Sample[] samparr = new Sample[3];
		System.out.println(samparr);
		System.out.println(samparr.length);
		System.out.println(samparr[0]);
		System.out.println(samparr[1]);
		System.out.println(samparr[2]);
		
		samparr[0] = new Sample();
		samparr[1] = new Sample();
		samparr[2] = new Sample();
		
	
	}
		
		
	}

class Sample{
	
}