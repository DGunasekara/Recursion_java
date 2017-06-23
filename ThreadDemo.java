import java.lang.*;

public class ThreadDemo implements Runnable{
	
	Thread t;

	ThreadDemo(){

		t = new Thread(this,"admin thread");			// thread created
		t.setPriority(1);

		System.out.println("Thread "+t);
		t.start();
	}

	public void run(){

		System.out.println("thread priority : "+t.getPriority());
	}

	public static void main(String[] args){

		new ThreadDemo();
	}
}