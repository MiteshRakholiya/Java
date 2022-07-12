package Sec_15;

import java.util.concurrent.ArrayBlockingQueue;

class Producer implements Runnable{
	
	private ArrayBlockingQueue<Integer> queue;

	public Producer(ArrayBlockingQueue<Integer> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		while(true){
			try {
				Thread.sleep(5000);
				queue.put(blocking_queue.counter++);
				System.out.println("Value added in the queue: "+blocking_queue.counter);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	
}

class Consumer implements Runnable{
	
	private ArrayBlockingQueue<Integer> queue;

	public Consumer(ArrayBlockingQueue<Integer> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		while(true){
			try {
				Thread.sleep(1000);
				queue.take();
				blocking_queue.counter--;
				System.out.println("Value removed in the queue: "+blocking_queue.counter);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	
}




public class blocking_queue {

	static int counter = 0;

	public static void main(String[] args) {
		ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);
		Producer produce = new Producer(queue);
		Thread producerThread = new Thread(produce);
        producerThread.start();
        
        Consumer consume = new Consumer(queue);
        Thread consumerThread = new Thread(consume);
        consumerThread.start();
	}

}
