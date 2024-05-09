package qedge_class;

public class MultiThreading_Example3 {

	public static void main(String[] args) {
		
		//create out thread object
		Thread t1 = new Thread( new Runnable() {
			public void run() {
				for(int i=1; i<6;i++) {
					System.out.println(i + " from thread 2");
					
				}
			}
		});
		t1.start();
		
		for(int i=1; i<6;i++) {
			System.out.println(i + " from thread 1");
		}
	}

}


