package qedge_class;

public class Interface_exam {

	public static void main(String[] args) {
		Shape s1 = new Triangle();
		
		Shape s2 = new Triangle();
		
		Object o1 = new Triangle();
		
		s1.area();
		
	}
}


//A java interface is also subtype of Object type if no explicit super type is defined 
interface Shape {
	void area();
}

// triangle is a form of Shape
// super & sub relation still exist
// this is not an inheritance relation, rather it is a implements relationship

class Triangle implements Shape{
	
	@Override
	public void area() {
		System.out.println("area of Triangle");
	}
}
