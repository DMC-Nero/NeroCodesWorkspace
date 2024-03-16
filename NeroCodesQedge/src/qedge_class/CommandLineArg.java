package qedge_class;

public class CommandLineArg {

	public static void main(String[] args) {
		System.out.println("Hello world");
		System.out.println(args);
		System.out.println(args.length);
		
		/*
		for(String arg : args) {
			System.out.println(arg);
		} */
		
		//performing arithemetic operation on command line argument
		if( args.length >=2) {
			int x = Integer.parseInt(args[0]);
			int y = Integer.parseInt(args[1]);
			int res = x + y;
			System.out.println(x + " + " + y + " = "+ res);
		}else {
			System.out.println("Insufficient input");
		}
	
	}
	
}

//	>javac -d . Test.java
//	>java com.nero.test				//without command line argument
//	>java com.nero.test	10 20 		//with command line argument