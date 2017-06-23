//get curent thread

public class CurrentThread{
	
	public static void main(String[] args){

		Thread thread = new Thread();

		thread.setName("MainThread");
		System.out.println("Id of the current thread is "+thread.getId());
		System.out.println("Name of the current thread is "+thread.getName());
		System.out.println("Priority of the current thread is "+thread.getPriority());

	}	

}