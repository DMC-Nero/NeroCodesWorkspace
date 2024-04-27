package qedge_class;

public class MultiThreading_Sequential {

	public static void main(String[] args) {
		// Task-1
		for (int i=1; i <= 1500;i++) {
			System.out.print("N");
		}
		System.out.println();
		
		// Task-2
		for (int i=1; i <= 1500;i++) {
			System.out.print("E");
		}
		System.out.println();
		
		// Task-3
		MultThrExa thr = new MultThrExa();
		thr.printNum();
	}

}

class MultThrExa {
	public void printNum() {
		for (int i=1; i<1500; i++) {
			System.out.print("R");
		}
	}
}
