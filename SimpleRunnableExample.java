//simple runnable example

public class SimpleRunnableExample implements Runnable{

	public void run(){
		System.out.println("Runs from a thread");
	}
	
	public static void main(String[] args){

		(new Thread(new SimpleRunnableExample())).start();
	}
}