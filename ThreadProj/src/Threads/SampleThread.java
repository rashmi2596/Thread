package Threads;
/*
 * rashm
 * since May 5, 2020
 * version 1.0
 *
 * This class is used to
 */
public class SampleThread extends Thread {
@Override
public void run() {
	
	Thread thread=Thread.currentThread();
	System.out.println(thread.getName()+"Started execution.");
	
	
	
	
	if(thread.getName().equals("sampleThread")) {
		try {
			Thread.sleep(500);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	for(int i=0;i<5;i++) {
		System.out.println(Thread.currentThread().getName()+ ":" +i);
	}
}

}
