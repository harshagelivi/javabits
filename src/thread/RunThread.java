package thread;

public class RunThread extends Thread{
	
	@Override
	public void run(){
		System.out.println(Thread.currentThread().getName());
	}
}
