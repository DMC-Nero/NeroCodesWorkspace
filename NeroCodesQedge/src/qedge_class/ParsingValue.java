package qedge_class;

public class ParsingValue {

	public static void main(String[] args) {
		String input = "50";
		
		int value1 = Integer.parseInt(input);
		System.out.println(value1);
		
		String input2 = "true";
		boolean value2 = Boolean.parseBoolean(input2);
		System.out.println(value2);
		
		String value3 = "1010";
		int value4 = Integer.parseInt(value3,2);
		System.out.println(value4);
		
		String value5 = "2345";
		int value6 = Integer.parseInt(value5, 8);
		System.out.println(value6); 	//print() always print numeric content in decimal NS
	}

}
