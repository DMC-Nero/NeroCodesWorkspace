package qedge_class;

public class FinalizedGarbage {

	public static void main(String[] args) throws InterruptedException {
		SampleFinalized s1 = new SampleFinalized();
		s1 = null;
		
		System.gc();			// invokes Garbage collector explicitly
		
		Thread.sleep(100);		//Makes the main thread to sleep/pause for 100 ms
				
	}

}


class SampleFinalized{
	protected void finalized() throws Throwable{
		System.out.println("finalized() of Sample");
	}
}