package qedge_class;

public class MultiThreading_Example2 {

	public static void main(String[] args) {
		
		//create out thread object
		Task2 myTask = new Task2();
		myTask.start();
		Task2 myTask2 = new Task2();
		myTask2.start();
		Task2 myTask3 = new Task2();
		myTask3.start();
		Task2 myTask4 = new Task2();
		myTask4.start();

	}

}

class Task2 extends Thread {
	public void run() {
		for(int i = 1; i <6; i++) {
			System.out.println("from thread " +i );
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}
		
	}
}
