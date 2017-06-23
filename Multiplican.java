//multiplican table using threads
public class Multiplican implements Runnable{

	private int number;

	public Multiplican(int number){
		this.number = number;
	}

	@Override
	public void run(){

		for(int i =0;i<10;i++){

			System.out.printf("%s : %d * %d = %d\n",Thread.currentThread().getName(),number,i,i*number);
		}
	}
	
	public static void main(String[] args){

		System.out.println("I will print 1 to 5");

		for(int i=0;i<10;i++){
				Multiplican ml = new Multiplican(5);
				Thread thread = new Thread(ml);
				thread.start();
		}
	}
}