//set thread name example

public class SetName{
	
	public static void main(String[] args){

		Thread currentThread = Thread.currentThread();
		System.out.println(currentThread);

		currentThread.setName("set the name here");

		System.out.println("Thread name : "+currentThread.getName());
	}
}