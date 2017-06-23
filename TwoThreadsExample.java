class TwoThreadsExample{
	
	public static void main(String[] args){

		new SimpleThread("thread A").start();
		new SimpleThread("Thread B").start();
	}
}

class SimpleThread extends Thread{
	public SimpleThread(String str){
		super(str);
	}
	public void run(){
		for(int i=0;i<10;i++){

			System.out.println(i+" "+getName());

			try{
				sleep((int)(Math.random()*1000));
			}catch(InterruptedException ex){
				System.err.println(ex.getMessage());
			}
		}
		System.out.println("exit ! "+getName());

	}
}