package qedge_class;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class failFast_failSafe {
	public static void main(String[] args) {
		// ArrayList<Integer> list = new ArrayList<>();
		CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<Integer>();
		list.add(10);
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		
		Iterator<Integer> it = list.iterator();
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				list.add(50);
			}
		});
		t1.start();
		
		while( it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("================");
		
		it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
