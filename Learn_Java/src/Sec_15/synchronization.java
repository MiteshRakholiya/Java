package Sec_15;

public class synchronization {
	public static int counter=0;
	
	public static void main(String[] args) throws InterruptedException {
		
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i =1; i<=1000; i++) {
					synchronization.counter++;
				}
				System.out.println("Thread 1 loop is over");
			}
		}) ;

		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i =1; i<=1000; i++) {
					synchronization.counter++;
				}
				System.out.println("Thread 2 loop is over");
			}
		}) ;
		
		thread1.start();
		thread2.start();
		Thread.sleep(2000);
		System.out.println("The value of counter is:" +synchronization.counter);
		
	}
}
