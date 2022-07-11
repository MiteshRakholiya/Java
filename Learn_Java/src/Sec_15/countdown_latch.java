package Sec_15;

import java.util.concurrent.CountDownLatch;

class test_new extends Thread{
	private CountDownLatch latch;

	public test_new(CountDownLatch latch) {
		this.latch = latch;
	}
	
	@Override
	public void run() {
		System.out.println("Thread running with thread name "+Thread.currentThread().getName());
		System.out.println("Thread execution completed");
		System.out.println("*************************");
		latch.countDown();
	}
	
}

public class countdown_latch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountDownLatch latch = new CountDownLatch(4);
		test_new thread1 = new test_new(latch);
		test_new thread2 = new test_new(latch);
		test_new thread3 = new test_new(latch);
		test_new thread4 = new test_new(latch);
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		
		
		try {
			latch.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("I am in main thread");
	}

}
