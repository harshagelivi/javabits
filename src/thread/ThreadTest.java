package thread;
public class ThreadTest {

	public static void main(String[] args) {
	    /*
	     * 3 states for a thread - new, runnable, running
	     * when it is created, it will be in new state
	     */
		Thread t1 = new Thread();
		t1.setName("t1");
		System.out.println("before t1 start");
		/*
		 * thread goes to runnable state
		 * does nothing as it doesn't have anything to run.
		 */
		t1.start();
		System.out.println("after t1 start");
		
		Runnable r = new MyRunnable();
		Thread t2 = new Thread(r);
		t2.setName("t2");
		
		System.out.println("before t2 start");
		t2.start();
		System.out.println("after t2 start");
		
		
		/*
		 * not a good OO practice to do this way
		 */
		Thread t3 = new RunThread();
		t3.setName("t3");
		System.out.println("before t3 start");
		t3.start();
		System.out.println("after t3 start");
		
		//t3.run();
		
		//System.out.println(Thread.currentThread().getName());
	}
	

}
