package qedge_class;

import java.util.Scanner;

public class Wait_Notify {

	public static void main(String[] args) {
		System.out.println("main start");
		ProcessorWN proc = new ProcessorWN();
		
		Thread t1 = new Thread( new Runnable() {
			public void run() {
				try {
					proc.producer();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		Thread t2 = new Thread( new Runnable() {
			public void run() {
				try {
					proc.consumer();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("main end");
	}

}

class ProcessorWN {
	public void producer() throws InterruptedException{
		synchronized (this) {
			System.out.println("producer running... holding lock of this ->" + Thread.currentThread().holdsLock(this));
			wait();
			System.out.println("producer resuming again... holding lock of this -> "+Thread.currentThread().holdsLock(this));
		}
	}
	
	public void consumer() throws InterruptedException {
		Thread.sleep(100);
		
		Scanner sc = new Scanner(System.in);
		
		synchronized (this) {
			System.out.println("I will read an input & notify you ->"+ Thread.currentThread().holdsLock(this));
			sc.nextLine();
			notify();
			System.out.println("exiting consumer");
		}
	}
}