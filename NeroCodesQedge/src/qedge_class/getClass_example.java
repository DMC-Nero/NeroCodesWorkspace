package qedge_class;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class getClass_example {

	static {
		System.out.println("static block of App");
	}
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, InvocationTargetException, ClassNotFoundException, InstantiationException {
		System.out.println("main start");
		
		// we can get hold of the j.l.class object for any loaded class defn in following ways:
		
		// 1. using.class property on the class name
		Class appClass = getClass_example.class;	//this class
		
		getClass_example a1 = new getClass_example();
		//2. using getClass() non-static mehtod
		Class a1Class = a1.getClass();
		
		System.out.println(appClass == a1Class);
		
		Method m1Method = appClass.getMethod("m1");
		m1Method.invoke(a1);
		
		System.out.println("///////////////////");
		// we can load a class definition into the JVM explicitly
		Class<?> sampleClass = Class.forName("qedge_SamplegetClass");	// sample load the class
		
		//loading a class & creating object out of the loaded class definition
		SamplegetClass s1 = (SamplegetClass)Class.forName("qedge_SamplegetClass").newInstance();
		
		
	}
	
	public void m1() {
		System.out.println("m1 of App");
	}

}

class SamplegetClass{
	static {
		System.out.println("static block of Sample");
	}
}
