package qedge_document_simple_exercises;

public class Q_22_ExtractDigits {

	public static void main(String[] args) {
		int i=498451;
		int j=i;
		int count=0;
		while(i>0) {
			i=i/10;
			count++;
		}
		while(j>0) {
			int rem2=j%10;
			j=j/10;
			System.out.println("Positon of the "+rem2+" is digit "+count);
			count--;
			
		}
		
		
	}

}
