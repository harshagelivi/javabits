package thread;

public class ThreadTest {

	public static void main(String[] args) {
		Thread t1 = new Thread();
		t1.setName("t1");
		System.out.println("before t1 start");
		t1.start();
		System.out.println("after t1 start");
		
		Runnable r = new MyRunnable();
		Thread t2 = new Thread(r);
		t2.setName("t2");
		
		System.out.println("before t2 start");
		t2.start();
		System.out.println("after t2 start");
		
		Thread t3 = new RunThread();
		t3.setName("t3");
		System.out.println("before t3 start");
		t3.start();
		System.out.println("after t3 start");
		
		//t3.run();
		
		//System.out.println(Thread.currentThread().getName());
	}
	

}
