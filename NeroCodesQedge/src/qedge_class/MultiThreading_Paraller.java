package qedge_class;

public class MultiThreading_Paraller {

	public static void main(String[] args) {
		
		// Create a new thread
		Thread t1 = new Thread(new TaskThr());
		t1.start();
		
		// Task-1
		for (int i=1;i<=1500;i++) {
			System.out.println("M");
		}
	}

}

class TaskThr implements Runnable {
	public void run() {
		doTask();
	}
	
	public void doTask() {
		for (int i=1;i<=1500;i++) {
			System.out.println("P");
		}
	}
}
