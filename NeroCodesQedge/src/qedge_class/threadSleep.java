package qedge_class;

public class threadSleep {

	public static void main(String[] args) {
		System.out.println("main start");
		
		for(int i=1; i<=10;i++) {
			System.out.println("running...");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			
		}
		System.out.println("main end");
	}

}
