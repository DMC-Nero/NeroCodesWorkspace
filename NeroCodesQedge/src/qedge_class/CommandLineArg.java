package qedge_class;

public class CommandLineArg {

	public static void main(String[] args) {
		System.out.println("Hello world");
		
		for(String arg: args) {
			System.out.println(arg);
		}
	}
	
}

//	>javac -d . Test.java
//	>java com.nero.test				//without command line argument
//	>java com.nero.test	10 20 30	//with command line argument