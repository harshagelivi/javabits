package thread;

public class Sync {

	/*
	 * Every object has a lock which is unlocked initially.
	 * For any synchronized method in this to be run, that lock has to be obtained
	 * so, a thread can be in synchronized method only if it obtain object's lock(not a method's lock)
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	/*
	 * 
	 */
	public synchronized void syncMethod(){
		System.out.println("iam atomic.");
	}
	
	public void method(){
		/*
		 * only this code block is atomic
		 * this refers the object whose lock is to be used
		 * 
		 */
		synchronized(this){
			
		}
	}


}
