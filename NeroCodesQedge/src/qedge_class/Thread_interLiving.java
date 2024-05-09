package qedge_class;

public class Thread_interLiving {
	int count = 0;

	public static void main(String[] args) {
		Thread_interLiving app = new Thread_interLiving(); // [ count = 0 ]
		app.doWork();
	}

	private void doWork() {
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 10000; i++) {
					count++; 	// Thread interleaving
								// count = count +1
								// overriding effort
					
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 10000; i++) {
					count++; 	// Thread interleaving
								// count = count +1
								// overriding effort
			
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
