package qedge_class;

public class ThreadJoin {

	public static void main(String[] args) {
		System.out.println("main statred");

		TaskJoin newTask = new TaskJoin();
		Thread t1 = new Thread(newTask);
		t1.start();

		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("main end");
	}

}

class TaskJoin implements Runnable {
	public void run() {
		System.out.println("New Thread started");
		for (int i = 1; i <= 10; i++) {
			System.out.println("running...");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("New Thread ending");
	}
}
