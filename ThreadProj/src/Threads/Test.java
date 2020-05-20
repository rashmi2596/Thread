package Threads;

/*
 * rashm
 * since May 5, 2020
 * version 1.0
 *
 * This class is used to
 */
public class Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Start of main");
		Thread thread =Thread.currentThread();
		System.out.println("Thread Name: " +thread.getName() );
		Thread.sleep(4000);
		System.out.println("End  of main");

	}

}
