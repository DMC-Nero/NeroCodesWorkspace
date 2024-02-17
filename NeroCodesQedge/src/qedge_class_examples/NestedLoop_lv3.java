package qedge_class_examples;

public class NestedLoop_lv3 {

	public static void main(String[] args) {
		int i=1;
		while(i<=5) {
			System.out.println("I am Outer Loop #" + i);
			
			int j=1;
			while(j<=i) {
				System.out.println("\t I am Inner Loop #" + j);

				j++;
			}	
			i++;
			
		}		
	
	}

}

//int k=1;
//while(k<=4) {
//	System.out.println("\t\t Inner Loop 2 #" + k);
//	k++;
//}
