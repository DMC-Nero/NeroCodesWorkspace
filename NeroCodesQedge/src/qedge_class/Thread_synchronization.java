package qedge_class;

public class Thread_synchronization {

	int count = 0;

	public static void main(String[] args) {
		Thread_synchronization app = new Thread_synchronization(); // [ count = 0 ]
		app.doWork();
	}
// sensitive logic - Need to considered as an atomic code unit.
// we want the increment() to executed exclusively by one thread at time.
// we want to avoid thread interleaving.
	private synchronized void increment() {
		count++;
	}

	private void doWork() {
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 10000; i++) {
					increment();

				}
			}
		});

		Thread t2 = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 10000; i++) {
					increment();

				}
			}
		});

		t1.start();
		t2.start();

		// wait the main thread here for t1 & t2 to finish
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("count is " + count);

	}

}