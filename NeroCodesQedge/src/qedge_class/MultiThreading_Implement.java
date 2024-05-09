package qedge_class;
// Thread Example #1

public class MultiThreading_Implement {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		
		// create a new thread to run out task [ A new thread of execution]
		Task newTask = new Task();
		Thread t1 = new Thread(newTask); 	//only thread object is created with task know
		
		// start the new thread of execution
		t1.start(); 	 // internally prepare a new threading context
		
		// Task-1
		for (int i = 1; i<=1500 ;i++) {
			System.out.println("M");
			int res = i + 10;
		}
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		long end = System.currentTimeMillis();
		System.out.println("Thime Taken "+ (end - start));
	}

}
// Another Task
// By implementing Runnable interface,
		// we're modeling a Task in java program that needs to be executed by a separate thread.

class  Task implements Runnable {
	public void run() {
		for(int i =1 ; i<= 1500;i++) {
			System.out.println("P");
			int res = i+10;
		}
	}
}

// In java programming, there are two contract to model a task
	// Runnable -> while working with vanila sytyle thread
	// callable -> Thread pooling, Executors framework, ExecutorService		[new from java 5]
