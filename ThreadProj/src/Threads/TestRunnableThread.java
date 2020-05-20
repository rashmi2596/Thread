package Threads;

/*
 * rashm
 * since May 5, 2020
 * version 1.0
 *
 * This class is used to
 */
public class TestRunnableThread {

	public static void main(String[] args) {
	//1	//Thread thread = new Thread(new SampleRunnable());
		//thread.setName("RunnableThread");
		//thread.start();

	//2	//Runnable runnable=()->{
			//System.out.println("Lambda Code");};
			//new Thread(runnable).start();
		
	//easy way
		new Thread(()->{System.out.println("Lambda Code");}).start();;
	
	
	}
	}


