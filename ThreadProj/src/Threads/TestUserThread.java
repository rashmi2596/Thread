package Threads;
/*
 * rashm
 * since May 5, 2020
 * version 1.0
 *
 * This class is used to
 */
public class TestUserThread {

	public static void main(String[] args) {
		SampleThread samplethread = new SampleThread();
		samplethread.setName("sampleThread");
		samplethread.start();

		
		SampleThread samplethread2 = new SampleThread();
		samplethread2.setName("sampleThread2");
		samplethread2.start();
	}

}
