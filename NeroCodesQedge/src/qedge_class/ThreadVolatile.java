package qedge_class;

import java.util.Scanner;

public class ThreadVolatile {

	public static void main(String[] args) {
		System.out.println("main start");
		
		ThreadVolProcessor proc = new ThreadVolProcessor();
		proc.start();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Press Enter key");
		sc.nextLine();
		
		proc.shutdown();
		System.out.println("main end");
	}

}

class ThreadVolProcessor extends Thread {
	// private boolean running = true; 		//shared variable

	private volatile boolean running = true;
	// volatile indicate the variable is a shared variable used for thread communication
	// hence threads should not cache it.

	public void run() {
		// could happen -> read the running variable value & cache it at the thread  level
		while (running) {
			System.out.println("running.....");
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void shutdown() {
		running = false;
	}
}