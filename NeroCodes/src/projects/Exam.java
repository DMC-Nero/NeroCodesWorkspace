package projects;

interface cal {
	void add();

	void sub();
}

class cal1 implements cal {
	public void add() {
		System.out.println("add of cal1");
	}

	public void sub() {
		System.out.println("sub of cal1");
	}
}

class cal2 implements cal {
	public void add() {
		System.out.println("add of cal2");
	}

	public void sub() {
		System.out.println("sub of cal2");
	}
}

class Math {
	public static void Permit(cal ref) {
		ref.add();
		ref.sub();

	}
}

public class Exam {
	public static void main(String[] args) {
		cal c1 = new cal1();
		Math.Permit(c1);

		cal c2 = new cal2();
		Math.Permit(c2);
	}
}
