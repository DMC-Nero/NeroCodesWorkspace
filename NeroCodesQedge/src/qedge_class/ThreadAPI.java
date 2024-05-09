package qedge_class;

import java.lang.Thread.Builder.OfPlatform;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.Map;

public class ThreadAPI {

	public static void main(String[] args) {
		System.out.println(Thread.MIN_PRIORITY);
		System.out.println(Thread.NORM_PRIORITY);
		System.out.println(Thread.MAX_PRIORITY);
		
		Thread mt = Thread.currentThread();	// return the thread object for the current thread of execution
		System.out.println("mt -> "+ mt);
		
		System.out.println(Thread.activeCount());
		
		Thread[] tarr = new Thread[Thread.activeCount()];
		Thread.enumerate(tarr);
		
		for(Thread t : tarr) {
			System.out.println("=>" +t);
			
		}
		System.out.println("=============");
		StackTraceElement[] stackTrack = mt.getStackTrace();
		
		for(StackTraceElement ele: stackTrack) {
			System.out.println("==>" + ele);
			
		}
		System.out.println("===============");
		Map<Thread, StackTraceElement[]> traceMap = Thread.getAllStackTraces();
		System.out.println(traceMap);
		
		System.out.println("==============");
		ClassLoader mtContextClassLoader = mt.getContextClassLoader();
		System.out.println(mtContextClassLoader);
		
		System.out.println("================");
		UncaughtExceptionHandler ueh = Thread.getDefaultUncaughtExceptionHandler();
		System.out.println(ueh);
		
		System.out.println(mt.getId());
		System.out.println(mt.threadId());
		
		System.out.println(mt.getName());
		System.out.println(mt.getPriority());
		
		System.out.println(mt.getThreadGroup());
		
		System.out.println("alive ->"+mt.isAlive());
		
		if(mt.isAlive()) {
			
		}
		
		System.out.println("daemon ->"+mt.isDaemon());
		/*
		 - Thread in jvm can be either daemon [background], or non-daemon [user thread]
		 - main thread is not a daemon thread
		 - Daemon thread are like the supporting thread for the non-daemon thread,
		 	 The JVM will terminate when there is no other non-daemon thread exist.
		 	 The JVM will continue as long as at least a single non-daemon thread exist within the JVM.
		 - Non-Daemon threads are like the worker thread that perform some meaningful work
		 
		 */
		System.out.println("virtual thread ->"+ mt.isVirtual());
		
		OfPlatform platform = Thread.ofPlatform();
		platform.start(new Runnable(){
			public void run() {
			System.out.println("It works");
		}
		});
		
		
		// OfVirtual virtual = Thread.ofVirtual();
		
		// virtual.start(new Runnable() {
		// 		public void run() {
		//			System.out.println("It also works");
		//		}
		// });
		
		System.out.println(mt.getState());
		System.out.println("main end");
		
	}

}
