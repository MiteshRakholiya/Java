package Sec_15;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class reentrant_lock {

	static int counter = 0;
	static Lock lock = new ReentrantLock();

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				lock.lock();
				try {
					for (int i = 1; i <= 1000; i++) {
						reentrant_lock.counter++;
					}
				} finally {
					lock.unlock();
				}

			}
		});

		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				lock.lock();
				try {
					for (int i = 1; i <= 1000; i++) {
						reentrant_lock.counter++;
					}
				} finally {
					lock.unlock();
				}
			}

		});
		thread1.start();
		thread2.start();

		thread1.join();
		thread2.join();

		System.out.println("The final value of counter is " + reentrant_lock.counter);

	}
}
