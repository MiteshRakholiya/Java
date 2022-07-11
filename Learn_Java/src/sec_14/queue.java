package sec_14;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class queue {

	public static void main(String[] args) {
		Queue<Integer> queue = new ArrayBlockingQueue<>(6);
//		System.out.println(queue.peek()); // Method 2
//		Queue<Integer> queue1 = new LinkedBlockingDeque<>();
//	
//		queue.add(1);
//		queue.add(2);
//		queue.add(3);
//		queue.add(4);
//		queue.add(5);
//		
//		System.out.println(queue.offer(1));
		queue.offer(1);
		queue.offer(2);
		queue.offer(3);
		queue.offer(4);
		queue.offer(5);
		queue.offer(6);
		queue.offer(7);
//		System.out.println(queue.offer(1));

		for (Integer element : queue) {
			System.out.println(element);
		}
		
//		System.out.println(queue.poll()); // Method 2
		
		System.out.println("********************");
		
//		for (Integer element : queue) {       // Method 2
//			System.out.println(element);
//		}
		System.out.println(queue.peek());
	}

}
